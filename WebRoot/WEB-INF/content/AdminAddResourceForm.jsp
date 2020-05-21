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
	<title>课程编辑</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
	<link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <link href="css/admin.css" rel="stylesheet">
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.js"></script>
	 <link rel="stylesheet" href="css_1/iconfont.css">  
	<script  type = "text/javascript" >
		function change(){
			var kclb = document.getElementById("selectKCLB").value;
			var kcxf = document.getElementById("selectKCXF").value;
			$("#kclb option[value = '"+kclb+"']").attr("selected","selected");
			$("#kcxf").find("option[value = '"+kcxf+"']").attr("selected","selected");
		}
	</script>
	
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><body onload="change()" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-0" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/AdminAddResourceForm.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-0" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/AdminAddResourceForm.jsp">
	<div class="container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-0" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/AdminAddResourceForm.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-0" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/AdminAddResourceForm.jsp">
		
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
				<li class="active">课程管理</li>
			</ul>
			
	</div>
	
	<div class="main-area dashboard">
	
			<!-- <div class="alert alert-info">
				<a class="close" data-dismiss="alert" href="#">x</a>
				<h4 class="alert-heading">Information</h4>
				This template shows how forms can be laid out for editing content.
			</div>
			
			<div class="alert alert-error">
				<a class="close" data-dismiss="alert" href="#">x</a>
				<h4 class="alert-heading">Error</h4>
				Example of an error message alert.
			</div>
			
			<div class="alert alert-success">
				<a class="close" data-dismiss="alert" href="#">x</a>
				<h4 class="alert-heading">Success</h4>
				Example of an success message alert.
			</div> -->
			
			<div class="alert alert-warning">
				<a class="close" data-dismiss="alert" href="#">x</a>
				<h4 class="alert-heading">Warning</h4>
				修改需谨慎！！！！！！！！！！！！！！！！！！！！！！！！！！！！！.
			</div>
			
			
			
			<div class="row">
			
				
				<div class="span10">
				
					<div class="slate">
					
						<div class="page-header">
							<h2>添加章节</h2>
						</div>
						<form class="form-horizontal" name="resource" enctype="multipart/form-data" method="post" id="form" action="teacher/courseResourceAdd">
						  <div class="control-group">
						    <label class="control-label" for="focusedInput">章节名称</label>
						    <div class="controls">
						      <input class="input-xlarge focused" name="zjmc" id="focusedInput" type="text" value="${cResource.zjmc }">
						    </div>
						  </div>
						  <div class="control-group success">
						    <label class="control-label" for="focusedInput">章节文件</label>
						    <div class="controls">
						    	<input type="file" class="form-control" id="ZYLJ" name="zylj" placeholder="课程文件" multiple>
						    </div>
						  </div>
						<input type="hidden" style="width:300px" class="input-text" value="${kcbh }" placeholder="课程编号" id="KCBH" name="kcbh">
						<input type="hidden" style="width:300px" class="input-text" value="${kcmc }" placeholder="课程编号" id="KCBH" name="kcmc">
						
						<div class="span10 listing-buttons">
							<a class="btn btn-info" style="cursor:pointer" onclick="history.back()">返回上一页面</a>
							<button class="btn btn-success" type="reset">重置</button>
							<button class="btn btn-primary" type="submit">提交</button>
						</div>
						
						</form>
						
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

</html>