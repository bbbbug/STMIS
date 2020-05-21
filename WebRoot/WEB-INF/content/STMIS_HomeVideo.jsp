<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
		<script type="text/javascript" src="ajax/dataRender3.js"></script>
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
				function setTab(name,cursel,n){
					for(i=1;i<=n;i++)
					{
						var menu=document.getElementById(name+i);
						var con=document.getElementById("con_"+name+"_"+i);
						menu.className=i==cursel?"hover":"";
						con.style.display=i==cursel?"block":"none";
					}
				}
			</script>
			<script>
				function checkFraction(){
					alert("该门课程得分:"+${cSelection.fraction}+"分");
				}
			</script>
			<script>
				function alertlogin(){
					alert("请先登录！！！");
					window.location="#"; 
				}
			</script>
		<script>
			function addcartCourse(){
				<%
					String str=(String)request.getParameter("kcbh");
					String str1=(String)request.getParameter("kcmc");
				%>
				var kcbh='<%=str%>';
				var kcmc='<%=str1%>';
				var username="<%=session.getAttribute("username")%>"; 
				$.ajax({
						 url : "user/addMyCourse?kcbh="+kcbh+"&username="+username,
						 type : "post",
						 dataType:"text",
						 contentType : 'application/json;charset=UTF-8',
						 success : function(data) {
								alert("成功")
						      },
						 error : function(e) {
						      }
					});
			}
		</script>
		
		<script>
			function alertExam(){
				alert("请先完成课程学习");
			}
		</script>
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
	
	<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-16" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/STMIS_HomeVideo.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-16" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/STMIS_HomeVideo.jsp">
		<div class="container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-16" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/STMIS_HomeVideo.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-16" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/STMIS_HomeVideo.jsp">
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
								<a href="#" class="text-muted">我的学习</a>
							</li>
						</c:when>
					</c:choose>
					<!-- <li role="presentation">
						<a href="exam/gotoExam" class="text-muted">学科竞赛</a>
					</li> -->
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
			<!-- 模态框 -->
			<!-- Modal author by Jaylin_yang 2019.7.8-->
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
									<form id="form">
										<ul class="list-group">
											<li class="list-group-item">
												<label >用户类型：</label>
												<select class="form-control" name="jsbs" id="jsbs">
													<option value="1">用户</option>
													<option value="2 ">管理员</option>
												</select>
											</li>
											<li class="list-group-item">
												<label>用户名：</label>
												<input name="username" class="form-control" id="username" placeholder="用户名">
											</li>
											<li class="list-group-item">
												<label>密码：</label>
												<input type="password" name="password" class="form-control" id="password" placeholder="密码">
											</li>
											<li class="list-group-item" style="border-bottom: 0px;border-left: 0px;border-right: 0px;">
												<label></label>
											</li>
											<li class="list-group-item" style="border-bottom: 0px;border-left: 0px;border-right: 0px;">
												<label id="error" class="text-danger"></label>
											</li>
										</ul>
										<div class="modal-footer">
										<!-- <a href="http://192.168.1.108:8080/STMIS/index.html">管理员</a> -->
							<!-- <button type="button" class="btn btn-default" data-dismiss="modal">其他方式登录</button> -->
							<button type="button" class="btn btn-primary" onclick="login()">立即登录</button>
						</div>
									</form>
								</div>
							</div>
						</div>
						
					</div>
				</div>
			</div>
			<!-- 模态框结束  -->
		<div class="container">
				<div class="kcxtb">
					<img  src="${homecourse.kctb }"/>
					<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="">${homecourse.kcmc }</a></h3>
					<h5 style="color: #003399;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${learnCount}人气
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;讲师：${homecourse.kcjs }</h5>
					<br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 课程类别：  ${homecourse.kclb }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 课程学分：  ${homecourse.kcxf }分</h5>
					<c:choose>
						<c:when test="${username != null}">
							<c:choose>
							<c:when test="${cSelection.kcjd == 2}">
								<a href="course/selectCourse?kcbh=${homecourse.kcbh }&kcxh=1"><input type="button"  value="复习课程" style="margin-left: 3%; margin-top: 5%;width: 10%;height: 8%;background-color: #46B8DA;" /></a>
							</c:when>
							<c:when test="${cSelection.kcjd == 1}">
								<a href="course/selectCourse?kcbh=${homecourse.kcbh }&kcxh=1"><input type="button"  value="继续学习" style="margin-left: 3%; margin-top: 5%;width: 10%;height: 8%;background-color: #46B8DA;" /></a>
							</c:when>
							<c:otherwise>
							<a href="course/selectCourse?kcbh=${homecourse.kcbh }&kcxh=1"><input type="button"  value="课程预览" style="margin-left: 3%; margin-top: 5%;width: 10%;height: 8%;background-color: #46B8DA;" /></a>
							</c:otherwise>
						</c:choose>
							
						</c:when>
						<c:otherwise>
							<input type="button" onclick="alertlogin()" value="课程预览" style="margin-left: 3%; margin-top: 5%;width: 10%;height: 8%;background-color: #46B8DA;" />
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${cSelection.kcjd == 2}">
							<c:choose>
								<c:when test="${cSelection.fraction == null}">
								<a href="exam/startExam?kcbh=${homecourse.kcbh }"><input type="button"  value="开始考试" style="margin-left: 3%; margin-top: 5%;width: 10%;height: 8%;background-color:#46B8DA  ;" /></a>
								</c:when>
								<c:otherwise>
								    <a href="course/selectHomeCourse?kcbh=${homecourse.kcbh }"><input type="button" onclick="checkFraction()"  value="查看分数" style="margin-left: 3%; margin-top: 5%;width: 10%;height: 8%;background-color: #46B8DA;" /></a>
								</c:otherwise>
							</c:choose>
						</c:when>
						<c:otherwise>
								    <input type="button" onclick="alertExam()" value="开始考试" style="margin-left: 3%; margin-top: 5%;width: 10%;height: 8%;background-color: #BEBEBE;" />
						</c:otherwise>
					</c:choose>
				</div>
			</div>
				
						<section class="container">
				<div id="Tab">
            		<div id="menubox" >
            			<ul>
            				<li id="menu1" onmouseover="setTab('menu',1,4)" class="hover">介绍</li>
            				<li id="menu2" onmouseover="setTab('menu',2,4)">目录</li>
            				<!-- <li id="menu3" onmouseover="setTab('menu',3,4)">笔记</li> -->
            				<!-- <li id="menu4" onmouseover="setTab('menu',4,4)">讨论区</li> -->
            			</ul>
            		</div>
            	    <div id="contentbox">
            	    	<div id="con_menu_1" class="hover">
            	    		<ul>
            	    			<li>${homecourse.kcjj }</li>
            	    		</ul>
            	    	</div>
            	    	<div id="con_menu_2" style="display: none;">
            	    		<ul>
            	    		<c:choose>
							   <c:when test="${!empty courseresourses}"> 
							   		<c:forEach items="${courseresourses}" var="item">
							   		<li>
		            	    			<div class="col-lg-11">
		            	    				<a href="course/selectCourse?kcxh=${item.zjxh}&kcbh=${item.kcbh}">章节${item.zjxh}：${item.zjmc}</a>
		            	    			</div>
		            	    			<div class="col-lg-1" style="color:#999999;">
		            	    				14:29s
		            	    			</div>
	            	    			</li>
									</c:forEach>
							   </c:when>
							   <c:otherwise>
								  
							   </c:otherwise>
							</c:choose>
            	    		</ul>
            	    	</div>
            	    	<div id="con_menu_3" style="display: none;">
            	    	<h3>笔记</h3>
            	    	<c:choose>
									<c:when test="${username != null}">
										<a href="javascript:void(0)" onclick="note('${homecourse.kcbh}')">
            	    					<input type="button" value="添加笔记" style="float:right; margin-top: 5%;width: 10%;height: 8%;background-color: #46B8DA;" /></a>
									</c:when>
						</c:choose>
            	    	
            	    		<br/><br/><br/>
            	    		<ul class="pllist">
            	    			<c:choose>
								   <c:when test="${!empty notes}"> 
								   		<c:forEach items="${notes}" var="item">
												<li style="line-height: 120px;">
				            	    				<div class="col-lg-2" >
				            	    				<c:choose>
														<c:when test="${item.ygxb == '男'}">
						            	    					<img src="img/ygtx-0.jpg" style="width: 70px;"/>
						            	    			</c:when>
														<c:otherwise>
																<img src="img/ygtx-1.jpg" style="width: 70px;"/>
														</c:otherwise>
													</c:choose>
												</div>
				            	    				<div class="col-lg-10">
				            	    					<h4>${item.ygxm} &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;课程${item.note.zjxh}</h4> 
				            	    					<h5> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${item.note.bjnr} <br><a style="color: grey">进入详情页</a></h5>
				            	    					<h6 class="pull-right" style="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<f:formatDate value="${item.note.bjsj}" pattern="yyyy-MM-dd HH:mm:ss"/></h6>
				            	    				</div>
				            	    			</li>
										</c:forEach>
								   </c:when>
								   <c:otherwise>
								   </c:otherwise>
								</c:choose>
            	    		</ul>
            	    	</div>
            	    	
            	    	<%-- <div id="con_menu_4" style="display: none;">
            	    	<h3>讨论</h3>
            	    	<a href="course/comment?kcbh=${homecourse.kcbh}"><input type="button" value="发起讨论" style="float:right; margin-top: 5%;width: 10%;height: 8%;background-color: #46B8DA;" /></a>
            	    		<ul>
            	    			<c:choose>
								   <c:when test="${!empty reviews}"> 
								   		<c:forEach items="${reviews}" var="item">
								   			
												<li style="line-height: 120px;">
												
				            	    				<div class="col-lg-2" >
				            	    				<c:choose>
														<c:when test="${item.ygxb == '男'}">
						            	    					<img src="img/ygtx-0.jpg" style="width: 70px;"/>
						            	    			</c:when>
														<c:otherwise>
																<img src="img/ygtx-1.jpg" style="width: 70px;"/>
														</c:otherwise>
													</c:choose>
												</div>
				            	    				<div class="col-lg-10">
				            	    					<h4>${item.ygxm}</h4>
				            	    					<h5> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${item.review.plnr}</h5>
				            	    					<h6 class="pull-right" style="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<f:formatDate value="${item.review.plsj}" pattern="yyyy-MM-dd HH:mm:ss"/></h6>
				            	    				</div>
				            	    			</li>
										</c:forEach>
								   </c:when>
								   <c:otherwise>
								   </c:otherwise>
								</c:choose>
            	    		</ul>
            	    	</div> --%>
            	    </div>
            	</div>
				
			</section>
		
			<!-- Modal -->
			<div class="modal fade" id="Modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title" id="myModalLabel">笔记分享 >> 写笔记</h4>
						</div>
						<div class="modal-body">
							<div class="panel panel-primary">
								<!-- Default panel contents -->
								<div class="panel-heading" id="login_type">记笔记</div>
								<div class="panel-body login_list">
									<form method="post" id="form" action="course/addNote">
										<ul class="list-group">
										    <li class="list-group-item">
												<label>课程名称：</label>
												<label id="kcmc" class="input-icon icon-right" ></label>
											</li>
											<li class="list-group-item">
												<label >针对...做笔记</label>
												<select class="form-control" name="zjxh" id="zjxh">
												</select>
												<h6><small style="color: gray;">选择课程，笔记将归属于全局课程；选择课时，将笔记归属于课时</small></h6>
											</li>
											<li class="list-group-item">
												<label>笔记内容：</label>
												<textarea class="form-control" rows="10" name="bjnr"></textarea>
												<p class="help-block">在此记录你的想法.</p>
											</li>
											<li class="list-group-item">
												<label>
                                            		<!-- <input name="bjzt" type="checkbox" class="colored-danger" onclick="javascript:document.getElementById('bjzt').value=this.checked;"> -->
                                            		<!-- <input type="checkbox" name="chk1" value="1" /> -->
													<input type="checkbox" name="asd" value="1" onclick="javascript:document.getElementById('bjzt').value=1;"/>
													<input type="hidden" id="bjzt" name="bjzt" value="0"/>
                                                    <span class="text">私密</span>
                                                </label>
                                                <input type="hidden" style="width:300px" class="input-text" value="${homecourse.kcbh}" id="KCBH" name="kcbh">
											</li>
											
										</ul>
										<div class="modal-footer">
										<a class="btn btn-info" style="cursor:pointer" onclick="history.back()">返回上一页面</a>
                                        <button type="submit" class="btn btn-info">提交</button>
								</div>
									</form>
								</div>
							</div>
						</div>
						
					</div>
				</div>
			</div>
		
		
		
		
		
	
					
	</body>


