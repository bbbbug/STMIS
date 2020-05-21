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
	<title>首页</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
	<script src="Jquery/jquery-3.3.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
 	 <script>
		function myFunction(){
			$.ajax({
					 url : "course/showCourse",
					 type : "post",
					 dataType:"text",
					 contentType : 'application/json;charset=UTF-8',
					 success : function(data) {
							var cc = jQuery.parseJSON(data);
						    var myCourse =$('#myCourse');
						    var hotCourse=$('#hotCourse');
							for ( var i = 0; i <cc.length; i++){
						        var content='<div class="col-xs-6 col-md-3"><a href="course/selectCourse?kcxh=1'+'&kcbh='+cc[i]["kcbh"]+'" class="thumbnail">'+
												'<img src="'+cc[i]["kctb"]+'" style="width: 260px;height: 130px"></a></div>';
						        myCourse.append(content);
						        hotCourse.append(content);
							}

					      },
					 error : function(e) {
					         alert("错误！！");
					      }
				});
		}
	</script>
  <body onload="myFunction()" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-37" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/test.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-37" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/test.jsp">
 <!--    <a href="course/add"><h> 上传课程</h></a> <br>
    <a href="course/upload"><h> 上传</h></a> <br>
    <a href="http://www.17sucai.com/pins/tag/1508.html">参考网址</a>
    <a href="https://blog.csdn.net/qq_40727252/article/details/79632845">上传网址</a>
    <a href="https://blog.csdn.net/wabiaozia/article/details/50117561">多个form表单提交</a>
    <a href="test">测试</a> -->
		<div class="container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-37" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/test.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-37" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/test.jsp">
			<div class=" index_nav">
				<h3 class="navbar-text navbar-left text-primary" style="margin-top: 1%;"><b><em>员工培训管理信息系统</em></b></h3>
				<ul class="nav nav-pills text-center">
					<li role="presentation">
						<a href="STMIS_.html" class="text-muted">首页</a>
					</li>
					<li role="presentation">
						<a href="#" class="text-muted">咨询</a>
					</li>
					<li role="presentation">
						<a href="#" class="text-muted"  data-toggle="dropdown">课程<span class="caret"></span>
							<ul class="dropdown-menu">
								<li>
									<a href="#">计算机</a>
								</li>
								<li>
									<a href="#">经济管理</a>
								</li>
								<li>
									<a href="#">外语</a>
								</li>
								<li>
									<a href="#">社科法律</a>
								</li>
								<li>
									<a href="#">文学</a>
								</li>
								<li>
									<a href="#">创业</a>
								</li>
							</ul>

						</a>
					</li>
					<li role="presentation">
						<a href="#" class="text-muted">定制</a>
					</li>
					<li role="presentation">
						<a href="#" class="text-muted">学习</a>
					</li>
					<li role="presentation">
						<a href="#" class="text-muted">社区</a>
					</li>
					<li role="presentation">
						<a href="#" class="text-muted">学员档案</a>
					</li>
					<li role="presentation">
						<a href="#" class="text-muted">学科竞赛</a>
					</li>
					<li role="presentation">
						<a href="course/add"" class="text-muted">管理者登录</a>
					</li>
					<li role="presentation">
						<a href="#" class="text-danger">登录</a>
					</li>
				</ul>
			</div>
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
						<img src="img/test.jpg" width="100%" style="height: 280px;">
						<div class="carousel-caption">
						</div>
					</div>
					<div class="item">
						<img src="img/test.jpg" width="100%" style="height: 280px;">
						<div class="carousel-caption">
						</div>
					</div>
					<div class="item">
						<img src="img/test.jpg" width="100%" style="height: 280px;">
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
			<div class="index_loop" style="margin-top: 5%;">
				<h4>视频推荐 <span class="label label-danger">New</span></h4>
				<div class="row" id="hotCourse">
					
				</div>
			</div>
			<div class="index_loop" style="margin-top: 5%;">
				<h4 class="">视频资源<a style="text-decoration:none;font-size: 1.5rem;">更多<span class="glyphicon glyphicon-th-large"></span></a></h4>
				<div class="row" id="myCourse">
					
				</div>
			</div>
			<div class="index_loop" style="margin-top: 5%;">
				<h4>最新资讯<span class="label label-danger">New</span></h4>
				<table class="table">
					<tr class="">
						<th>1</th>
						<th>2</th>
						<th>3</th>
						<th>4</th>
					</tr>
					<tr class="">
						<td>1</td>
						<td>2</td>
						<td>3</td>
						<td>4</td>
					</tr>
					<tr class="">
						<td>1</td>
						<td>2</td>
						<td>3</td>
						<td>4</td>
					</tr>
				</table>
			</div>
			<div class="index_loop" style="margin-top: 5%;">
				<h4>优秀学员 <span class="label label-danger">New</span></h4>
				<div class="row">
					<div class="col-xs-6 col-md-3">
						<a href="#" class="thumbnail">
							<img src="img/test.jpg">
						</a>
					</div>
					<div class="col-xs-6 col-md-3">
						<a href="#" class="thumbnail">
							<img src="img/test.jpg">
						</a>
					</div>
					<div class="col-xs-6 col-md-3">
						<a href="#" class="thumbnail">
							<img src="img/test.jpg">
						</a>
					</div>
					<div class="col-xs-6 col-md-3">
						<a href="#" class="thumbnail">
							<img src="img/test.jpg">
						</a>
					</div>
					<div class="col-xs-6 col-md-3">
						<a href="#" class="thumbnail">
							<img src="img/test.jpg">
						</a>
					</div>
					<div class="col-xs-6 col-md-3">
						<a href="#" class="thumbnail">
							<img src="img/test.jpg">
						</a>
					</div>
					<div class="col-xs-6 col-md-3">
						<a href="#" class="thumbnail">
							<img src="img/test.jpg">
						</a>
					</div>
					<div class="col-xs-6 col-md-3">
						<a href="#" class="thumbnail">
							<img src="img/test.jpg">
						</a>
					</div>
				</div>
			</div>
		</div>

	</body>

</html>