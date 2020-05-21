/**
 * 数据渲染
 */
$(function(){
	$(".yearEnd").click(function(){
		//getAllyearEndSelect1();
		getAllyearEndSelect();
	});
	$(".offlineRecord").click(function(){
		//getAllyearEndSelect1();
		getAllofflineRecordSelect();
	});
	
	$(".backRecord").click(function(){
		
		getAllfeedBackFormSelect();
	});
	$(".record").click(function(){
		
		getAllfeedBackFormSelect();
	});
	
	$(".department").click(function(){
		
		getAlldepartmentSelect();
	});
	/*
	 * 黄金明
	 */
	
	$(".category").click(function(){
		getAllCategory();
	});
	
	$(".course").click(function(){
		getAllCourse();
	});
	
	$(".teacher").click(function(){
		getAllTeacher();
	});
	
	$(".resource").click(function(){
		getAllResource();
	});
	
	$(".employee").click(function(){
		getAllEmployee();
	});
	
	$(".manager").click(function(){
		getManagerPassword();
	});
	
	$(".authorize").click(function(){
		getAllManager();
	});
	
	$(".selection").click(function(){
		getAllCourseSelection();
	});
	
	$("#selectBtn").click(function(){
		selectCourse();
	});
	
	$("#resource_selectBtn").click(function(){
		selectCourseResurce();
	});
	
	$("#employee_selectBtn").click(function(){
		selectEmployee();
	});
	
	/**
	 * 查询部门列表
	 * 2019.7.10
	 */
	$("#add_employee").click(function(){//点击员工新增，查询部门编号表显示对应部门
		selectDepartment();
	});
	/**
	 * 查询部门列表
	 * 2019.7.10
	 */
	
	$("#courseSelection_selectBtn").click(function(){
		selectCourseSelection();
	});
	
	$("#sort").change(function(){
		sortEmployeeListByCondition();
	});
	
	$("#courseSelection_sort").change(function(){
		sortCourseSelectionListByCondition();
	});
	
	$("#saveManagerPassword").click(function(){
		var glyzh="admin";
		modifyManagerPassword(glyzh);
	});
});

/*课程管理*/

/**
 * 模态框数据渲染 课程目录
 */
function loadCategoryModal(item){
	var modal="";
	//模态框
	modal='<div class="modal fade bs-example-modal-lg" id="viewCategory'+item.id+'" tabindex="-1"'
		 +'role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">'
		 +'<div class="modal-dialog modal-lg">'
		 +'<div class="form-horizontal">'
		 +'<div class="modal-content">'
		 +'<div class="modal-header">'
		 +'<button type="button" class="close" data-dismiss="modal"'
		 +'aria-hidden="true" onclick="closeModal()">&times;'
		 +'</button>'
		 +'<h4 class="modal-title" id="myModalLabel">'
		 +'新增类别标签'+item.id+'</h4>'
		 +'</div>'
		 +'<div class="modal-body">'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">类别编号</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="LBBH'+item.id+'" placeholder="类别编号" readonly="readonly">'		
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">类别名称</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="LBMC'+item.id+'" placeholder="类别名称">'
		 +'</div>'
		 +'</div>'					
		 +'</div>'
		 +'<div class="modal-footer">'
		 +'<button type="button" class="btn btn-default"'
		 +'data-dismiss="modal"'
		 +'onclick="closeCategoryModal('+item.id+')">关闭</button>'
		 +'<button type="button" class="btn btn-primary"'
		 +'onclick="saveCategoryChange('+item.id+')">保存修改</button>'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'</div>';	
	return modal;
}

/**
 * 模态框数据渲染 课程信息
 */
function loadCourseModal(item){
	var modal="";
	//模态框
	modal='<div class="modal fade bs-example-modal-lg" id="view'+item.id+'" tabindex="-1"'
		 +'role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">'
		 +'<div class="modal-dialog modal-lg">'
		 +'<div class="form-horizontal">'
		 +'<div class="modal-content">'
		 +'<div class="modal-header">'
		 +'<button type="button" class="close" data-dismiss="modal"'
		 +'aria-hidden="true" onclick="closeModal()">&times;'
		 +'</button>'
		 +'<h4 class="modal-title" id="myModalLabel">'
		 +'新增类别标签'+item.id+'</h4>'
		 +'</div>'
		 +'<div class="modal-body">'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">课程编号</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="KCBH'+item.id+'" placeholder="课程编号" readonly="readonly">'		
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">课程名称</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="KCMC'+item.id+'" placeholder="课程名称">'
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">课程类别</label>'
		 +'<div class="col-sm-8">'
		 +'<select class="form-control" id="KCLB'+item.id+'" placeholder="课程类别">'
		 +'</select>'											
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">课程简介</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="KCJJ'+item.id+'" placeholder="课程简介">'
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">课程教师</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="KCJS'+item.id+'" placeholder="课程教师">'
		 +'</div>'
	     +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">课程学分</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="KCXF'+item.id+'" placeholder="课程学分">'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'<div class="modal-footer">'
		 +'<button type="button" class="btn btn-default"'
		 +'data-dismiss="modal"'
		 +'onclick="closeModal('+item.id+')">关闭</button>'
		 +'<button type="button" class="btn btn-primary"'
		 +'onclick="saveChange('+item.id+')">保存修改</button>'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'</div>';
	return modal;
}

/**
 * 课程类别管理
 */
/*获取所有课程目录*/
function getAllCategory(){
	$.ajax({
		url : "course/selectAllCategory",
		type : "post",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {			
			console.log(result);			
			//课程类别渲染
			var html="";
			var modal="";
			$.each(result,function(index,item){
				modal=loadCategoryModal(item);
				//模态框
//				modal='<div class="modal fade bs-example-modal-lg" id="viewCategory'+item.id+'" tabindex="-1"'
//					 +'role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">'
//					 +'<div class="modal-dialog modal-lg">'
//					 +'<div class="form-horizontal">'
//					 +'<div class="modal-content">'
//					 +'<div class="modal-header">'
//					 +'<button type="button" class="close" data-dismiss="modal"'
//					 +'aria-hidden="true" onclick="closeModal()">&times;'
//					 +'</button>'
//					 +'<h4 class="modal-title" id="myModalLabel">'
//					 +'新增类别标签'+item.id+'</h4>'
//					 +'</div>'
//					 +'<div class="modal-body">'
//					 +'<div class="form-group">'
//					 +'<label for="input" class="col-sm-2 control-label">类别编号</label>'
//					 +'<div class="col-sm-8">'
//					 +'<input type="text" class="form-control"'
//					 +'id="LBBH'+item.id+'" placeholder="类别编号" readonly="readonly">'		
//					 +'</div>'
//					 +'</div>'
//					 +'<div class="form-group">'
//					 +'<label for="input" class="col-sm-2 control-label">类别名称</label>'
//					 +'<div class="col-sm-8">'
//					 +'<input type="text" class="form-control"'
//					 +'id="LBMC'+item.id+'" placeholder="类别名称">'
//					 +'</div>'
//					 +'</div>'					
//					 +'</div>'
//					 +'<div class="modal-footer">'
//					 +'<button type="button" class="btn btn-default"'
//					 +'data-dismiss="modal"'
//					 +'onclick="closeCategoryModal('+item.id+')">关闭</button>'
//					 +'<button type="button" class="btn btn-primary"'
//					 +'onclick="saveCategoryChange('+item.id+')">保存修改</button>'
//					 +'</div>'
//					 +'</div>'
//					 +'</div>'
//					 +'</div>'
//					 +'</div>';				
				
				//html
				//处理状态显示
				var lbzt="";
				if(item.bxzd_1==1){
					lbzt="开启";
				}else{
					lbzt="未开启";

				}
				html+='<div class="row">'
					+'<div class="col-xs-2">'
					+ (index+1)
					+'</div>'
					+'<div class="col-xs-3">'
					+ item.lbbh
					+'</div>'
					+'<div class="col-xs-3">'
					+ item.lbmc
					+'</div>'
					+'<div class="col-xs-2" id="lbzt">'
					+ lbzt
					+'</div>'
					+'<div class="col-xs-2">'	
					+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#viewCategory'+item.id+'" onclick="viewCategory(\''+item.id+'\',\''+item.lbbh+'\')">修改</button> '
					+'<button class="btn btn-warning btn-xs" onclick="setupCategory(\''+item.lbbh+'\')">开通</button> '
					+'<button class="btn btn-danger btn-xs" data-toggle="modal" data-target="" onclick="removeCategory(\''+item.lbbh+'\')">删除</button>'
					+'</div>'
					+'</div>';							
					html+=modal;
			});			
			$('#category').html(html);
		}
	});
}
/**
 * 课程管理
 */
