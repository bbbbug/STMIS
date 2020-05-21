<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
	<title>试题管理</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
	<link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <link href="css/admin.css" rel="stylesheet">
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.js"></script>
<link rel="stylesheet" href="css_1/iconfont.css"> 
	
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-5" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/AdminShowExam.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-5" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/AdminShowExam.jsp">
	<div class="container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-5" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/AdminShowExam.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-5" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/AdminShowExam.jsp">
		
	<div class="row">
		
		<div class="span2">
		
		<div class="main-left-col">
		
			<h1>后台管理</h1>
			
<ul class="side-nav">

				<li class="active">
					<a href="#"><i class="iconfont icon-shouye"></i> 首页</a>
				</li>
				<li class="iconfont icon-course">
					<a class="dropdown-toggle" data-toggle="collapse" data-target="#website-dropdown" ><i class="icon-sitemap"></i> 课程管理 <b class="caret"></b></a>
					<ul id="website-dropdown" class="collapse">
						<li><a href="teacher/showCourse">课程编辑</a></li>
						<li><a href="course/add">课程上传</a></li>
					</ul>
				</li>
				<li class="iconfont icon-shijuanguanli">
					<a class="dropdown-toggle" data-toggle="collapse" data-target="#store-dropdown"><i class="icon-shopping-cart"></i> 试卷管理 <b class="caret"></b></a>
					<ul id="store-dropdown" class="collapse">
						<li><a href="exam/adminShowExam">试卷管理</a></li>
						<li><a href="exam/gotoAdminExam">试题上传</a></li>
					</ul>
				</li>
			</ul>
		
		</div> <!-- end main-left-col -->
	
	</div> <!-- end span2 -->
	
	<div class="span10">
		
	<div class="secondary-masthead">
		
			<ul class="nav nav-pills pull-right">
				<c:choose>
						<c:when test="${username != null}">
						<li class="dropdown">
							<a class="dropdown-toggle" data-toggle="dropdown" href="#"><i class="icon-user"></i> ${username} <b class="caret"></b>
							</a>
							<ul class="dropdown-menu">
								<li><a href="profile.html">个人中心</a></li>
								<li class="active"><a href="form.html">设置</a></li>
								<li class="divider"></li>
								<li><a href="user/logout">注销</a></li>
							</ul>
						</li>
						</c:when>
					</c:choose>
			</ul>

			<ul class="breadcrumb">
				<li>
					<a href="#">首页</a> <span class="divider">/</span>
				</li>
				<li class="active">试题管理</li>
			</ul>
			
	</div>
	
	<div class="main-area dashboard">
			<div class="row">
				<div class="span10">
					<div class="slate">
						<div class="page-header">
							<div class="row">
								<div style="float:left;margin-left: 4%">
		                        	<select class="form-control" id="KCMCselect" style="margin-left:2%;float:left;" onchange="SelectByKCMC(this.value)">
								      <c:forEach items="${courselist}" var="item">
								        <option value="${item.kcbh}">${item.kcmc}</option>
								      </c:forEach>
								    </select>
		                       </div>
		                 	   <div style="float:left;margin-left: 2%">
		                        	<input type="text" class=" form-control input-sm " id="keyword" placeholder="输入文字搜索">
		                        	<button class="btn btn-info btn-xs" id="selectBtn" style="margin-top: -3%" onclick="search()">查 询 </button>
		                       </div>
		                       
                   			</div>
                   		</div>
							<table class="orders-table table">
						<thead>
							<tr>
								<th>试题</th>
								<th class="actions">操作</th>
							</tr>
						</thead>
						<tbody id="searchID">
							<c:choose>
							<c:when test="${empty exams}">
								<p>暂无试题</p>
							</c:when>
							<c:otherwise>
								<c:forEach items="${exams}" var="item" varStatus="cou">
											<tr>
												<td>${cou.count}.<a href="course/goto404">${item.caption }</a> <span class="label label-info">${item.answer }</span><br />关键字:<span class="meta">${item.sjlb}</span></td>
												<td class="actions">
													<button class="btn btn-small btn-danger" onclick="deleteExam(${item.id})">移除</button>
													<button class="btn btn-small btn-primary" data-toggle="modal" id="editCourseExam" data-target="editCourseExam" onclick="editCourseExam(${item.id})" >编辑</button>
												</td>
											</tr>
								</c:forEach>
							</c:otherwise>
							</c:choose>
						</tbody>
						</table>
						</div>
						
		<!-- 编辑试题模态框 -->
         <div class="modal fade" id="editExam" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
			<div class="modal-dialog">
				<div class="form-horizontal">
					<div class="modal-content" >
						<div class="modal-header">
							<div role="tabpanel" class="tab-pane" id="ExamEdit">
			                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>  	
			                <h4 class="modal-title" id="myModalLabel">修改试题信息</h4> 
			                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
		 				</div>
		 				<form id="form" class="form-horizontal" onsubmit="return false" action="##" method="post">
		 				<div class="modal-body" id="viewExamInfo">
		 				</div>
		 				</form>
	               		<div class="modal-footer">
	               			<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		      				<button type="button" class="btn btn-default" data-dismiss="modal" onclick="savemodal()">保存</button>
	              		</div>
           			</div>
                </div>
            </div>
         </div>
						
						
					</div>
				
				</div>
				
			</div>
			
		<div class="row">
		
			<div class="span10 footer">
			
			
			</div>
		
		</div>
		
	</div>
	
	</div> <!-- end span10 -->
		
	</div> <!-- end row -->
		
