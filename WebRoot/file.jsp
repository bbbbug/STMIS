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
	<meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="员工培训管理系统">
        <meta name="keywords" content="员工培训 ">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <meta name="format-detection" content="telephone=no">
        <script src="js/jquery.min.js"></script>
        <script src="Jquery/jquery-3.3.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="ajax/dataRender.js"></script>
	<body>
		<div>
			<button id="addImport">导入</button>			
			<input id="FileUpload" name="file" type="file" accept=".xls,.xlsx" onchange="uploadWord()" style="display: none;"/>
			<label id="filename"></label>
		</div>
	</body>		
	
	<!-- 
		文件上传: chen
	-->
	<script type="text/javascript">
	   /**
	    * 导入word文档入口
	    */
	   $('#addImport').click(function () {
	       openFileDialogue();
	   });
	   /**
	    * 打开上传文件对话框
	    */
	   function openFileDialogue() {
	       var f = document.getElementById('FileUpload');
	       f.click();
	   }
	
	   /**
	    * 文件上传 前检查与确认
	    */
	   var msg;
	   function uploadWord() {
	       var fileObj = document.getElementById("FileUpload").files[0]; // js 获取文件对象
	       var fileObjName = $("#FileUpload").val();
	       console.log(fileObjName);
	       if (typeof (fileObj) == "undefined" || fileObj.size <= 0) {
	           alert("请选择要导入的文档?");
	           return;
	       }
	       //判断是否为 doc 或 docx 文件
	       var fileName = getFileName(fileObjName);
	       console.log("已上传的文件名:"+fileName);
	       $("#filename").text(fileName);
	       /*var fileSuffix = getFileSuffix(fileObjName);
	       if (fileSuffix != 'doc' && fileSuffix != 'docx') {
	           alert("----请选择正确的文件格式---------");
	           return;
	       } */
	       //确认是否上传(略)
	       //执行上传
	       uploadWordDo(fileObj);
	
	   }
	
	   /**
	    * 发送ajax请求 执行上传
	    */
	   function uploadWordDo(fileObj) {
	       var formFile = new FormData();
	       formFile.append("file", fileObj); //加入文件对象
	       formFile.append("basePath", ""); //加入文件对象
	       var data = formFile;
	       $.ajax({
	           url: "course/updateCourseFeedbackQuestion",
	           data: data,
	           type: "post",
	           dataType: "json",
	           async: true,
	           cache: false,
	           processData: false,//用于对data参数进行序列化处理 这里必须false
	           contentType: false, //必须
	           success: function (result) {
	               //成功提示
	               console.log(result);
	               var code = result.code;
	               if (code == '100') {
	                   alert("--上传成功---");
	               } else {
	                   alert("--失败---");
	               }
	           }
	       });
	   }
	   /**
	    * 获取文件名
	    * @param file
	    * @returns {*}
	    */
	   function getFileName(file) {
	       var arr = file.split('\\');
	       return arr[arr.length - 1];
	   }
	
	   /**
	    * 获取后缀
	    * @param file
	    * @returns {string}
	    */
	   function getFileSuffix(file) {
	       var point = file.lastIndexOf(".");
	       var type = file.substr(point + 1);
	       return type;
	   }
	
	</script>
</html>