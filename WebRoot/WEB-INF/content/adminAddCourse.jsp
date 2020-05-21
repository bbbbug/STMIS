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
    <title>课程上传</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <link href="css/admin.css" rel="stylesheet">
     <link rel="stylesheet" href="css_1/iconfont.css">  
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.js"></script>
		<script type="text/javascript" src="ajax/dataRender3.js"></script>
<!-- 	<link href="css/bootstrap.min.css" rel="stylesheet">
	
	
	<script src="Jquery/jquery-1.11.3.min.js"></script>
	<script src="js/bootstrap.min.js"></script> -->
	<link rel="stylesheet" href="css/easy-upload.css">
	<link href="css/style.css" rel="stylesheet">
 	<script type="text/javascript" src="js/easyUpload.js"></script>
 	<script>
			$(document).ready(function(){
			   $("input").blur(function(){
			     thisval = $(this).val();
			     if(thisval != ""){
				    $(this).siblings("label").css({"display":"None"});
				   }else{
				    $(this).siblings("label").css({"display":"block"});
				   }
        		});
			 })
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
 		<script type="text/javascript">
		    $('#easyContainer').easyUpload({
		      allowFileTypes: '*.jpg;*.doc;*.pdf',//允许上传文件类型，格式';*.doc;*.pdf'
		      allowFileSize: 100000,//允许上传文件大小(KB)
		      selectText: '选择文件',//选择文件按钮文案
		      multi: true,//是否允许多文件上传
		      multiNum: 5,//多文件上传时允许的文件数
		      showNote: true,//是否展示文件上传说明
		      note: '提示：最多上传5个文件，支持格式为doc、pdf、jpg',//文件上传说明
		      showPreview: true,//是否显示文件预览
		      url: '/api/file/upload',//上传文件地址
		      fileName: 'file',//文件filename配置参数
		      /* formParam: {
		        token: $.cookie('token_cookie')//不需要验证token时可以去掉
		      }, *///文件filename以外的配置参数，格式：{key1:value1,key2:value2}
		      timeout: 30000,//请求超时时间
		      successFunc: function(res) {
		        console.log('成功回调', res);
		      },//上传成功回调函数
		      errorFunc: function(res) {
		        console.log('失败回调', res);
		      },//上传失败回调函数
		      deleteFunc: function(res) {
		        console.log('删除回调', res);
		      }//删除文件回调函数
		    });
  		</script>
		<style type="text/css">
			.x {
				width: 100%;
				height: 80px;
			}
			
			.x div {
				background-repeat: no-repeat;
				background-size: 100% 100%;
				height: 100%;
				width: 100%;
				position: relative;
				background-position: center center;
				background-size: cover;
			}
			
			.page {
				text-align: center;
				margin-top: 50px;
			}
			
			.page a {
				text-decoration: none;
				border: 1px solid #E8E8E8;
				padding: 5px 7px;
				color: #767675;
			}
			
		</style>
		<script language="JavaScript" type="text/javascript">
		<!--只允许输入数字-->
			function clearNoNum(obj)
				{
				//先把非数字的都替换掉，除了数字和.
				obj.value = obj.value.replace(/[^\d.]/g,"");
				//必须保证第一个为数字而不是.
				obj.value = obj.value.replace(/^\./g,"");
				//保证只有出现一个.而没有多个.
				obj.value = obj.value.replace(/\.{2,}/g,".");
				//保证.只出现一次，而不能出现两次以上
				obj.value = obj.value.replace(".","$#$").replace(/\./g,"").replace("$#$",".");
				}
				</script>
				<script language="JavaScript" type="text/javascript">
		        function show(){
		        	var  AId = "wx7e42bfda7a9ccc22369";
				    // 随机6位数
				    var Atanisi = Math.floor(Math.random() * 999999);
				    var KCBH=document.form1.KCBH.value;
		            document.getElementById('KCBH').value=document.getElementById('KCLB').value+Atanisi;
		            
	        }
        </script>
        <!--
        	作者：461352934@qq.com
        	时间：2019-01-09
        	描述：讲课程数据加入到模态框
        -->
        <script>
        	 function TJSJ() {
        	  var a=document.getElementById("KCBH");
        	  var b=document.getElementById("KCMC");
        	  var c=document.getElementById("KCLB");
        	  var ABC='<input type="hidden" name="kcbh" value="'+a.value+'">'+
        	          '<input type="hidden" name="kcmc" value="'+b.value+'">'+
        	          '<input type="hidden" name="kclb" value="'+c.value+'">';
        	 var oABC=$('#ZJZJ');
        	 oABC.append(ABC);
        }	
        </script>
        <script>
        	 function showDewpart() {
        	  $.ajax({
						 url : "department/departments",
						 type : "post",
						 dataType:"text",
						 contentType : 'application/json;charset=UTF-8',
						 success : function(result) {
						 	var html="";
						 	console.log(result);
							var data = jQuery.parseJSON(result);
							for ( var i=0; i <data.length; i++){
								html+='<input type="checkbox" checked name="department" value="'+data[i]["bmbh"]+'" />'+data[i]["bmmc"];
									html+="&nbsp&nbsp&nbsp";
									if(i%4==0 && i>0){
									html+="<br><br>"
									}
								}	
								$("#showDepart").append(html);
						      }
					});
        }	
        </script>
                <script>
        	 function selectDepart() {
        	  alert("添加成功");
        	  var kcmc=$("#KCMC").val();
        	  var kcbh=$("#KCBH").val();
		      var courseTypes = [];
        	  $("#showDepart").find('input[type="checkbox"]:checked').each(function(v, i){
					var bmid = $(this).val();
					var courseType = {
							"kcbh" : kcbh,
							"bmid" : bmid,
							"kcmc" : kcmc,
							"xxbx" : "选修"
						};
					courseTypes.push(courseType);
				});
				$.ajax({
					url : "course/insertCourseTypes",
					type : "post",
					data : JSON.stringify(courseTypes),
					dataType : "json",
					async : true,
					contentType : "application/json",
					success : function(result) {
						alert("success");
					}
				});
       		 }	
        </script>
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body onload="showDewpart()" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-30" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/adminAddCourse.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-30" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/adminAddCourse.jsp">
  	<div class="container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-30" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/adminAddCourse.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-30" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/adminAddCourse.jsp">
		
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
			<li class="active">课程管理</li>
		</ul>
		
	</div>
	
	<div class="main-area dashboard">
    <form enctype="multipart/form-data" method="post" id="form" action="course/addcourse" name="form1" >
			<table border="" class="table table-bg" >
				<tr>
		            <th class="text-r"><span class="">*</span>课程名称：</th>
		            <td><input type="text" class="input-xlarge focused" value="" placeholder="" id="KCMC" name="kcmc"><label style="display: None;color: red;" for="KCMC">请输入课程名称</label></td>
	          	</tr>
	          	
	          	<tr>
		            <th class="text-r"><span class="c-red">*</span>课程类别：</th>
		            <td>
		            	<select id="KCLB" name="kclb" class="" onChange="show()">
		            	  <option value ="#">--请选择--</option>
						</select>
		            </td>
	          	</tr>
	          	<tr>
					
	          	<tr>
		            <th class="text-r"><span class="c-red">*</span>课程学分：</th>
		            <td>
		            	 <select id="KCXF" name="kcxf" onkeyup="clearNoNum(this)">
						        <option>1</option>
						        <option>2</option>
						        <option>3</option>
						        <option>4</option>
						        <option>5</option>
						  </select>
		            </td>
	          	</tr>
	          	
	          	<tr>
		            <th class="text-r">课程简介：</th>
		            <td><textarea class="input-text" name="kcjj" id="" style="height:100px;width:300px;"></textarea></td>
          		</tr>
				 <tr>
		            <th class="text-r"><span class="c-red">*</span>课程图标：</th>
		            <td><input type="file" class="" name="kctb" multiple></td>
	           </tr>
	           <!--
	            <tr>
		            <th class="text-r"><span class="c-red">*</span>开课时间：</th>
		            <td><input type="date" id="KKSJ" name="kksj" /></td>
	           </tr>
	           <tr>
		            <th class="text-r"><span class="c-red">*</span>节课时间：</th>
		            <td><input type="date" id="JKSJ" name="jksj"/></td>
	           </tr> -->
	            <tr>
		            <th class="text-r">新增章节：</th>
		            <td >
		            	<img alt="新增章节" src="img/add_2.jpg" onclick="TJSJ()" style="height: 30px; width: 30px;" data-toggle="modal" data-target="#myModal">
		            	<div id="zjxs"></div>
		            </td>
          		</tr>
          	    <tr style="display: none" >
		            <th class="text-r"><span class="c-red">*</span>需修部门：</th>
		            <td id="showDepart">
		            </td>
	          	</tr>
	            <tr>
		            <th></th>
		            <td><button onclick="selectDepart()" class="btn btn-success radius" type="submit"><i class="icon-ok"></i> 确定</button>
		            	<button class="btn btn-success radius" type="reset" ><i class="icon-ok"></i> 重置</button>
		            </td>
		            
          		</tr>
	
			</table>
			<input  type="hidden" style="width:300px" class="input-text" value="" placeholder="课程编号" id="KCBH" name="kcbh" readonly="" >
			</form>
			<div style="display: none;" id="XZZJ">
			</div>
			
		</div>

		<!-- 模态框 -->
			<!-- Modal -->
			
			<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-t itle" id="myModalLabel">新增章节</h4>
						</div>
						<div class="modal-body">
							<div class="panel panel-primary">
								
								<div class="panel-heading" id="XZ">新增</div>
								<div class="panel-body login_list">
									<form enctype="multipart/form-data" method="post" name="form" id="ZJZJ" >
										<ul class="list-group">
											<li class="list-group-item">
												<label>章节名称：</label>
												<input type="text" class="form-control" id="ZJMC" name="zjmc"  >
											</li>
											
											<li class="list-group-item">
												<label>章节文件：</label>
												<input type="file" class="form-control" id="ZYLJ" name="zylj" placeholder="课程文件" multiple>
											</li>
											<li class="list-group-item" style="border-bottom: 0px;border-left: 0px;border-right: 0px;">
												 <button  type="button" class="btn btn-primary" onclick="TJCG()">提交更改</button>
											</li>
											<!--<script>
												var x=document.getElementById("KCMC");
												alert(x);
											</script>-->
										</ul>
									</form>
								</div>
							</div>
						</div>
						
					</div>
				</div>
			</div>
  </body>
  </div>
			
	</div>
	
	</div> <!-- end span10 -->
		
	</div> <!-- end row -->
		
	</div> <!-- end container -->
  <script language="javaScript" type="text/javascript">  
  				 var zjxh=0;
		  		 function TJCG() {
		  		 	zjxh=zjxh+1;
			  	    var form = new FormData(document.getElementById("ZJZJ"));
					   $.ajax({
					      url : "course/addCourseResource",
					      type : "post",
					      data : form,
					      processData : false,
					      contentType : false,
					      success : function(data) {
					             var XZ='<a herf="#">第'+zjxh+'章    </a>';
								    var oTab=$('#zjxs');
								    oTab.append(XZ);
								    alert("添加成功");
								    $('#myModal').map(function() {//用id选择器选中要关闭的模态框
										$(this).modal('hide'); //关闭
									});
					      },
					      error : function(e) {
					         alert("错误！！");
					      }
					   });
		  }
		</script>
</html>