</div> <!-- end container -->

</body>

<script src="js/jquery.min.js"></script>
       <script src="Jquery/jquery-3.3.1.min.js"></script>
       <script src="js/bootstrap.min.js"></script>

<script type="text/javascript">
function search(){
	var caption = $('#keyword').val();
	console.log(caption);
		$.ajax({
		url : "searchExam?caption="+caption,
		type : "POST",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
            console.log(result);//打印服务端返回的数据(调试用)
	    	var html = "";
	    	$.each(result,function(index,data){
				console.log("item:"+data);	
				console.log("index:"+index);
				if(index == "extend"){
					console.log(data.searchResult);	
					var list=data.searchResult;
					for(var i=0;i<list.length;i++){
						var item = list[i];
						console.log(item);
						html+='<tr><td>'+item.id+'<a href="course/goto404">'
							 +item.caption
							 +'</a> '
							 +'<span class="label label-info">'
							 +item.answer
							 +'</span><br />'
							 +'关键字:<span class="meta">'
							 +item.sjlb
							 +'</span></td>'
							 +'<td class="actions"><button class="btn btn-small btn-danger" onclick="deleteExam('
							 +item.id+')">移除</button>'
							 +'<button class="btn btn-small btn-primary" data-toggle="modal" id="editCourseExam" data-target="editCourseExam"'
							 +'onclick="editCourseExam('
							 +item.id+')" >编辑</button>'
							 +'</td></tr>';
					}
				}
			});
			$("#searchID").html(html);
		}
    });
}

function editCourseExam(keyword){
	console.log(keyword);
	var id_int = parseInt(keyword);
	$.ajax({
		url : "updateExam?id="+keyword,
		type : "POST",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			console.log(result);
			var html = "";
			$.each(result,function(index,data){
				console.log("item:"+data);	
				console.log("index:"+index);
				if(index == "extend"){
					var item=data.exam;
					var option = item.rrange.split("#");
					console.log(option[0]+"hh"+option[1]);
					html+='<div class="form-group">'
					     +'<label for="input" class="col-sm-2 control-label">题目:&nbsp;</label>'
						 +'<div class="col-sm-8">'
						 +'<input type="hidden" id="exam_id" value="'+item.id+'"/>'
						 +'<input type="hidden" id="kcjs" value="'+item.kcjs+'"/>'
						 +'<input type="hidden" id="sjlb" value="'+item.sjlb+'"/>'
						 +'<input type="hidden" id="kcbh" value="'+item.kcbh+'"/>'
						 +'<input type="text" class="form-control"'
						 +'id="question" placeholder="" value="'+item.caption+'" name="caption">'		
						 +'</div>'
						 +'</div>'
						 +'<div class="form-group" style="height:20px;"></div>'
						 +'<div class="form-group">'
						 +'<label for="input" class="col-sm-2 control-label">选项A:&nbsp;</label>'
						 +'<div class="col-sm-8">'
						 +'<input type="text" class="form-control"'
						 +' value="'+option[0]+'" id="rrangeA" placeholder="">'
						 +'</div>'
						 +'</div>'
						 +'<div class="form-group" style="height:20px;"></div>'
						 +'<div class="form-group">'
						 +'<label for="input" class="col-sm-2 control-label">选项B:&nbsp;</label>'
						 +'<div class="col-sm-8">'
						 +'<input type="text" class="form-control"'
						 +' value="'+option[1]+'" id="rrangeB" placeholder="">'
						 +'</div>'
						 +'</div>'
						 +'<div class="form-group" style="height:20px;"></div>'
						 +'<div class="form-group">'
						 +'<label for="input" class="col-sm-2 control-label">选项C:&nbsp</label>'
						 +'<div class="col-sm-8">'
						 +'<input type="text" class="form-control"'
						 +' value="'+option[2]+'" id="rrangeC" placeholder="">'
						 +'</div>'
						 +'</div>'
						 +'<div class="form-group" style="height:20px;"></div>'
						 +'<div class="form-group">'
						 +'<label for="input" class="col-sm-2 control-label">选项D:&nbsp</label>'
						 +'<div class="col-sm-8">'
						 +'<input type="text" class="form-control"'
						 +' value="'+option[3]+'" id="rrangeD"  placeholder="">'
						 +'</div>'
						 +'</div>'
						 +'<div class="form-group" style="height:20px;"></div>'
						 +'<div class="form-group">'
						 +'<label for="input" class="col-sm-2 control-label">正确答案:&nbsp</label>'
						 +'<div class="col-sm-8">'
						 +'<input type="text" class="form-control"'
						 +' value="'+item.answer+'" id="answer" placeholder="">'
						 +'</div>'
						 +'</div>'
				}
			})
			var viewExamInfo=document.getElementById("viewExamInfo");
			viewExamInfo.innerHTML=html;
			$("#editExam").modal();
		},
        error : function() {
            alert("异常！");
        }
    });
}