/*获取所有课程*/
function getAllCourse(){
	$.ajax({
		url : "course/courseList",
		type : "post",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
			console.log(result);
			//课程渲染
			var html="";
			var modal="";
			$.each(result,function(index,item){
				modal=loadCourseModal(item);
//				//模态框
//				modal='<div class="modal fade bs-example-modal-lg" id="view'+item.id+'" tabindex="-1"'
//					 +'role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">'
//					 +'<div class="modal-dialog modal-lg">'
//					 +'<div class="form-horizontal">'
//					 +'<div class="modal-content">'
//					 +'<div class="modal-header">'
//					 +'<button type="button" class="close" data-dismiss="modal"'
//					 +'aria-hidden="true" onclick="closeModal()">&times;'
//					 +'</button>'
//					 +'<h4 class="modal-title" id="myModalLabel">'
//					 +'新增类别标签'+item.id+'</h4>'
//					 +'</div>'
//					 +'<div class="modal-body">'
//					 +'<div class="form-group">'
//					 +'<label for="input" class="col-sm-2 control-label">课程编号</label>'
//					 +'<div class="col-sm-8">'
//					 +'<input type="text" class="form-control"'
//					 +'id="KCBH'+item.id+'" placeholder="课程编号" readonly="readonly">'		
//					 +'</div>'
//					 +'</div>'
//					 +'<div class="form-group">'
//					 +'<label for="input" class="col-sm-2 control-label">课程名称</label>'
//					 +'<div class="col-sm-8">'
//					 +'<input type="text" class="form-control"'
//					 +'id="KCMC'+item.id+'" placeholder="课程名称">'
//					 +'</div>'
//					 +'</div>'
//					 +'<div class="form-group">'
//					 +'<label for="input" class="col-sm-2 control-label">课程类别</label>'
//					 +'<div class="col-sm-8">'
//					 +'<select class="form-control" id="KCLB'+item.id+'" placeholder="课程类别">'
//					 +'</select>'											
//					 +'</div>'
//					 +'</div>'
//					 +'<div class="form-group">'
//					 +'<label for="input" class="col-sm-2 control-label">课程简介</label>'
//					 +'<div class="col-sm-8">'
//					 +'<input type="text" class="form-control"'
//					 +'id="KCJJ'+item.id+'" placeholder="课程简介">'
//					 +'</div>'
//					 +'</div>'
//					 +'<div class="form-group">'
//					 +'<label for="input" class="col-sm-2 control-label">课程教师</label>'
//					 +'<div class="col-sm-8">'
//					 +'<input type="text" class="form-control"'
//					 +'id="KCJS'+item.id+'" placeholder="课程教师">'
//					 +'</div>'
//				     +'</div>'
//					 +'<div class="form-group">'
//					 +'<label for="input" class="col-sm-2 control-label">课程学分</label>'
//					 +'<div class="col-sm-8">'
//					 +'<input type="text" class="form-control"'
//					 +'id="KCXF'+item.id+'" placeholder="课程学分">'
//					 +'</div>'
//					 +'</div>'
//					 +'</div>'
//					 +'<div class="modal-footer">'
//					 +'<button type="button" class="btn btn-default"'
//					 +'data-dismiss="modal"'
//					 +'onclick="closeModal('+item.id+')">关闭</button>'
//					 +'<button type="button" class="btn btn-primary"'
//					 +'onclick="saveChange('+item.id+')">保存修改</button>'
//					 +'</div>'
//					 +'</div>'
//					 +'</div>'
//					 +'</div>'
//					 +'</div>';
				var kczt=item.kczt;
				if(kczt==""||kczt==null||kczt==0){
					kczt="未开课/待审核";
				}else if(kczt==1){
					kczt="开课中";
				}else if(kczt==2){
					kczt="已结课";
				}else if(kczt==4){
					kczt="审核通过";
				}else if(kczt==5){
					kczt="审核未通过";
				}
				html+='<div class="row">'
					+'<div class="col-xs-1">'
					+ (index+1)
					+'</div>'
					+'<div class="col-xs-2">'
					+'<span style="white-space: nowrap; ">'
					+ item.kcbh
					+'</span>'
					+'</div>'
					+'<div class="col-xs-2" style="overflow: hidden;text-overflow:ellipsis ">'
					+'<span style="white-space: nowrap; ">'
					+ item.kcmc
					+'</span>'
					+'</div>'
					+'<div class="col-xs-2">'
					+'<span style="white-space: nowrap; ">'
					+ item.kclb
					+'</span>'
					+'</div>'
					+'<div class="col-xs-1">'
					+'<span style="white-space: nowrap; ">'
					+ item.kcjs
					+'</span>'
					+'</div>'
					+'<div class="col-xs-1">'
					+'<span style="white-space: nowrap; ">'
					+ kczt
					+'</span>'
					+'</div>'
					+'<div class="col-xs-1">'
					+'<span style="white-space: nowrap; ">'
					+ item.kcxf
					+'</span>'
					+'</div>'
					+'<div class="col-xs-2">'	
					+'<a class="btn btn-success btn-xs" data-toggle="modal" onclick="viewCourse(\''+item.kcbh+'\',\''+item.id+'\')" data-target="#view'+item.id+'">查看</a> '
					+'<a class="btn btn-warning btn-xs" onclick="setupCourse(\''+item.kcbh+'\')">开课</a> '
					+'<a class="btn btn-danger btn-xs" onclick="removeCourse(\''+item.kcbh+'\')">移除</a> '					
					+'</div>'
					+'</div>';				
					html+=modal;
			});			
			$('#course').html(html);
		}
	});
}


/*根据类别名称查询类别信息*/
function getCategoryByName(){
	var lbmc = $("#categoryName").val();
	var category={
		"lbmc" : lbmc
	}
	if(lbmc!=""&&lbmc!=null){
		$.ajax({
			url: "course/getCategoryByName",
			type: "post",
			data: JSON.stringify(category),
			dataType: "json",
			async: true,
			contentType: "application/json",
			success: function(result){
				var html="";
				var modal="";
				$.each(result,function(index,item){
					modal=loadCategoryModal(item);
					//处理状态显示
					var lbzt="";
					if(item.bxzd_1==1){
						lbzt="开启";
					}else{
						lbzt="未开启";
	
					}
					html+='<div class="row">'
						+'<div class="col-xs-2">'
						+ (index+1)
						+'</div>'
						+'<div class="col-xs-3">'
						+ item.lbbh
						+'</div>'
						+'<div class="col-xs-3">'
						+ item.lbmc
						+'</div>'
						+'<div class="col-xs-2" id="lbzt">'
						+ lbzt
						+'</div>'
						+'<div class="col-xs-2">'	
						+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#viewCategory'+item.id+'" onclick="viewCategory(\''+item.id+'\',\''+item.lbbh+'\')">修改</button> '
						+'<button class="btn btn-warning btn-xs" onclick="setupCategory(\''+item.lbbh+'\')">开通</button> '
						+'<button class="btn btn-danger btn-xs" data-toggle="modal" data-target="" onclick="removeCategory(\''+item.lbbh+'\')">删除</button>'
						+'</div>'
						+'</div>';							
						html+=modal;
				});
				$('#category').html(html);
			}
		});
	}else{
		getAllCategory();
	}
}

/*查看类别*/
function viewCategory(id,lbbh){
	$.ajax({
		url: "course/findCategory?id="+id+"&lbbh="+lbbh,
		type: "get",
		data: {},
		dataType: "json",
		async: true,
		contentType: "application/json",
		success: function(result){
			alert(result.lbmc);
			$("#LBBH" + id).val(result.lbbh);
			$("#LBMC" + id).val(result.lbmc);
		}
	})
}

/*查看课程*/
function viewCourse(kcbh, id) {
	$.ajax({
		url : "course/findCourse?kcbh=" + kcbh,
		type : "get",
		data : {},
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			$.ajax({
				url : "course/selectAllCategory",
				type : "get",
				data : {},
				dataType : "json",
				async : true,
				contentType : "application/json",
				success : function(result) {
					var option = new Array();
					option = result;
					$.each(option, function() {
						console.log(JSON.stringify(this));
						var html = "<option>" + this.lbbh + "</option>";
						$("#KCLB" + id).append(html);
					});
					//alert(JSON.stringify(option));
				}
			});
			//alert(JSON.stringify(result));
			var data = result.course;
			$("#KCBH" + id).val(data.kcbh);
			$("#KCMC" + id).val(data.kcmc);
			$("#KCJJ" + id).val(data.kcjj);
			$("#KCJS" + id).val(data.kcjs);
			$("#KCXF" + id).val(data.kcxf);
		}
	});
}

/*根据类别编号判断是否有重复数据*/
function queryRepeatCategory(){
	var flag=false;
	var lbmc=$("#LBMC").val();
	var category={"lbmc" : lbmc};
	//console.log(JSON.stringify(category));
	$.ajax({
		url : "course/queryRepeatCategory",
		type : "post",
		data : JSON.stringify(category),
		dataType: "json",
		async: true,
		contentType : "application/json",
		success : function(result){
			if(result.lbmc!=null||result.lbmc!=""){
				console.log(result.lbmc);
				//如果数据库中有重复的值，提示用户重新输入
				flag=true;	
			}
			if(flag){
				alert("该类别已存在，请重新输入");
				$("#LBMC").focus();
			}
		}
	});
}

/*增加单个课程类别*/
function addCategory(){
	var lbmc=$("#LBMC").val();
	var lbzt=$("#LBZT").val();
	//json字符串中字段用小写字段命名
	var category={
		"lbmc" : lbmc,
		"bxzd_1" : lbzt
	};
	if(lbmc==""){
		alert("类别名称为空，请输入");
	}else if(lbzt==""){
		alert("该类别状态为空，请输入");
	}else{
	//alert(JSON.stringify(category));
		$.ajax({
			url : "course/addCategory",
			type : "post",
			data : JSON.stringify(category),
			dataType: "json",
			async: true,
			contentType : "application/json",
			success : function(result){
				if(result.addFlag=="success"){
					alert("课程目录标签增加成功");
					closeCategoryAddModal();
					getAllCategory();
				}
			}
		});
		}
}

/*关闭信息添加的模态框*/
function closeCategoryAddModal(){
	$("#addCategory").modal("hide");
	$('input').val("");
}

/*移除单个课程类别*/
function removeCategory(lbbh){
	$.ajax({
		url : "course/removeCategory?lbbh="+lbbh,
		type : "get",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			if(result.removeFlag=="success"){
				alert("课程目录标签移除成功");
				getAllCategory();
			}
		}
	});
}
/*开启课程目录的设置*/
function setupCategory(lbbh){
	var category={
		"lbbh" : lbbh
	};
	$.ajax({
		url : "course/setupCategory",
		type : "post",
		data : JSON.stringify(category),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result){
			if(result.categorySetup=="success"){
				getAllCategory();
			}
		}
	});
}

/*查询所有的课程信息，获取课程编号*/
function getAllKCBH(){
	$.ajax({
		url : "course/courseList",
		type : "post",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
			console.log(result);
			//课程渲染
			var option = new Array();
			option = result;
			$.each(option, function() {
				console.log(JSON.stringify(this));
				var html = "<option>" + this.kcbh + "</option>";
				$("#KCBH_ALL").append(html);
			});
		}
	});
}

/*移除单个课程*/
function removeCourse(kcbh){
	$.ajax({
		url : "course/removeCourse?kcbh="+kcbh,
		type : "get",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			if(result.removeFlag=="success"){
				alert("课程移除成功:"+result.removeFlag);
				getAllCourse();
			}
		}
	});
}

/*将课程设置为开课状态*/
function setupCourse(kcbh){
	var course={"kcbh":kcbh};
	var href="course/getUnsetCourse";
	$.ajax({
		url : "course/setupCourse",
		type : "post",
		data : JSON.stringify(course),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			if(result.setupFlag=="success"){					
				getAllCourse();
			}
		}	
	});
}

