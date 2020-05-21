<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-34" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/loginForm.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-34" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/loginForm.jsp">
	<h3 data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-34" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/loginForm.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-34" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/loginForm.jsp">登录页面</h3>
	<form action="login" method="post">
		<font color="red">${requestScope.message}</font>
		<table>
			<tr>
				<td><label>登录名:</label></td>
				<td><input type="text" id="loginname" name="loginname"/></td>
			</tr>
			<tr>
				<td><label>密码:</label></td>
				<td><input type="password" id="password" name="password"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="登录"/></td>
			</tr>
		</table>
	</form>
  </body>
</html>
