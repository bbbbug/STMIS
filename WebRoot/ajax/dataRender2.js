var ip="http://188.131.239.248:8080/STMIS/";
function getAllyearEndSelect1(){
	$.ajax({
		url : "http://125.220.212.139:8080/STMIS/course/getCourseOnsiteWithExample",
		type : "GET",
		data : "",
		dataType : "json",
//		jsonp: "callback",//默认
//		jsonpCallback: "successCallback",
		async : true,
		contentType : "application/json",
		success : function(result) {					
			var html="";
			console.log("跨域ajax："+JSON.stringify(result));
		},
		error: function(result){
			console.log(result);
		}
	});
}
//关闭线下课程记录模态框
function closeModal1(){
	$("#addEmployee input").val("");
	$("#offline").modal("hide");	
}

//下载资料
function download(pxzl){
	console.log("打印："+pxzl)
	url= "course/download?filepath="+pxzl;
	window.location.href=url;
	
}
//下载资料
function downloadType(pxzl){
	console.log("打印："+pxzl)
	url= "course/downloadType?filepath="+pxzl;
	window.location.href=url;
	
}

//选择参与人后计算参加人数
function calculateEmp(){
	var i=0;
	$("#XYZHS input[type=checkbox]:checked").each(function(){
	      i=i+1;
	});
	console.log(i);
	$("#CJRS").val(i);
}


//部门管理模块一条条记录显示
function getAlldepartmentSelect(pageCurrentNum){
	$.ajax({
		url : "department/departmentList",
		type : "POST",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {					
			var html="";
			
			/**
			 * @author 黄金明
			 * 修改时间:2019.8.29
			 * 功能:分页
			 */
			var pageInfo_id=$("#departmentconf_pageInfo ul li");//获取分页的分页footer
			result=result.extend.departmentList;
			page(result,pageInfo_id,pageCurrentNum);
//			var pageNum=pageInfo_id.find("select").val();
			var _item;
//         	alert("测试:"+pageCurrentNum);
			_item=pageInfo(result,pageInfo_id,pageCurrentNum);
//			alert(JSON.stringify(result));
			
			$.each(_item,function(index,item){
//				console.log("item:"+data);	
//				console.log("index:"+index);
//				if(index == "extend"){
//					console.log(data.departmentList);	
//					var list=data.departmentList;
//					for(var i=0;i<list.length;i++){
//						var item = list[i];
						var bmzt;
						if(item.bxzd2==0){
							bmzt="在编";
						}else{
							bmzt="删除";
						}
						console.log("hahaha"+item.bmbh);
						html+='<div class="row">'
							+'<div class="col-xs-1" >'
		                    + +item.bmbh
		                    +'<input type="text" hidden id="BMBH_1'+item.bmbh+'" />'
		                    +'</div>'
		                	+'<div class="col-xs-2">'
		                    + item.bmmc
		                    +'</div>'
		                    +'<div class="col-xs-1">'
							+ item.zfyq
							+'</div>'
							+'<div class="col-xs-2">'
							+ item.bxxfyq
							+'</div>'
							+'<div class="col-xs-2">'
		                    + item.xxxfyq
		                    +'</div>'
		                    +'<div class="col-xs-2">'
		                    + bmzt
		                    +'</div>'
		                    +'<div class="col-xs-2">'
		                	+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#departmentDetail"  onclick="viewDepartment(\''
		                		+item.bmbh+'\')">详情</button> '
		                	+'<button class="btn btn-warning btn-xs" data-toggle="modal" data-target="#departmentChange"  onclick="changeDepartment(\''
		                		+item.bmbh+'\')">更改</button> '
		                	+'<button class="btn btn-danger btn-xs" data-toggle="modal" data-target="#departmentDelete"  onclick="deleteDepartment(\''
		                		+item.bmbh+'\')">删除</button> '
		                    +'</div>'
		                    +'</div>';
						
						
//					}
				
//				}
				
				
				/*modal=loadTeacherModal(item);*/
				
			});
			$("#departmentconf").html(html);
		}
	});
}
//增加部门模态框
function addDepartment(){
	
	var modal="";
	modal+='<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label"></label>'
		 +'<div class="col-sm-8">'
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">部门编号</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control" id="BMBH_" value="" placeholder="部门编号">'
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">部门名称</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control" id="BMMC_" value="" placeholder="部门名称">'
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">总分要求</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control" id="ZFYQ_" value="" placeholder="总分要求">'
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">必修学分要求</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control" id="BXXFYQ_" value="" placeholder="必修学分要求">'
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">选修学分要求</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="XXXFYQ_" value="" placeholder="选修学分要求">'
		 +'</div>'
		 +'</div>'
		 +'<div class="modal-footer">'
		 +'<button type="button" class="btn btn-default" data-dismiss="modal"onclick="closeModal1()">关闭</button>'
		 +'<button type="button" class="btn btn-default" data-dismiss="modal"onclick="saveModal1()">保存</button>'
		 +'</div>';
			var depart=document.getElementById("viewDepartmentAdd");
			depart.innerHTML=modal;
			$("#departmentAdd").modal();
}
//保存新增部门模态框
function saveModal1(){
	var bmbh=$("#departmentAdd #BMBH_").val();
	var bmmc=$("#departmentAdd #BMMC_").val();
	var zfyq=$("#departmentAdd #ZFYQ_").val();
	var bxxfyq=$("#departmentAdd #BXXFYQ_").val();
	var xxxfyq=$("#departmentAdd #XXXFYQ_").val();
	var bxzd2=0;
	if(bmbh==""){
		alert("部门编号不能为空，请输入部门编号！");
	}else if(bmmc==""){
		alert("部门名称不能为空，请输入部门名称！");
	}else if(zfyq==""){
		alert("总分要求不能为空，请输入总分要求！");
	}else if(bxxfyq==""){
		alert("必修学分要求不能为空，请输入必修学分要求！");
	}else{
		var department={
				"bmbh" : bmbh,
				"bmmc" : bmmc,
				"zfyq" : zfyq,
				"bxxfyq" : bxxfyq,
				"xxxfyq" : xxxfyq,
				"bxzd2" : bxzd2
			};
		console.log(department);
		//alert(JSON.stringify(department));
		$.ajax({
			url : "department/addDepartment",
			type: "post",
			data : department,
			dataType: "jsonp",
			jsonp: "callback",//传递给请求处理程序或页面的，用以获得jsonp回调函数名的参数名(一般默认为:callback)
			/*jsonpCallback: "println",*/
			async: true,
			cache: false,
			contentType : "application/json",
			success : function(result) {	
			console.log(result)
			if(result.code==100){
				alert("添加成功！");
				getAlldepartmentSelect(1);
			}else{
				alert("添加失败请重新添加	");
			}
			},
			error : function(){
				alert("部门不能重复");
			}
		})
		/*return modal;*/
	}
	
}

//更新部门信息模态框 
function saveModal2(id){
	
	var bmbh=$("#departmentChange #_BMBH").val();
	var bmmc=$("#departmentChange #_BMMC").val();
	var zfyq=$("#departmentChange #_ZFYQ").val();
	var bxxfyq=$("#departmentChange #_BXXFYQ").val();
	var xxxfyq=$("#departmentChange #_XXXFYQ").val();
	var bxzd2=$("#departmentChange #_BXZD2"+id).val();
	console.log("wonadaole:"+bxzd2);
	if(bmbh==""){
		alert("部门编号不能为空，请输入部门编号！");
	}else if(bmmc==""){
		alert("部门名称不能为空，请输入部门名称！");
	}else if(zfyq==""){
		alert("总分要求不能为空，请输入总分要求！");
	}else if(bxxfyq==""){
		alert("必修学分要求不能为空，请输入必修学分要求！");
	}else{
		var department1={
				"bmbh" : bmbh,
				"bmmc" : bmmc,
				"zfyq" : zfyq,
				"bxxfyq" : bxxfyq,
				"xxxfyq" : xxxfyq,
				"bxzd2" : bxzd2
			};
		console.log("我现在来打印这个:"+department1.bmbh);
		$.ajax({
			url : "department/updateDepartment",
			type: "post",
			data : department1,
			dataType: "jsonp",
			jsonp: "callback",//传递给请求处理程序或页面的，用以获得jsonp回调函数名的参数名(一般默认为:callback)
			/*jsonpCallback: "println",*/
			async: true,
			cache: false,
			contentType : "application/json",
			success : function(result) {	
			console.log(result);
			if(result.code==100){
				alert("修改成功！");
				getAlldepartmentSelect(1);
			}else{
				alert("修改失败请重新修改	");
			}
			
			
			}
		})
		/*return modal;*/
	}
	
}

