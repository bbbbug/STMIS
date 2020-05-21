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
	<title>课程</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
	<link href="css/ymPrompt.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="awewome.min.css">
	<script src="js/message.js"></script>
    <link rel="stylesheet" href="css/message.css">
	<script src="Jquery/jquery-3.3.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	 <script type="text/javascript" src="ajax/dataRender3.js"></script>
	 <script type="text/javascript" src="js/ymPrompt.js"></script>
	 <script type="text/javascript" src="ajax/dataRender3.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"50754",secure:"50759"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
	
			<script>
			function gradeAlert(){
				//系统上线时间
			var System_onlineDate = new Date('2018/10/01 00:00');
			var currentDate = new Date();
				onlineDate = System_onlineDate.getTime();
				current = currentDate.getTime();
				var differenceTime = (current-onlineDate)/1000;
				var differenceDay = parseInt(differenceTime / (24*60*60));//计算整数天数
				var comDay = differenceDay%365
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
		</script>
	
    <script>
        $(function(){
            MessagePlugin.init({
                elem: "#message",
                msgData: [{text: "message1", id: 1, readStatus: 1},
                    {text: "message2", id: 2, readStatus: 0},
                    {text: "message3", id: 3, readStatus: 0},
                    {text: "message4", id: 4, readStatus: 0},
                    {text: "message5", id: 5, readStatus: 0},
                    {text: "message6", id: 6, readStatus: 0}],
                    msgUnReadData: 1,
                    noticeUnReadData: 1,
                    msgClick: function(obj) {
                        alert("消息点击事件");
                    },
                    noticeClick: function(obj) {
                        alert("提醒点击事件");
                    },
                    allRead: function(obj) {
                        alert("全部已读");
                    },
                    getNodeHtml: function(obj, node) {
                        if (obj.readStatus == 1) {
                            node.isRead = true;
                        } else {
                            node.isRead = false;
                        }
                        var html = "<p>"+ obj.text +"</p>";

                        node.html = html;

                        return node;
                    }
            });
        });

    </script>
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
		<style rel="stylesheet" type="text/css" >
			.remove_position{
				display : block;
				height : 20px;
				width : 20px;
				position : absolute;
				left : 230px;
				float : right;
			}
		</style>
	<body onload="gradeAlert()" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-17" data-genuitec-path="/STMIS/WebRoot/index.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-21" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/STMIS_course.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-21" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/STMIS_course.jsp">
		<div class="container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-17" data-genuitec-path="/STMIS/WebRoot/index.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-21" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/STMIS_course.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-21" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/STMIS_course.jsp">
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
						<li class="dropdown">
							<a class="dropdown-toggle" data-toggle="dropdown" href="#"><i class="icon-user"></i> ${username} <b class="caret"></b>
							</a>
							<ul class="dropdown-menu">
								<li><a href="user/person">个人中心</a></li>
								<li class="divider"></li>
								<li><a href="user/logout">注销</a></li>
							</ul>
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
												<label></label>
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
			    <div class="container" style="margin-left:5%;">
		  			
				</div>
				<div class="homepage_body">
				<div class="">
					<div class="my">
						<div class="my_course">
						<!--write by JinMing2019.7.18  -->
							<h3>我的课程<span id="message" style="vertical-align: super;display: none;">
										
										</span>
							    <input class="btn  btn-info" type="button" value="上传课程" style="float:right;" onclick="teacher()"/>
							</h3>
							
							
							<ul class="nav nav-tabs">
								<li role="presentation" class="active">
									<a href="user/showMyCourse">我的课程</a>
								</li>
								<li role="presentation" class="">
									<a href="user/gotoCredit">我的学分</a>
								</li>
								<li role="presentation" class="">
									<a href="user/showMyCollection">我的收藏</a>
								</li>
							<!-- 	<li role="presentation">
									<a href="#">我的讨论</a>
								</li> -->
								<li style="margin-left: 65rem;">
									<!-- <a href="#" style="text-decoration: none;">查看全部</a> -->
								</li>
							</ul>
							
						</div>
					</div>
					
					<div class="row" style="margin-top:2%;">
					<div class="panel-heading">已选${selectSize}课程</div>
						<c:choose>
						<c:when test="${selectSize == 0}">
							
						</c:when>
						<c:otherwise>
							<c:forEach items="${courses}" var="item">
								<div class="col-md-3" style="height:250px !important;margin-top:2%;">
								<%--  --%>
								<c:choose>
									<c:when test="${item.courseSelection.threshold != 0}">
										<a href="user/removeMyCourse?kcbh=${item.kcbh}&username=<%=session.getAttribute("username")%>" style="z-index: 1"><img id="remove" alt="${item.kcbh}" src="img/remove.jpg" class="remove_position pull-right" ></a>
									</c:when>
								</c:choose>
								<c:choose>
									<c:when test="${item.courseSelection.threshold == 0}">
										<span class="label label-danger">必修</span>
									</c:when>
								</c:choose>
										
										<c:choose>
											<c:when test="${item.courseSelection.kcjd == '0'}">
											<a href="course/selectCourse?kcbh=${item.kcbh}&kcxh=${item.courseKCJD}" class="thumbnail" style="z-index: -1">
												<img style="width:250px;height: 140px;" src="${item.kctb}">
												<h5 style="text-align: center;">${item.kcmc}</h5>
												<div style="text-align:center">
												<button class="btn btn-toolbar" onmouseover="this.style.backgroundColor='green';" onmouseout="this.style.backgroundColor='';"style="color: #000000;">开始学习</button>                
												<h6 style="color: green;">已学习0/${item.courseCount}课时</h6>
												</div>
											</a>
											</c:when>
											<c:when test="${item.courseSelection.kcjd == '1'}">
											<a href="course/selectCourse?kcbh=${item.kcbh}&kcxh=${item.courseKCJD}" class="thumbnail">
												<img style="width:250px;height: 140px;" src="${item.kctb}">
												<h5 style="text-align: center;">${item.kcmc}</h5>
												<div style="text-align:center">
												<button class="btn btn-toolbar" onmouseover="this.style.backgroundColor='green';" onmouseout="this.style.backgroundColor='';"style="color: #000000;">继续学习</button>                 
												<h6 style="color: green;">已学习${item.courseKCJD}/${item.courseCount}课时</h6>
												</div>
											</a>
											</c:when>
											<c:otherwise>
											<a href="course/selectHomeCourse?kcbh=${item.kcbh}" class="thumbnail">
												<img style="width:250px;height: 140px;" src="${item.kctb}">
												<h5 style="text-align: center;">${item.kcmc}</h5>
												<div style="text-align:center">
											    <button class="btn btn-too lbar" onmouseover="this.style.backgroundColor='';" onmouseout="this.style.backgroundColor='';"style="color: #000000;">开始考试</button>                 
												<h6 style="color: green;">已学习${item.courseKCJD}/${item.courseCount}课时</h6>
												</div>
											</a>
											</c:otherwise>
										</c:choose>  
										
								</div>
							</c:forEach>
						</c:otherwise>
						</c:choose>
				    </div>
					
				</div>
			</div>
	<%-- 					<div class="index_detail_body">
				<div class="panel panel-info">
					<!-- Default panel contents -->
					<div class="panel-heading">我的课程</div>
					<!-- Table -->
						<c:choose>
						<c:when test="${empty courses}">
							<p>暂未选课</p>
						</c:when>
						<c:otherwise>
							<c:forEach items="${courses}" var="item">
								<div class="col-xs-6 col-md-3">
									<a href="course/selectHomeCourse?kcbh=${item.kcbh}" class="thumbnail">
										<img src="${item.kctb}" style="width: 260px;height: 130px"> ${item.kcmc}</a>
										<c:choose>
										<c:when test="${item.courseSelection.kcjd == '0'}">
											<a href="course/selectHomeCourse?kcbh=${item.kcbh}" class="thumbnail">开始学习</a>
										</c:when>
										<c:when test="${item.courseSelection.kcjd == '1'}">
											<a href="course/selectHomeCourse?kcbh=${item.kcbh}" class="thumbnail">继续学习</a>
										</c:when>
										<c:otherwise>
										    <a href="course/selectHomeCourse?kcbh=${item.kcbh}" class="thumbnail">学习完成</a>
										</c:otherwise>
									</c:choose>
									<a href="user/removeMyCourse?kcbh=${item.kcbh}&username=<%=session.getAttribute("username")%>">移除</a>
								</div>
							</c:forEach>
						</c:otherwise>
						</c:choose>
				</div>
			</div> --%>
			<nav aria-label="Page navigation" class="text-center">
				<!-- <ul class="pagination">
					<li>
						<a href="#" aria-label="Previous">
							<span aria-hidden="true">&laquo;</span>
						</a>
					</li>
					<li>
						<a href="#">1</a>
					</li>
					<li>
						<a href="#">2</a>
					</li>
					<li>
						<a href="#">3</a>
					</li>
					<li>
						<a href="#">4</a>
					</li>
					<li>
						<a href="#">5</a>
					</li>
					<li>
						<a href="#" aria-label="Next">
							<span aria-hidden="true">&raquo;</span>
						</a>
					</li>
				</ul> -->
			</nav>
		</div>
	</body>

</html>
<script type="text/javascript">
	function teacher(){
		window.location.href="teacher/showCourse";
	}
</script>