/*根据条件查询对应的课程信息*/
function selectCourse(){
	var condition=$('#condition').val();
	var select=$('#select option:selected');
	var key=select.attr('id');
	var value=select.val();
	if(condition==""){
		condition=null;	
	}
	console.log("被选中的值:"+key);
	//用关联数组解决键名是变量的问题
	var course = {};
	course[key]=condition;
	console.log(JSON.stringify(course));
	$.ajax({
		url : "course/getCourseByCondition",
		type : "post",
		data : JSON.stringify(course),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {			
			console.log(result);
			var modal="";
			var html="";
			$.each(result,function(index,item){				
				modal=loadCourseModal(item);
				html+='<div class="row">'
					+'<div class="col-xs-1">'
					+ (index+1)
					+'</div>'
					+'<div class="col-xs-2">'
					+'<span style="white-space: nowrap; ">'
					+ item.kcbh
					+'</span>'
					+'</div>'
					+'<div class="col-xs-2" style="overflow: hidden;text-overflow:ellipsis ">'
					+'<span style="white-space: nowrap; ">'
					+ item.kcmc
					+'</span>'
					+'</div>'
					+'<div class="col-xs-2">'
					+'<span style="white-space: nowrap; ">'
					+ item.kclb
					+'</span>'
					+'</div>'
					+'<div class="col-xs-1">'
					+'<span style="white-space: nowrap; ">'
					+ item.kcjs
					+'</span>'
					+'</div>'
					+'<div class="col-xs-1">'
					+'<span style="white-space: nowrap; ">'
					+ item.kczt
					+'</span>'
					+'</div>'
					+'<div class="col-xs-1">'
					+'<span style="white-space: nowrap; ">'
					+ item.kcxf
					+'</span>'
					+'</div>'
					+'<div class="col-xs-2">'	
					+'<a class="btn btn-success btn-xs" data-toggle="modal" onclick="viewCourse(\''+item.kcbh+'\',\''+item.id+'\')" data-target="#view'+item.id+'">查看</a> '
					+'<a class="btn btn-warning btn-xs" onclick="setupCourse(\''+item.kcbh+'\')">开课</a> '
					+'<a class="btn btn-danger btn-xs" onclick="removeCourse(\''+item.kcbh+'\')">移除</a> '					
					+'</div>'
					+'</div>';				
					html+=modal;
			});
			$("#course").html(html);
		}
	});
}
/*保存课程目录修改信息*/
function saveCategoryChange(id){	
	var lbbh=$("#LBBH" + id).val();
	var lbmc=$("#LBMC" + id).val();
	var category = {
		"id" : id,
		"lbbh" : lbbh,
		"lbmc" : lbmc
	};		
	$.ajax({
		url : "course/updateCategory",
		type : "post",
		data : JSON.stringify(category),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			var tag=false;
			console.log(result.updateFlag);
			if(result.updateFlag=="success"){				
				alert("修改课程目录成功");								
				$("#viewCategory"+id).modal("hide");				
				tag=true;
			}			
			$("#viewCategory"+id).on("hidden.bs.modal",function(){
				if(tag){
					getAllCategory();
				}
			});
		}
	});
}

//关闭类别目录模态框
function closeCategoryModal(courseId) { 	
	$("#viewCategory"+courseId).modal("hide");
}

/*保存课程修改信息*/
function saveChange(id) {
	var kcbh = $("#KCBH" + id).val();
	var kcmc = $("#KCMC" + id).val();
	var kclb = $("#KCLB" + id).val();
	var kcjj = $("#KCJJ" + id).val();
	var kcjs = $("#KCJS" + id).val();
	var kcxf = $("#KCXF" + id).val();
	var course = {
		"kcbh" : kcbh,
		"kcmc" : kcmc,
		"kclb" : kclb,
		"kcjj" : kcjj,
		"kcjs" : kcjs,
		"kcxf" : kcxf
	};
	$.ajax({
		url : "course/updateCourse",
		type : "post",
		data : JSON.stringify(course),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			alert("updateFlag" + result.updateFlag);
			if (result.updateFlag == "success") {
				var tag=false;
				alert("修改成功");
				$("#view"+id).modal("hide");
				tag=true;
				$("#view"+id).on("hidden.bs.modal",function(){
					if(tag){
						getAllCourse();
					}
				});
				/*window.location.href = "course/courseList";*/
			}
		}
	});
}

//关闭课程模态框
function closeModal(courseId) { 
	$("#KCLB" + courseId + " option:first").prop("selected", "selected");
	$("#view"+courseId).modal("hide");
}


/*人员管理*/
/**
 * 模态框数据渲染 教师
 */
function loadTeacherModal(item){
	var modal="";
	//模态框
	modal='<div class="modal fade bs-example-modal-lg" id="viewTeacher'+item.id+'" tabindex="-1"'
		 +'role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">'
		 +'<div class="modal-dialog modal-lg">'
		 +'<div class="form-horizontal">'
		 +'<div class="modal-content">'
		 +'<div class="modal-header">'
		 +'<button type="button" class="close" data-dismiss="modal"'
		 +'aria-hidden="true" onclick="closeTeacherModal('+item.id+')">&times;'
		 +'</button>'
		 +'<h4 class="modal-title" id="myModalLabel">'
		 +'新增类别标签'+item.id+'</h4>'
		 +'</div>'
		 +'<div class="modal-body">'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">教师账号</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="JSZH'+item.id+'" placeholder="教师账号" value="'+item.jszh+'" readonly="readonly">'		
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">教师姓名</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="JSXM'+item.id+'" value="'+item.jsxm+'" placeholder="教师姓名">'
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">教师性别</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="JSXB'+item.id+'" value="'+item.jsxm+'" placeholder="教师性别">'
		 +'</div>'
		 +'</div>'	
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">教师状态</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="JSDLZT'+item.id+'" value="'+item.jsdlzt+'" placeholder="教师登录状态">'
		 +'</div>'
		 +'</div>'	
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">教师年龄</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="JSNL'+item.id+'" value="'+item.jsnl+'" placeholder="教师年龄">'
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">课程编号</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="_KCLB'+item.id+'" value="'+item.kcbh+'" placeholder="课程编号">'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'<div class="modal-footer">'
		 +'<button type="button" class="btn btn-default"'
		 +'data-dismiss="modal"'
		 +'onclick="closeTeacherModal('+item.id+')">关闭</button>'
		 +'<button type="button" class="btn btn-primary"'
		 +'onclick="saveTeacherChange('+item.id+')">保存修改</button>'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'</div>';	
	return modal;
}

/**
 * 教师管理
 */
function getAllTeacher(){
	$.ajax({
		url : "employee/teacherList",
		type : "post",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {			
			console.log(result);			
			//课程类别渲染
			var html="";
			var modal="";
			$.each(result,function(index,item){
				var jsdlzt=item.jsdlzt;
				if(jsdlzt==0){
					jsdlzt="离线";
				}else if(jsdlzt==1){
					jsdlzt="在线";
				}else if(jsdlzt==2){
					jsdlzt="已解约";
				}else if(jsdlzt==3){
					jsdlzt="上线";
				}
				console.log(item);
				modal=loadTeacherModal(item);
				html+='<div class="row">'
					+'<div class="col-xs-1">'
                    + (index+1)
                    +'</div>'
                	+'<div class="col-xs-1">'
                    + item.jszh
                    +'</div>'
                    +'<div class="col-xs-1">'
					+ item.jsxm
					+'</div>'
					+'<div class="col-xs-2">'
					+ item.jszy
					+'</div>'
					+'<div class="col-xs-2">'
                    + item.jsdwbh
                    +'</div>'
                    +'<div class="col-xs-1">'
                    + jsdlzt
                    +'</div>'
                    +'<div class="col-xs-2">'
                    + item.jsmm
                    +'</div>'
                    +'<div class="col-xs-2">'
                	+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#viewTeacher'+item.id+'" onclick="viewTeacher(\''+item.jszh+'\',\''+item.id+'\')">详情</button> '
                	//+'<button class="btn btn-warning btn-xs" data-toggle="modal" data-target="#deleteObey">修改</button> '
                	+'<button class="btn btn-warning btn-xs" data-toggle="modal" onclick="engageTeacher(\''+item.jszh+'\')">聘用</button> '
                    +'<button class="btn btn-danger btn-xs" data-toggle="modal" onclick="fireTeacher(\''+item.jszh+'\')">解约</button>'
                    +'</div>'
                    +'</div>';
				html+=modal;
			});
			$("#teacher").html(html);
		}
	});
}

/*查看教师详情*/
function viewTeacher(jszh,id){ 
	$.ajax({
		url : "employee/findTeacher?jszh="+jszh+"&id="+id,
		type : "get",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
			console.log(result.jszh);
			$('#JSZH'+id).val(result.jszh);
			$('#JSXM'+id).val(result.jsxm);
			$('#JSXB'+id).val(result.jsxb);
			$('#JSDLZT'+id).val(result.jsdlzt);
			$('#JSNL'+id).val(result.jsnl);
			$('#JSBH'+id).val(result.jsbh);
		}
	});
}

/**
 * 教师信息修改后保存
 */
function saveTeacherChange(id){
	var jszh=$('#JSZH'+id).val();
	var jsxm=$('#JSXM'+id).val();
	var jsxb=$('#JSXB'+id).val();
	var jsdlzt=$('#JSDLZT'+id).val();
	var jsnl=$('#JSNL'+id).val();
	var jsbh=$('#JSBH'+id).val();
	var teacher={
		"jszh" : jszh,
		"jsxm" : jsxm,
		"jsxb" : jsxb,
		"jsdlzt" : jsdlzt,
		"jsnl" : jsnl,
		"jsdwbh" : jsbh
	};
	$.ajax({
		url : "employee/updateTeacher",
		type : "post",
		data : JSON.stringify(teacher),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
			var tag=false;
			console.log(result.teacherUpdate);
			if(result.teacherUpdate=="success"){				
				alert("修改教师信息成功");								
				$("#viewTeacher"+id).modal("hide");				
				tag=true;
			}			
			$("#viewTeacher"+id).on("hidden.bs.modal",function(){
				if(tag){
					getAllTeacher();
				}
			});
		}
	});
}
/**
 * 关闭教师详情模态框
 */
function closeTeacherModal(teacherId){
	$("#viewTeacher"+teacherId).modal("hide");
}

/**
 * 聘用教师
 */
function engageTeacher(jszh){
	var teacher={
			"jszh" : jszh
		}
	$.ajax({
		url : "employee/engageTeacher",
		type : "post",
		data : JSON.stringify(teacher),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
			var tag=false;
			console.log("聘用教师"+result);
			if(result.teacherEngage=="success"){
				alert("教师账户:"+jszh+"被成功聘用");
				getAllTeacher();
			}
			
		}
	});
}

/**
 * 解约教师
 */
function fireTeacher(jszh){
	var teacher={
		"jszh" : jszh
	}
	$.ajax({
		url : "employee/fireTeacher",
		type : "post",
		data : JSON.stringify(teacher),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
			var tag=false;
			console.log("解约教师"+result);
			if(result.teacherFire=="success"){
				alert("教师账户:"+jszh+"被成功解约");
				getAllTeacher();
			}
			
		}
	});
}


/**
 * 添加教师
 */
function addTeacher(){
	var jszh=$('#JSZH').val();
	var jsxm=$('#JSXM').val();
	var jszy=$('#JSZY').val();
	var jsdwbh=$('#JSDWBH').val();
	var jsmm=$('#JSMM').val();
	var kcbh=$('#KCBH').val();
	var jsdlzt=0;
	jsdwbh="1101";
	var teacher={
			"jszh" : jszh,
			"jsxm" : jsxm,
			"jszy" : jszy,
			"jsmm" : jsmm,
			"jsdwbh" : jsdwbh,
			"kcbh" : kcbh,
			"jsdlzt" : jsdlzt
		}
	console.log(teacher);
		$.ajax({
			url : "employee/addTeacher",
			type : "post",
			data : JSON.stringify(teacher),
			dataType : "json",
			async : true,
			contentType : "application/json",
			success : function(result) {	
				var tag=false;
				console.log("添加教师"+result);
				if(result.teacherAdd=="success"){
					alert("教师账户:"+jszh+"添加成功");
					closeAddTeacherModal();
					getAllTeacher();
				}
				
			}
		});
}
/*关闭教师添加模态框*/
function closeAddTeacherModal(){
	$("#addTeacher").modal("hide");
	$('input').val("");
}