//更改部门详情模态框
function changeDepartment(bmbh){
	console.log(bmbh)
	$.ajax({
		url : "department/findDepartment?bmbh="+bmbh,
		type : "POST",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
		console.log(result)
		var modal="";
		//alert(JSON.stringify(result.extend.department));
		var data=result.extend.department;
		modal+='<div class="form-group">'
			 +		'<label for="input" class="col-sm-2 control-label"></label>'
			 +		'<div class="col-sm-8">'
			 +		'</div>'
			 +	'</div>'
			 +	'<div class="form-group">'
			 +		'<label for="input" class="col-sm-2 control-label">部门编号</label>'
			 +		'<div class="col-sm-8">'
			 +		'<input type="text" class="form-control"'
			 +		'id="_BMBH" value="'+data.bmbh+'" placeholder="部门编号" readonly>'
			 +		'</div>'
			 +	'</div>'
			 +	'<div class="form-group">'
			 +		'<label for="input" class="col-sm-2 control-label">部门名称</label>'
			 +		'<div class="col-sm-8">'
			 +		'<input type="text" class="form-control"'
			 +		'id="_BMMC" value="'+data.bmmc+'" placeholder="部门名称">'
			 +		'</div>'
			 +	'</div>'
			 +	'<div class="form-group">'
			 +		'<label for="input" class="col-sm-2 control-label">总分要求</label>'
			 +		'<div class="col-sm-8">'
			 +		'<input type="text" class="form-control"'
			 +		'id="_ZFYQ" value="'+data.zfyq+'" placeholder="总分要求">'
			 +		'</div>'
			 +	'</div>'
			 +	'<div class="form-group">'
			 +		'<label for="input" class="col-sm-2 control-label">必修学分要求</label>'
			 +		'<div class="col-sm-8">'
			 +			'<input type="text" class="form-control"'
			 +			'id="_BXXFYQ" value="'+data.bxxfyq+'" placeholder="必修学分要求">'
			 +		'</div>'
			 +	'</div>'
			 +	'<div class="form-group">'
			 +		'<label for="input" class="col-sm-2 control-label">选修学分要求</label>'
			 +		'<div class="col-sm-8">'
			 +			'<input type="text" class="form-control"'
			 +			'id="_XXXFYQ" value="'+data.xxxfyq+'" placeholder="选修学分要求">'
			 +		'</div>'
			 +	'</div>'
			 +	'<div class="form-group">'
			 +		'<label for="input" class="col-sm-2 control-label">部门状态</label>'
			 +		'<div class="col-sm-8">'
			 +			'<select class="form-control" id="_BXZD2'+data.id+'"  placeholder="部门状态">'
			 +				'<option value="0" >在编</option>'
			 +				'<option value="1" >删除</option>'
			 +			'</select>' 
			 +		'</div>'
			 +	'</div>'
			 +	'<div class="modal-footer">'
			 +		'<button type="button" class="btn btn-default" data-dismiss="modal"onclick="closeModal1()">关闭</button>'
			 +		'<button type="button" class="btn btn-default" data-dismiss="modal"onclick="saveModal2('+data.id+')">保存</button>'
			 +	'</div>';
			var yearEnd1=document.getElementById("viewDepartmentChange");
			yearEnd1.innerHTML=modal;
			$("#_BXZD2"+data.id).find('option[value="'+data.bxzd2+'"]').prop("selected",true);
			
			$("#departmentChange").modal();
		}
	})
	/*return modal;*/
}
//删除部门详情模态框
function deleteDepartment(bmbh){
	console.log("我拿到的部门编号是:"+bmbh);
	$.ajax({
		url : "department/deleteDepartment?bmbh="+bmbh,
		type : "GET",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
			if(result.code==100){
				alert("删除成功!");
				getAlldepartmentSelect(1);
			}else{
					("删除失败！");
			}
		}
	})
}
//部门管理详情模态框
function viewDepartment(bmbh){
	console.log("打印："+bmbh)
	$.ajax({
		url :"department/findDepartment?bmbh="+bmbh,
		type : "POST",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
		console.log(result)
		var modal="";
		//alert(JSON.stringify(result.extend.department));
		var data=result.extend.department;
		modal+='<div class="form-group">'
			 +'<label for="input" class="col-sm-2 control-label"></label>'
			 +'<div class="col-sm-8">'
			 +'</div>'
			 +'</div>'
			 +'<div class="form-group">'
			 +'<label for="input" class="col-sm-2 control-label" >部门编号</label>'
			 +'<div class="col-sm-8">'
			 +'<input type="text" class="form-control"'
			 +'id="BMBH'+data.bmbh+'" value="'+data.bmbh+'" placeholder="部门编号" readonly>'
			 +'</div>'
			 +'</div>'
			 +'<div class="form-group">'
			 +'<label for="input" class="col-sm-2 control-label">部门名称</label>'
			 +'<div class="col-sm-8">'
			 +'<input type="text" class="form-control"'
			 +'id="BMMC'+data.bmmc+'" value="'+data.bmmc+'" placeholder="部门名称" readonly>'
			 +'</div>'
			 +'</div>'
			 +'<div class="form-group">'
			 +'<label for="input" class="col-sm-2 control-label">总分要求</label>'
			 +'<div class="col-sm-8">'
			 +'<input type="text" class="form-control"'
			 +'id="ZFYQ'+data.zfyq+'" value="'+data.zfyq+'" placeholder="总分要求" readonly>'
			 +'</div>'
			 +'</div>'
			 +'<div class="form-group">'
			 +'<label for="input" class="col-sm-2 control-label">必修学分要求</label>'
			 +'<div class="col-sm-8">'
			 +'<input type="text" class="form-control"'
			 +'id="BXXFYQ'+data.bxxfyq+'" value="'+data.bxxfyq+'" placeholder="必修学分要求" readonly>'
			 +'</div>'
			 +'</div>'
			 +'<div class="form-group">'
			 +'<label for="input" class="col-sm-2 control-label">选修学分要求</label>'
			 +'<div class="col-sm-8">'
			 +'<input type="text" class="form-control"'
			 +'id="XXXFYQ'+data.xxxfyq+'" value="'+data.xxxfyq+'" placeholder="选修学分要求" readonly>'
			 +'</div>'
			 +'</div>'
			 +'<div class="form-group">'
			 +'<label for="input" class="col-sm-2 control-label">部门状态</label>'
			 +'<div class="col-sm-8">'
			 +'<input type="text" class="form-control"'
			 +'id="BXZD2" value="'+data.bxzd2+'" placeholder="部门状态" readonly>'
			 +'</div>'
			 +'</div>';
			var yearEnd1=document.getElementById("viewDepartmentDetail");
			yearEnd1.innerHTML=modal;
			$("#departmentDetail").modal();

			
		}
	})
	/*return modal;*/
}