function savemodal(){
	var question = $('#question').val();
	var rrangeA = $('#rrangeA').val();
	var rrangeB = $('#rrangeB').val();
	var rrangeC = $('#rrangeC').val();
	var rrangeD = $('#rrangeD').val();
	var answer = $('#answer').val();
	var kcjs = $('#kcjs').val();
	var sjlb = $('#sjlb').val();
	var kcbh = $('#kcbh').val();
	var id= $('#exam_id').val();
	console.log(question+rrangeA+rrangeB+rrangeC+rrangeD+id);
	if(question.length > 0 && rrangeA.length>0 && rrangeB.length>0 && rrangeC.length>0 && rrangeD.length>0){
	    $.ajax({
	    //几个参数需要注意一下
	        type: "POST",//方法类型
	        dataType: "json",//预期服务器返回的数据类型
	        url: "updateInfoExam" ,//url
	        data: {
				"caption" : question,
				"rrange" : rrangeA+"#"+rrangeB+"#"+rrangeC+"#"+rrangeD,
				"kcjs" : kcjs,
				"sjlb" :sjlb,
				"kcbh" :kcbh,
				"id" :id,
				"answer":answer
			},
	        success: function (result) {
	            console.log(result);//打印服务端返回的数据(调试用)
	            if(result!=null){
	            	alert("修改成功！");
	            	$('#editExam').modal('hide');
	            }
	        },
	        error : function() {
	            alert("异常！");
	        }
	        
	    });
    }else{
		alert("试题信息不能为空！");
	}
}

function deleteExam(id){
	console.log("id:"+id);
	$.ajax({
		url : "deleteExam?id="+id,
		type : "POST",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			if(result!=null){
				alert("删除成功！");
				location.href='exam/adminShowExam';
			}
		},
		error : function() {
	            alert("异常！");
	       	}
	        
    });
}

function SelectByKCMC(kcbh){
	console.log("kcbh:"+kcbh);
	$.ajax({
		url : "exam/screenExam?kcbh="+kcbh,
		type : "POST",
		data : "",
		dataType : "json",
		async : true,
		contentType : "application/json",
		success : function(result) {
			console.log(result);
			var html = "";
			$.each(result,function(index,data){
				console.log("item:"+data);	
				console.log("index:"+index);
				if(index == "extend"){
					console.log(data.examlist);	
					var list=data.examlist;
					for(var i=0;i<list.length;i++){
						var item = list[i];
						console.log("item:"+item.caption);
						var j = i+1;
						html+='<tr><td>'
							+j+'<a href="course/goto404">'
							+item.caption+'</a> <span class="label label-info">'
							+item.answer+'</span><br />关键字:<span class="meta">'
							+item.sjlb+'</span></td><td class="actions">'
							+'<button class="btn btn-small btn-danger" onclick="deleteExam('
							+item.id+')">移除</button>'
							+'<button class="btn btn-small btn-primary" data-toggle="modal" id="editCourseExam" data-target="editCourseExam"'
							+'onclick="editCourseExam('
							+item.id+')">编辑</button>'
							+'</td></tr>'
					}
				}
			})
			var searchID=document.getElementById("searchID");
			searchID.innerHTML=html;
		},
		error : function() {
	            alert("异常！");
	       	}
	        
    });
}
</script>

</html>