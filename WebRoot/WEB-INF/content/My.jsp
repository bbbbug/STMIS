<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<base href="<%=basePath %>">
		<title>视频</title>
		<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/easy-upload.css">
		<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
		<script src="${pageContext.request.contextPath}/Jquery/jquery-3.3.1.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<%-- <script src="${pageContext.request.contextPath}/js/video.min.js"></script> --%>
		<style type="text/css">
			body {
				/*background-color: #191919;*/
			}
			
			.m {
				width: 960px;
				height: 400px;
				/*margin: auto;*/
				position: absolute;
				left: 30rem;
				/*margin-left: auto;*/
				/*margin-right: auto;*/
				/*margin-top: 100px;*/
			}
		</style>
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
			function addcartCourse(){
				var username="<%=session.getAttribute("username")%>"; 
				<%
					String str=(String)request.getParameter("kcbh");
				%>
				if (!username){
					alert("请先登录");
				}else{
					var kcbh='<%=str%>';
					$.ajax({
							 url : "user/addMyCourse?kcbh="+kcbh+"&username="+username,
							 type : "post",
							 dataType:"text",
							 contentType : 'application/json;charset=UTF-8',
							 success : function(ifadd) {
							 		if(ifadd == true){
							 			alert("添加成功");
							 		}else{
							 			alert("课程已添加");
							 		}
							      },
							 error : function(e) {
							      }
						});
				}
			}
		</script>
		
		<script>
			function addCollectCourse(){
				var username="<%=session.getAttribute("username")%>"; 
				<%
					String s=(String)request.getParameter("kcbh");
				%>
				if (!username){
					alert("请先登录");
				}else{
					var kcbh='<%=str%>';
					$.ajax({
							 url : "user/addCollectCourse?kcbh="+kcbh+"&username="+username,
							 type : "post",
							 dataType:"text",
							 contentType : 'application/json;charset=UTF-8',
							 success : function(ifadd) {
							 		if(ifadd == true){
							 			alert("收藏成功");
							 		}else{
							 			alert("课程已添加");
							 		}
							      },
							 error : function(e) {
							      }
						});
				}
			}
		</script>
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>

	<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-8" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/My.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-8" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/My.jsp"> <!-- onload="checkCourse()" -->
		<div class="container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-8" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/My.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-8" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/My.jsp">
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
						<a href="#" class="text-muted" data-toggle="dropdown">课程<span class="caret"></span>
							<ul class="dropdown-menu">
								<li>
									<a href="course/showByKclb?kclb=jisuanji">计算机</a>
								</li>
								<li>
									<a href="course/showByKclb?kclb=jingguan">经济管理</a>
								</li>
								<li>
									<a href="course/showByKclb?kclb=dianzi">电子</a>
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
					<!-- <li role="presentation">
						<a href="exam/gotoExam" class="text-muted">学科竞赛</a>
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
					<li role="presentation">
						<div class="input-group" style="width: 28rem;">
							<input type="text" class="form-control" id="" placeholder="请输入" style="" />
							<span class="input-group-btn">
        						<button class="btn btn-default" onclick="search()" type="button">Go!</button>
     						</span>
						</div>
					</li>
					<c:choose>
						<c:when test="${username != null}">
						<li role="presentation">
							<a href="user/showMyCourse" class="text-danger" >${username}</a>
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
		</div>
		<div class="video_bg" style="">
			<div class="m" style="">
					<c:choose>
						<c:when test="${empty course}">
							<p>暂无数据</p>
						</c:when>
						<c:otherwise>
							<c:choose>
								<c:when test="${course.zylx== 'mp4' }"> 
									<video id="my-video" class="video-js" controls preload="auto" width="960" height="400" poster="${homecourse.kctb }" data-setup="{}">
								        <source src="${course.zylj }" type="video/mp4">   
								        <source src="${course.zylj }.webm" type="video/webm">
										<source src="${course.zylj }.ogv" type="video/ogg">
										<!-- 处理兼容性 -->
										<p class="vjs-no-js"> To view this video please enable JavaScript, and consider upgrading to a web browser that
											<a href="http://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>
										</p>					
									</video> 
								</c:when>
								<c:otherwise>
								  		 <img src="${course.zylj }">
								</c:otherwise>
							</c:choose>
						</c:otherwise>
					</c:choose>
					<span>
						<c:choose>
							<c:when test="${cSelection == null}">
							<input type="button"  onclick="addcartCourse()" value="加入课程" style="width: 70px; color: #31B0D5;" ></input>
							</c:when>
							<c:otherwise>
							    <input type="button" value="已添加" style="width: 70px; color: #31B0D5;" ></input>
							</c:otherwise>
						</c:choose>
						
						<c:choose>
							<c:when test="${cSelection == null}">
							<input type="button"  onclick="addCollectCourse()" value="加入喜欢" style="width: 70px; color: #31B0D5;" ></input>
							</c:when>
							<c:otherwise>
							    
							</c:otherwise>
						</c:choose>
					</span>
			</div>
			<div class="pull-right video_list" style="width: 200px">
				<ul class="list-group" style="width: 100px">
				<c:choose>
				   <c:when test="${!empty courseresourses}"> 
				   		<c:forEach items="${courseresourses}" var="item">
						    <%-- <li class="list-group-item"><a href='course/selectCourse?kcxh=${item.zjxh}&kcbh=${item.kcbh}'>第${item.zjxh}章 ${item.zjmc}</a></li>  --%> 
							<li class="list-group-item"><a href='course/selectCourse?kcxh=${item.zjxh}&kcbh=${item.kcbh}'>课时 ${item.zjxh} ${item.zjmc}</a></li>
							<br>
						</c:forEach>
				   </c:when>
				   <c:otherwise>
					   <li class="list-group-item"><a href="">第${course.zjxh }章 ${course.zjmc}</a></li>
				   </c:otherwise>
				</c:choose>
				</ul>
			</div>
			<div class="spjj">
				<c:choose>
						<c:when test="${empty homecourse}">
							<p>暂无数据</p>
						</c:when>
						<c:otherwise>
			        		<h2>课程介绍</h2>
			        		<p>${homecourse.kcjj }</p>
        				</c:otherwise>
					</c:choose>
       		</div>
		</div>
<span>
					
	</body>

	<script src="http://vjs.zencdn.net/5.19/lang/zh-CN.js"></script>
	<script type="text/javascript">
		var myPlayer = videojs('my-video');
		videojs("my-video").ready(function() {
			var myPlayer = this;
			myPlayer.play();
		});
	</script>

</html>