//反馈表详情记录显示
function viewFeedBackForm(id,kcbh){
	$('#viewFeedBackStu').modal('hide');
    var kcbh=$("#back #KCBH_1"+kcbh).val();
    var kcfs=$("#FKKCFS_1"+kcbh).val();
    console.log(kcfs);
	var ygzh=$("#viewFeedBackStu #YGZH_1"+id).val();
	var CourseFeedback={
			"kcbh" : kcbh,
			"ygzh" : ygzh
		};
	console.log("我拿到了他的："+CourseFeedback.kcbh);
	$.ajax({
		url : "course/findCourseFeedbackByExample",
		type: "post",
		data : CourseFeedback,
		dataType: "jsonp",
		jsonp: "callback",//传递给请求处理程序或页面的，用以获得jsonp回调函数名的参数名(一般默认为:callback)
		/*jsonpCallback: "println",*/
		async: true,
		cache: false,
		contentType : "application/json",
		success : function(result) {	
		console.log(result)
		var html="";
		//alert(JSON.stringify(result.extend.findCourseFeedbackByExample));
		var data=result.extend.findCourseFeedbackByExample;
		console.log(data[0].kcjs);
		html+= +'<div>'	
			   +'<table border="0" cellpadding="0" cellspacing="0" width="653" style="border-collapse:collapse;table-layout:fixed;width:489pt">'
			   +'<col class="x69" width="72" span="2" style="mso-width-source:userset;width:54pt">'
			   +'<col class="x69" width="189" style="mso-width-source:userset;width:141.75pt">'	 
			   + '<col class="x69" width="64" span="5" style="mso-width-source:userset;width:48pt">'
			   + '<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r0">'
			   +'<td colspan="8" height="34" class="x91" width="653" style="height:25.5pt;" align="left" valign="top">'
			   +'<span style="mso-ignore:vglayout;position:absolute;z-index:0;margin-left:18px;margin-top:0px;width:390px;height:43px">'
			   +'<img width="390" height="43" src="img/1.png" name="Picture 2" alt="一起">'
			   +'</span>'
			   +'<span  style="mso-ignore:vglayout2">'
			   +'<table cellpadding="0" cellspacing="0">'
			   +'<tr>'		
		       +'<td colspan="8" height="34" class="x70" width="653" style="height:25.5pt;">'			
			   +'</td>'
			   +'</tr>'			
			   +'</table>'		
			   +'</span>'	
			   +'</td>'
			   +'</tr>'
			   +'<tr height="18" style="mso-height-source:userset;height:13.5pt" id="r1">'
			   +'<td colspan="8" rowspan="2" height="43" class="x71" style="height:32.25pt;">培训效果调查表</td>'
			   +'</tr>'
			   +'<tr height="25" style="mso-height-source:userset;height:18.75pt" id="r2">'
			   +'</tr>'
			   +'<tr height="5" style="mso-height-source:userset;height:3.75pt" id="r3">'
			   +'<td height="5" class="x72" style="height:3.75pt;"></td>'
			   +'<td class="x72"></td>'
			   +'<td class="x72"></td>'
			   +'<td class="x72"></td>'
			   +'<td class="x72"></td>'
			   +'<td class="x73"></td>'
			   +'<td colspan="2" class="x73"></td>'
			   +'</tr>'
			   +'<tr height="21" style="mso-height-source:userset;height:15.75pt" id="r4">'
			   +'<td height="20" class="x72" style="height:15pt;"></td>'
			   +'<td class="x72"></td>'
			   +'<td class="x72"></td>'
			   +'<td class="x72"></td>'
			   +'<td colspan="4" class="x74">'
			   +'<span style="float:right">培训日期:'
			   +'<input type="text" value="'+data[0].jksj+'" readonly/>'
			   +'</span>'
			   +'<span style="float:right">讲师：'
			   +'<input type="text" value="'+data[0].kcjs+'" readonly/>'
			   +'</span>'
			   +'</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r5">'
			   +'<td height="32" class="x75" style="height:24pt;">课程名称:'
			   +'</td>'
			   +'<td colspan="7" class="x76" style="mso-height-source:userset;height:25.5pt">'
			   +'<input type="text" style="border:none;height:25.5pt;" value="'+data[0].kcmc+'" />'
			   +'</td>'
			   +'</tr>'
			   +'<tr height="69" style="mso-height-source:userset;height:51.75pt" id="r6">'
			   +'<td colspan="8" height="67" class="x76" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:50.25pt;">'
			   +'<li>1.本问卷请受训员工详实填写,并请于结训后交予人力资源部.</li>'
			   +'<li>2.请您给予率直的批评和建议,以帮助我们改进和完善今后的培训课程.</li>'
			   +'<li>3.请在你觉得合适的选项下打钩.</li>'
			   +'</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r7">'
			   +'<td colspan="3" height="32" class="x79" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;">一、课程方面：</td>'
			   +'<td class="x80">非常<br>赞同</td>'
			   +'<td class="x80">赞同</td>'
			   +'<td class="x80">一般 </td>'
			   +'<td class="x80">不太<br>赞同</td>'
			   +'<td class="x80">强烈<br>反对</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r8">'
			   +'<td colspan="3" height="32" class="x81" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;">1、课程涵盖了我想要了解的内容与信息</td>'	 
			   +'<td class="x82">'
			   +'<div class="radio-inline" >'
			   +'<input type="radio" name="killOrder" id="feedback1_A" value="A" disabled />'
			   +'<label for="killOrder"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder" id="feedback1_B" value="B" disabled/>'
			   +'<label for="killOrder"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder" id="feedback1_C" value="C" disabled/>'
			   +' <label for="killOrder"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder" id="feedback1_D" value="D" disabled/>'
			   +'<label for="killOrder"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder" id="feedback1_E" value="E" disabled/>'
			   +'<label for="killOrder"></label>'
			   +'</div>'
			   +'</td>'
			   +'</tr>'
			   +' <tr height="34" style="mso-height-source:userset;height:25.5pt" id="r9">'
			   +'<td colspan="3" height="32" class="x81" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;">2、课程能为我的实际工作提供帮助</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder1" value="A" disabled/>'
			   +'<label for="killOrder1"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder1" value="B" disabled/>'
			   +'<label for="killOrder1"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder1" value="C" disabled/>'
			   +'<label for="killOrder1"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder1" value="D" disabled/>'
			   +'<label for="killOrder1"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder1" value="E" disabled/>'
			   +'<label for="killOrder1"></label>'
			   +'</div>'
			   +'</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r10">'
			   +'<td colspan="3" height="32" class="x81" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;">3、我喜欢这种培训形式</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder2" value="A" disabled/>'
			   +'<label for="killOrder2"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder2" value="B" disabled/>'
			   +' <label for="killOrder2"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder2" value="C" disabled/>'
			   +'<label for="killOrder2"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder2" value="D" disabled/>'
			   +'<label for="killOrder2"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder2" value="E" disabled/>'
			   +'<label for="killOrder2"></label>'
			   +'</div>'
			   +'</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r11">'
			   +'<td colspan="8" rowspan="2" height="67" class="x83" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:50.25pt;padding:0px, 0px, 0px, 0px;">'
			   +'4、您的建议：'
			   +'<textarea style="height: 99.6px;width: 652px;resize: none;border:none;font-size:18px;" readonly>'
			   +data[3].fkjg
			   +'</textarea>'
			   +'</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r12">'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r13">'
			   +'<td colspan="3" height="32" class="x79" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;">二、讲师方面：</td>'
			   +'<td class="x80">非常<br>赞同</td>'
			   +'<td class="x80">赞同</td>'
			   +'<td class="x80">一般 </td>'
			   +'<td class="x80">不太<br>赞同</td>'
			   +'<td class="x80">强烈<br>反对</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r14">'
			   +'<td colspan="3" height="32" class="x81" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;">1、讲师的讲解深入浅出,举例生动贴切</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder4" value="A" disabled/>'
			   +'<label for="killOrder4"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder4" value="B" disabled/>'
			   +'<label for="killOrder4"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder4" value="C" disabled/>'
			   +'<label for="killOrder4"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder4" value="D" disabled/>'
			   +'<label for="killOrder4"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder4" value="E" disabled/>'
			   +'<label for="killOrder4"></label>'
			   +'</div>'
			   +'</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r15">'
			   +'<td colspan="3" height="32" class="x81" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;">2、课程时间安排合理,松紧得当</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder5" value="A" disabled/>'
			   +'<label for="killOrder5"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder5" value="B" disabled/>'
			   +'<label for="killOrder5"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder5" value="C" disabled/>'
			   +'<label for="killOrder5"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder5" value="D" disabled/>'
			   +'<label for="killOrder5"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder5" value="E" disabled/>'
			   +'<label for="killOrder5"></label>'
			   +'</div>'
			   +'</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt: id="r16">'
			   +'<td colspan="3" height="32" class="x81" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;">3、我能够清楚地明白讲师的讲解</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder6" value="A" disabled/>'
			   +'<label for="killOrder6"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder6" value="B" disabled/>'
			   +'<label for="killOrder6"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder6" value="C" disabled/>'
			   +'<label for="killOrder6"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder6" value="D" disabled/>'
			   +'<label for="killOrder6"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder6" value="E" disabled/>'
			   +'<label for="killOrder6"></label>'
			   +'</div>'
			   +'</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r17">'
			   +'<td colspan="3" height="32" class="x81" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;">4、讲师能够与学员进行互动，吸引学员的注意力</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder7" value="A" disabled/>'
			   +'<label for="killOrder7"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder7" value="B" disabled/>'
			   +'<label for="killOrder7"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder7" value="C" disabled/>'
			   +'<label for="killOrder7"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder7" value="D" disabled/>'
			   +'<label for="killOrder7"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder7" value="E" disabled/>'
			   +'<label for="killOrder7"></label>'
			   +'</div>'
			   +'</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r18">'
			   +'<td colspan="8" rowspan="2" height="67" class="x83" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:50.25pt;">'
			   +'5、您的建议:'
			   +'<textarea style="height: 99.6px;width: 652px;resize: none;border:none;font-size:18px;" readonly>'
			   +data[8].fkjg
			   +'</textarea>'
			   +'</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r19">'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r20">'
			   +'<td colspan="3" height="32" class="x79" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;">三、您自己：</td>'
			   +'<td class="x80">非常<br>赞同</td>'
			   +'<td class="x80">赞同</td>'
			   +'<td class="x80">一般 </td>'
			   +'<td class="x80">不太<br>赞同</td>'
			   +'<td class="x80">强烈<br>反对</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r21">'
			   +'<td colspan="3" height="32" class="x81" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;">1、经过培训，我对该课程内容有了一定的理解</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder9" value="A" disabled/>'
			   +'<label for="killOrder9"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder9" value="B" disabled/>'
			   +'<label for="killOrder9"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder9" value="C" disabled/>'
			   +'<label for="killOrder9"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder9" value="D" disabled/>'
			   +'<label for="killOrder9"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder9" value="E"/>'
			   +'<label for="killOrder9"></label>'
			   +'</div>'
			   +'</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r22">'
			   +'<td colspan="3" height="32" class="x81" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;">2、我会在日后的工作生活中学以致用并持之以恒</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder10" value="A" disabled/>'
			   +'<label for="killOrder10"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder10" value="B" disabled/>'
			   +'<label for="killOrder10"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder10" value="C" disabled/>'
			   +'<label for="killOrder10"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder10" value="D" disabled/>'
			   +'<label for="killOrder10"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder10" value="E" disabled/>'
			   +'<label for="killOrder10"></label>'
			   +'</div>'
			   +'</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r23">'
			   +'<td colspan="3" height="32" class="x79" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;">四、整体部分：</td>'
			   +'<td class="x79">很好</td>'
			   +'<td class="x79">好</td>'
			   +'<td class="x79">普通</td>'
			   +'<td class="x79">不好</td>'
			   +'<td class="x79">极差</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r24">'
			   +'<td colspan="3" height="32" class="x81" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;">总而言之，您对课程的整体满意度是：</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder11" value="A" disabled/>'
			   +'<label for="killOrder11"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder11" value="B" disabled/>'
			   +'<label for="killOrder11"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder11" value="C" disabled/>'
			   +'<label for="killOrder11"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrdeR11" value="D" disabled/>'
			   +'<label for="killOrder11"></label>'
			   +'</div>'
			   +'</td>'
			   +'<td class="x82">'
			   +'<div class="radio-inline">'
			   +'<input type="radio" name="killOrder11" value="E" disabled/>'
			   +'<label for="killOrder11"></label>'
			   +'</div>'
			   +'</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r25">'
			   +'<td colspan="8" height="32" class="x89" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;">为了帮助我们更好地改进工作，请留下您的宝贵建议：</td>'
			   +'</tr>'
			   +'<tr height="34" style="mso-height-source:userset;height:25.5pt" id="r26">'
			   +'<td colspan="8" rowspan="2" height="101" class="x90" style="border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:75.95pt;">'
			   +'<textarea style="height:154px;width: 652px;resize: none;border:none;font-size:18px;" readonly>'
			   +data[11].fkjg
			   +'</textarea>'
			   +'</td>'
			   +'</tr>'
			   +'<tr height="69" style="mso-height-source:userset;height:51.95pt" id="r27">'
			   +'</tr>'
			   +'<![if supportMisalignedColumns]>'
			   +'<tr height="0" style="display:none">'
			   +'<td width="72" style="width:54pt"></td>'
			   +'<td width="72" style="width:54pt"></td>'
			   +'<td width="189" style="width:141.75pt"></td>'
			   +'<td width="64" style="width:48pt"></td>'
			   +'<td width="64" style="width:48pt"></td>'
			   +'<td width="64" style="width:48pt"></td>'
			   +'<td width="64" style="width:48pt"></td>'
			   +'<td width="64" style="width:48pt"></td>'
			   +'</tr>'
			   +'</table>'
			   +'</div>';	
					$("#viewFeedBackForm").html(html);
					
		    	   if(data[0].fkjg=="A"){
		    		   $("input[name='killOrder'][value='A']").attr("checked",true);
    			    	   
			       }if(data[0].fkjg=="B"){
			    	   $("input[name='killOrder'][value='B']").attr("checked",true);
			       }if(data[0].fkjg=="C"){
			    	   $("input[name='killOrder'][value='C']").attr("checked",true);
			       }if(data[0].fkjg=="D"){
			    	   $("input[name='killOrder'][value='D']").attr("checked",true);
			       }if(data[0].fkjg=="E"){
			    	   $("input[name='killOrder'][value='E']").attr("checked",true);
			       }
			       
			       if(data[1].fkjg=="A"){
		    		   $("input[name='killOrder1'][value='A']").attr("checked",true);
			       }if(data[1].fkjg=="B"){
			    	   $("input[name='killOrder1'][value='B']").attr("checked",true);
			       }if(data[1].fkjg=="C"){
			    	   $("input[name='killOrder1'][value='C']").attr("checked",true);
			       }if(data[1].fkjg=="D"){
			    	   $("input[name='killOrder1'][value='D']").attr("checked",true);
			       }if(data[1].fkjg=="E"){
			    	   $("input[name='killOrder1'][value='E']").attr("checked",true);
			       }
			       
			       if(data[2].fkjg=="A"){
		    		   $("input[name='killOrder2'][value='A']").attr("checked",true);
			       }if(data[2].fkjg=="B"){
			    	   $("input[name='killOrder2'][value='B']").attr("checked",true);
			       }if(data[2].fkjg=="C"){
			    	   $("input[name='killOrder2'][value='C']").attr("checked",true);
			       }if(data[2].fkjg=="D"){
			    	   $("input[name='killOrder2'][value='D']").attr("checked",true);
			       }if(data[2].fkjg=="E"){
			    	   $("input[name='killOrder2'][value='E']").attr("checked",true);
			       }
			       
			       if(data[4].fkjg=="A"){
		    		   $("input[name='killOrder4'][value='A']").attr("checked",true);
			       }if(data[4].fkjg=="B"){
			    	   $("input[name='killOrder4'][value='B']").attr("checked",true);
			       }if(data[4].fkjg=="C"){
			    	   $("input[name='killOrder4'][value='C']").attr("checked",true);
			       }if(data[4].fkjg=="D"){
			    	   $("input[name='killOrder4'][value='D']").attr("checked",true);
			       }if(data[4].fkjg=="E"){
			    	   $("input[name='killOrder4'][value='E']").attr("checked",true);
			       }
			       
			       if(data[5].fkjg=="A"){
		    		   $("input[name='killOrder5'][value='A']").attr("checked",true);
			       }if(data[5].fkjg=="B"){
			    	   $("input[name='killOrder5'][value='B']").attr("checked",true);
			       }if(data[5].fkjg=="C"){
			    	   $("input[name='killOrder5'][value='C']").attr("checked",true);
			       }if(data[5].fkjg=="D"){
			    	   $("input[name='killOrder5'][value='D']").attr("checked",true);
			       }if(data[5].fkjg=="E"){
			    	   $("input[name='killOrder5'][value='E']").attr("checked",true);
			       }
			       
			       if(data[6].fkjg=="A"){
		    		   $("input[name='killOrder6'][value='A']").attr("checked",true);
			       }if(data[6].fkjg=="B"){
			    	   $("input[name='killOrder6'][value='B']").attr("checked",true);
			       }if(data[6].fkjg=="C"){
			    	   $("input[name='killOrder6'][value='C']").attr("checked",true);
			       }if(data[6].fkjg=="D"){
			    	   $("input[name='killOrder6'][value='D']").attr("checked",true);
			       }if(data[6].fkjg=="E"){
			    	   $("input[name='killOrder6'][value='E']").attr("checked",true);
			       }
			       
			       if(data[7].fkjg=="A"){
		    		   $("input[name='killOrder7'][value='A']").attr("checked",true);
			       }if(data[7].fkjg=="B"){
			    	   $("input[name='killOrder7'][value='B']").attr("checked",true);
			       }if(data[7].fkjg=="C"){
			    	   $("input[name='killOrder7'][value='C']").attr("checked",true);
			       }if(data[7].fkjg=="D"){
			    	   $("input[name='killOrder7'][value='D']").attr("checked",true);
			       }if(data[7].fkjg=="E"){
			    	   $("input[name='killOrder7'][value='E']").attr("checked",true);
			       }
		    	   
			       if(data[9].fkjg=="A"){
		    		   $("input[name='killOrder9'][value='A']").attr("checked",true);
			       }if(data[9].fkjg=="B"){
			    	   $("input[name='killOrder9'][value='B']").attr("checked",true);
			       }if(data[9].fkjg=="C"){
			    	   $("input[name='killOrder9'][value='C']").attr("checked",true);
			       }if(data[9].fkjg=="D"){
			    	   $("input[name='killOrder9'][value='D']").attr("checked",true);
			       }if(data[9].fkjg=="E"){
			    	   $("input[name='killOrder9'][value='E']").attr("checked",true);
			       }
			       
			       if(data[10].fkjg=="A"){
		    		   $("input[name='killOrder10'][value='A']").attr("checked",true);
			       }if(data[10].fkjg=="B"){
			    	   $("input[name='killOrder10'][value='B']").attr("checked",true);
			       }if(data[10].fkjg=="C"){
			    	   $("input[name='killOrder10'][value='C']").attr("checked",true);
			       }if(data[10].fkjg=="D"){
			    	   $("input[name='killOrder10'][value='D']").attr("checked",true);
			       }if(data[10].fkjg=="E"){
			    	   $("input[name='killOrder10'][value='E']").attr("checked",true);
			       }
			       
			       if(kcfs>=80){
		    		   $("input[name='killOrder11'][value='A']").attr("checked",true);
			       }if(kcfs<80&&kcfs>=60){
			    	   $("input[name='killOrder11'][value='B']").attr("checked",true);
			       }if(kcfs<60&&kcfs>=40){
			    	   $("input[name='killOrder11'][value='C']").attr("checked",true);
			       }if(kcfs<40&&kcfs>=20){
			    	   $("input[name='killOrder11'][value='D']").attr("checked",true);
			       }if(kcfs<20&&kcfs>=0){
			    	   $("input[name='killOrder11'][value='E']").attr("checked",true);
			       }

		       
		       
				
			}
				
		});
	
}