/*根据教师姓名查询教师*/
function getTeacherByName(){
	var teacherName=$("#Name").val();
	$.ajax({
		url : "employee/getTeacherByName?name="+teacherName,
		type : "get",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {				
			var modal="";
			var html="";
			console.log(result);
			$.each(result,function(index,item){
				modal=loadTeacherModal(item);
				var jsdlzt=item.jsdlzt;
				if(jsdlzt==0){
					jsdlzt="离线";
				}else if(jsdlzt==1){
					jsdlzt="在线";
				}else if(jsdlzt==2){
					jsdlzt="已解约";
				}
				html+='<div class="row">'
					+'<div class="col-xs-1">'
                    + (index+1)
                    +'</div>'
                	+'<div class="col-xs-1">'
                    + item.jszh
                    +'</div>'
                    +'<div class="col-xs-1">'
					+ item.jsxm
					+'</div>'
					+'<div class="col-xs-2">'
					+ item.jszy
					+'</div>'
					+'<div class="col-xs-2">'
                    + item.jsdwbh
                    +'</div>'
                    +'<div class="col-xs-1">'
                    + jsdlzt
                    +'</div>'
                    +'<div class="col-xs-2">'
                    + item.jsmm
                    +'</div>'
                    +'<div class="col-xs-2">'
                	+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#viewTeacher'+item.id+'" onclick="viewTeacher(\''+item.jszh+'\',\''+item.id+'\')">详情</button> '
                	+'<button class="btn btn-warning btn-xs" data-toggle="modal" data-target="#deleteObey">修改</button> '
                    +'<button class="btn btn-danger btn-xs" data-toggle="modal" data-target="#" onclick="fireTeacher(\''+item.jszh+'\')">解约</button>'
                    +'</div>'
                    +'</div>';
					html+=modal;
			});
			$("#teacher").html(html);
		}
	});
}

/*资源管理*/
/**
 * 模态框数据渲染 资源审查
 */
function loadResourceModal(item){
	var modal="";
	//模态框
	modal='<div class="modal fade bs-example-modal-lg" id="viewCourseResource'+item.id+'" tabindex="-1"'
		 +'role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">'
		 +'<div class="modal-dialog modal-lg">'
		 +'<div class="form-horizontal">'
		 +'<div class="modal-content">'
		 +'<div class="modal-header">'
		 +'<button type="button" class="close" data-dismiss="modal"'
		 +'aria-hidden="true" onclick="closeSourceModal('+item.id+')">&times;'
		 +'</button>'
		 +'<h4 class="modal-title" id="myModalLabel">'
		 +'新增资源标签'+item.id+'</h4>'
		 +'</div>'
		 +'<div class="modal-body">'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">课程编号</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="KCBH'+item.id+'" placeholder="课程编号" value="'+item.kcbh+'" readonly="readonly">'		
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">课程名称</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="KCMC'+item.id+'" value="'+item.kcmc+'" readonly="readonly" placeholder="课程名称">'
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">章节名称</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="ZJMC'+item.id+'" value="'+item.zjmc+'" readonly="readonly" placeholder="章节名称">'
		 +'</div>'
		 +'</div>'	
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">资源类型</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="ZYLX'+item.id+'" value="'+item.zylx+'" readonly="readonly" placeholder="资源类型">'
		 +'</div>'
		 +'</div>'	
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">资源路径</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="ZYLJ'+item.id+'" value="'+item.zylj+'" readonly="readonly" placeholder="资源路径">'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'<div class="modal-footer">'
		 +'<button type="button" class="btn btn-default"'
		 +'data-dismiss="modal"'
		 +'onclick="closeResourceModal('+item.id+')">关闭</button>'
		 +'<button type="button" class="btn btn-primary"'
		 +'onclick="saveResourceChange('+item.id+')">保存修改</button>'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'</div>';	
	return modal;
}

/*获取所有课程资源*/
function getAllResource(){
	$.ajax({
		url : "course/resourceList",
		type : "post",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {		
			console.log(result);
			var html="";
			var modal="";			
			$.each(result,function(index,item){
				var shzt=item.bxzd1;
				var jdlj="../STMIS/";
				//console.log(shzt);
				if(shzt==null||shzt==""||shzt==0){
					shzt="待审核";
				}else if(shzt==1){
					shzt="通过"
				}else if(shzt==2){
					shzt="未通过"
				}
				modal=loadResourceModal(item);
				html+='<div class="row">'
					+'<div class="col-xs-1">'
                    + (index+1)
                    +'</div>'
                	+'<div class="col-xs-2" style="white-space: nowrap;  overflow: hidden;text-overflow:ellipsis;">'
                    + item.kcbh
                    +'</div>'
                    +'<div class="col-xs-2" style="white-space: nowrap;  overflow: hidden;text-overflow:ellipsis;">'
					+ item.kcmc
					+'</div>'
					+'<div class="col-xs-2" style="white-space: nowrap; overflow: hidden;text-overflow:ellipsis;">'
					+ item.zjmc
					+'</div>'
					+'<div class="col-xs-1" style="white-space: nowrap; overflow: hidden;text-overflow:ellipsis;">'
                    + item.zylx
                    +'</div>'
                    +'<div class="col-xs-1" style="white-space: nowrap; overflow: hidden;text-overflow:ellipsis;">'
                    + shzt
                    +'</div>'
                    +'<div class="col-xs-2">'
                	+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#viewCourseResource'+item.id+'" onclick="viewCourseResource(\''+item.id+'\',\''+item.kcbh+'\')">详情</button> '
                	+'<button class="btn btn-warning btn-xs" data-toggle="modal" data-target="#viewVideo" onclick="viewVideo(\''+item.id+'\',\''+jdlj+item.zylj+'\',\''+item.kcbh+'\')">审核</button> '
                    +'</div>'
                    +'<div class="col-xs-1">'                    
                	+'<label><input class="select" name="select" id="checkbox'+item.id+'" type="checkbox" value="'+item.id+'" label="'+item.kcbh+'"/></label>'                	
                    +'</div>'                    
                    +'</div>';
				html+=modal;
			})
			$("#resource").html(html);			
		}		
	});
}

/*根据课程编号和课程id查找对应的课程资源*/
function viewCourseResource(id,kcbh){
	$.ajax({
		url : "course/findCourseResource?id="+id+"&kcbh="+kcbh,
		type : "get",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result){
			console.log(result);
			$('#KCBH'+id).val(result.kcbh);
			$('#KCMC'+id).val(result.kcmc);
			$('#ZJMC'+id).val(result.zjmc);
			$('#ZYLX'+id).val(result.zylx);
			$('#ZYLJ'+id).val(result.zylj);
		}
	});
}

/*查看视频*/
function viewVideo(id,zylj,kcbh){
	//alert(zylj);
	$("#viewVideo #video").attr("src",zylj);
	$("#viewVideo #video").attr("label",kcbh);
	$("#viewVideo #pass").val(id);	
	$("#viewVideo #refuse").val(id);
}

/*审核视频通过*/
function videoPass(){
	var id=$("#viewVideo #pass").val();
	var kcbh=$("#viewVideo #video").attr("label");
	console.log("id:"+id);
	var courseResource={
		"id" : id,
		"kcbh" : kcbh
	}
	console.log(courseResource);
	$.ajax({
		url : "course/passCourseResource",
		type : "post",
		data : JSON.stringify(courseResource),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result){
			console.log(result);			
			if(result.courseResourcePass=="success"){				
				alert("审核通过");							
				$("#viewVideo").modal("hide");
				$("#viewVideo #video").attr("src","");			
				tag=true;
			}			
			$("#viewVideo").on("hidden.bs.modal",function(){
				if(tag){
					getAllResource();
				}
			});
		}
	});
}

/*审核视频不通过*/
function videoRefuse(){
	var id=$("#viewVideo #refuse").val();
	var kcbh=$("#viewVideo #video").attr("label");
	console.log("id:"+id);
	var courseResource={
		"id" : id,
		"kcbh" : kcbh
	}
	$.ajax({
		url : "course/refuseCourseResource",
		type : "post",
		data : JSON.stringify(courseResource),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result){
			console.log(result);
			
			if(result.courseResourceRefuse=="success"){		
				alert("审核未通过");
				$("#viewVideo").modal("hide");
				tag=true;
			}			
			$("#viewVideo").on("hidden.bs.modal",function(){
				if(tag){
					getAllResource();
				}
			});
		}
	});
}

/*关闭视频模态框*/
function closeVideoModal(){
	$("#viewVideo").modal("hide");
	$("#viewVideo #video").attr("src","");
}

/*课程视频审核复选框全选*/
function chooseAll(){
	$("#resource .select").each(function(){
		$(this).prop("checked",true);
		console.log(this.value);
	});
}

/*课程视频审核复选框反选*/
function cancelAll(){
	$("#resource .select").each(function(){
		$(this).prop("checked",false);
	});
}

/*一键审核通过*/
function batchPassCourseResource(){
	var selectedArray=new Array();
	var courseResourceArray=new Array();
	$("#resource .select").each(function(){
		var course={}
		var val=$(this).val();
		var kcbh=$(this).attr("label");		
		courseResource={
			"kcbh" : kcbh 
		};
		if($(this).prop("checked")){
			selectedArray.push(val);
			courseResourceArray.push(courseResource);
		}
	});
	console.log(selectedArray);
	var batch=confirm("确定审核批量通过吗?");	
	if(batch==true){
		if(selectedArray.length!=0){
			$.ajax({
				url : "course/batchPassCourseResource",
				type : "post",
				data : {batchPass : selectedArray},
				dataType : "json",
				async : true,
		//		contentType : "application/json",
				success : function(result){
					var tag=false;//是否批量处理完成
					if(result.courseResourceBatchPass=="success"){
						tag=true;
						$('#loading_pass').modal('hide');
					}
					$("#loading_pass").on("hidden.bs.modal",function(){
						if(tag){		
							alert("批量审核通过");
							getAllResource();							
						}
					});
					//批量查找所有课程，根据课程资源状态修改课程状态
					batchUpdateCourseByKCBH(courseResourceArray);
				}
			});
		}else{
			$('#loading_pass').modal({backdrop: 'static', keyboard: false});
			alert("没有选择资源对象");
		}
	}else{
		$('#loading_pass').modal({backdrop: 'static', keyboard: false});
		alert("放弃批量操作!");			
	}
}