<script type="text/javascript">
	function note(kcbh) {
		
		    $.ajax({
		    //几个参数需要注意一下
		        type: "POST",//方法类型
		        dataType: "json",//预期服务器返回的数据类型
		        url: "course/note" ,//url
		        data: {kcbh:kcbh},
		        success: function (result) {
		            console.log(result);//打印服务端返回的数据(调试用)
		            if (result != null) {
		               var dataObj = result.kcmc;//返回的result为json格式的数据
	                   console.log(dataObj);
	                   $("#kcmc").html(dataObj);
	                   con2 = "";
	                   $.each(result.courseresourses,function(index, item){
	                         con2 +="<option value='"+item.zjxh+"'>课时"+item.zjxh+item.zjmc+"</option>";
	                   });
	                   console.log(con2);
	                   $("#zjxh").html(con2);
	                   $('#Modal').modal('show');
		            }
		        },
		        error : function() {
		            alert("异常！");
		        }
		    });
		}
	
	
	
</script>
<script type="text/javascript">
//console.log($('#form').serialize());
	function login() {
	    $.ajax({
	    //几个参数需要注意一下
	        type: "post",//方法类型
	        dataType: "json",//预期服务器返回的数据类型
	        url: "user/login" ,//url	        
	        data: $('#form').serialize(),
	        success: function (result) {
	            console.log(result);//打印服务端返回的数据(调试用)
	            
	            //alert(result);
	            if (result != null) {
	            	if(result.error!=null){
	            		//$('#error').html(result.error);
	            		alert(result.error);
	            	}else if(result.redirect!=null){
	            		location.href="<%=request.getContextPath()%>"+result.redirect;
	            	}
	            }
	        },
	        error : function(){
	            alert("异常！");
	        }
	    });
	}
</script>
</html>