//反馈记录表（一条条记录）
function getAllfeedBackFormSelect(pageCurrentNum){
	$.ajax({
		url : "course/feedbackList",
		type : "GET",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {					
			var html="";
			var fkkcfs;
			
			/**
			 * @author huang
			 * 修改时间:2019.9.2
			 * 功能:分页
			 */
			
			
			var pageInfo_id=$("#backRecord_pageInfo ul li");//获取分页的分页footer
			result=result.extend.feedbackList;
			page(result,pageInfo_id,pageCurrentNum);
//			var pageNum=pageInfo_id.find("select").val();
			
//			alert("课程类别分页测试:"+pageCurrentNum);
			item=pageInfo(result,pageInfo_id,pageCurrentNum);
			
			$.each(item,function(index,data){
				console.log("item:"+data);	
				console.log("index:"+index);
			//	if(index == "extend"){
			//		console.log(data.feedbackList);	
			//		var list=data.feedbackList;
			//		for(var i=0;i<list.length;i++){
			//			var item = data[i];
					fkkcfs=parseInt(data.fkfs);
						html+='<div class="row" >'
							+'<div class="col-xs-2">'
		                    + data.kcmc
		                    +'<input type="text" value="'+data.kcbh+'" hidden id="KCBH_1'+data.kcbh+'" />'
		                    +'</div>'
		                	+'<div class="col-xs-2">'
		                    + data.kcjs
		                    +'<input type="text" hidden id="KCJS_1'+data.kcmc+'"/>'
		                    +'</div>'
		                    +'<div class="col-xs-3">'
							+ fkkcfs
							+'<input type="text" hidden id="FKKCFS_1'+data.kcbh+'" value="'+fkkcfs+'" />'
							+'</div>'
							+'<div class="col-xs-3">'
		                    + timestampToTime(data.jksj)
		                    +'</div>'
		                    +'<div class="col-xs-2">'
		                	+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#viewFeedBackStu"  onclick="viewFeedBackStu(\''
		                		+data.kcbh+'\')">详情</button> '
		                    +'</div>'
		                    +'</div>';
				//	}
				
				//}
				
				
				/*modal=loadTeacherModal(item);*/
				
			});
			$("#backRecord").html(html);
		}
	});
}