/*一键审核拒绝*/
function batchRefuseCourseResource(){
	var selectedArray=new Array();
	var courseResourceArray=new Array();
	$("#resource .select").each(function(){
		var course={}
		var val=$(this).val();
		var kcbh=$(this).attr("label");
		courseResource={
			"kcbh" : kcbh 
		}
		if($(this).prop("checked")){
			selectedArray.push(val);
			courseResourceArray.push(courseResource);
		}
	});
	var batch=confirm("确定审核批量不通过吗?");
	if(batch==true){
		if(selectedArray.length!=0){
			$.ajax({
				url : "course/batchRefuseCourseResource",
				type : "post",
				data : {batchRefuse : selectedArray},
				dataType : "json",
				async : true,
		//		contentType : "application/json",
				success : function(result){
					var tag=false;//是否批量处理完成
					if(result.courseResourceBatchRefuse=="success"){
						tag=true;
						$('#loading_refuse').modal('hide');
					}
					$("#loading_refuse").on("hidden.bs.modal",function(){
						if(tag){
							alert("批量审核不通过");
							getAllResource();
						}
					});		
					//批量查找所有课程，根据课程资源状态修改课程状态
					batchUpdateCourseByKCBH(courseResourceArray);
				}
			});
		}else{
			$('#loading_refuse').modal({backdrop: 'static', keyboard: false});
			alert("没有选择资源对象");			
		}
	}else{
		$('#loading_refuse').modal({backdrop: 'static', keyboard: false});		
		alert("放弃批量审核操作");						
	}
}

/*根据课程编号对应的课程资源状态批量修改课程状态*/
function batchUpdateCourseByKCBH(courseResourceArray){
	console.log(courseResourceArray);
	batchUpdate=JSON.stringify(courseResourceArray);
	console.log(batchUpdate);
	$.ajax({
		url : "course/batchUpdateCourseByKCBH",
		type : "post",
		data : batchUpdate,
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result){
			var tag=false;//是否批量处理完成
			if(result.courseBatchUpdate=="success"){
				console.log("批量修改课程信息完成");
			}			
		}
	});
}

/*根据条件查询对应的课程资源信息*/
function selectCourseResurce(){
	var condition=$('#resource_condition').val();
	var select=$('#resource_select option:selected');
	var key=select.attr('id');
	var value=select.val();
	if(condition==""){
		condition=null;	
	}
	console.log("被选中的值:"+key);
	//用关联数组解决键名是变量的问题
	var courseResource = {};
	courseResource[key]=condition;
	console.log(JSON.stringify(courseResource));
	$.ajax({
		url : "course/getCourseResourceByCondition",
		type : "post",
		data : JSON.stringify(courseResource),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {			
			console.log(result);
			var html="";
			var modal="";			
			var jdlj="../STMIS/";
			$.each(result,function(index,item){
				var shzt=item.bxzd1;
				//console.log(shzt);
				if(shzt==null||shzt==""||shzt==0){
					shzt="待审核";
				}else if(shzt==1){
					shzt="通过"
				}else if(shzt==2){
					shzt="未通过"
				}
				modal=loadResourceModal(item);
				html+='<div class="row">'
					+'<div class="col-xs-1">'
                    + (index+1)
                    +'</div>'
                	+'<div class="col-xs-2" style="white-space: nowrap;  overflow: hidden;text-overflow:ellipsis;">'
                    + item.kcbh
                    +'</div>'
                    +'<div class="col-xs-2" style="white-space: nowrap;  overflow: hidden;text-overflow:ellipsis;">'
					+ item.kcmc
					+'</div>'
					+'<div class="col-xs-2" style="white-space: nowrap; overflow: hidden;text-overflow:ellipsis;">'
					+ item.zjmc
					+'</div>'
					+'<div class="col-xs-1" style="white-space: nowrap; overflow: hidden;text-overflow:ellipsis;">'
                    + item.zylx
                    +'</div>'
                    +'<div class="col-xs-1" style="white-space: nowrap; overflow: hidden;text-overflow:ellipsis;">'
                    + shzt
                    +'</div>'
                    +'<div class="col-xs-2">'
                	+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#viewCourseResource'+item.id+'" onclick="viewCourseResource(\''+item.id+'\',\''+item.kcbh+'\')">详情</button> '
                	+'<button class="btn btn-warning btn-xs" data-toggle="modal" data-target="#viewVideo" onclick="viewVideo(\''+item.id+'\',\''+jdlj+item.zylj+'\',\''+item.kcbh+'\')">审核</button> '
                    +'</div>'
                    +'<div class="col-xs-1">'                    
                	+'<label><input class="select" name="select" id="checkbox'+item.id+'" type="checkbox" value="'+item.id+'" label="'+item.kcbh+'"/></label>'                	
                    +'</div>'                    
                    +'</div>';
				html+=modal;
			});
			$("#resource").html(html);	
		}
	});
}

/**
 * 模态框数据渲染 员工
 */
function loadEmployeeModal(item){
	var modal="";
	//模态框
	modal='<div class="modal fade bs-example-modal-lg" id="viewEmployee'+item.id+'" tabindex="-1"'
		 +'role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">'
		 +'<div class="modal-dialog modal-lg">'
		 +'<div class="form-horizontal">'
		 +'<div class="modal-content">'
		 +'<div class="modal-header">'
		 +'<button type="button" class="close" data-dismiss="modal"'
		 +'aria-hidden="true" onclick="closeEmployeeModal('+item.id+')">&times;'
		 +'</button>'
		 +'<h4 class="modal-title" id="myModalLabel">'
		 +'用户标签'+item.id+'</h4>'
		 +'</div>'
		 +'<div class="modal-body">'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">员工账号</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="YGZH'+item.id+'" placeholder="员工账号" readonly="readonly" value="'+item.ygzh+'">'		
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">员工密码</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="YGMM'+item.id+'" value="'+item.ygmm+'" placeholder="员工密码">'
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">员工姓名</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="YGXM'+item.id+'" value="'+item.ygxm+'" placeholder="员工姓名">'
		 +'</div>'
		 +'</div>'	
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">员工性别</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="YGXB'+item.id+'" value="'+item.ygxb+'" placeholder="员工性别">'
		 +'</div>'
		 +'</div>'	
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">员工电话</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="YGDH'+item.id+'" value="'+item.ygdh+'" placeholder="员工电话">'
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">员工邮箱</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="YGYX'+item.id+'" value="'+item.ygyx+'" placeholder="员工邮箱">'
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">员工地址</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="YGSSDW'+item.id+'" value="'+item.ygdz+'" placeholder="员工地址">'
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">员工单位</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"' 
		 +'id="YGDWBH'+item.id+'" value="'+item.ygdwbh+'" readonly placeholder="员工单位">'
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">员工登录状态</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="YGDLZT'+item.id+'" value="'+item.ygdlzt+'" placeholder="员工登录状态">'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'<div class="modal-footer">'
		 +'<button type="button" class="btn btn-default"'
		 +'data-dismiss="modal"'
		 +'onclick="closeEmployeeModal('+item.id+')">关闭</button>'
		 +'<button type="button" class="btn btn-primary"'
		 +'onclick="saveEmployeeChange('+item.id+')">保存修改</button>'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'</div>';	
	return modal;
}
/*渲染员工学分信息*/
function loadEmployeeCreditModal(item){
	var modal="";
	//模态框
	modal='<div class="modal fade bs-example-modal-lg" id="viewEmployeeCredit'+item.id+'" tabindex="-1"'
		 +'role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">'
		 +'<div class="modal-dialog modal-lg">'
		 +'<div class="form-horizontal">'
		 +'<div class="modal-content">'
		 +'<div class="modal-header">'
		 +'<button type="button" class="close" data-dismiss="modal"'
		 +'aria-hidden="true" onclick="closeEmployeeCreditModal('+item.id+')">&times;'
		 +'</button>'
		 +'<h4 class="modal-title" id="myModalLabel">'
		 +'用户学分标签'+item.id+'</h4>'
		 +'</div>'
		 +'<div class="modal-body">'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">员工账号</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="YGZH'+item.id+'" placeholder="员工账号" value="'+item.ygzh+'" readonly="readonly">'		
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">员工学分</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="YGXF'+item.id+'" value="'+item.ygxf+'"  placeholder="员工学分">'
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">员工成绩</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="YGCJ'+item.id+'" value="'+item.ygcj+'"  placeholder="员工成绩">'
		 +'</div>'
		 +'</div>'	
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">员工培训要求</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="YGPXYQ'+item.id+'" value="'+item.ygpxyq+'" placeholder="员工培训要求">'
		 +'</div>'
		 +'</div>'	
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">员工培训总评</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="YGPXZP'+item.id+'" value="'+item.ygpxzp+'"  placeholder="员工培训总评">'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'<div class="modal-footer">'
		 +'<button type="button" class="btn btn-default"'
		 +'data-dismiss="modal"'
		 +'onclick="closeEmployeeCreditModal('+item.id+')">关闭</button>'
		 +'<button type="button" class="btn btn-primary"'
		 +'onclick="saveEmployeeCreditChange('+item.id+')">保存修改</button>'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'</div>';	
	return modal;
}

/*显示所有员工用户列表*/
function getAllEmployee(){
	$.ajax({
		url : "employee/employeeList",
		type : "post",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {			
			console.log(result);			
			//课程类别渲染
			var html="";
			var modal="";
			var creditModal="";
			$.each(result,function(index,item){
				var ygdlzt=item.ygdlzt;
				var ygzt=item.yzgt;
				//var ygssdw=item.bxzd_1;
				var ygssdw=item.ygdz;
				if(ygdlzt==0||ygdlzt==""||ygdlzt==null){
					ygdlzt="注销";
				}else if(ygdlzt==1){
					ygdlzt="在职";
				}else if(ygdlzt==2){
					ygdlzt="离职";
				}
				if(ygzt==0||ygzt==null||ygzt==""){
					ygzt="离线";
				}else if(ygzt==1){
					ygzt="在线";
				}
				
				console.log(item);
				modal=loadEmployeeModal(item);
				creditModal=loadEmployeeCreditModal(item);
				html+='<div class="row">'
					+'<div class="col-xs-1">'
                    + (index+1)
                    +'</div>'
                	+'<div class="col-xs-1">'
                    + item.ygzh
                    +'</div>'
                    +'<div class="col-xs-1">'
					+ item.ygmm
					+'</div>'
					+'<div class="col-xs-1">'
					+ item.ygxm
					+'</div>'
					+'<div class="col-xs-2">'
                    + item.ygdh
                    +'</div>'
                    +'<div class="col-xs-2" style="white-space: nowrap;  overflow: hidden;text-overflow:ellipsis;">'
                    + ygssdw
                    +'</div>'
                    +'<div class="col-xs-2">'
                    + ygdlzt
                    +'</div>'
//                    +'<div class="col-xs-1">'
//                    + item.ygcj
//                    +'</div>'
                    +'<div class="col-xs-2">'
                	+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#viewEmployee'+item.id+'" onclick="viewEmployee(\''+item.ygzh+'\',\''+item.id+'\')">详情</button> '
//                	+'<button class="btn btn-warning btn-xs" data-toggle="modal" data-target="#viewEmployeeCredit'+item.id+'" onclick="viewEmployeeCredit(\''+item.ygzh+'\',\''+item.id+'\')">成绩</button> '
                	+'<button class="btn btn-warning btn-xs" data-toggle="modal" onclick="engageEmployee(\''+item.ygzh+'\',\''+item.id+'\')">解锁</button> '
                    +'<button class="btn btn-danger btn-xs" data-toggle="modal" data-target="" onclick="removeEmployee(\''+item.id+'\')">冻结</button>'
                    +'</div>'
                    +'</div>';
				html+=modal;
				html+=creditModal;
			});
			$("#employee").html(html);
		}
	});
}

