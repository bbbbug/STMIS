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
	<title>试题上传</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
	<link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <link href="css/admin.css" rel="stylesheet">
	<link href="css/iconfont.css" rel="stylesheet" type="text/css" />
	<link href="css/test.css" rel="stylesheet" type="text/css" />
	<script src="js/jquery.min.js"></script>
	<script type="text/javascript" src="ajax/dataRender2.js"></script>
	 <link rel="stylesheet" href="css_1/iconfont.css">  
	<script src="js/bootstrap.js"></script>
     <style type="text/css">
		
		  
		  .form_control.active {
		
		    border: 1px #32BC61 solid;
		
		    background-color: #fff;
		
		  }
		
		
		
		  .form_control.error {
		
		    border: 1px #f00 solid;
		
		    background-color: #FBF9BB;
		
		  }
		
		
		
		  .form_control.error input[type="text"] {
		
		    background-color: #FBF9BB;
		
		    color: #f00;
		
		  }
		
		
		
		  input[type="text"]:focus,
		
		  input[type="password"]:focus {
		
		    border: none;
		
		    outline: none;
		
		  }
		
		  .valid_message {
		    color:red;!important
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
		  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
	<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-1" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/AdminExam.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-1" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/AdminExam.jsp">
	<div class="container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-1" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/AdminExam.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-1" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/AdminExam.jsp">
		
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
				<li class="active">试题上传</li>
			</ul>
			
	</div>
	
	<div class="main-area dashboard">
			<div class="row">
				<div class="span10">
					<div class="slate">
						<div class="page-header">
							<label style="font-size: 18px;float: left;">EXCEL上传</label>
							<div class="form-group" style="float:right;">
					           <label class="input-group-btn" style="float:right;">
					               <input type="button" id="i-check" value="上传" class="btn btn-primary" onclick="uploadExam()">
					           </label>
					            <label class="" style="float:right;">
					               <input type="button" id="i-check" value="下载" class="btn btn-primary" onclick="downloadType('source/uploadType.xlsx')">
					           </label>
							</div>
							<input type="file" name="file" id='i-file'  accept=".xls, .xlsx" onchange="$('#location').val($('#i-file').val());" style="display: none">
						</div>
						<form id="form" class="form-horizontal" onsubmit="return false" action="##" method="post">
						<div>&nbsp;</div>
						<div class="control-group success" style="margin-left:-8%;">
						    <label class="control-label" for="selectError">请选择课程</label>
						    <div class="controls">
							     <input class="input-large" type="hidden" id="selectKCBH">
							      <select style="width: 30%" id="kcbh" name="kcbh" onchange="kaotinum(this.value)">
							      <c:forEach items="${courselist}" var="item">
							        <option value="${item.kcbh}">${item.kcmc}</option>
							      </c:forEach>
							      </select>
							      <span class="help-inline" style="color:red;">*</span>&nbsp;&nbsp;&nbsp;
								  <label>当前试题库有<i id="examsize" style="color:red;">0</i>道题</label>
						    </div>
						    <div style="float:right;margin-right:18%;margin-top: -5%">
							     <div class="controls">
						              <input type="button" id="i-check" value="浏览文件" class="btn btn-primary" onclick="$('#i-file').click();">&nbsp;&nbsp;&nbsp;
							     	  <input id='location' class="form-control">
							     </div>
						     </div>
						</div>
						
						<div class="control-group" style="margin-left:-8%;margin-top: -1.5%">
							<label class="control-label" for="selectError" style="color: #468847">答题时间:</label>
						    <div class="controls">
						    	<select class="form-control" name="dtsj" id="answerTime" style="width: 30%;color: #468847">
					              	<option value="00:30">三十分钟</option>
							        <option value="01:00">一小时</option>
							        <option value="01:30">一个半小时</option>
							        <option value="02:00">两个小时</option>
					             </select>
					             <span class="help-inline" style="color:red;">*</span>
					             <div style="float:right;margin-right: 10%">
						             <label class="control-label" for="selectError" style="color: #468847">考题数量:</label>
								     <div class="controls">
							              <input class="form-control" name="ktsl" id="ktsl" value="5" style="color: #468847"/>
							              <span class="help-inline" style="color:red;">*</span>&nbsp;&nbsp;&nbsp;
							              <small>选择考几道题</small>
								     </div>
							     </div>
						    </div>
						</div>
							
						<div class="control-group" style="margin-left:0%">
							<label style="font-size: 18px;float: left;">单选题</label>
						</div>
						<div style="border:1px dashed #000;padding-top: 20px;height: 400px;padding-left: 40px;padding-right: 40px;">
						  <div class="test_content_nr_tt" style="border-bottom:none !important;float:left;">
								<i id="smallnum" style="margin-top: -5px;margin-left: 5px;">1</i>
						  </div>
						  <div class="form-control" style="padding:10px 10px 10px 10px;">
							<label class="control-label" for="focusedInput">
								问题：</label>
						    <div class="controls">
						      <input class="required" name="caption" id="question" type="text" data-tip="请输入问题" data-valid="isNonEmpty" data-error="问题不能为空" >
						    </div>
						  </div>
						  <div class="form-control" style="padding:10px 10px 10px 10px;">
						    <label class="control-label" for="focusedInput">A选项：</label>
						    <div class="controls">
						      <input class="required" name="rrangeA" id="rrangeA" type="text" data-tip="请输入问题" data-valid="isNonEmpty" data-error="选项不能为空">
						    </div>
						  </div>
						  <div class="form-control" style="padding:10px 10px 10px 10px;">
						    <label class="control-label" for="focusedInput">B选项：</label>
						    <div class="controls">
						      <input class="required" name="rrangeB" id="rrangeB" type="text" data-tip="请输入问题" data-valid="isNonEmpty" data-error="选项不能为空">
						    </div>
						  </div>
						  <div class="form-control" style="padding:10px 10px 10px 10px;">
						    <label class="control-label" for="focusedInput">C选项：</label>
						    <div class="controls">
						      <input class="required" name="rrangeC" id="rrangeC" type="text" data-tip="请输入问题" data-valid="isNonEmpty" data-error="选项不能为空">
						    </div>
						  </div>	
						  <div class="form-control" style="padding:10px 10px 10px 10px;">
						    <label class="control-label" for="focusedInput">D选项：</label>
						    <div class="controls">
						      <input class="required" name="rrangeD" id="rrangeD" type="text" data-tip="请输入问题" data-valid="isNonEmpty" data-error="选项不能为空">
						    </div>
						  </div>
						  <div class="form-control success" style="padding:10px 10px 10px 10px;">
						    <label class="control-label" for="selectError">正确答案</label>
						    <div class="controls">
							    <input type="hidden" id="selectKCXF">
							      <select id="select_id" name="answer">
							        <option value="A">A</option>
							        <option value="B">B</option>
							        <option value="C">C</option>
							        <option value="D">D</option>
							      </select>
							      <span class="help-inline"></span>
						    </div>
						  </div>
						 
						  <div class="" style="float: right;">
							<button class="btn btn-primary" onclick="saveExam()">保存</button>
							<span>&nbsp;&nbsp;</span>
						   </div>
						 </div>
						</form>
					</div>
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
<script src="Jquery/jquery-1.11.3.min.js"></script>
<script src="Jquery/jquery.easy-pie-chart.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
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
  
  
<script type="text/javascript">
	$(document).on("change","input,textarea,select",function(){
	    window.onbeforeunload = function(event) {
	          return "您编辑的信息尚未保存，您确定要离开吗？"//这里内容不会显示在提示框，为了增加语义化。
	    };
	});
	function saveExam() {
		var question = $('#question').val();
		var rrangeA = $('#rrangeA').val();
		var rrangeB = $('#rrangeB').val();
		var rrangeC = $('#rrangeC').val();
		var rrangeD = $('#rrangeD').val();
		console.log(question+rrangeA+rrangeB+rrangeC+rrangeD);
		if(question.length > 0 && rrangeA.length>0 && rrangeB.length>0 && rrangeC.length>0 && rrangeD.length>0){
	    $.ajax({
	    //几个参数需要注意一下
	        type: "POST",//方法类型
	        dataType: "json",//预期服务器返回的数据类型
	        url: "exam/addExam" ,//url
	        data: $('#form').serialize(),
	        success: function (result) {
	            console.log(result);//打印服务端返回的数据(调试用)
	            if (result != null) {
	                //alert("SUCCESS");
	                var num = $("#examsize").html();
	                if(parseInt(num) == 100){
	                	alert("最多只能添加100道题！");
	                }else{
	                	num = parseInt(num)+1;
		                console.log(num);
		                $("#examsize").html(num);
		                $("#number").html(num);
		                $("#smallnum").html(num+1);
	                }
	              $(" input[ type='text' ] ").val("");
	            };
	        },
	        error : function() {
	            alert("异常！");
	        }
	        
	    });
	    }else{
			console.log("试题信息不能为空！");
		}
	}
	
	
	function Examinfo(){
		$.ajax({
	    //几个参数需要注意一下
	        type: "POST",//方法类型
	        dataType: "json",//预期服务器返回的数据类型
	        url: "course/addKSinfo" ,//url
	        data: $('#Form2').serialize(),
	        success: function (result) {
	            console.log(result);//打印服务端返回的数据(调试用)
	            if (result != null) {
	                alert("提交成功！");
	            }
	            ;
	        },
	        error : function() {
	            alert("异常！");
	        }
	    });
	}
	window.onbeforeunload = function(){
		return "您还没有提交，确定要离开吗?";
	}
	
	function kaotinum(kcbh){
		$.ajax({
	    //几个参数需要注意一下
	        type: "POST",//方法类型
	        dataType: "json",//预期服务器返回的数据类型
	        url: "exam/selectKtnum" ,//url
	        data:{kcbh:kcbh},
	        success: function (result) {
	            console.log(result);//打印服务端返回的数据(调试用)
	            if (result != null) {
	                $('#examsize').html(result);
	                $('#numberexam').html(result);
	                var num = parseInt(result)+1;
	                $('#smallnum').html(num);
	            }
	        },
	        error : function() {
	            alert("异常！");
	        }
	    });
	}
	
	dtsj_all = '';
	function dtsj(kssj){
		dtsj_all = kssj;
	}
	
	function uploadExam(){
		var filepath = $('#location').val();
		var fileObj = document.getElementById("i-file").files[0];
		var formFile = new FormData();
	    formFile.append("filepath", fileObj); 
	    formFile.append("basePath", "");
		var data = formFile;
		var kcbh = $('#kcbh').val();
		var ktsl = $('#ktsl').val();
		var obj = document.getElementById("answerTime"); //定位id
		var index = obj.selectedIndex; // 选中索引
		var dtsj = obj.options[index].value; 
		console.log("filename:"+kcbh+ktsl+dtsj);
		$.ajax({
	        type: "POST",//方法类型
	        dataType: "json",//预期服务器返回的数据类型
	        url: "exam/uploadXlsxExam?kcbh="+kcbh+"&ktsl="+ktsl+"&dtsj="+dtsj,//url
	        data:data,
	        async: true,
            cache: false,
            processData: false,//用于对data参数进行序列化处理 这里必须false
            contentType: false, //必须
	        success: function (result) {
	            console.log(result);//打印服务端返回的数据(调试用)
	            if(result != null){
	            	alert("上传成功！");
	            }
	        },
	        error : function() {
	            alert("异常！");
	        }
	    });
	}
	
	function getPath(obj) 
	{ 
	  if(obj){ 
	    if (window.navigator.userAgent.indexOf("MSIE")>=1){ 
	        obj.select(); 
	      	return document.selection.createRange().text; 
	    }else if(window.navigator.userAgent.indexOf("Firefox")>=1){ 
	        if(obj.files){ 
	        	return obj.files.item(0).getAsDataURL(); 
	      	} 
	      		return obj.value; 
	      	} 
	    		return obj.value; 
	    } 
	}
</script>
</html>