//反馈表点击课程详情后显示对课程反馈的人员信息
function viewFeedBackStu(kcbh){
	console.log("这是我传进来的id："+kcbh);
	$.ajax({
		url : "course/courseFeedbackAllList?kcbh="+kcbh,
		type : "GET",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {					
			var html="";
			$.each(result,function(index,data){
				console.log("item:"+data);	
				console.log("index:"+index);
				if(index == "extend"){
					console.log(data.courseFeedbackAllList);	
					var list=data.courseFeedbackAllList;
					for(var i=0;i<list.length;i++){
						var item = list[i];
						console.log("hahaha"+list[i].ygzh);
						html+='<div class="row" style="margin-top:10px;margin-left:3px;">'
							+		'<div class="col-xs-4">'
		                    + 			item.ygzh
		                    +			'<input type="text" value="'+item.ygzh+'" hidden id="YGZH_1'+item.id+'" />'          
		                    +		'</div>'
		                    +		'<div class="col-xs-4">'
		                    + 			item.pjfs
		                    +			'<input type="text" value="" hidden id="PJFS_1'+item.id+'" />'          
		                    +		'</div>'
		                    +		'<div class="col-xs-4">'
		                	+			'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#feedBackForm"  onclick="viewFeedBackForm(\''+item.id+'\',\''+kcbh+'\')">详情</button> '
		                    +		'</div>'
		                    + '</div>';
					}
				
				}
				/*modal=loadTeacherModal(item);*/
			});
			$("#FeedBackStu").html(html);
		}
	});
}

//written by JinMing 2019.7.16
//部门点击后显示所有参与人员(标准案例)
function findParticipants(){
		$("#XYZHS").empty();
		$('input:checkbox[name="PXBM_2"]:checked').each(function() //multiple checkbox的name
			   {        
			            
						var ygdwbh=$(this).val();
						var employee={
								"ygdwbh" : ygdwbh
							};
							console.log(employee);
							$.ajax({
								url  : "employee/getEmployeeWithDept",
								type: "post",
								data : employee,
								dataType: "jsonp",
								jsonp: "callback",//传递给请求处理程序或页面的，用以获得jsonp回调函数名的参数名(一般默认为:callback)
								/*jsonpCallback: "println",*/
								async: true,
								cache: false,
								contentType : "application/json",
								success : function(result){
									console.log("新打印的："+JSON.stringify(result.extend) );
									var html="";
									var data=result.extend.EmployeeWithDeptList;
									
									$.each(data,function(index,data1){
										console.log("第一次打印："+data1.ygzh)
										html+='<div>'
											+	'<div class="col-xs-2">'
											+		'<span>'
											+			data1.ygzh
											+		'</span>'
											+	'</div>'
					     			        +	'<div class="col-xs-1">'
					     			        +		'<span>'
					     			        +			'<input onclick="calculateEmp()" type="checkbox" id="_YGZH'+data1.id+'" name="_YGZH" value="'+data1.ygzh+'" checked>'
					     			        +		'</span>'
					     			        +	'</div>'
					     			        +'</div>';
										
										});
									$("#XYZHS").append(html);
									calculateEmp();
								}
							
							});
							
			       
			   })

	
		
		/*if(pxkc==""){
			alert("类别名称为空，请输入");
		}else if(pxdd==""){
			alert("该类别状态为空，请输入");
		}else if(pxfs==""){
		alert(JSON.stringify(record));
			
			}*/
}


//线下培训表根据部门查询
function getDepartmentByName(){
	var departmenyName=$("#searchDepartment").val();
	console.log(departmenyName);
	var course_onsite={
			"pxzzbm" : departmenyName,
		};
	$.ajax({
		url : "course/getCourseOnsiteWithExample",
		type : "get",
		data : course_onsite,
		dataType: "jsonp",
		jsonp: "callback",//传递给请求处理程序或页面的，用以获得jsonp回调函数名的参数名(一般默认为:callback)
		/*jsonpCallback: "println",*/
		async: true,
		cache: false,
		contentType : "application/json",
		success : function(result) {				
			var html="";
			console.log(result);
			var data=result.extend.courseOnsiteListWithExample;
			
			
			
			$.each(data,function(index,item){
				
				html+='<div class="row">'
					+'<div class="col-xs-2">'
                  + item.pxkc
                  +'</div>'
              	+'<div class="col-xs-1">'
                  + item.pxzzbm
                  +'</div>'
                  +'<div class="col-xs-1">'
					+ item.cjrs
					+'</div>'
					+'<div class="col-xs-1">'
					+ item.skls
					+'</div>'
					+'<div class="col-xs-3">'
                  + item.pxsj
                  +'</div>'
                  +'<div class="col-xs-2">'
                  + item.pxjlr
                  +'</div>'
                  +'<div class="col-xs-1">'
                  + item.skxf
                  +'</div>'
                  +'<div class="col-xs-1">'
              	+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#offline"  onclick="viewofflineRecord(\''
              		+item.id+'\')">详情</button> '
                  +'</div>'
                  +'</div>';
					
			});
			$("#offlineRecord").html(html);
		}
	});
}

//更改线下培训表组织部门下拉框获取部门
function loadingDepartment(){
	$.ajax({
		url : "department/departmentList",
		type : "GET",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {					
			var html="";
			var html1="";
			var fkkcfs;
			$("#PXBMS").empty();
			$.each(result,function(index,data){
				console.log("item:"+data);	
				console.log("index:"+index);
				if(index == "extend"){
					console.log(data.departmentList);	
					var list=data.departmentList;
					for(var i=0;i<list.length;i++){
						
						var item = list[i];
						console.log("获取部门信息:"+list[i].bmmc);
						
						html+=
							'<option  value="'+item.bmbh+'" label="'+item.bmmc+'" >'
		                    + item.bmmc
					
					}
					//written By JinMing 2019.7.16
					for(var i=0;i<list.length;i++){
						
						var item = list[i];
						console.log("我要显示部门信息:"+list[i].bmmc);
						
						if(item.bxzd2==0){
							html1+='<div style="margin-left:40%;"><input name="PXBM_2" type="checkbox" id="PXBM_2'+item.id+'" value="'+item.bmbh+'" label="'+item.bmmc+'" onclick="findParticipants()" />'
							   +item.bmmc
							   +'</div> ';
						}else{
							
						}
						
						/*if(i == list.length/2){
							html1+=' ';
							html1+='br';						
						}*/
					}
				}
				/*modal=loadTeacherModal(item);*/
			});
			$("#PXBMS").append(html1);
			$("#PXZZBM").append(html);
		}
	});
}


//提交线下培训记录表
function addOfflineRecord(){
	var pxkc=$("#reco #PXKC").val();
	var pxdd=$("#reco #PXDD").val();
	var skls=$("#reco #SKLS").val();
	var skxf=$("#reco #SKXF").val();
	var cjrs=$("#reco #CJRS").val();
	var pxzl=$("#reco #PXZL").val();
	var pxfs=$("#reco #PXFS").val();
	var xyzh="";
	$("#XYZHS input[type=checkbox]:checked").each(function(index,item){
	     xyzh+=item.value
	     		+'#';
	});
	xyzh=xyzh.substring(0, xyzh.length-1);
	var pxnr=$("#reco #PXNR").val();
	var pxjlr=$("#reco #PXJLR").val();
	//var pxsj=$("#reco #PXSJ").val();
	var pxsj=new Date($("#reco #PXSJ").val());
	//var pxjlsj=new Date($("#reco #PXJLSJ").val());
	//var pxzzbm=$("#reco #PXZZBM").val();
	var pxzzbm=$("#reco #PXZZBM option:selected").attr("label");
	//console.log(xyzh);
	//json字符串中字段用小写字段命名
	if(pxkc==""){
		alert("培训课程为，请输入");
	}else if(pxdd==""){
		alert("培训地点为空，请输入");
	}else if(skls==""){
		alert("授课老师为空，请输入");
	}else if(pxnr==""){
		alert("培训内容为空，请输入");
	}else if(pxjlr==""){
		alert("培训记录人为空，请输入");
	}else if(pxfs==""){
		alert("授课方式为空，请输入");
	}else if(pxfs==""){
		alert("培训时间为空，请输入");
	}else{
		var courseOnsite={
				"pxkc" : pxkc,
				"pxdd" : pxdd,
				"skls" : skls,
				"skxf" : skxf,
				"cjrs" : cjrs,
				"pxnr" : pxnr,
				"pxjlr": pxjlr,
				"pxsj" : pxsj,
				"pxzzbm":pxzzbm,
				"bxzd2" : xyzh,
				"pxzl" : pxzl,
				"pxfs": pxfs
				
			};
			console.log(courseOnsite);
			
			$.ajax({
				url : "course/addBatchCourseOnsiteCredit",
				type: "get",
				data : courseOnsite,
				dataType: "jsonp",
				jsonp: "callback",//传递给请求处理程序或页面的，用以获得jsonp回调函数名的参数名(一般默认为:callback)
				jsonpCallback: "println",
				async: true,
				cache: false,
				contentType : "application/json",
				success : function(result){
					alert("提交成功!");
				}
			});
	}
	
	
		
}







