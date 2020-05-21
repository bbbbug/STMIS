<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="multipart/form-data"  charset=utf-8"/>
		<base href="<%=basePath %>">
		<title>课程管理</title>
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="css/easy-upload.css">
		<link href="css/style.css" rel="stylesheet">
		<script src="Jquery/jquery-1.11.3.min.js"></script>
		<!-- <script type="text/javascript" src="js/jquery.min.js"></script> -->
		<script src="js/bootstrap.min.js"></script>
		<!-- <script type="text/javascript" src="js/jquery.cookie-1.4.1.min.js"></script> -->
 		<script type="text/javascript" src="js/easyUpload.js"></script>
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
		
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>

	<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-18" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/STMIS_addcourse.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-18" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/STMIS_addcourse.jsp">
		<div class="container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-18" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/STMIS_addcourse.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-18" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/STMIS_addcourse.jsp">
			<div class="index_nav">
			<!--write by Jinming  -->
				 <div style="width:100%;">
				    <img alt="" src="img/2.png" style="float:left;width:140px;height:40px;">
					<h3 class="navbar-left text-primary" style="margin-top: 4%;margin-left:-12%;font-size:16px;"><b>员工培训管理系统</b></h3>
				 </div>
				<ul class="nav nav-pills text-center">
					<li role="presentation">
						<a href="STMIS_.html" class="text-muted">首页</a>
					</li>
					
					<li role="presentation">
						<a href="STMIS_course.html" class="text-muted" data-toggle="dropdown">课程管理<span class="caret"></span>
							<ul class="dropdown-menu">
								<li>
									<a href="STMIS_addcourse.html">增加课程</a>
								</li>
								<li>
									<a href="#">删除课程</a>
								</li>
								<li>
									<a href="#">修改课程</a>
								</li>
								<li>
									<a href="#">查找课程</a>
								</li>
								
							</ul>

						</a>·
					</li>
					<li role="presentation">
						<a href="#" class="text-muted">已上传课程</a>
					</li>
					<li role="presentation">
						<a href="#" class="text-muted">课程试卷</a>
					</li>
					<li role="presentation">
						<a href="#" class="text-muted">评价</a>
					</li>
					<li role="presentation">
						<div class="input-group" style="width: 23rem;">
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
			
			<div class="index_detail_body">
				<div class="panel panel-info">
					<!-- Default panel contents -->
					<div class="panel-heading">添加课程</div>
				
				</div>
			</div>
			<div class="index_nav" style="width: 1048px;">
			<form enctype="multipart/form-data" method="post" id="form" action="course/addcourse" name="form1" >
			<table border="" class="table table-bg" >
				<tr>
		            <th class="text-r"><span class="c-red">*</span>课程名称：</th>
		            <td><input type="text" style="width:300px" class="input-text" value="" placeholder="" id="KCMC" name="kcmc"></td>
	          	</tr>
	          	<tr>
		            <th class="text-r"><span class="c-red">*</span>课程类别：</th>
		            <td>
		            	<select id="KCLB" name="kclb" class="" onChange="show()">
		            	  <option value ="#">--请选择--</option>
						  <option value ="jingguan">经管</option>
						  <option value ="dianzi">电子</option>
						  <option value="gongcheng">工程</option>
						  <option value="jisuanji">计算机</option>
						</select>
		            </td>
	          	</tr>
	          	<tr>
					 <th class="text-r"><span class="c-red">*</span>课程编号</th>
					 <td><input type="text" style="width:300px" class="input-text" value="" placeholder="课程编号" id="KCBH" name="kcbh" readonly="" ></td>
				</tr>
	          	<tr>
		            <th class="text-r"><span class="c-red">*</span>课程教师：</th>
		            
		            <td><input  type="text" style="width:300px" class="input-text" value="" placeholder="" id="KCJS" name="kcjs"></td>
	          	    
	          	</tr>
	          
	          	<tr>
		            <th class="text-r"><span class="c-red">*</span>课程学分：</th>
		            <td><input type="text" style="width:300px" class="input-text" value="" placeholder="" id="KCXF" name="kcxf" onkeyup="clearNoNum(this)"></td>
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
		            	<input type="button"  name="新增章节" style="height: 30px; width: 70px;" data-toggle="modal" data-target="#myModal" onclick="TJSJ()"  value="新增"/>
		            	<div id="zjxs"></div>
		            </td>
          		</tr>
          	   
	            <tr>
		            <th></th>
		            <td><button class="btn btn-success radius" type="submit"><i class="icon-ok"></i> 确定</button>
		            	<button class="btn btn-success radius" type="reset" ><i class="icon-ok"></i> 重置</button>
		            </td>
		            
          		</tr>
	
			</table>
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
												<label>课程章节：</label>
												<input type="text" class="form-control" id="ZJXH" name="zjxh" placeholder="输入数字" onkeyup="value=value.replace(/[^\d]/g,'')">
											</li>
											
											<li class="list-group-item">
												<label>章节描述：</label>
												<textarea class="form-control" name="" id="ZJMS" name="zjms" style="height:100px;width:300px;" placeholder="课程描述"></textarea>
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
		<script language="javaScript" type="text/javascript">  
		  		 function TJCG() {
			  	    var form = new FormData(document.getElementById("ZJZJ"));
					   var zjxh =document.getElementById('ZJXH').value;
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