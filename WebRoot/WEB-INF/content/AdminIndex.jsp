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
	<title>首页</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
	<link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href="css/admin.css">
    <link rel="stylesheet" href="css_1/iconfont.css"> 
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.js"></script>
	<script type="text/javascript">
		function getHref(kcbh){
			var href = "teacher/adminRemoveCourse?kcbh="+kcbh
			document.getElementById("removeCour").href = href;
		}
		
	</script>
	
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-3" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/AdminIndex.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-3" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/AdminIndex.jsp">
	
	<div class="container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-3" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/AdminIndex.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-3" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/AdminIndex.jsp">
		
	<div class="row">
		
		<div class="span2">
		
		<div class="main-left-col">
		
			<h1>后台管理</h1>
			
			<ul class="side-nav">

				<li class="active">
					<a href="#"><span class="iconfont icon-shouye"></span> 首页</a>
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
				The listing template can be used to list content that requires 编辑ing, such as pages, product catalogue, settings and members.
			</div> -->
			
			<div class="row">
			
				<div class="span10">
				
					<div class="slate">
					
						<form class="form-inline" method="post"  action="teacher/adminSearchCourse">
							<input type="text" name="keyword" class="input-large" placeholder="关键字...">
							
							<select class="span2" name="kclb">
								<option value="">---课程类别---</option>
								<option value="jisuanji">计算机</option>
						       	<option value ="jingguan">经管</option>
								<option value ="dianzi">电子</option>
							</select>
							<button type="submit" class="btn btn-primary">搜索</button>
						</form>
					</div>
				
				</div>
			
			</div>
			
			<div class="row">
				
				<div class="span10 listing-buttons">
				
				
					<a href="course/add" class="btn btn-primary">添加课程</a>
				
				</div>
				
				<div class="span10">
				
					<div class="slate">
					
						<div class="page-header">
							<div class="btn-group pull-right">
								<button class="btn dropdown-toggle" data-toggle="dropdown">
									<i class="icon-download-alt"></i> 导出
									<span class="caret"></span>
								</button>
								<ul class="dropdown-menu">
									<li><a href="">CSV</a></li>
									<li><a href="">Excel</a></li>
									<li><a href="">PDF</a></li>
								</ul>
							</div>
							<h2>课程</h2>
						</div>
					
						<table class="orders-table table">
						<thead>
							<tr>
								<th>课程</th>
								<th class="actions">操作</th>
							</tr>
						</thead>
						<tbody>
							<c:choose>
							<c:when test="${empty courses}">
								<p>暂无课程</p>
							</c:when>
							<c:otherwise>
								<c:forEach items="${courses}" var="item">
								
									 <c:choose>
										<c:when test="${item.kczt == '0'}">
											<tr>
												<td><img src="${item.kctb }" style="width: 60px;height: 30px"><a href="teacher/courseEdit?kcbh=${item.kcbh }">${item.kcmc}</a> <span class="label label-info">审核中</span><br /><span class="meta">${item.kksj}</span></td>
												<td class="actions" >
													<a onmouseover="getHref('${item.kcbh }')" class="btn btn-small btn-danger" data-toggle="modal" href="#移除Item">移除</a>
													<a class="btn btn-small btn-primary" href="teacher/courseEdit?kcbh=${item.kcbh }">编辑</a>
												</td>
											</tr>
										</c:when>
										<c:when test="${item.kczt == '4'}">
											<tr>
												<td><img src="${item.kctb }" style="width: 60px;height: 30px"><a href="teacher/courseEdit?kcbh=${item.kcbh }">${item.kcmc}</a> <span class="label label-success">审核通过</span><br /><span class="meta">${item.kksj}</span></td>
												<td class="actions">
													<a class="btn btn-small btn-primary" href="teacher/courseEdit?kcbh=${item.kcbh }">编辑</a>
												</td>
											</tr>
										</c:when>
										<c:when test="${item.kczt == '5'}">
											<tr>
												<td><img src="${item.kctb }" style="width: 60px;height: 30px"><a href="teacher/courseEdit?kcbh=${item.kcbh }">${item.kcmc}</a> <span class="label label-important">未通过审核</span><br /><span class="meta">${item.kksj}</span></td>
												<td class="actions">
													<a  class="btn btn-small btn-danger" data-toggle="modal" href="#移除Item?kcbh=${item.kcbh }">移除</a>
													<a class="btn btn-small btn-primary" href="teacher/courseEdit?kcbh=${item.kcbh }">编辑</a>
												</td>
											</tr>
										</c:when>
										<c:otherwise>
										    
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</c:otherwise>
							</c:choose>
						</tbody>
						</table>

					</div>
				
				</div>
				
				<div class="modal hide fade" id="移除Item">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">×</button>
						<h3>移除课程</h3>
					</div>
					<div class="modal-body">
						<p>确定 移除 这门课程吗?</p>
					</div>
					<div class="modal-footer">
						<a href="" class="btn" data-dismiss="modal">关闭</a>
						<a id="removeCour" href="" class="btn btn-danger">移除</a>
					</div>
				</div>
			
				<div class="span5">
				
				
				
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