//线下课程记录表（总条）
function getAllofflineRecordSelect(pageCurrentNum){
	$.ajax({
		url :"course/courseOnsiteList",
		type : "POST",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {					
			var html="";
			
			/**
			 * @author huang
			 * 修改时间:2019.9.2
			 * 功能:分页
			 */
			var pageInfo_id=$("#offlineRecord_pageInfo ul li");//获取分页的分页footer
			result=result.extend.courseOnsiteList;
			page(result,pageInfo_id,pageCurrentNum);
//			var pageNum=pageInfo_id.find("select").val();
			var item;
//			alert("课程类别分页测试:"+pageCurrentNum);
			item=pageInfo(result,pageInfo_id,pageCurrentNum);
		    
			$.each(item,function(index,data){
				console.log("item:"+data);	
				console.log("index:"+index);
			//	if(index == "extend"){
					
			//		console.log(data.courseOnsiteList);	
			//		var list=data.courseOnsiteList;
			//		for(var i=0;i<list.length;i++){
						
			//			var item = list[i];
						
			//			console.log("hahaha"+list[i].pxkc);
						
						
						//var zxf=parseInt(item.ygzxf)+parseInt(item.courseOnsiteCredit.xxkcxf);
						//var zyq=parseInt(item.department.zfyq)+parseInt(item.courseOnsiteCredit.xxkcxf);
						html+='<div class="row">'
							+'<div class="col-xs-2">'
		                    + data.pxkc
		                    +'</div>'
		                	+'<div class="col-xs-1">'
		                    + data.pxzzbm
		                    +'</div>'
		                    +'<div class="col-xs-1">'
							+ data.cjrs
							+'</div>'
							+'<div class="col-xs-1">'
							+ data.skls
							+'</div>'
							+'<div class="col-xs-3">'
		                    + data.pxsj
		                    +'</div>'
		                    +'<div class="col-xs-2">'
		                    + data.pxjlr
		                    +'</div>'
		                    +'<div class="col-xs-1">'
		                    + data.skxf
		                    +'</div>'
		                    +'<div class="col-xs-1">'
		                	+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#offline"  onclick="viewofflineRecord(\''
		                		+data.id+'\')">详情</button> '
		                    +'</div>'
		                    +'</div>';
						
						
				//	}
				
			//	}
				
				
				/*modal=loadTeacherModal(item);*/
				
			});
			$("#offlineRecord").html(html);
		}
	});
}

//单个线下课程记录表所有参与人
function viewSingleRecordAllEmp(id){
	console.log("这是我传进来的id"+id);
	$.ajax({
		url : "course/findCourseOnsiteCredit?id="+id,
		type : "POST",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
		var html="";
	//	alert(JSON.stringify(result.extend.CourseOnsiteCreditList));
		var data=result.extend.CourseOnsiteCreditList;
		$.each(data,function(index,data1){
			console.log("第一次打印："+data1.xyzh);
			html+=data1.xyzh
			     +'  ';
			        
			});
		$("#xyzhs").text(html);
			
		}
		})
}

//线下总记录表详情弹出模态框信息(单个记录)
function viewofflineRecord(id){
	console.log("打印："+id)
	
	$.ajax({
		url : "course/findCourseOnsite?id="+id,
		type : "POST",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
		console.log(result)
		var modal="";
		//alert(JSON.stringify(result.extend.findCourseOnsite));
		var data=result.extend.findCourseOnsite;
		modal+=	'<div>'
			   +'<p style="line-height:20pt; margin:0pt 7.75pt 0pt 0pt; orphans:0; text-align:center; text-indent:10.5pt; widows:0">'
		       +'<span style="font-family:楷体_GB2312; font-size:15pt; font-weight:bold">员工培训记录表</span>'
		       +'</p>'
		       +'<p style="line-height:20pt; margin:0pt 7.75pt 0pt 0pt; orphans:0; text-align:center; text-indent:10.5pt; widows:0">'
	           +'<span style="font-family:楷体_GB2312; font-size:14pt; font-weight:bold">&#xa0;</span>'
	           +'</p>'
	           +'<div style="text-align:center">'
	           +'<table cellspacing="0" cellpadding="0" style="border-collapse:collapse; margin:0 auto">'
	           +'<tr style="height:30.5pt">'
	           +'<td colspan="2" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:1.5pt; border-right-color:#000000; border-right-style:solid; border-right-width:0.75pt; border-top-color:#000000; border-top-style:solid; border-top-width:1.5pt; padding-left:4.65pt; padding-right:5.03pt; vertical-align:middle">'
	           +'<p style="margin:0pt; orphans:0; text-align:center; widows:0">'
	           +'<span style="font-family:宋体; font-size:12pt">培训时间</span>'
	           +'</p>'
	           +'</td>'
	           +'<td style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:0.75pt; border-right-color:#000000; border-right-style:solid; border-right-width:0.75pt; border-top-color:#000000; border-top-style:solid; border-top-width:1.5pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle">'
	           +'<p style="margin:0pt; orphans:0; text-align:center; widows:0">'
	           +'<span style="font-family:Times New Roman; font-size:12pt">'
	           +data.pxsj
	           +'</span>'
	           +'</p>'
	           +'</td>'
	           +'<td colspan="2" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:0.75pt; border-right-color:#000000; border-right-style:solid; border-right-width:0.75pt; border-top-color:#000000; border-top-style:solid; border-top-width:1.5pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle">'
	           +'<p style="margin:0pt; orphans:0; text-align:center; widows:0">'
	           +'<span style="font-family:宋体; font-size:12pt">培训方式</span>'
	           +'</p>'
	           +'</td>'
	           +'<td colspan="2" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:0.75pt; border-right-color:#000000; border-right-style:solid; border-right-width:0.75pt; border-top-color:#000000; border-top-style:solid; border-top-width:1.5pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle">'
	           +'<p style="margin:0pt; orphans:0; text-align:center; widows:0">'
	           +'<span style="font-family:Times New Roman; font-size:12pt">'
	           +data.pxfs
	           +'</span>'
	           +'</p>'
	           +'</td>'
	           +'<td style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:0.75pt; border-right-color:#000000; border-right-style:solid; border-right-width:0.75pt; border-top-color:#000000; border-top-style:solid; border-top-width:1.5pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle">'
	           +'<p style="margin:0pt; orphans:0; text-align:center; widows:0">'
	           +'<span style="font-family:宋体; font-size:12pt">培训学分</span>'
	           +'</p>'
	           +'</td>'
	           +'<td colspan="2" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:0.75pt; border-right-color:#000000; border-right-style:solid; border-right-width:1.5pt; border-top-color:#000000; border-top-style:solid; border-top-width:1.5pt; padding-left:5.03pt; padding-right:4.65pt; vertical-align:middle">'
			   +'<p style="margin:0pt; orphans:0; text-align:center; widows:0">'
			   +'<span style="font-family:Times New Roman; font-size:12pt">'
			   +data.skxf
			   +'</span>'
			   +'</p>'
			   +'</td>'
			   +'</tr>'
			   +'<tr style="height:30.75pt">'
			   +'<td colspan="2" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:1.5pt; border-right-color:#000000; border-right-style:solid; border-right-width:0.75pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:4.65pt; padding-right:5.03pt; vertical-align:middle">'
			   +'<p style="margin:0pt; orphans:0; text-align:center; widows:0"><span style="font-family:宋体; font-size:12pt">授课教师</span>'
			   +'</p>'
			   +'</td>'
			   +'<td style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:0.75pt; border-right-color:#000000; border-right-style:solid; border-right-width:0.75pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle">'
			   +'<p style="margin:0pt; orphans:0; text-align:center; widows:0">'
			   +'<span style="font-family:Times New Roman; font-size:12pt">'
			   +data.skls
			   +'</span>'
			   +'</p>'
			   +'</td>'
			   +'<td colspan="2" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:0.75pt; border-right-color:#000000; border-right-style:solid; border-right-width:0.75pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle">'
			   +'<p style="margin:0pt; orphans:0; text-align:center; widows:0">'
			   +'<span style="font-family:宋体; font-size:12pt">组织部门</span>'
			   +'</p>'
			   +'</td>'
			   +'<td colspan="2" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:0.75pt; border-right-color:#000000; border-right-style:solid; border-right-width:0.75pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle">'
			   +'<p style="margin:0pt; orphans:0; text-align:center; widows:0">'
			   +'<span style="font-family:Times New Roman; font-size:12pt">'
			   +data.pxzzbm
			   +'</span>'
			   +'</p>'
			   +'</td>'
			   +'<td style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:0.75pt; border-right-color:#000000; border-right-style:solid; border-right-width:0.75pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle">'
			   +'<p style="margin:0pt; orphans:0; text-align:center; widows:0">'
			   +'<span style="font-family:宋体; font-size:12pt">人数</span>'
			   +'</p>'
			   +'</td>'
			   +'<td colspan="2" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:0.75pt; border-right-color:#000000; border-right-style:solid; border-right-width:1.5pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:4.65pt; vertical-align:middle">'
			   +'<p style="margin:0pt; orphans:0; text-align:center; widows:0">'
			   +'<span style="font-family:Times New Roman; font-size:12pt id="xyzhs">'
			   +data.cjrs
			   +'</span>'
			   +'</p>'
			   +'</td>'
			   +'</tr>'
			   +'<tr style="height:42.75pt">'
			   +'<td colspan="2" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:1.5pt; border-right-color:#000000; border-right-style:solid; border-right-width:0.75pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:4.65pt; padding-right:5.03pt; vertical-align:middle">'
			   +'<p style="margin:0pt; orphans:0; text-align:center; widows:0">'
			   +'<span style="font-family:宋体; font-size:12pt">参与人：</span>'
			   +'</p>'
			   +'</td>'
			   +'<td colspan="8" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:0.75pt; border-right-color:#000000; border-right-style:solid; border-right-width:1.5pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:4.65pt; vertical-align:middle" id="xyzhs">'
			   +'<p style="margin:0pt; orphans:0; text-align:justify; widows:0;"  >'
			   
			   +'</p>'
			   +'</td>'
			   +'</tr>'
			   +'<tr style="height:42.75pt">'
			   +'<td colspan="2" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:1.5pt; border-right-color:#000000; border-right-style:solid; border-right-width:0.75pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:4.65pt; padding-right:5.03pt; vertical-align:middle">'
			   +'<p style="margin:0pt; orphans:0; text-align:center; widows:0">'
			   +'<span style="font-family:宋体; font-size:12pt">培训课程</span>'
			   +'</p>'
			   +'</td>'
			   +'<td colspan="8" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:0.75pt; border-right-color:#000000; border-right-style:solid; border-right-width:1.5pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:4.65pt; vertical-align:middle">'
			   +'<p style="margin:0pt; orphans:0; text-align:justify; widows:0">'
			   +'<span style="font-family:Times New Roman; font-size:12pt">'
			   +data.pxkc
			   +'</span>'
			   +'</p>'
			   +'</td>'
			   +'</tr>'
			   +'<tr style="height:42.75pt">'
			   +'<td colspan="2" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:1.5pt; border-right-color:#000000; border-right-style:solid; border-right-width:0.75pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:4.65pt; padding-right:5.03pt; vertical-align:middle">'
			   +'<p style="margin:0pt; orphans:0; text-align:center; widows:0">'
			   +'<span style="font-family:宋体; font-size:12pt">培训地点</span>'
			   +'</p>'
			   +'</td>'
			   +'<td colspan="8" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:0.75pt; border-right-color:#000000; border-right-style:solid; border-right-width:1.5pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:4.65pt; vertical-align:middle">'
			   +'<p style="margin:0pt; orphans:0; text-align:justify; widows:0">'
			   +'<span style="font-family:Times New Roman; font-size:12pt">'
			   +data.pxdd
			   +'</span>'
			   +'</p>'
			   +'</td>'
			   +'</tr>'
			   +'<tr style="height:77.8pt">'
			   +'<td colspan="10" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:1.5pt; border-right-color:#000000; border-right-style:solid; border-right-width:1.5pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:4.65pt; padding-right:4.65pt; vertical-align:middle">'
			   +'<p style="margin-right:75%; orphans:0; widows:0">'
			   +'<span style="font-family:宋体; font-size:12pt">培训教材或资料（备存）：</span>'
			   +'<span style="color:#ff0000; font-family:宋体; font-size:12pt">'
			   +'培训文件'
			   +'<button class="btn btn-success btn-xs"  onclick="download(\''
     			+data.pxzl+'\')">下载</button> '
			   +'</span>'
			   +'</p>'
			   +'<p style="margin:0pt; orphans:0; widows:0">'
			   +'<span style="font-family:Times New Roman; font-size:12pt">'
			   +'</span>'
			   +'</p>'
			   +'<p style="margin:0pt; text-align:justify">'
			   +'<span style="font-family:Times New Roman; font-size:10.5pt">&#xa0;</span>'
			   +'</p>'
			   +'</td>'
			   +'</tr>'
			   +'<tr style="height:444pt">'
			   +'<td colspan="10" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#000000; border-left-style:solid; border-left-width:1.5pt; border-right-color:#000000; border-right-style:solid; border-right-width:1.5pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:4.65pt; padding-right:4.65pt; vertical-align:top">'
			   +'<p style="line-height:22pt; margin:0pt; orphans:0; text-align:justify; widows:0">'
			   +'<span style="font-family:宋体; font-size:12pt">培训内容记录</span>'
			   +'<span style="font-family:Times New Roman; font-size:12pt">(</span>'
			   +'<span style="font-family:宋体; font-size:12pt">可续页</span>'
			   +'<span style="font-family:Times New Roman; font-size:12pt">)</span>'
			   +'<span style="font-family:宋体; font-size:12pt">：</span>'
			   +'</p>'
			   +'<p style="line-height:18pt; margin:0pt; orphans:0; text-align:justify; widows:0">'
			   +'<span style="font-family:Times New Roman; font-size:10.5pt">'
			   +data.pxnr
			   +'</span>'
			   +'</p>'
			   +'</td>'
			   +'</tr>'
			   +'<tr style="height:35.3pt">'
			   +'<td style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:1.5pt; border-left-color:#000000; border-left-style:solid; border-left-width:1.5pt; border-right-color:#000000; border-right-style:solid; border-right-width:0.75pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:4.65pt; padding-right:5.03pt; vertical-align:middle">'
			   +' <p style="line-height:18pt; margin:0pt; orphans:0; text-align:center; widows:0">'
			   +'<span style="font-family:宋体; font-size:12pt">记录人</span>'
			   +'</p>'
			   +'</td>'
			   +'<td colspan="3" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:1.5pt; border-left-color:#000000; border-left-style:solid; border-left-width:0.75pt; border-right-color:#000000; border-right-style:solid; border-right-width:0.75pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle">'
			   +'<p style="line-height:18pt; margin:0pt; orphans:0; text-align:center; widows:0">'
			   +'<span style="font-family:Times New Roman; font-size:12pt">'
			   +data.pxjlr
			   +'</span>'
			   +'</p>'
			   +'</td>'
			   +'<td colspan="2" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:1.5pt; border-left-color:#000000; border-left-style:solid; border-left-width:0.75pt; border-right-color:#000000; border-right-style:solid; border-right-width:0.75pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle">'
			   +'<p style="line-height:18pt; margin:0pt; orphans:0; text-align:center; widows:0">'
			   +'<span style="font-family:宋体; font-size:12pt">时间</span>'
			   +'</p>'
			   +'</td>'
			   +'<td colspan="3" style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:1.5pt; border-left-color:#000000; border-left-style:solid; border-left-width:0.75pt; border-right-color:#000000; border-right-style:solid; border-right-width:0.75pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle">'
			   +'<p style="line-height:18pt; margin:0pt; orphans:0; text-align:center; widows:0">'
			   +'<span style="font-family:Times New Roman; font-size:12pt">'
			   +data.pxjlsj
			   +'</span>'
			   +'</p>'
			   +'</td>'
			   +'<td style="border-bottom-color:#000000; border-bottom-style:solid; border-bottom-width:1.5pt; border-left-color:#000000; border-left-style:solid; border-left-width:0.75pt; border-right-color:#000000; border-right-style:solid; border-right-width:1.5pt; border-top-color:#000000; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:4.65pt; vertical-align:middle">'
			   +'</td>'
			   +'</tr>'
			   +'<tr style="height:0pt">'
			   +'<td style="width:74.15pt; border:none"></td>'
			   +'<td style="width:15.05pt; border:none"></td>'
			   +'<td style="width:78.6pt; border:none"></td>'
			   +'<td style="width:23.45pt; border:none"></td>'
			   +'<td style="width:38.35pt; border:none"></td>'
			   +'<td style="width:42.3pt; border:none"></td>'
			   +'<td style="width:80.05pt; border:none"></td>'
			   +'<td style="width:35.55pt; border:none"></td>'
			   +'<td style="width:1.65pt; border:none"></td>'
			   +'<td style="width:97pt; border:none"></td>'
			   +'</tr>'
			   +'</table>'
			   +'</div>'
			   +'<p style="margin:0pt; orphans:0; text-align:justify; widows:0">'
			   +'<span style="font-family:Times New Roman; font-size:10.5pt">&#xa0;</span>'
			   +'</p>'
			   +'</div>';
			var yearEnd1=document.getElementById("viewofflineRecord");
			yearEnd1.innerHTML=modal;
			$("#offline").modal();
			viewSingleRecordAllEmp(data.id);
//			$.each(result,function(index,data){
//					console.log("item:"+data);	
//					console.log("index:"+index);
//					if(index == "extend"){
//						console.log(data);	
//					}
//			})
			
		}
	})
	/*return modal;*/
}







