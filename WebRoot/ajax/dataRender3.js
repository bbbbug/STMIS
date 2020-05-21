var ip="http://188.131.239.248:8080/STMIS/";

/**
 * 数据渲染
 */
$(function(){
	$("#saveSTs").click(function(){
		saveCourseTypes();
	});
	
	$("#selectCategory").click(function(){
		selectcategory();
	});
	
	var i=0;
	$("#KCLB").click(function(){
		if(i<1){
			selectcategory_2();
			i+=1;
		}
	});
});

//系统上线时间
var System_onlineDate = new Date('2018/10/01 00:00');
var currentDate = new Date();
function compareDate(){
	onlineDate = System_onlineDate.getTime();
	current = currentDate.getTime();
	var differenceTime = (current-onlineDate)/1000;
	var differenceDay = parseInt(differenceTime / (24*60*60));//计算整数天数
	var comDay = differenceDay%365
	alert(comDay);
		if(comDay>270){
			$.ajax({
				 url : "user/gradeAlert",
				 type : "post",
				 dataType:"text",
				 contentType : 'application/json;charset=UTF-8',
				 success : function(result) {
					 //var result=false;
					 if(result == "true"){
						 document.getElementById("message").style.display="";
					 }
				 }
			});
		}
	}

/**
 * 查询课程类别
 * 程默
 * 7-30
 */
function selectcategory_2() {
	$.ajax({
		url : "course/selectAllCategory",
		type : "post",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			console.log(result);
			$("#KCLB").empty();
			var html='<option id="selectKCLB" value ="#">--请选择--</option>';
			$.each(result,function(index,data){
				if(data.bxzd_1==0){
					
				}else{
					html+='<option value ="'+data.lbbh+'">'+data.lbmc+'</option>';
				}
				
			});
			$("#KCLB").append(html);
		}
	});
}

/**
 * 查询课程类别
 * 程默
 * 7-30
 */
function selectcategory_1() {
	$.ajax({
		url : "course/selectAllCategory",
		type : "post",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			console.log(result);
			var html="";
			$.each(result,function(index,data){
				if(data.bxzd_1==0){
					
				}else{
					html+='<li role="presentation"><a href="course/showByKclb?kclb='+data.lbbh+'">'+data.lbmc+'</a></li>';
				}
				
			});
			$("#Category_1").append(html);
		}
	});
}

/**
 * 查询课程类别
 * 程默
 * 7-30
 */
function selectcategory() {
	$.ajax({
		url : "course/selectAllCategory",
		type : "post",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			console.log(result);
			$("#showCategory").empty();
			var html="";
			$.each(result,function(index,data){
				if(data.bxzd_1==0){
					
				}else{
					html+='<li><a href="course/showByKclb?kclb='+data.lbbh+'">'+data.lbmc+'</a></li>';	
				}
				
			});
			$("#showCategory").append(html);
		}
	});
}

/**
 * 保存课程配置信息
 * 程默
 * 7-9
 */
function saveCourseTypes() {
	var courseTypes = [];
	alert("保存课程配置");
	$(".row").each(function(index,item){
		$(item).find($("input:checkbox:checked")).each(function(v, i){
			kcbh = $(this).val();
			bmid = $(this).attr("content");
			kcmc = $(this).attr("content_1");
			xxbx = $(this).attr("content_2");
			var courseType = {
					"kcbh" : kcbh,
					"bmid" : bmid,
					"kcmc" : kcmc,
					"xxbx" : xxbx
				};
			courseTypes.push(courseType);
		});
	});
	console.log(courseTypes);

	$.ajax({
		url : "course/saveCourseTypes",
		type : "post",
		data : JSON.stringify(courseTypes),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			
		}
	});
}

//下拉框后显示所有的课程
function findcourse(pageCurrentNum){
	var bmid=$("#conf #_BMMC_").val();
	var courseType = {
			"bmid" : bmid
		};
		$.ajax({
			url  : "course/selectCourseTypes",
			type: "POST",
			data : JSON.stringify(courseType),
			dataType : "json",
			async : true,
			contentType : "application/json",
			success : function(result){
				console.log("新打印的："+JSON.stringify(result) );
				var html="";
				var data1=result;
				$("#courseConfig").empty();
			
				
				$.each(data1,function(index,data){
					
					html='<div class="row">'
						+	'<div class="col-xs-4">'
						+		'<span name="'+data.kcbh+'">'
						+			data.kcmc
						+		'</span>'
						+	'</div>'
			        +	'<div class="col-xs-3">'
			        +		'<span name="kcbh">'
			        +		    data.kcbh	
			        +		'</span>'
			        +	'</div>'
			        
			        +	'<div class="col-xs-3">'
						+		'<span>'
						+			'<input  type="checkbox" content_2="'+ data.xxbx+'" content_1="'+ data.kcmc+'" content="'+data.bmid+'" id="_XXBX'+data.id+'"  name="_XXBX'+data.id+'" value="'+data.kcbh+'">'
						+		'</span>'
						+	'</div>'
						+	'<div class="col-xs-2">'
			        +		'<span>'
			        +		 timestampToTime(data.jzsj)
			        +		'</span>'
			        +	'</div>'
			        +'</div>';
					   
					  
					$("#courseConfig").append(html);
					//alert('input[name="_XXBX'+data.id+'"]:checkbox')
					if(data.xxbx=="必修"){
						$('input[name="_XXBX'+data.id+'"]:checkbox').prop("checked", true);
					}
					
					});
				
				
				
			}
		});
		
		/*if(pxkc==""){
			alert("类别名称为空，请输入");
		}else if(pxdd==""){
			alert("该类别状态为空，请输入");
		}else if(pxfs==""){
		alert(JSON.stringify(record));
			
			}*/
}
//动态加载部门
function loadingDepartment1(){
	$.ajax({
		url : "department/departmentList",
		type : "GET",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {					
			var html="";
			$("#conf #_BMMC_").empty();
			console.log("wojinlaila!!");
			$.each(result,function(index,data){
				console.log("item:"+data);	
				console.log("index:"+index);
				if(index == "extend"){
					console.log(data.departmentList);	
					var list=data.departmentList;
					for(var i=0;i<list.length;i++){
						
						var item = list[i];
						console.log("获取部门信息:"+list[i].bmmc);
						if(item.bxzd2==0){
							html+=
								'<option  value="'+item.bmbh+'">'
			                    + item.bmmc
			                    +'</option>';
						}else{
							
						}
						
						
						
					}
					
				}
				
				
				/*modal=loadTeacherModal(item);*/
				
			});
			$("#conf #_BMMC_").append(html);
			
			findcourse();
			
			
		}
	});
}

////long转换成Date
////将long类型时间戳转换为date时间表示
//function timestampToTime(timestamp) {
//  var date = new Date(timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
//  Y = date.getFullYear() + '-';//此时为四位数字表示 getYear()的话为两位数字表示
//  M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';//当前月份(0-11,0代表1月)
//  D = date.getDate() + ' ';//当前日(1-31)
//  h = date.getHours() + ':';
//  m = (date.getMinutes() < 10 ? '0' + date.getMinutes() : date.getMinutes()) +':'; 
//  s = date.getSeconds();
//  ms = date.getMilliseconds();//毫秒值
//  
//  return M + D + h + m + s;//此处可以自定义需要的显示类型
//}



