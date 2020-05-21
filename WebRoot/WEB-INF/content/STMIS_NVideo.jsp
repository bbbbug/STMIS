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
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="css/style1.css" rel="stylesheet">
		<link href="css/video-js.min.css" rel="stylesheet">
		<script src="Jquery/jquery-3.3.1.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script type="text/javascript" src="ajax/dataRender3.js"></script>
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
		<style>
			.wenzi{
				position: relative;
				float: right;
				top: 330px;
				color: #FF0000;
				margin-right: 5%;
				font-size: 24px;
				margin-top:110px;
				
				z-index: 9999999999;
			}
		</style>

	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>

	<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-17" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/STMIS_NVideo.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-17" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/STMIS_NVideo.jsp">
		<div class="container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-17" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/STMIS_NVideo.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-17" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/STMIS_NVideo.jsp">
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
					<!-- <li role="presentation">
						<a href="exam/gotoExam" class="text-muted">学科竞赛</a>
					</li> -->
					<c:choose>
						<c:when test="${jsbs ==1}">
							<li role="presentation">
								<a href="user/showMyCourse" class="text-muted">我的学习</a>
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
		<!--
        	作者：461352934@qq.com
        	时间：2019-02-26
        	描述：视频播放栏目
        -->
        <div class="" style="width: 100% !important;margin-left:-5%;">
        	<!--<%-- <div id="rightNav" style="position:fixed; right:0;z-index: 999;">  
		        <div style="float: left;">  
		            <img id="navImg" style="cursor:pointer;" src="img/yj.png">  
		        </div>  
		        <div style="height:700px; width:400px; float:left; background:#C0C0C0;">  
		               
				<ul class="list-group">
				<c:choose>
				   <c:when test="${!empty courseresourses}"> 
				   		<c:forEach items="${courseresourses}" var="item">
						    <li class="list-group-item"><a href='course/selectCourse?kcxh=${item.zjxh}&kcbh=${item.kcbh}'>第${item.zjxh}章 ${item.zjmc}</a></li>  
							<li class="list-group-item" ><a href='course/selectCourse?kcxh=${item.zjxh}&kcbh=${item.kcbh}'>课时 ${item.zjxh} ${item.zjmc}</a></li>
							<br>
						</c:forEach>
				   </c:when>
				   <c:otherwise>
					   <li class="list-group-item"><a href="">第${course.zjxh }章 ${course.zjmc}</a></li>
				   </c:otherwise>
				</c:choose>
				</ul>
			
		        </div>   
 		   </div> --%>-->
        	<div class="video_bg" style="width: 100% !important;height:550px !important;">
			<div class="m" style="width: 100% !important;">
			
				<div class="row">
					<div class="col-md-9" style="padding:0;marign:0;">
						<div style="width:100%;height: 511px;">
						<div class="wenzi">${username}</div>
						<video id="my-video" class="video-js" controls preload="auto" style="width:100%;height: 100%;"  poster="${homecourse.kctb }" data-setup="{}">
							<source src="${course.zylj }" type="video/mp4">
							<source src="${course.zylj }.webm" type="video/webm">
							<source src="${course.zylj }.ogv" type="video/ogg">
							<!-- 处理兼容性 -->
							<p class="vjs-no-js"> To view this video please enable JavaScript, and consider upgrading to a web browser that
								<a href="http://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>
							</p>
												
						</video>
						</div>
					</div>
					<input type="hidden" id="Prozjxh" name="zjxh" value="${course.zjxh }">
					<input type="hidden" id="Prokcbh" name="kcbh" value="${course.kcbh }">
					<div class="col-md-3" style="padding:0;marign:0;">
						<div style="padding:0;marign:0;">
							<ul class="list-group" style="margin-bottom: 0px;">
								<li class="list-group-item active" >课程章节</li>
							</ul>
						</div>
						<div class="pre-scrollable" style="width: 95%;max-height: 470px;padding:0;marign:0;">
							<ul class="list-group mod_video_list_content">
							    <c:choose>
								   <c:when test="${!empty courseresourses}"> 
								   		<c:forEach items="${courseresourses}" var="item">
											<li class="list-group-item videoitem" style="background: #666666 !important;">
										    	 <c:choose>
													<c:when test="${item.bxzd_1 == '0'}">
														
												    	<a class="item_link" href="course/selectCourse?kcxh=${item.zjxh}&kcbh=${item.kcbh}" title="${item.zjmc}" style="color: #BEBEBE;"> 
												    		<span class="album_pic"> 
												    		<img width="117px" height="65px" src="${homecourse.kctb }" alt="${item.zjmc}"> 
												    		<span class="figure_mask"> <em class="mask_txt">${item.bxzd_1}</em> </span> </span>
													        <div class="video_title"><strong>${item.zjmc}</strong><br />
														              <!--   播放：12556次<br />
														                评论：1554次 --></div>
													    </a>
													</c:when>
													<c:otherwise>
												    	<a class="item_link" href="course/selectCourse?kcxh=${item.zjxh}&kcbh=${item.kcbh}" title="${item.zjmc}"> 
												    		<span class="album_pic"> 
												    		<img width="117px" height="65px" src="${homecourse.kctb }" alt="${item.zjmc}"> 
												    		<span class="figure_mask"> <em class="mask_txt"></em> </span> </span>
													        <div class="video_title"><strong>${item.zjmc}</strong><br />
														              <!--   播放：12556次<br />
														                评论：1554次 --></div>
													    </a>
													</c:otherwise>
												</c:choose>  
										    </li>
										</c:forEach>
								   </c:when>
								   <c:otherwise>
									   <li class="list-group-item"><a href="">第${course.zjxh }章 ${course.zjmc}</a></li>
								   </c:otherwise>
								</c:choose>
								
							</ul>
						</div>
					</div>
					<%-- <span>
						<c:choose>
							<c:when test="${cSelection == null}">
							<input type="button"  onclick="addcartCourse()" value="加入课程" style="width: 70px; margin-left:11%;color: #31B0D5;" ></input>
							</c:when>
							<c:otherwise>
							    <input type="button" value="已添加" style="width: 70px;margin-left:11%;color: #31B0D5;" ></input>
							</c:otherwise>
						</c:choose>
						
						<c:choose>
							<c:when test="${cSelection == null}">
							<input type="button"  onclick="addCollectCourse()" value="加入喜欢" style="width: 70px; color: #31B0D5;" ></input>
							</c:when>
							<c:otherwise>
							    
							</c:otherwise>
						</c:choose>
					</span> --%>
				</div>
			</div>    
            </div>
            
       </div>
       
       
       
       
       
       
       
       <div class="container">
       		<div class="row" style="margin-left: 0px;margin-right: 0px;">
       			<!--点赞-->
       			<div class="agree"><span class="dzsc">
       				<c:choose>
						<c:when test="${cSelection == null}">
       						<a href="course/selectCourse?kcbh=${homecourse.kcbh }&kcxh=1" class="dianz" onclick="addcartCourse()">加入课程</a>
       					</c:when>
       					<c:otherwise>
       						<a href="course/selectCourse?kcbh=${homecourse.kcbh }&kcxh=1" class="dianz">已添加</a>
       					</c:otherwise>
       				</c:choose>
       				</span> 
       				<span class="dzsc">
       				
       				<c:choose>
						<c:when test="${cCollect == null}">
							<img src="img/shouc.png" style="margin-left: -30px;"/>&nbsp;&nbsp;&nbsp;&nbsp;
       						<a href="course/selectCourse?kcbh=${homecourse.kcbh }&kcxh=1" class="kdsc" onclick="addCollectCourse()">加入收藏</a>
       					</c:when>
       					<c:otherwise>
       						<img src="img/shoucang.png" style="margin-left: -30px;width:40px;height:40px;"/>&nbsp;&nbsp;&nbsp;&nbsp;
       						<a href="course/selectCourse?kcbh=${homecourse.kcbh }&kcxh=1" class="kdsc">已收藏</a>
       					</c:otherwise>
       				</c:choose>
       				</span>
       				<span class="fenx">
				    <div class="bshare-custom icon-medium">
				      <div class="bsPromo bsPromo2"></div>
				      </div>
				    <script type="text/javascript" charset="utf-8" src="http://static.bshare.cn/b/buttonLite.js#style=-1&amp;uuid=&amp;pophcol=2&amp;lang=zh"></script>
				    <script type="text/javascript" charset="utf-8" src="http://static.bshare.cn/b/bshareC0.js"></script>
				    <!-- </span>  <span style="float:right; margin-top:0px;">
				    <input type="image" src="img/zxpc.jpg" style="float:left; margin-right:10px;" />
				    <input type="image" src="img/xxbj.jpg" style="float:left;" />
				    </span>  -->
       			</div>
				  <!--视频简介-->
			    <div class="playerjj">
				    <ul>
				      <li>
				      	<div class="upname">
				          <div class="upnameimg"><img src="img/upname.jpg" width="61" height="60"/></div>
				          <div class="upnamet">昵称:<a href="user/showMyCourse">${username}</a><br />
				            <img src="img/xbg.jpg" /></div>
				        </div>
				        <div class="upinfo">
				          <h1>课程简介:</h1>
				          <p><c:choose>
						<c:when test="${empty homecourse}">
							<p>暂无数据</p>
						</c:when>
						<c:otherwise>
			        		<p>${homecourse.kcjj }</p>
        				</c:otherwise>
					</c:choose></p> </div>
				      </li>
				    </ul>
			    </div>
       			
       			<div class="col-md-9" style="margin-left: 0;padding-left: 0px;">
       				<div class="fbpl">
			        <div class="plr"><span class="pltx"><a href="#"><img src="img/upname.jpg" width="61" height="61" /></a></span><span class="plname"><a href="user/showMyCourse">${username}</a></span><span class="plnum">所有评论<a href="#"> </a></span></div>
			        <div class="zishu">0/300</div>
			        <form method="post" action="course/addComment">
				        <textarea name="plnr" class="input4"></textarea>
				        <input type="hidden" name="kcbh" value="${homecourse.kcbh }">
				        <input type="image" src="img/fbpl.jpg" style="margin-left:25px;" />
				    </form>
			      </div>
			      <!--留言列表-->
			      <div class="lylist">
			        <div class="title1">
			          <h1>全部评论</h1>
			          <div class="plpage">
			            <%-- <div class="page1"><span class="num"><font class="f_blue">1</font>/41</span><span class="prev">上一页</span><span class="next"><a href="#">下一页</a></span> </div>
			           --%></div>
			        </div>
			        <ul class="pllist">
			        <c:choose>
								   <c:when test="${!empty reviews}"> 
								   		<c:forEach items="${reviews}" var="item">
												<li>
										            <div class="lyimg" style="position:relative;"><a href="#">
										            <c:choose>
														<c:when test="${item.ygxb == '男'}">
						            	    					<img src="img/ygtx-0.jpg" style="width: 70px;"/>
						            	    			</c:when>
														<c:otherwise>
																<img src="img/ygtx-1.jpg" style="width: 70px;"/>
														</c:otherwise>
													</c:choose>
										            </a></div>
										              <div class="lyname"><span class="myname"><a href="#">${item.ygxm}</a></span></div>
										              <br><div class="gxqm">${item.review.plnr}</div>
										              <div class="reque"><f:formatDate value="${item.review.plsj}" pattern="yyyy-MM-dd HH:mm:ss"/><!--  <span class="zhuanfa"><a href="#">转发</a><a href="#">回复</a></span> --></div>
										          </li>
										</c:forEach>
								   </c:when>
								   <c:otherwise>
								   </c:otherwise>
								</c:choose>
			          
			        </ul>
			        <!-- <div class="page"><span class="prev">上一页</span><span class="num"><a href="#" class="on">1</a><a href="#">2</a><a href="#">3</a><a href="#">4</a><a href="#">5</a><a href="#">6</a><a href="#">7</a><a href="#">8</a><a href="#">9</a><a href="#">10</a></span><span class="next"><a href="#">下一页</a></span><em>217/5</em>转到
			          <input name="textfield" type="text" value="5" class="inputpage"/>
			          页
			          <input type="submit" name="Submit" value="GO" class="btngo"/>
			        </div> -->
			      </div>
       				
       			</div>
       			<div class="col-md-3" style="margin-left: 0;padding-left: 0px;">
       				<div class="title2">
				        <h1>推荐视频</h1>
				    </div>
				    <div class="tjlist">
				        <ul class="list-group">
				        <c:choose>
						   <c:when test="${!empty reCourse}"> 
						   <c:forEach items="${reCourse}" var="item">
							<li class="ist-group-item">
				            <div class="tjimg"><img src="${item.kctb }" width="138" height="83" /><span class="bftime">02:10</span></div>
				            <div class="tjinfo">
				              <h2><a href="course/selectHomeCourse?kcbh=${item.kcbh}">${item.kcmc }</a></h2>
				              <span>${item.bxzd1 }次播放</span></div>
				          </li>
				          </c:forEach>
						   </c:when>
						   <c:otherwise>
							   暂无视频推荐
						   </c:otherwise>
						</c:choose>
				        </ul>
				      </div>
       				
       			</div>
       		</div>
       </div>
       
		

	</body>
	<script src="js/video.min.js"></script>
	<script src="http://vjs.zencdn.net/5.19/lang/zh-CN.js"></script>
	<script type="text/javascript">
		var myPlayer = videojs('my-video');
		videojs("my-video").ready(function() {
			var myPlayer = this;
			/*var md=document.getElementsByTagName("video")[0];
			md.currentTime = 2;*/
			myPlayer.play();
		});
	</script>
	<script>
	//判断视频是否结束 the video is end?
	var md=document.getElementsByTagName("video")[0];
	    if(md.ended){
	        console.log("结束");
	        alert("视频播放结束！");
	    }
	    md.addEventListener("ended",function(){
	         console.log("结束");
	         alert("播放结束！");
	         var username="<%=session.getAttribute("username")%>";
	         var zjxh= document.getElementById("Prozjxh").value;
	         var kcbh= document.getElementById("Prokcbh").value;
	         $.ajax({
					url : "user/proKCJD?kcbh="+kcbh+"&username="+username+"&zjxh="+zjxh,
					type : "post",
					dataType:"text",
					contentType : 'application/json;charset=UTF-8',
					success : function(ifadd) {
							 		
							      },
							 error : function(e) {
							      }
						});
	    })
	//记录播放进度  record video point
	md.addEventListener("timeupdate",function(){
	    var timeDisplay;
		//用秒数来显示当前播放进度
		timeDisplay = Math.floor(md.currentTime);
		console.log(Math.floor(md.currentTime))
	    //当视频播放到 4s的时候
		if(timeDisplay == 4){
		      //alert("视频正播放到4秒哦");
		}
		//禁止快进 abandon fast
		/*var last = 0;
		//当目前的播放位置已更改时
		md.ontimeupdate = function () {
		    var current = md.currentTime;
		    if(current - last > 2) {
		        md.currentTime = last;
		    } else {
			last = current;
		    }
		};*/
	},false);
	md.addEventListener("loadedmetadata",function(){
       // alert("从两秒开始播放哦");
        this.currentTime = 2;
    });
	</script>
	<script type="text/javascript">  
        var divShow = true;  
        $(function(){  
            $("#navImg").click(function(){  
                var thisObj = $("#rightNav");  
                if (divShow) {  
                    thisObj.each(function() {  
                        $(this).animate({right : "-400"}, 100);  
                    });  
                    divShow = false;  
                } else {  
                    thisObj.each(function() {  
                        $(this).animate({right : "0"}, 300);  
                    });  
                    divShow = true;  
                }  
            });  
        });  
    </script>
    	<script type="text/javascript">
		var myPlayer = videojs('my-video');
		videojs("my-video").ready(function() {
			var myPlayer = this;
			myPlayer.play();
		});
	</script>
</html>