var searchYearEnd

//学分总评信息
function getAllyearEndSelect(pageCurrentNum){
	$.ajax({
		url : "yearEndSelect",
		type : "POST",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {					
			var html="";
			
			var pageInfo_id=$("#yearEnd_pageInfo ul li");//获取分页的分页footer
			result=result.extend.yearEndList;
			page(result,pageInfo_id,pageCurrentNum);
			var pageNum=pageInfo_id.find("select").val();
			var item;
		//	alert("教师分页测试:"+pageCurrentNum);
			item=pageInfo(result,pageInfo_id,pageCurrentNum);
			
			
			$.each(item,function(index,data){
				
				console.log("item:"+data);	
				console.log("index:"+index);
			//	if(index == "extend"){
			//		console.log(data.yearEndList);	
			//		var list=data.yearEndList;
			//		searchYearEnd = list;
			//		for(var i=0;i<list.length;i++){
			//			var item = list[i];
			//			console.log("hahaha"+list[i].ygzh);
						var pass;
						var xxkcxf;
						if(data.bxzd3==null||data.bxzd3=="null"){
							xxkcxf=0;
						}else{
							xxkcxf=parseInt(data.bxzd3);
						}
						var zxf=parseInt(data.ygbxxf)+parseInt(data.ygxxxf)+parseInt(xxkcxf);
						var zyq=parseInt(data.department.zfyq);
						if(zyq>zxf){
							pass="不合格";
						}else if(parseInt(data.department.bxxfyq)>parseInt(data.ygbxxf)){
							pass="不合格";
						}else{
							pass="合格";
						}
						
						
						html+='<div class="row">'
							+'<div class="col-xs-2">'
		                    + data.ygzh
		                    +'</div>'
		                	+'<div class="col-xs-2">'
		                    + data.department.bmmc
		                    +'</div>'
		                    +'<div class="col-xs-1">'
							+ xxkcxf
							+'</div>'
							+'<div class="col-xs-1">'
							+ data.ygbxxf+'/'+data.department.bxxfyq
							+'</div>'
							+'<div class="col-xs-1">'
		                    + data.ygxxxf
		                    +'</div>'
		                    +'<div class="col-xs-2">'
		                    + zxf+'/'+zyq
		                    +'</div>'
		                    +'<div class="col-xs-2">'
		                    + pass
		                    +'</div>'
		                    +'<div class="col-xs-1">'
		                	+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#viewEndRecord"  onclick="viewEndRecord(\''
		                		+data.ygzh+'\')">详情</button> '
		                    +'</div>'
		                    +'</div>';
				//	}
			//	}
				/*modal=loadTeacherModal(item);*/
			});
			$("#yearEnd").html(html);
		}
	});
}


