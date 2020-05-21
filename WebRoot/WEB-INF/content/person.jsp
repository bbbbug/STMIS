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
	  <script type="text/javascript" src="Jquery/jquery-3.3.1.js"></script>

  <script type="text/javascript" src="js/jquery-validate.js"></script>

  <script type="text/javascript">

  $('form').validate({

    onFocus: function() {

      this.parent().addClass('active');

      return false;

    },

    onBlur: function() {

      var $parent = this.parent();

      var _status = parseInt(this.attr('data-status'));

      $parent.removeClass('active');

      if (!_status) {

        $parent.addClass('error');

      }

      return false;

    }

  });



  $('form').on('submit', function(event) {

    event.preventDefault();

    $(this).validate('submitValidate'); //return boolean;

  });

  </script>
  <style type="text/css">
		#pic {
			width: 100px;
			height: 100px;
			border-radius: 50%;
			cursor: pointer;
		}
        </style>
		<style type="text/css">
			
		 
		  .form_control {
		
		    border: 1px #ccc solid;
		    
		
		  }
		
		
		
		  input[type="text"],
		
		  input[type="password"] {
		
		    border: none;
		
		    width: 100%;
		
		  }
		
		
		
		  .form_control.active {
		
		    border: 1px #32BC61 solid;
		
		    background-color: #fff;
		
		  }
		
		
		
		  .form_control.error {
		
		    border: 1px #f00 solid;
		
		    background-color: #FBF9BB;
		
		  }
		
		
		
		  .form_control.error input[type="text"],
		
		  .form_control.error input[type="password"] {
		
		    background-color: #FBF9BB;
		
		    color: #f00;
		
		  }
		
		
		
		  input[type="text"]:focus,
		
		  input[type="password"]:focus {
		
		    border: none;
		
		    outline: none;
		
		  }
		
		
		
		  .form_control .valid_message {
		
		    color: #32BC61;
		
		    position: absolute;
		
		    left: 50%;
		
		    top: 5px;
		
		    width: 200px;
		
		  }
		
		
		
		  .form_control.error .valid_message {
		
		    color: #f00;
		
		  }
		
		
		
		  .form_control.success .valid_message {
		
		    background: url(img/sucess.png) no-repeat;
		
		    left: auto;
		
		    right: 5px;
		
		    top: 4px;
		
		    width: 16px;
		
		    height: 16px;
		
		  }
		
		
		
		  .none {
		
		    display: none;
		
		  }
		
		  </style>
	<script type="text/javascript">
		$(function () {
			$("#pic").click(function () {
				$("#upload").click(); //隐藏了input:file样式后，点击头像就可以本地上传
				
				$("#upload").on("change", function () {
					var objUrl = getObjectURL(this.files[0]); //获取图片的路径，该路径不是图片在本地的路径
					if (objUrl) {
						$("#pic").attr("src", objUrl); //将图片路径存入src中，显示出图片
					}
				});
			});
		});
		//建立一個可存取到該file的url
		function getObjectURL(file) {
			var url = null;
			if (window.createObjectURL != undefined) { //basic
				url = window.createObjectURL(file);
			} else if (window.URL != undefined) { //mozilla(firefox) 
				url = window.URL.createObjectURL(file);
			} else if (window.webkitURL != undefined) { //webkit or chrome
				url = window.webkitURL.createObjectURL(file);
			}
			return url;
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
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-17" data-genuitec-path="/STMIS/WebRoot/index.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-35" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/person.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-35" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/person.jsp">
		<div class="container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-17" data-genuitec-path="/STMIS/WebRoot/index.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-35" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/person.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-35" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/person.jsp">
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
			
		
			
		<div class="container" style="margin-left: 20%;">
			<h2>个人信息表</h2>
            <form action="user/updatePerson" method="post"  enctype="multipart/form-data">
            <c:choose>
						<c:when test="${employee == ''}">
							
						</c:when>
						<c:otherwise>
             	 姓名：
			    <div class="form_control" style="width: 300px;position: relative;margin: 10px 0;">
			
			      <input class="required" value="${employee.ygxm }" type="text" name="ygxm" data-tip="请输入您的姓名" data-valid="isNonEmpty||onlyZh||between:2-5" data-error="姓名不能为空||姓名只能为中文||姓名长度为2-5位">
			
			    </div>
			    邮箱：
			    <div class="form_control" style="width: 300px;position: relative;margin: 10px 0;">
			
			      <input class="required" value="${employee.ygyx }" type="text" name="ygyx" data-tip="请输入您的邮箱" data-valid="isNonEmpty||isEmail" data-error="email不能为空||邮箱格式不正确">
			  
			    </div>
			   密码：
			    <div class="form_control" style="width: 300px;position: relative;margin: 10px 0;">
			
			      <input class="required" name="ygmm" value="${employee.ygmm }" type="password" data-tip="请输入您的密码" data-valid="isNonEmpty||between:6-16" data-error="密码不能为空||密码长度6-16位" name="nickname">
			
			    </div>
			<!--  个人图标：<input id="upload" name="file" accept="image/*" type="file" style="display: none;" />
							<br>
							<img id="pic" src="img/1.jpg" style="margin-left: 7%;margin-top: -1%;margin-bottom: 1%;">
                            <br /><br /> -->
			  电话号码：
			    <div class="form_control" style="width: 300px;position: relative;margin: 10px 0;">
			
			      <input class="required" name="ygdh" value="${employee.ygdh }" type="text" data-tip="请输入您的电话号码" data-valid="isNonEmpty||between:11-11" data-error="电话号码不能为空||电话号码11位" >
			
			    </div>
			    员工地址：
			    <div class="form_control" style="width: 300px;position: relative;margin: 10px 0;">
			
			      <input class="required" name="ygdz" value="${employee.ygdz }" type="text" data-tip="请输入您的电话号码" data-valid="isNonEmpty||between:11-11" data-error="电话号码不能为空||电话号码11位" >
			
			    </div>
			    <%-- 性别：
			    <div class="form_control" style="width: 300px;position: relative;margin: 20px 0;padding: 5px 10px;">
			
			      <span class="required" data-valid="isChecked" data-error="性别必选" data-type="radio">
			      <c:choose>
					<c:when test="${employee.ygxb == '男' }">
			          <label><input type="radio" checked="checked" name="ygxb">男</label>
			          <label><input type="radio" name="ygxb">女</label>
					</c:when>
					<c:otherwise>
						<label><input type="radio" name="ygxb">男</label>
			          <label><input type="radio" checked="checked"  name="ygxb">女</label>
			         </c:otherwise>
				</c:choose>
			      </span>
			
			    </div> --%>
				</c:otherwise>
			</c:choose>
				 所在单位：
			    <div class="form_control" style="width: 300px;position: relative;margin: 10px 0;padding: 0px 0px;">
				 <span>${employee.ygdwbh }</span>
			      

    </div>

    <div>

      <input type="submit" value="提交">

    </div>

  </form>

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