/*查看员工详情*/
function viewEmployee(ygzh,id){ 
	$.ajax({
		url : "employee/findEmployee?ygzh="+ygzh+"&id="+id,
		type : "get",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
			$('#YGZH'+id).val(result.ygzh);
			$('#YGMM'+id).val(result.ygmm);
			$('#YGXM'+id).val(result.ygxm);
			$('#YGXB'+id).val(result.ygxb);
			$('#YGDH'+id).val(result.ygdh);
			$('#YGYX'+id).val(result.ygyx);
			$('#YGDLZT'+id).val(result.ygdlzt);
			$('#YGSSDW'+id).val(result.ygdz);
//			$('#YGSSDW'+id).val(result.bxzd_1);
			viewEmployeeDept(result.ygdwbh,id);
		}
	});
}

/*保存员工详情修改*/
function saveEmployeeChange(id){
	var employee={};
	var ygzh=$("#YGZH" + id).val();
	var ygmm=$("#YGMM" + id).val();
	var ygxm=$("#YGXM" + id).val();
	var ygxb=$("#YGXB" + id).val();
	var ygdh=$("#YGDH" + id).val();
	var ygyx=$("#YGYX" + id).val();
	var ygdlzt=$("#YGDLZT" + id).val();
	var ygssdw=$("#YGSSDW"+ id).val();
	employee={
		"id" : id,
		"ygzh" : ygzh,
		"ygmm" : ygmm,
		"ygxm" : ygxm,
		"ygxb" : ygxb,
		"ygdh" : ygdh,
		"ygyx" : ygyx,
		"ygdlzt" : ygdlzt,
		"ygdz" : ygssdw
	};
	console.log(JSON.stringify(employee));
	$.ajax({
		url : "employee/saveEmployeeChange",
		type : "post",
		data : JSON.stringify(employee),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			var tag=true;
			if(result.employeeSave=="success"){				
				alert("员工信息修改成功");								
				$("#viewEmployee"+id).modal("hide");				
				tag=true;
			}			
			$("#viewEmployee"+id).on("hidden.bs.modal",function(){
				if(tag){
					getAllEmployee();
				}
			});
		}
	});
}

/*保存员工学分信息修改*/
function saveEmployeeCreditChange(id){
	var employee={};
	var ygzh=$("#YGZH" + id).val();
	var ygxf=$("#YGXF" + id).val();
	var ygcj=$("#YGCJ" + id).val();
	var ygpxyq=$("#YGPXYQ" + id).val();
	var ygpxzp=$("#YGPXZP" + id).val();
	employee={
		"id" : id,
		"ygzh" : ygzh,
		"ygxf" : ygxf,
		"ygpxyq" : ygpxyq,
		"ygpxzp" : ygpxzp
	};
	console.log(JSON.stringify(employee));
	$.ajax({
		url : "employee/saveEmployeeCreditChange",
		type : "post",
		data : JSON.stringify(employee),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			var tag=true;
			if(result.employeeCreditSave=="success"){				
				alert("员工信息修改成功");								
				$("#viewEmployeeCredit"+id).modal("hide");				
				tag=true;
			}			
			$("#viewEmployeeCredit"+id).on("hidden.bs.modal",function(){
				if(tag){
					getAllEmployee();
				}
			});
		}
	});
}

/*关闭员工详情模态框*/
function closeEmployeeModal(id){
	$("#viewEmployee"+id).modal("hide");
	//$('input').val("");
}

/*查看员工学分*/
function viewEmployeeCredit(ygzh,id){ 
	$.ajax({
		url : "employee/findEmployee?ygzh="+ygzh+"&id="+id,
		type : "get",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			console.log(result);
			$('#YGZH'+id).val(result.ygzh);
			$('#YGXF'+id).val(result.ygxf);
			$('#YGCJ'+id).val(result.ygcj);
			$('#YGPXYQ'+id).val(result.ygpxyq);
			$('#YGPXZP'+id).val(result.ygpxzp);
		}
	});
}

/*关闭员工学分查看模态框*/
function closeEmployeeCreditModal(id){
	$("#viewEmployeeCredit"+id).modal("hide");
	//$('input').val("");
}

/*根据就用户输入的员工条件返回对应的员工列表*/
function selectEmployee(){
	var condition=$('#employee_condition').val();
	var select=$('#employee_select option:selected');
	var key=select.attr('id');
	var value=select.val();
	if(condition==""){
		condition=null;	
	}
	console.log("被选中的值:"+key);
	//用关联数组解决键名是变量的问题
	var employee = {};
	employee[key]=condition;
	console.log(JSON.stringify(employee));
	$.ajax({
		url : "employee/getEmployeeByCondition",
		type : "post",
		data : JSON.stringify(employee),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {			
			console.log(result);
			var html="";
			var modal="";	
			$.each(result,function(index,item){
				var ygdlzt=item.ygdlzt;
				var ygzt=item.yzgt;
				var ygssdw=item.bxzd_1;
				if(ygdlzt==0||ygdlzt==""||ygdlzt==null){
					ygdlzt="注销";
				}else if(ygdlzt==1){
					ygdlzt="在职";
				}else if(ygdlzt==2){
					ygdlzt="离职";
				}
				if(ygzt==0||ygzt==null||ygzt==""){
					ygzt="离线";
				}else if(ygzt==1){
					ygzt="在线";
				}
				
				console.log(item);
				modal=loadEmployeeModal(item);
				creditModal=loadEmployeeCreditModal(item);
				html+='<div class="row">'
					+'<div class="col-xs-1">'
                    + (index+1)
                    +'</div>'
                	+'<div class="col-xs-1">'
                    + item.ygzh
                    +'</div>'
                    +'<div class="col-xs-1" style="white-space: nowrap;  overflow: hidden;text-overflow:ellipsis;">'
					+ item.ygmm
					+'</div>'
					+'<div class="col-xs-1">'
					+ item.ygxm
					+'</div>'
					+'<div class="col-xs-2" style="white-space: nowrap;  overflow: hidden;text-overflow:ellipsis;">'
                    + item.ygdh
                    +'</div>'
                    +'<div class="col-xs-2" style="white-space: nowrap;  overflow: hidden;text-overflow:ellipsis;">'
                    + ygssdw
                    +'</div>'
                    +'<div class="col-xs-2">'
                    + ygdlzt
                    +'</div>'
//                    +'<div class="col-xs-1">'
//                    + item.ygcj
//                    +'</div>'
                    +'<div class="col-xs-2">'
                	+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#viewEmployee'+item.id+'" onclick="viewEmployee(\''+item.ygzh+'\',\''+item.id+'\')">详情</button> '
//                	+'<button class="btn btn-warning btn-xs" data-toggle="modal" data-target="#viewEmployeeCredit'+item.id+'" onclick="viewEmployeeCredit(\''+item.ygzh+'\',\''+item.id+'\')">成绩</button> '
                	+'<button class="btn btn-warning btn-xs" data-toggle="modal"  onclick="engageEmployee(\''+item.ygzh+'\',\''+item.id+'\')">解锁</button> '
                    +'<button class="btn btn-danger btn-xs" data-toggle="modal" data-target="" onclick="removeEmployee(\''+item.id+'\')">冻结</button>'
                    +'</div>'
                    +'</div>';
				html+=modal;
				html+=creditModal;
			});
			$("#employee").html(html);
		}
	});
}

/*按照选择的选项进行列表排序*/
function sortEmployeeListByCondition(){
	var select = $("#sort option:selected");
	var condition=select.attr("id");
	console.log(condition);
	$.ajax({
		url : "employee/sortEmployeeListByCondition?sort="+condition,
		type : "get",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
			var html="";
			var modal="";				
			$.each(result,function(index,item){				
				var ygdlzt=item.ygdlzt;
				var ygzt=item.yzgt;
				var ygssdw=item.bxzd_1;
				if(ygdlzt==0||ygdlzt==""||ygdlzt==null){
					ygdlzt="注销";
				}else if(ygdlzt==1){
					ygdlzt="在职";
				}else if(ygdlzt==2){
					ygdlzt="离职";
				}
				if(ygzt==0||ygzt==null||ygzt==""){
					ygzt="离线";
				}else if(ygzt==1){
					ygzt="在线";
				}
				console.log(item);
				modal=loadEmployeeModal(item);
				creditModal=loadEmployeeCreditModal(item);
				html+='<div class="row">'
					+'<div class="col-xs-1">'
                    + (index+1)
                    +'</div>'
                	+'<div class="col-xs-1">'
                    + item.ygzh
                    +'</div>'
                    +'<div class="col-xs-1" style="white-space: nowrap;  overflow: hidden;text-overflow:ellipsis;">'
					+ item.ygmm
					+'</div>'
					+'<div class="col-xs-1">'
					+ item.ygxm
					+'</div>'
					+'<div class="col-xs-2" style="white-space: nowrap;  overflow: hidden;text-overflow:ellipsis;">'
                    + item.ygdh
                    +'</div>'
                    +'<div class="col-xs-2" style="white-space: nowrap;  overflow: hidden;text-overflow:ellipsis;">'
                    + ygssdw
                    +'</div>'
                    +'<div class="col-xs-2">'
                    + ygdlzt
                    +'</div>'
//                    +'<div class="col-xs-1">'
//                    + item.ygcj
//                    +'</div>'
                    +'<div class="col-xs-2">'
                	+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#viewEmployee'+item.id+'" onclick="viewEmployee(\''+item.ygzh+'\',\''+item.id+'\')">详情</button> '
//                	+'<button class="btn btn-warning btn-xs" data-toggle="modal" data-target="#viewEmployeeCredit'+item.id+'" onclick="viewEmployeeCredit(\''+item.ygzh+'\',\''+item.id+'\')">成绩</button> '
                	+'<button class="btn btn-warning btn-xs" data-toggle="modal"  onclick="engageEmployee(\''+item.ygzh+'\',\''+item.id+'\')">解锁</button> '
                    +'<button class="btn btn-danger btn-xs" data-toggle="modal" data-target="" onclick="removeEmployee(\''+item.id+'\')">冻结</button>'
                    +'</div>'
                    +'</div>';
				html+=modal;
				html+=creditModal;
			});
			$("#employee").html(html);
		}
	});
}

/*根据员工账号解锁员工*/
function engageEmployee(ygzh,id){
	var employee={};
	var ygzh=$("#YGZH" + id).val();
	employee={
		"id" : id,
		"ygzh" : ygzh,
	};
	console.log(JSON.stringify(employee));
	$.ajax({
		url : "employee/engageEmployee",
		type : "post",
		data : JSON.stringify(employee),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			var tag=true;
			if(result.employeeEngage=="success"){				
				alert("员工账号"+ygzh+"解锁成功");								
				getAllEmployee();
			}			
		}
	});
}