var YGZH_Detail 

//学分总评模态框数据渲染
function viewEndRecord(ygzh){
	console.log("打印："+ygzh)
	$.ajax({
		url : "yearEndSelectByYGZH?ygzh="+ygzh,
		type : "POST",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
		console.log(result)
		var modal="";
		
		/**
		 * @author 黄
		 * 修改时间:2019.8.29
		 * 功能:分页
		 */
//		var pageInfo_id=$("#teacher_pageInfo ul li");//获取分页的分页footer
//		page(result,pageInfo_id,pageCurrentNum);
//		var pageNum=pageInfo_id.find("select").val();
//		var data;
//		alert("教师分页测试:"+pageCurrentNum);
//		data=pageInfo(result,pageInfo_id,pageCurrentNum);
		
		$.each(result,function(index,data){
				console.log("item:"+data);	
				console.log("index:"+index);
				if(index == "extend"){
					console.log(data.YGDetailList);	
					var list=data.YGDetailList;
					YGZH_Detail = list;
					for(var i=0;i<list.length;i++){
						var item = list[i];
						var xxjd;
						var xscj;
						console.log("hahaha"+item.kcjd);
						if(item.kcjd == 0){
							xxjd="未开始";
						}else{
							if(item.kcjd == 1){
								xxjd="学习中";
							}else{
								xxjd="已完成";
							}
						}
						if(item.fraction =='null' || item.fraction == null || item.fraction == "Null"){
							xscj="--";
						}else{
							xscj=item.fraction;
						}
						console.log("员工分数："+xscj);
						console.log("课程名称："+item.courseType.kcmc+"选修必修:"+item.courseType.xxbx+"成绩:"+item.fraction+"学习进度"+xxjd);
						modal+=	'<div class="row">	'				       
						        +'<div class="col-xs-6">'
								+item.courseType.kcmc
							    +"</div>"
							    +' <div class="col-xs-2">'
							    +item.courseType.xxbx
							    +'</div>'
						        +'<div class="col-xs-2">'
						        +xscj
						        +'</div>'
						        +'<div class="col-xs-2">'
						        +xxjd
						        +'</div>'
						        +'</div>'
					}
				}
			})
			var yearEnd1=document.getElementById("yearEndDetail");
			yearEnd1.innerHTML=modal;
			var YGZH_yearEnd = document.getElementById("YGZH_yearEnd");
			YGZH_yearEnd.innerHTML = ygzh;
			$("#grademanager").modal();
		}
	})
	/*return modal;*/
}


/*function test(Names){
	var Name
	for (var i=1;i<4;i++){
		var tempname="mune_x"+i
		var NewsHot="x"+i
		if (Names==tempname){
			Nnews=document.getElementById(NewsHot)
			Nnews.style.display='';
		}else{
			Nnews=document.getElementById(NewsHot)
			Nnews.style.display='none';
		}
	}
}
*/
//select XXBX(选修必修) from endYearDetail
//author by Jaylin_Yang 2019.7.1

function selectXXBX(){
	var value = $('#selectXXBX').val();
	console.log("选修必修："+value);
	var modal="";
	for(var i=0;i<YGZH_Detail.length;i++){
		var item = YGZH_Detail[i];
		var xxjd;
		var xscj;
		if(item.kcjd == 0){
			xxjd="未开始";
		}else{
			if(item.kcjd == 1){
				xxjd="学习中";
			}else{
				xxjd="已完成";
			}
		}
		console.log("Fraction:"+item.fraction);
		if(item.fraction == null || item.fraction == "null" || item.fraction == "Null"){
			xscj="--";
		}else{
			xscj=item.fraction;
		}
		if(item.courseType.xxbx == value){
			console.log("必修选修已匹配！");
			modal+=	'<div class="row">	'				       
		        +'<div class="col-xs-6">'
				+item.courseType.kcmc
			    +"</div>"
			    +' <div class="col-xs-2">'
			    +item.courseType.xxbx
			    +'</div>'
		        +'<div class="col-xs-2">'
		        +xscj
		        +'</div>'
		        +'<div class="col-xs-2">'
		        +xxjd
		        +'</div>'
		        +'</div>'
		}
	}
	var yearEnd1=document.getElementById("yearEndDetail");
	yearEnd1.innerHTML=modal;
}

//search everything from endYearSearch
//author by Jaylin_Yang 2019.7.1
function endYearSearch(){
	var keyword = $('#endYearSearch').val();
	if(keyword == "合格" || keyword == "不合格"){
		console.log("是否合格"+keyword)
		searchByPass(keyword);
	}else{
		$.ajax({
			url : "searchYearEnd?ygzh="+keyword,
			type : "POST",
			data : "",
			dataType : "json",
			async : true,
			contentType : "application/json",
			success : function(result) {					
				var html="";
				$.each(result,function(index,data){
					console.log("item:"+data);	
					console.log("index:"+index);
					if(index == "extend"){
						console.log(data.searchYearEndResult);	
						var list=data.searchYearEndResult;
						for(var i=0;i<list.length;i++){
							var item = list[i];
							var pass;
							var xxkcxf;
							if(item.bxzd3==null||item.bxzd3=="null"){
								xxkcxf=0;
							}else{
								xxkcxf=parseInt(item.bxzd3);
							}
							var zxf=parseInt(item.ygbxxf)+parseInt(item.ygxxxf)+parseInt(xxkcxf);
							var zyq=parseInt(item.department.zfyq);
							if(zyq>zxf){
								pass="不合格";
							}else if(parseInt(item.department.bxxfyq)>parseInt(item.ygbxxf)){
								pass="不合格";
							}else{
								pass="合格";
							}
							
							html+='<div class="row">'
								+'<div class="col-xs-2">'
			                    + item.ygzh
			                    +'</div>'
			                	+'<div class="col-xs-2">'
			                    + item.bxzd2
			                    +'</div>'
			                    +'<div class="col-xs-1">'
								+ xxkcxf
								+'</div>'
								+'<div class="col-xs-1">'
								+ item.ygbxxf+'/'+item.department.bxxfyq
								+'</div>'
								+'<div class="col-xs-1">'
			                    + item.ygxxxf
			                    +'</div>'
			                    +'<div class="col-xs-2">'
			                    + zxf+'/'+zyq
			                    +'</div>'
			                    +'<div class="col-xs-2">'
			                    + pass
			                    +'</div>'
			                    +'<div class="col-xs-1">'
			                	+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#viewEndRecord"  onclick="viewEndRecord(\''
			                		+item.ygzh+'\')">详情</button> '
			                    +'</div>'
			                    +'</div>';
						}
					}
				});
				//$("#yearEnd").html(html);
				var yearEnd=document.getElementById("yearEnd");
				yearEnd.innerHTML=html;
			}
		});
	}
}

//search the passed employee from yearEndResult
function searchByPass(keyword){
	var html=""
	for(var i=0;i<searchYearEnd.length;i++){
		var item = searchYearEnd[i];
		var pass;
		var xxkcxf;
		if(item.bxzd3==null||item.bxzd3=="null"){
			xxkcxf=0;
		}else{
			xxkcxf=parseInt(item.bxzd3);
		}
		var zxf=parseInt(item.ygbxxf)+parseInt(item.ygxxxf)+parseInt(xxkcxf);
		var zyq=parseInt(item.department.zfyq);
		if(zyq>zxf){
			pass="不合格";
		}else if(parseInt(item.department.bxxfyq)>parseInt(item.ygbxxf)){
			pass="不合格";
		}else{
			pass="合格";
		}
		
		if(pass == keyword){
			html+='<div class="row">'
				+'<div class="col-xs-2">'
	            + item.ygzh
	            +'</div>'
	        	+'<div class="col-xs-2">'
	            + item.bxzd2
	            +'</div>'
	            +'<div class="col-xs-1">'
				+ xxkcxf
				+'</div>'
				+'<div class="col-xs-1">'
				+ item.ygbxxf+'/'+item.department.bxxfyq
				+'</div>'
				+'<div class="col-xs-1">'
	            + item.ygxxxf
	            +'</div>'
	            +'<div class="col-xs-2">'
	            + zxf+'/'+zyq
	            +'</div>'
	            +'<div class="col-xs-2">'
	            + pass
	            +'</div>'
	            +'<div class="col-xs-1">'
	        	+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#viewEndRecord"  onclick="viewEndRecord(\''
	        		+item.ygzh+'\')">详情</button> '
	            +'</div>'
	            +'</div>';
		}
	}
	var yearEnd=document.getElementById("yearEnd");
	yearEnd.innerHTML=html;
}

//long转换成Date
//将long类型时间戳转换为date时间表示
function timestampToTime(timestamp) {
var date = new Date(timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
Y = date.getFullYear() + '-';//此时为四位数字表示 getYear()的话为两位数字表示
M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';//当前月份(0-11,0代表1月)
D = date.getDate() + ' ';//当前日(1-31)
h = date.getHours() + ':';
m = (date.getMinutes() < 10 ? '0' + date.getMinutes() : date.getMinutes()) +':'; 
s = (date.getSeconds() < 10 ? '0' + date.getSeconds() : date.getSeconds());
ms = date.getMilliseconds();//毫秒值
//alert(date.getSeconds());
return M + D + h + m + s;//此处可以自定义需要的显示类型
}