<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
	<title>课程</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
			<link href="css/font-awesome.min.css" rel="stylesheet" />
			<link id="beyond-link" href="css/beyond.min.css" rel="stylesheet" />
    		<link href="css/animate.min.css" rel="stylesheet" />
			<link href="css/style.css" rel="stylesheet">
			<script src="Jquery/jquery-3.3.1.min.js"></script>
			<script src="js/bootstrap.min.js"></script>
			<script type="text/javascript" src="ajax/dataRender3.js"></script>
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"50754",secure:"50759"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
	<script>
			function search(){
					var keyword = document.getElementById("keyword").value;
				$.ajax({
						 url : "course/gotoSearch",
						 type : "post",
						 dataType:"text",
						 contentType : 'application/json;charset=UTF-8',
						 success : function(data) {
						 		window.location.href="course/search?keyword="+keyword;
						      },
						 error : function(e) {
						         alert("错误！！");
						      }
					});
			}
		</script>
		
	<script>
			function removeAlert(){
					var kcbh = document.getElementById("remove").alt;
					var username="<%=session.getAttribute("username")%>"; 
					alert(kcbh);
					$.ajax({
							 url : "user/removeMyCourse?kcbh="+kcbh+"&username="+username,
							 type : "post",
							 dataType:"text",
							 contentType : 'application/json;charset=UTF-8',
							 success : function(data) {
							 		if(data == true){
							 			alert("禁止删除");
							 		}
							      },
							 error : function(e) {
							      }
						});
			}
		</script>
	<body onload="myFunction()" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-17" data-genuitec-path="/STMIS/WebRoot/index.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-9" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/Note.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-9" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/Note.jsp">
		<div class="container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-17" data-genuitec-path="/STMIS/WebRoot/index.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-9" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/Note.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-9" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/Note.jsp">
			<div class="index_nav">
		<!--write by Jinming  -->
			 <div style="width:100%;">
			    <img alt="" src="img/2.png" style="float:left;width:140px;height:40px;">
				<h3 class="navbar-left text-primary" style="margin-top: 4%;margin-left:-12%;font-size:16px;"><b>员工培训管理系统</b></h3>
			 </div>
				<ul class="nav nav-pills text-center">
					<li role="presentation">
						<a href="#" class="text-muted">首页</a>
					</li>
					<li role="presentation">
						<a></a>
					</li>
					<li role="presentation">
						<a href="#" id="selectCategory" class="text-muted" data-toggle="dropdown">课程<span class="caret"></span>
							<ul id="showCategory" class="dropdown-menu">
								<li>
									<a href="course/showAllCourse">全部课程</a>
								</li>
							</ul>

						</a>
					</li>
					<li role="presentation">
						<a></a>
					</li>
					<li role="presentation">
						<a></a>
					</li>
					<!-- <li role="presentation">
						<a href="course/goto404" class="text-muted">培训社区</a>
					</li>
					<li role="presentation">
						<a href="course/goto404" class="text-muted">学员档案</a>
					</li> -->
					<li role="presentation">
						<a></a>
					</li>
					<li role="presentation">
						<a></a>
					</li>
					<c:choose>
						<c:when test="${jsbs ==1}">
							<li role="presentation">
								<a href="user/showMyCourse" class="text-muted">我的学习</a>
							</li>
						</c:when>
					</c:choose>
					<!-- <li role="presentation">
						<a href="course/goto404" class="text-muted">学科竞赛</a>
					</li> -->
					<c:choose>
						<c:when test="${jsbs ==2}">
							<li role="presentation">
								<a href="course/add" class="text-muted">上传视频</a>
							</li>
						</c:when>
					</c:choose>
					
					<li role="presentation">
						<div class="input-group" style="width: 28rem;">
							<input type="text" class="form-control" id="keyword" placeholder="请输入" style="" />
							<span class="input-group-btn">
        						<button class="btn btn-default" onclick="search()"  type="button">Go!</button>
     						</span>
						</div>
					</li>
					<c:choose>
						<c:when test="${username != null}">
						<li role="presentation">
							<a href="user/showMyCourse" class="text-danger" >${username}</a>
							<a href="user/logout" class="text-danger" >注销</a>
						</li>
						</c:when>
						<c:otherwise>
						    <li role="presentation">
								<a href="#" class="text-danger" data-toggle="modal" data-target="#myModal">登录</a>
							</li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>

			<!-- 模态框 -->
			<!-- Modal -->
			<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title" id="myModalLabel">登录</h4>
						</div>
						<div class="modal-body">
							<div class="panel panel-primary">
								<!-- Default panel contents -->
								<div class="panel-heading" id="login_type">用户登录</div>
								<div class="panel-body login_list">
									<form method="post" id="form" action="user/login">
										<ul class="list-group">
											<li class="list-group-item">
												<label >用户类型：</label>
												<select class="form-control" name="jsbs">
													<option value="1">学员</option>
													<option value="2">教师</option>
													<option value="3 ">管理员</option>
												</select>
											</li>
											<li class="list-group-item">
												<label>用户名：</label>
												<input name="username" class="form-control" id="" placeholder="用户名">
											</li>
											<li class="list-group-item">
												<label>密码：</label>
												<input name="password" type="password" class="form-control" id="" placeholder="用户名">
											</li>
											<li class="list-group-item" style="border-bottom: 0px;border-left: 0px;border-right: 0px;">
												<label><a class="text-danger">忘记密码</a></label>
											</li>
										</ul>
										<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">其他方式登录</button>
							<button type="submit" class="btn btn-primary">立即登录</button>
						</div>
									</form>
								</div>
							</div>
						</div>
						
					</div>
				</div>
			</div>
			
			<div class="page-body">
                <div class="row">
                    <div class="col-lg-12 col-sm-12 col-xs-12">
                        <h5 class="row-title before-magenta"><i class="fa fa-edit magenta"></i>笔记分享 >> 写笔记</h5>
                        <div class="widget flat radius-bordered">
                            <div class="widget-header bg-info">
                                <span class="widget-caption">写笔记</span>
                            </div>
                            <div class="widget-body">
                                <div id="registration-form">
                                    <form role="form" method="post" id="form" action="course/addNote">
                                        <div class="form-title">
                                        	
                                        </div>
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <div class="form-group">
                                                    <label for="exampleInputEmail2">课程名称:</label>
                                                    <h4 class="input-icon icon-right">
                                                         ${homecourse.kcmc }</h4>
                                                        <!--<i class="fa fa-envelope blue"></i>-->
                                                    </h4>
                                                </div>
                                            </div>
                                            <div class="col-sm-6">
                                                <div class="form-group">
                                                    <label for="exampleInputName2">针对...做笔记</label>
                                                     <select class="icon-right form-control" name="zjxh" >
												      <c:choose>
														   <c:when test="${!empty courseresourses}"> 
														   		<c:forEach items="${courseresourses}" var="item">
														   			<option value="${item.zjxh }">课时${item.zjxh } ${item.zjmc }</option>
																</c:forEach>
														   </c:when>
														   <c:otherwise>
														   </c:otherwise>
														</c:choose>
												    </select>
												    <h6><small style="color: gray;">选择课程，笔记将归属于全局课程；选择课时，将笔记归属于课时</small></h6>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-sm-12">
                                                <div class="form-group">
                                                    <label for="exampleInputEmail2">笔记内容</label>
                                                    <span class="input-icon icon-right">
                                                        <textarea class="form-control" rows="10" name="bjnr"></textarea>
                                                        <i class="glyphicon glyphicon-briefcase darkorange"></i>
                                                    </span>
                                                    <p class="help-block">在此记录你的想法.</p>
                                                </div>

                                            </div>
                                        </div>
                                       
                                        <div class="form-group">
                                            <div class="checkbox">
                                            <input name="bjzt" type="hidden" value="0" id="bjzt">
                                            	<label>
                                            		<input type="checkbox" class="colored-danger" onclick="javascript:document.getElementById('bjzt').value=this.checked;">
                                                    <span class="text">私密</span>
                                                </label>
                                            </div>
                                        </div>
                                        <input type="hidden" style="width:300px" class="input-text" value="${homecourse.kcbh}" id="KCBH" name="kcbh">
                                        <a class="btn btn-info" style="cursor:pointer" onclick="history.back()">返回上一页面</a>
                                        <button type="submit" class="btn btn-info">保存</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
			
			
		</div>

	</body>

</html>
