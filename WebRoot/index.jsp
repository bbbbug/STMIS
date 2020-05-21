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
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
	<script src="Jquery/jquery-3.3.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="ajax/dataRender3.js"></script>
	<script>
			function myFunction(){
				selectcategory_1();
				$.ajax({
						 url : "course/showCourse",
						 type : "post",
						 dataType:"text",
						 contentType : 'application/json;charset=UTF-8',
						 success : function(data) {
						 		console.log("hhhhhhhhhhhhhhhhhh"+data);
								var i = 0;
								var cc = jQuery.parseJSON(data);
							    var myCourse =$('#myCourse');
							    var hotCourse=$('#hotCourse');
								for ( ; i <cc.length/2; i++){
							        var content='<div class="col-xs-6 col-md-3"><a href="course/selectHomeCourse?kcbh='+cc[i]["kcbh"]+'" class="thumbnail">'+
													'<img src="'+cc[i]["kctb"]+'" style="width: 260px;height: 130px;algin:cent">'+cc[i]["kcmc"]+'</a></div>';
							        hotCourse.append(content);
								}
								for ( ; i <cc.length; i++){
							         //write by Jinming 2019.7.15
								    if(cc[i]["kczt"]==4){
								    	var content='<div class="col-xs-6 col-md-3"><a href="course/selectHomeCourse?kcbh='+cc[i]["kcbh"]+'" class="thumbnail">'+
													'<img src="'+cc[i]["kctb"]+'" style="width: 260px;height: 130px">'+cc[i]["kcmc"]+'</a></div>';
							     	 	  myCourse.append(content);
								  	  }
								    else{
								    
								    }
							        //write by Jinming 2019.7.15
								}
	
						      },
						 error : function(e) {
						         alert("错误！！");
						      }
					});
			}
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
	<body onload="myFunction()" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-17" data-genuitec-path="/STMIS/WebRoot/index.jsp">
		<div class="container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-17" data-genuitec-path="/STMIS/WebRoot/index.jsp">
			<div class="index_nav">
			 <!--write by Jinming  -->
			 <div style="width:100%;">
			    <img alt="" src="img/2.png" style="float:left;width:140px;height:40px;">
				<h3 class="navbar-left text-primary" style="margin-top: 4%;margin-left:-12%;font-size:16px;"><b>员工培训管理系统</b></h3>
			</div>
				<ul class="nav nav-pills text-center" >
					<li role="presentation">
						<a href="#" class="text-muted">首页</a>
					</li>
					<li role="presentation">
						<a></a>
					</li>
					<li role="presentation">
						<a></a>
					</li>
					<li role="presentation">
						<a></a>
					</li>
					<li role="presentation">
						<a href="#" id="selectCategory" class="text-muted" data-toggle="dropdown">课程<span class="caret"></span>
							<ul id="showCategory" class="dropdown-menu">
								<li>
									<a href="course/showAllCourse"></a>
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
					<!--  <li role="presentation">
						<a href="course/goto404" class="text-muted">培训社区</a>
					</li>
					<li role="presentation">
						<a href="course/goto404" class="text-muted">学员档案</a>
					</li>  -->
					<li role="presentation">
						<a></a>
					</li>
					<li role="presentation">
						<a></a>
					</li>
					<c:choose>
						<c:when test="${username != null}">
						<li role="presentation">
							<a href="user/showMyCourse" class="text-muted">我的学习</a>
						</li>
						</c:when>
						<c:otherwise>
							<li role="presentation">
								<a href="#" class="text-muted" data-toggle="modal" data-target="#myModal">我的学习</a>
							</li>
						</c:otherwise>
					</c:choose>
					<!-- <li role="presentation">
						<a href="course/goto404" class="text-muted">学科竞赛</a>
					</li> -->
					<li role="presentation">
						<a></a>
					</li>	
					<li role="presentation">
						<a></a>
					</li>
					<li role="presentation">
						<div class="input-group" style="width: 28rem;">
							<input type="search" class="form-control" id="keyword" placeholder="请输入" style="" />
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
												<label><a class="text-danger">忘记密码</a></label>
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
			<div id="carousel-example-generic" class="carousel slide index_loop" data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
					<li data-target="#carousel-example-generic" data-slide-to="1"></li>
					<li data-target="#carousel-example-generic" data-slide-to="2"></li>
				</ol>

				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">
					<div class="item active">
						<img src="img/lunbo.png" width="100%" style="height: 300px;">
						<div class="carousel-caption">
						</div>
					</div>
					<div class="item">
						<img src="img/lunbo2.jpg" width="100%" style="height: 300px;">
						<div class="carousel-caption">
						</div>
					</div>
					<div class="item">
						<img src="img/lunbo3.jpg" width="100%" style="height: 300px;">
						<div class="carousel-caption">
						</div>
					</div>
					<div class="item">
						<img src="img/lunbo4.jpg" width="100%" style="height: 300px;">
						<div class="carousel-caption">
						</div>
					</div>
				</div>
				<!-- Controls -->
				<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
					<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a>
				<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
					<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
			<div class="head_label" style="margin-top: 5%;">
				<div>
					<h4>培训栏目
						<span class="label label-danger">New</span>
						<a href="course/showAllCourse" class="href-color"><span class="pull-right text-danger">片库</span></a>						
					</h4>					
				</div>	
				<div style="background-color: #F5F5F5;">
					<ul id="Category_1" class="nav nav-pills">
						
					</ul>
				</div>
			</div>
			<div class="index_loop" style="margin-top: 5%;">
				<h4>最新视频 <span class="label label-danger">New</span></h4>
				<div class="row" id="hotCourse">
					
				</div>
			</div>
			<div class="index_loop" style="margin-top: 10%;">
				<h4 class="">推荐视频<a style="text-decoration:none;font-size: 1.5rem;"><span class="glyphicon glyphicon-th-large"></span></a></h4>
				<div class="row" id="myCourse">
					
				</div>
			</div>
			
		
		</div>
	</body>
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