/*根据员工账号注销该员工*/
function removeEmployee(id){
	var employee={};
	var ygzh=$("#YGZH" + id).val();
	employee={
		"id" : id,
		"ygzh" : ygzh,
	};
	console.log(JSON.stringify(employee));
	$.ajax({
		url : "employee/removeEmployee",
		type : "post",
		data : JSON.stringify(employee),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			var tag=true;
			if(result.employeeRemove=="success"){				
				alert("员工信息修改成功");								
				getAllEmployee();
			}			
		}
	});
}

/*查询部门信息显示在员工添加模块中*/
function selectDepartment(){
	$.ajax({
		url : "department/departmentList",
		type : "post",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {			
			var data=result.extend.departmentList;
			console.log(data);
			$("#_YGDWBH").empty();
			$.each(data,function(index,item){
				//动态生成下拉框
				var option='<option value="'+item.bmbh+'">'+item.bmmc+'</option>';				
				$("#_YGDWBH").append(option);
			});			
		}
	});
}

/*根据部门编号查询对应的部门*/
function viewEmployeeDept(bmbh,id){
	$.ajax({
		url : "department/findDepartment?bmbh="+bmbh,
		type : "get",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
			console.log(result);
			$("#YGDWBH"+id).val(result.extend.department.bmmc);
		}
	});
}

/*添加员工信息*/
function addEmployee(){
	var employee={};
	var ygzh=$("#_YGZH").val();
	var ygmm=$("#_YGMM").val();
	var ygxm=$("#_YGXM").val();
	var ygdwbh=$("#_YGDWBH").val();
//	alert(ygdwbh);
	var ygdz=$("#_YGDZ").val();
	var ygpxyq=$("#_YGPXYQ option:selected").val();
	var ygdlzt=1;
	employee={
		"ygzh" : ygzh,
		"ygmm" : ygmm,
		"ygxm" : ygxm,
		"ygdwbh" : ygdwbh,
		"ygdz" : ygdz,
		"ygpxyq" : ygpxyq,
		"ygdlzt" : ygdlzt
	};
	console.log(JSON.stringify(employee));
	$.ajax({
		url : "employee/addEmployee",
		type : "post",
		data : JSON.stringify(employee),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			var tag=true;
			if(result.employeeAdd=="success"){				
				alert("员工新增成功");								
				$("#addEmployee").modal("hide");				
				tag=true;
			}			
			$("#addEmployee").on("hidden.bs.modal",function(){
				if(tag){
					getAllEmployee();
				}
			});
			$("#addEmployee input").val("");
		}
	});
}

//关闭员工增加的模态框
function closeEmployeeAddModal(){
	$("#addEmployee input").val("");
	$("#addEmployee").modal("hide");	
}

/*根据员工账号判断是否有重复数据*/
function queryRepeatEmployee(){
	var flag=false;
	var ygzh=$("#_YGZH").val();
	var employee={"ygzh" : ygzh};
	console.log(JSON.stringify(employee));
	$.ajax({
		url : "employee/queryRepeatEmployee",
		type : "post",
		data : JSON.stringify(employee),
		dataType: "json",
		async: true,
		contentType : "application/json",
		success : function(result){
			if(result.ygzh!=null||result.ygzh!=""){
				console.log(result.ygzh);
				//如果数据库中有重复的值，提示用户重新输入
				flag=true;	
			}
			if(flag){
				alert("该员工账号已存在，请重新输入");
				$("#_YGZH").focus();
			}
		}
	});
}


/**
 * 模态框数据渲染 管理员
 */
function loadManagerModal(item){
	var modal="";
	//模态框
	var glyqx=item.bxzd_2;	
	modal='<div class="modal fade bs-example-modal-lg" id="viewManager'+item.id+'" tabindex="-1"'
		 +'role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">'
		 +'<div class="modal-dialog modal-lg">'
		 +'<div class="form-horizontal">'
		 +'<div class="modal-content">'
		 +'<div class="modal-header">'
		 +'<button type="button" class="close" data-dismiss="modal"'
		 +'aria-hidden="true" onclick="closeManagerModal()">&times;'
		 +'</button>'
		 +'<h4 class="modal-title" id="myModalLabel">'
		 +'修改权限'+item.id+'</h4>'
		 +'</div>'
		 +'<div class="modal-body">'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">权限账户</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="GLYZH'+item.id+'" placeholder="管理员账户">'		
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">权限密码</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="GLYMM'+item.id+'" placeholder="管理员密码">'
		 +'</div>'
		 +'</div>'	
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">权限</label>'
		 +'<div class="col-sm-8">'
		 +'<select class="form-control" id="GLYQX'+item.id+'">'
		 +'<option title="0">部分</option>'
		 +'<option title="1">所有</option>'
		 +'</select>'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'<div class="modal-footer">'
		 +'<button type="button" class="btn btn-default"'
		 +'data-dismiss="modal"'
		 +'onclick="closeManagerModal('+item.id+')">关闭</button>'
		 +'<button type="button" class="btn btn-primary"'
		 +'onclick="saveManagerChange('+item.id+')">保存修改</button>'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'</div>';			
	return modal;
}

/*获取所有管理员信息*/
function getAllManager(){
	$.ajax({
		url : "manager/managerList",
		type : "post",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {			
			console.log(result);			
			//课程类别渲染
			var html="";
			var modal="";
			$.each(result,function(index,item){
				var glyzt=item.bxzd_1;
				var glyqx=item.bxzd_2;
				if(glyzt==""||glyzt==null||glyzt==0){
					glyzt="无效";
				}else{
					glyzt="有效";
				}
				if(glyqx==""||glyqx==null||glyqx==0){
					glyqx="部分";
				}else{
					glyqx="所有";
				}
				modal=loadManagerModal(item);
				html+='<div class="row">'
					+'<div class="col-xs-1">'
					+ (index+1)
					+'</div>'
					+'<div class="col-xs-3">'
					+item.glyzh
					+'</div>'
					+'<div class="col-xs-3">'
					+item.glymm
					+'</div>'
					+'<div class="col-xs-2">'
					+glyzt
					+'</div>'
					+'<div class="col-xs-1">'
					+glyqx
					+'</div>'
					+'<div class="col-xs-2">'
//					+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#changeChar">修改</button> '
					+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#viewManager'+item.id+'" onclick=viewManager(\''+item.glyzh+'\',\''+item.id+'\')>修改</button> '
					+'<button class="btn btn-danger btn-xs" data-toggle="modal" data-target="#deleteChar" onclick="removeManager(\''+item.glyzh+'\')">移除</button> '
					+'<button class="btn btn-info btn-xs" data-toggle="modal" onclick="setupManager(\''+item.glyzh+'\')">开启</button>'
					+'</div>'
					+'</div>';
				html+=modal;
			});
			$('#authorize').html(html);
		}
	});
}

/*根据管理员账号获取对应的管理员信息*/
function viewManager(glyzh,id){
	$.ajax({
		url : "manager/findManager?id="+id+"&glyzh="+glyzh,
		type : "get",
		data : "",
		dataType: "json",
		async: true,
		contentType : "application/json",
		success : function(result){
			var glyqx="";
			if(result!=null){
				console.log(result);
				$("#GLYZH"+id).val(result.glyzh);
				$("#GLYMM"+id).val(result.glymm);
				glyqx=result.bxzd_2;
				if(glyqx==0||glyqx==""||glyqx==null){
					$("#GLYQX"+result.id+" option:first").attr("selected","selected");
				}else{
					$("#GLYQX"+result.id+" option:last").attr("selected","selected");
				}
			}
		}
	});
}

/*保存修改后的管理员信息*/
function saveManagerChange(id){
	var manager={};
	var glyzh=$("#GLYZH"+id).val();
	var glymm=$("#GLYMM"+id).val();
	var glyqx=$("#GLYQX"+id+" option:selected").attr("title");
	manager={
		"id" : id,
		"glyzh" : glyzh,
		"glymm" : glymm,
		"bxzd_2" : glyqx
	}
	$.ajax({
		url : "manager/updateManager",
		type : "post",
		data : JSON.stringify(manager),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
			var tag=false;
			if(result.managerUpdate=="success"){				
				alert("修改管理员信息成功");								
				$("#viewManager"+id).modal("hide");				
				tag=true;
			}			
			$("#viewManager"+id).on("hidden.bs.modal",function(){
				if(tag){
					getAllManager();
				}
			});	
		}
	});
	
}

/*添加新的管理员权限*/
function addManager(){
	var manager={};
	var glyzh=$("#GLYZH").val();
	var glymm=$("#GLYMM").val();
	var glyzt=$("#BXZD_1 option:selected").attr("title");
	var glyqx=$("#BXZD_2 option:selected").attr("title");
	manager={
		"glyzh" : glyzh,
		"glymm" : glymm,
		"bxzd_1" : glyzt,
		"bxzd_2" : glyqx
	}
	console.log(manager);
	$.ajax({
		url : "manager/addManager",
		type : "post",
		data : JSON.stringify(manager),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
			var tag=false;
			console.log("添加管理员权限"+result);
			if(result.managerAdd=="success"){
				alert("管理员账户:"+glyzh+"添加成功");
				closeAddManagerModal();
				getAllManager();
			}
			
		}
	});
}

/*关闭管理员新增模态框*/
function closeAddManagerModal(){
	$("#addManager").modal("hide");
	$('input').val("");
}

/*查找管理员账户是否存在*/
function queryRepeatManager(){
	var id="";
	var glyzh=$("#GLYZH").val();
	$.ajax({
		url : "manager/findManager?id="+id+"&glyzh="+glyzh,
		type : "get",
		data : "",
		dataType: "json",
		async: true,
		contentType : "application/json",
		success : function(result){
			if(result!=null){
				alert("管理员账户已存在");
				console.log(result);
				$("#GLYZH").focus();
			}
		}
	});
}

/*移除该管理员*/
function removeManager(glyzh){
	var id="";
	$.ajax({
		url : "manager/removeManager?glyzh="+glyzh,
		type : "get",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			if(result.managerRemove=="success"){
				getAllManager();
			}
		}
	});
}

/*开启被移除的管理员账户*/
function setupManager(glyzh){
	$.ajax({
		url : "manager/setupManager?glyzh="+glyzh,
		type : "get",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			if(result.managerSetup=="success"){
				getAllManager();
			}
		}
	});
}

/*获取当前管理员信息*/
function getManagerPassword(){
	var id="";
	var glyzh="admin";
	var glymm="";
	var tag=false;
	$.ajax({
		url : "manager/findManager?id="+id+"&glyzh="+glyzh,
		type : "get",
		data : "",
		dataType: "json",
		async: true,
		contentType : "application/json",
		success : function(result){
//			alert(result.glymm);
			glymm="";
			$("#original_key").text(result.glymm);
			glymm=result.glymm;			
			tag=true;			
		}
	});
}

