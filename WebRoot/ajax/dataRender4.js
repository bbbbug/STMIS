var ip="http://188.131.239.248:8080/STMIS/";
//员工端反馈表提交
function addFeedBackForm(){
	var ygzh=$("#KCFKB_div #YGZH_").val();
	var ygmc=ygzh;
	//var jksj="2019-7-9 18:50:53";
	var kcbh=$("#KCFKB_div #KCBH_").val();
	var jksj=new Date();
	var kcjs=$("#KCFKB_div #KCJS_").val();
	var kcmc=$("#KCFKB_div #KCMC_").val();
	var batchAddCourseFeedback=new Array();
	//遍历获取class="_feedback_"的tr元素
	$('#KCFKB_div ._feedback_').each(function(index,item){
		var courseFeedback={};
		if($(item).find('textarea').length>0){//文本
			console.log("反馈表文本："+$(item).find('textarea').val()+"-"+$(item).find('textarea').attr("label"));
			var fkjg=$(item).find('textarea').val();
			var fktmlx="主观题";
			var tmbh=$(item).find('textarea').attr("label");
			courseFeedback={
				"jksj":jksj,
				"kcjs":kcjs,
				"kcmc":kcmc,
				"fkjg":fkjg,
				"fktmlx":fktmlx,
				"tmbh":tmbh,
				"ygzh":ygzh,
				"kcbh":kcbh,
				"ygmc":ygmc
			}
			batchAddCourseFeedback.push(courseFeedback);
		}else{
			$(item).find('input:checked').each(function(){//选择题
				console.log("反馈表参数："+$(this).val()+"-"+$(this).attr("label"));
				var fkjg=$(this).val();
				var fktmlx="选择题";
				var tmbh=$(this).attr("label");
				//write By Jinming2019.7.17
				
				courseFeedback={
						"jksj":jksj,
						"kcjs":kcjs,
						"kcmc":kcmc,
						"fkjg":fkjg,
						"fktmlx":fktmlx,
						"tmbh":tmbh,
						"ygzh":ygzh,
						"kcbh":kcbh,
						"ygmc":ygmc
					}
				batchAddCourseFeedback.push(courseFeedback);
			})
		}
		
	});
	console.log(batchAddCourseFeedback);
	$.ajax({
		url : "course/addCourseFeedback",
		type: "get",
		data : {"batchAddCourseFeedback[]":JSON.stringify(batchAddCourseFeedback)},
		dataType: "jsonp",
		jsonp: "callback",//传递给请求处理程序或页面的，用以获得jsonp回调函数名的参数名(一般默认为:callback)
		/*jsonpCallback: "println",*/		
		async: true,
		cache: false,
		contentType : "application/json",
		success : function(result){
			if(result!=null){
				alert("提交成功！");
				//update by Jaylin in 2019.7.16
				window.location.href="exam/showAnswer";
			}
		}
	});
	
}


