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
    
    <title>My JSP 'Comment.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-7" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/Comment.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-7" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/Comment.jsp">
    <form class="form-horizontal" method="post" id="form" action="course/addComment" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-7" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/Comment.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-7" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/Comment.jsp">
						<fieldset>
						  <div class="control-group">
						    <label class="control-label" for="focusedInput">主题</label>
						    <div class="controls">
						       <textarea class="input-xlarge" name="plnr" id="textarea" rows="6" cols="100"></textarea>
						    </div>
						  </div>
						<input type="hidden" style="width:300px" class="input-text" value="${kcbh}" id="KCBH" name="kcbh">
						</fieldset>
						<div class="span10 listing-buttons">
							<a class="btn btn-info" style="cursor:pointer" onclick="history.back()">返回上一页面</a>
							<button class="btn btn-success" type="reset">重置</button>
							<button class="btn btn-primary" type="submit">发布</button>
						</div>
			</form>
  </body>
</html>