/*修改管理员密码*/
function modifyManagerPassword(glyzh){//管理员测试账号是admin	
	var manager={};
	var XMM=$("#XMM").val();
	manager={
		"glyzh" : glyzh,
		"glymm" : XMM
	};
	console.log(JSON.stringify(manager));
	var err_check=judgeRepeatOrDistinctPassword();
	if(err_check=="true"){
		$.ajax({
			url : "manager/modifyManagerPassword",
			type : "post",
			data : JSON.stringify(manager),
			dataType: "json",
			async: true,
			contentType : "application/json",
			success : function(result){
				if(result.passwordModify=="success"){
					alert("管理员密码修改成功！");
					getManagerPassword();
					$("#password input").val("");
				}
			}
		});
	}else if(err_check=="err_2"){
		$("#CFMM").focus();
	}else if(err_check=="err_1"){
		$("#YMM").focus();
	}else{
		
	}
}

/*判断验证新密码的输入*/
function judgeRepeatOrDistinctPassword(){
	var YMM=$("#YMM").val();
	var XMM=$("#XMM").val();
	var CFMM=$("#CFMM").val();
	var original_key=$("#original_key").text();
	if(YMM!=original_key){
		alert("原密码输入错误");		
		return "err_1";
	}else{
		return "true";
	}
	if(XMM!=CFMM){
		alert("两次密码输入不一致,请重新输入");		
		return "err_2";
	}else{
		return "true";
	}	
}

/*
 * 员工学分管理
 * 修改时间：2019.5.16
 */

/*人员管理*/
/**
 * 模态框数据渲染 员工学分
 */
function loadCourseSelectionModal(item){
	var modal="";
	var kccj=item.fraction;
	if(kccj==null||kccj==0){
		kccj=0;
	}
	//模态框
	modal='<div class="modal fade bs-example-modal-lg" id="viewCourseSelection'+item.id+'" tabindex="-1"'
		 +'role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">'
		 +'<div class="modal-dialog modal-lg">'
		 +'<div class="form-horizontal">'
		 +'<div class="modal-content">'
		 +'<div class="modal-header">'
		 +'<button type="button" class="close" data-dismiss="modal"'
		 +'aria-hidden="true" onclick="closeCourseSelectionModal('+item.id+')">&times;'
		 +'</button>'
		 +'<h4 class="modal-title" id="myModalLabel">'
		 +'课程选择详情'+item.id+'</h4>'
		 +'</div>'
		 +'<div class="modal-body">'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">员工账号</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="YGZH'+item.id+'" placeholder="员工账号" value="'+item.ygzh+'" readonly="readonly">'		
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">课程编号</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="KCBH'+item.id+'" value="'+item.kcbh+'" readonly="readonly" placeholder="课程编号">'
		 +'</div>'
		 +'</div>'
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">课程名称</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="KCMC'+item.id+'" value="'+""+'" readonly="readonly" placeholder="课程名称">'
		 +'</div>'
		 +'</div>'	
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">课程学分</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control"'
		 +'id="KCXF'+item.id+'" value="'+item.threshold+'" readonly="readonly" placeholder="课程学分">'
		 +'</div>'
		 +'</div>'	
		 +'<div class="form-group">'
		 +'<label for="input" class="col-sm-2 control-label">课程成绩</label>'
		 +'<div class="col-sm-8">'
		 +'<input type="text" class="form-control" readonly="readonly"' 
		 +'id="KCCJ'+item.id+'" value="'+kccj+'"  placeholder="课程成绩">'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'<div class="modal-footer">'
		 +'<button type="button" class="btn btn-default"'
		 +'data-dismiss="modal"'
		 +'onclick="closeCourseSelectionModal('+item.id+')">关闭</button>'
//		 +'<button type="button" class="btn btn-primary"'
//		 +'onclick="saveCourseSelectionChange('+item.id+')">保存修改</button>'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'</div>'
		 +'</div>';	
	return modal;
}

/**
 * 员工学分管理
 */
function getAllCourseSelection(){
	$.ajax({
		url : "course/courseSelectionList",
		type : "post",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {			
			console.log(result);			
			//课程类别渲染
			var html="";
			var modal="";
						
			$.each(result,function(index,item){
				console.log(item);
				var credit=item.threshold;
				var qualify="";
				if(credit==null||credit==""){
					credit=0;
				}
				if(credit!=0){
					qualify='<span class="text-success">合格</span>';
				}else{
					qualify='<span class="text-danger">不合格</span>';
				}
				modal=loadCourseSelectionModal(item);
				html+='<div class="row">'
					+'<div class="col-xs-1">'
                    + (index+1)
                    +'</div>'
                	+'<div class="col-xs-3">'
                    + item.ygzh
                    +'</div>'
                    +'<div class="col-xs-3">'
					+ item.kcbh
					+'</div>'
					+'<div class="col-xs-2">'
					+ credit
					+'</div>'
					+'<div class="col-xs-2">'
					+ qualify
					+'</div>'
                    +'<div class="col-xs-1">'
                	+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#viewCourseSelection'+item.id+'" onclick="viewCourseSelection(\''+item.id+'\')">详情</button> '
                	//+'<button class="btn btn-warning btn-xs" data-toggle="modal" data-target="#deleteObey">修改</button> '
//                	+'<button class="btn btn-warning btn-xs" data-toggle="modal" onclick="engageTeacher(\''+item.jszh+'\')">聘用</button> '
//                    +'<button class="btn btn-danger btn-xs" data-toggle="modal" onclick="fireTeacher(\''+item.jszh+'\')">解约</button>'
                    +'</div>'
                    +'</div>';
				html+=modal;
			});
			$("#credit").html(html);
		}
	});
}

/*
 * 查询课程选择的详情信息
 */
function viewCourseSelection(id){
	var courseSelection={
		"id" : id
	};
	console.log(JSON.stringify(courseSelection));
	$.ajax({
		url : "course/viewCourseSelection",
		type : "post",
		data : JSON.stringify(courseSelection),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
			console.log(result);
			var kcxf=result.threshold;
			var kccj=result.fraction;
			if(kcxf==""||kcxf==null){
				kcxf=0;
			}
			if(kccj==""||kccj==null){
				kccj=0;
			}
			var kcbh=result.kcbh;
			$.ajax({
				url : "course/findCourse?kcbh="+kcbh,
				type : "post",
				data : "",
				dataType : "json",
				async : true,
				contentType : "application/json",
				success : function(result) {	
					$("#KCMC"+id).val(result.course.kcmc);
					console.log(result);
				}
			});
			$("#YGZH"+id).val(result.ygzh);
			$("#KCBH"+id).val(kcbh);			
			$("#KCXF"+id).val(kcxf);
			$("#KCCJ"+id).val(kccj);
			//根据课程编号查询对应课程
		}
	});
}

/*
 * 根据条件查询对应的选课信息
 */
function selectCourseSelection(){
	var condition=$('#courseSelection_condition').val();
	var select=$('#courseSelection_select option:selected');
	var key=select.attr('id');
	var value=select.val();
	if(condition==""){
		condition=null;	
	}
	console.log("被选中的值:"+key);
	//用关联数组解决键名是变量的问题
	var courseSelection = {};
	courseSelection[key]=condition;
	console.log(JSON.stringify(courseSelection));
	$.ajax({
		url : "course/getCourseSelectionByCondition",
		type : "post",
		data : JSON.stringify(courseSelection),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {			
			console.log(result);
			var modal="";
			var html="";
			$.each(result,function(index,item){		
				var credit=item.threshold;
				if(credit==null||credit==""){
					credit=0;
				}
				if(credit!=0){
					qualify='<span class="text-success">合格</span>';
				}else{
					qualify='<span class="text-danger">不合格</span>';
				}
				modal=loadCourseSelectionModal(item);
				html+='<div class="row">'
					+'<div class="col-xs-1">'
                    + (index+1)
                    +'</div>'
                	+'<div class="col-xs-3">'
                    + item.ygzh
                    +'</div>'
                    +'<div class="col-xs-3">'
					+ item.kcbh
					+'</div>'
					+'<div class="col-xs-2">'
					+ credit
					+'</div>'
					+'<div class="col-xs-2">'
					+ qualify
					+'</div>'
                    +'<div class="col-xs-1">'
                	+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#viewCourseSelection'+item.id+'" onclick="viewCourseSelection(\''+item.id+'\')">详情</button> '
                	//+'<button class="btn btn-warning btn-xs" data-toggle="modal" data-target="#deleteObey">修改</button> '
//                	+'<button class="btn btn-warning btn-xs" data-toggle="modal" onclick="engageTeacher(\''+item.jszh+'\')">聘用</button> '
//                    +'<button class="btn btn-danger btn-xs" data-toggle="modal" onclick="fireTeacher(\''+item.jszh+'\')">解约</button>'
                    +'</div>'
                    +'</div>';
				html+=modal;
			});
			$("#credit").html(html);
		}
	});
} 

/**
 * 按照选择的选项进行选课列表排序
 */
function sortCourseSelectionListByCondition(){
	var select = $("#courseSelection_sort option:selected");
	var condition=select.attr("id");
	console.log(condition);
	$.ajax({
		url : "course/sortCourseSelectionListByCondition?sort="+condition,
		type : "get",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {	
			console.log(result);
			var modal="";
			var html="";
			$.each(result,function(index,item){		
				var credit=item.threshold;
				if(credit==null||credit==""){
					credit=0;
				}
				if(credit!=0){
					qualify='<span class="text-success">合格</span>';
				}else{
					qualify='<span class="text-danger">不合格</span>';
				}
				modal=loadCourseSelectionModal(item);
				html+='<div class="row">'
					+'<div class="col-xs-1">'
                    + (index+1)
                    +'</div>'
                	+'<div class="col-xs-3">'
                    + item.ygzh
                    +'</div>'
                    +'<div class="col-xs-3">'
					+ item.kcbh
					+'</div>'
					+'<div class="col-xs-2">'
					+ credit
					+'</div>'
					+'<div class="col-xs-2">'
					+ qualify
					+'</div>'
                    +'<div class="col-xs-1">'
                	+'<button class="btn btn-success btn-xs" data-toggle="modal" data-target="#viewCourseSelection'+item.id+'" onclick="viewCourseSelection(\''+item.id+'\')">详情</button> '
                	//+'<button class="btn btn-warning btn-xs" data-toggle="modal" data-target="#deleteObey">修改</button> '
//                	+'<button class="btn btn-warning btn-xs" data-toggle="modal" onclick="engageTeacher(\''+item.jszh+'\')">聘用</button> '
//                    +'<button class="btn btn-danger btn-xs" data-toggle="modal" onclick="fireTeacher(\''+item.jszh+'\')">解约</button>'
                    +'</div>'
                    +'</div>';
				html+=modal;
			});
			$("#credit").html(html);
		}
	});
}

/*关闭选课弹窗*/
function closeCourseSelectionModal(id){
	$("#viewCourseSelection"+id).modal("hide");
}


/**
 * 查询部门下的课程
 * 程默
 * 7-9
 */
function selectCourseTypes(bmid) {
	var courseType = {
				"bmid" : bmid
			};
	$.ajax({
		url : "course/selectCourseTypes",
		type : "post",
		data : JSON.stringify(courseType),
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			console.log("coursetypes_配置"+result);
		}
	});
}
