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
    
    <title>课程反馈表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="ajax/dataRender4.js"></script>
	<script src="js/jquery.min.js"></script>
	<script src="Jquery/jquery-3.3.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/kcfkb.css" />

  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script><script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56057",secure:"56066"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body link='blue' vlink='purple' class='x69' style="margin-left:30%;margin-right:30%;" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-33" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/kcfkb.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-33" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/kcfkb.jsp">
		<div id="KCFKB_div" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-33" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/kcfkb.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-33" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/kcfkb.jsp">
			<table border='0' cellpadding='0' cellspacing='0' width='653' style='border-collapse: 
			 collapse;table-layout:fixed;width:489pt'>
				 <col class='x69' width='72' span='2' style='mso-width-source:userset;width:54pt'>
				 <col class='x69' width='189' style='mso-width-source:userset;width:141.75pt'>
				 <col class='x69' width='64' span='5' style='mso-width-source:userset;width:48pt'>
			 <tr height='34' style='mso-height-source:userset;height:25.5pt' id='r0'>
				<td colspan='8' height='34' class='x91' width='653' style='height:25.5pt;' align='left' valign='top'>
					<span style='mso-ignore:vglayout;position:absolute;z-index:0;margin-left:18px;margin-top:0px;width:390px;height:43px'>
						<img width='390' height=43' src="img/1.png" name='Picture 2' alt='一起'>
					</span>
					<span  style='mso-ignore:vglayout2'>
						<table cellpadding='0' cellspacing='0'>
							<tr>
								<td colspan='8' height='34' class='x70' width='653' style='height:25.5pt;'>
								</td>
							</tr>
						</table>
					</span>
				</td>
			 </tr>
			 <tr height='18' style='mso-height-source:userset;height:13.5pt' id='r1'>
				<td colspan='8' rowspan='2' height='43' class='x71' style='height:32.25pt;'>培训效果调查表</td>
			 </tr>
			 <tr height='25' style='mso-height-source:userset;height:18.75pt' id='r2'>
			 </tr>
			 <tr height='5' style='mso-height-source:userset;height:3.75pt' id='r3'>
				<td height='5' class='x72' style='height:3.75pt;'></td>
				<td class='x72'></td>
				<td class='x72'></td>
				<td class='x72'></td>
				<td class='x72'></td>
				<td class='x73'></td>
				<td colspan='2' class='x73'></td>
			 </tr>
			 <tr height='21' style='mso-height-source:userset;height:15.75pt' id='r4'>
					<td height='20' class='x72' style='height:15pt;'></td>
					<td class='x72'></td>
					<td class='x72'></td>
					<td class='x72'></td>
					<td colspan='4' class='x74'>
				<span style="float:right;">培训日期:
					<input type="text" id="JKSJ_" name="JKSJ_" value="${course.kksj}" readonly/>
					
				</span>
				
				<span style='float:right'>讲师：
					<input type="text" id="KCJS_" name="KCJS_" value="${course.kcjs}" readonly />
				 </span>
				 <span style='float:right'>
					<input type="text" id="YGZH_" name="YGZH_" hidden value="${sessionScope.username}" readonly />
				 </span>
			</td>
			 </tr>
			 <tr height='34' style='mso-height-source:userset;height:25.5pt' id='r5'>
			<td height='32' class='x75' style='height:24pt;'>课程名称
			</td>
			<td colspan='7' class='x76' style='mso-height-source:userset;height:25.5pt'>
			    <input type="text" style="border:none;height:25.5pt;" id="KCMC_" name="KCMC_" value="${course.kcmc}" />
			    <input type="text" style="border:none;height:25.5pt;" id="KCBH_" hidden name="KCBH_" value="${course.kcbh}" />
			</td>
			 </tr>
			 <tr height='69' style='mso-height-source:userset;height:51.75pt' id='r6'>
			<td colspan='8' height='67' class='x76' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:50.25pt;'>
				<li>1.本问卷请受训员工详实填写,并请于结训后交予人力资源部.</li>
				<li>2.请您给予率直的批评和建议,以帮助我们改进和完善今后的培训课程.</li>
				<li>3.请在你觉得合适的选项下打钩.</li>
			</td>
			 </tr>
			 <tr height='34' style='mso-height-source:userset;height:25.5pt' id='r7'>
			<td colspan='3' height='32' class='x79' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;'>一、课程方面：</td>
			<td class='x80'>非常<br>赞同</td>
			<td class='x80'>赞同</td>
			<td class='x80'>一般 </td>
			<td class='x80'>不太<br>赞同</td>
			<td class='x80'>强烈<br>反对</td>
			 </tr>
			 <tr class="_feedback_" height='34' style='mso-height-source:userset;height:25.5pt' id='r8'>
			<td colspan='3' height='32' class='x81' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;'>
			1、课程涵盖了我想要了解的内容与信息
			</td>
				<td class='x82'>
				   <div class="radio-inline">
				 	 <input type="radio" name="killOrder1" label="1" id="killOrder1_A" value="A" label="1"/>
				 	 <label for="killOrder1"></label>
					</div>
				</td>
				<td class='x82'>
					<div class="radio-inline">
				 	 <input type="radio" name="killOrder1" label="1" value="B" />
				 	 <label for="killOrder1"></label>
					</div>
				</td>
				<td class='x82'>
				   <div class="radio-inline">
				 	 <input type="radio" name="killOrder1" label="1" id="killOrder1_C" value="C"/>
				 	 <label for="killOrder1"></label>
					</div>
				</td>
				<td class='x82'>
				    <div class="radio-inline">
				 	 <input type="radio" name="killOrder1" label="1" id="killOrder1_D" value="D"/>
				 	 <label for="killOrder1"></label>
					</div>
				</td>
				<td class='x82'>
				     <div class="radio-inline">
				 	 <input type="radio" name="killOrder1" label="1" id="killOrder1_E" value="E"/>
				 	 <label for="killOrder1"></label>
					</div>
				</td>
			 </tr>
			 <tr class="_feedback_" height='34' style='mso-height-source:userset;height:25.5pt' id='r9'>
			<td colspan='3' height='32' class='x81' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;'>
			2、课程能为我的实际工作提供帮助</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder2" label="2" id="killOrder2_A" value="A"/>
				 	 <label for="killOrder2"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder2" label="2" id="killOrder2_B" value="B"/>
				 	 <label for="killOrder2"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder2" label="2" id="killOrder2_C" value="C"/>
				 	 <label for="killOrder2"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder2" label="2" id="killOrder2_D" value="D"/>
				 	 <label for="killOrder2"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder2" label="2" id="killOrder2_E" value="E"/>
				 	 <label for="killOrder2"></label>
				</div>
			</td>
			 </tr>
			 <tr class="_feedback_" class="killOrder" height='34' style='mso-height-source:userset;height:25.5pt' id='r10'>
			<td colspan='3' height='32' class='x81' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;'>3、我喜欢这种培训形式</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder3" label="3" id="killOrder3_A" value="A"/>
				 	 <label for="killOrder3"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder3" label="3" id="killOrder3_B" value="B"/>
				 	 <label for="killOrder3"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder3" label="3" id="killOrder3_C" value="C"/>
				 	 <label for="killOrder3"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder3" label="3" id="killOrder3_D" value="D"/>
				 	 <label for="killOrder3"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder3" label="3" id="killOrder3_E" value="E"/>
				 	 <label for="killOrder3"></label>
				</div>
			</td>
			 </tr>
			 <tr class="_feedback_" height='34' style='mso-height-source:userset;height:25.5pt' id='r11'>
			<td colspan='8' rowspan='2' height='67' class='x83' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:50.25pt;padding:0px, 0px, 0px, 0px;'>
				4、您的建议：
				   <textarea  label="4" style="height: 99.6px;width: 652px;resize: none;border:none;font-size:18px;" id="killOrder4" name="killOrder4"></textarea>
			</td>
			 </tr>
			 <tr height='34' style='mso-height-source:userset;height:25.5pt' id='r12'>
			 </tr>
			 <tr height='34' style='mso-height-source:userset;height:25.5pt' id='r13'>
			<td colspan='3' height='32' class='x79' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;'>二、讲师方面：</td>
			<td class='x80'>非常<br>赞同</td>
			<td class='x80'>赞同</td>
			<td class='x80'>一般 </td>
			<td class='x80'>不太<br>赞同</td>
			<td class='x80'>强烈<br>反对</td>
			 </tr>
			 <tr class="_feedback_" height='34' style='mso-height-source:userset;height:25.5pt' id='r14'>
			<td colspan='3' height='32' class='x81' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;'>1、讲师的讲解深入浅出,举例生动贴切</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder5" label="5" id="killOrder5_A" value="A"/>
				 	 <label for="killOrder5"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder5" label="5" id="killOrder5_B"  value="B"/>
				 	 <label for="killOrder5"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder5" label="5" id="killOrder5_C" value="C"/>
				 	 <label for="killOrder5"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder5" label="5" id="killOrder5_D" value="D"/>
				 	 <label for="killOrder5"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder5" label="5" id="killOrder5_E" value="E"/>
				 	 <label for="killOrder5"></label>
				</div>
			</td>
			 </tr>
			<tr class="_feedback_"  height='34' style='mso-height-source:userset;height:25.5pt' id='r15'>
			<td colspan='3' height='32' class='x81' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;'>2、课程时间安排合理,松紧得当</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder6" label="6" id="killOrder6_A" value="A"/>
				 	 <label for="killOrder6"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder6" label="6" id="killOrder6_B" value="B"/>
				 	 <label for="killOrder6"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder6" label="6" id="killOrder6_C" value="C"/>
				 	 <label for="killOrder6"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder6" label="6" id="killOrder6_D" value="D"/>
				 	 <label for="killOrder6"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder6" label="6" id="killOrder6_E" value="E"/>
				 	 <label for="killOrder6"></label>
				</div>
			</td>
			 </tr>
			 <tr class="_feedback_" height='34' style='mso-height-source:userset;height:25.5pt' id='r16'>
			<td colspan='3' height='32' class='x81' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;'>3、我能够清楚地明白讲师的讲解</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder7" label="7" id="killOrder7_A" value="A"/>
				 	 <label for="killOrder7"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder7" label="7" id="killOrder7_B" value="B"/>
				 	 <label for="killOrder7"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder7" label="7" id="killOrder7_C" value="C"/>
				 	 <label for="killOrder7"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder7" label="7" id="killOrder7_D" value="D"/>
				 	 <label for="killOrder7"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder7" label="7" id="killOrder7_E" value="E"/>
				 	 <label for="killOrder7"></label>
				</div>
			</td>
			 </tr>
			 <tr class="_feedback_" height='34' style='mso-height-source:userset;height:25.5pt' id='r17'>
			<td colspan='3' height='32' class='x81' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;'>4、讲师能够与学员进行互动，吸引学员的注意力</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder8" label="8" id="killOrder8_A" value="A"/>
				 	 <label for="killOrder8"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder8" label="8" id="killOrder8_B" value="B"/>
				 	 <label for="killOrder8"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder8" label="8" id="killOrder8_C" value="C"/>
				 	 <label for="killOrder8"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder8" label="8" id="killOrder8_D" value="D"/>
				 	 <label for="killOrder8"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder8" label="8" id="killOrder8_E" value="E"/>
				 	 <label for="killOrder8"></label>
				</div>
			</td>
			 </tr>
			 <tr class="_feedback_" height='34' style='mso-height-source:userset;height:25.5pt' id='r18'>
			<td colspan='8' rowspan='2' height='67' class='x83' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:50.25pt;'>
				5、您的建议：
				 <textarea label="9" style="height: 99.6px;width: 652px;resize: none;border:none;font-size:18px;" name="killOrder9" id="killOrder9"></textarea>
			</td>
			 </tr>
			 <tr height='34' style='mso-height-source:userset;height:25.5pt' id='r19'>
			 </tr>
			 <tr height='34' style='mso-height-source:userset;height:25.5pt' id='r20'>
			<td colspan='3' height='32' class='x79' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;'>三、您自己：</td>
			<td class='x80'>非常<br>赞同</td>
			<td class='x80'>赞同</td>
			<td class='x80'>一般 </td>
			<td class='x80'>不太<br>赞同</td>
			<td class='x80'>强烈<br>反对</td>
			 </tr>
			 <tr class="_feedback_" height='34' style='mso-height-source:userset;height:25.5pt' id='r21'>
			<td colspan='3' height='32' class='x81' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;'>1、经过培训，我对该课程内容有了一定的理解</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder10"  label="10" id="killOrder10_A" value="A"/>
				 	 <label for="killOrder10"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder10" label="10" id="killOrder10_B" value="B"/>
				 	 <label for="killOrder1"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder10" label="10" id="killOrder10_C" value="C"/>
				 	 <label for="killOrder10"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder10" label="10" id="killOrder10_D" value="D"/>
				 	 <label for="killOrder10"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder10" label="10" id="killOrder10_E" value="E"/>
				 	 <label for="killOrder10"></label>
				</div>
			</td>
			 </tr>
			 <tr class="_feedback_" height='34' style='mso-height-source:userset;height:25.5pt' id='r22'>
			<td colspan='3' height='32' class='x81' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;'>2、我会在日后的工作生活中学以致用并持之以恒</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder11" label="11" id="killOrder11_A" value="A"/>
				 	 <label for="killOrder11"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder11" label="11" id="killOrder11_B" value="B"/>
				 	 <label for="killOrder11"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder11" label="11" id="killOrder11_C" value="C"/>
				 	 <label for="killOrder11"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder11" label="11" id="killOrder11_D" value="D"/>
				 	 <label for="killOrder11"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder11" label="11" id="killOrder11_E" value="E"/>
				 	 <label for="killOrder11"></label>
				</div>
			</td>
			 </tr>
		<!-- 	 <tr height='34' style='mso-height-source:userset;height:25.5pt' id='r23'>
			<td colspan='3' height='32' class='x79' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;'>四、整体部分：</td>
			<td class='x79'>很好</td>
			<td class='x79'>好</td>
			<td class='x79'>普通</td>
			<td class='x79'>不好</td>
			<td class='x79'>极差</td>
			 </tr>
			 <tr height='34' style='mso-height-source:userset;height:25.5pt' id='r24'>
			<td colspan='3' height='32' class='x81' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;'>总而言之，您对课程的整体满意度是：</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder12" id="killOrder12_A" value="A"/>
				 	 <label for="killOrder12"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder12" id="killOrder12_B" value="B"/>
				 	 <label for="killOrder12"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder12" id="killOrder12_C" value="C"/>
				 	 <label for="killOrder12"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder12" id="killOrder12_D" value="D"/>
				 	 <label for="killOrder12"></label>
				</div>
			</td>
			<td class='x82'>
				<div class="radio-inline">
				 	 <input type="radio" name="killOrder12" id="killOrder12_E" value="E"/>
				 	 <label for="killOrder12"></label>
				</div>
			</td>
			 </tr> -->
			 <tr class="_feedback_" height='34' style='mso-height-source:userset;height:25.5pt' id='r25'>
			<td colspan='8' height='32' class='x89' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:24pt;'>为了帮助我们更好地改进工作，请留下您的宝贵建议：</td>
			 </tr>
			 <tr class="_feedback_" height='34' style='mso-height-source:userset;height:25.5pt' id='r26'>
			<td colspan='8' rowspan='2' height='101' class='x90' style='border-right:1px solid windowtext;border-bottom:1px solid windowtext;height:75.95pt;'>
				<textarea label="13" style="height:299px;width: 652px;resize: none;border:none;font-size:18px;" id="killOrder13" name="killOrder13" label="13"></textarea>
				<div style="float:right;margin-top:120px;margin-right:20px;">
		                <button class="btn btn-info btn-ml" id="addFeedBackForm" onclick="addFeedBackForm()">提交</button>
		        </div>												
			</td>
			   						
			 </tr>
			 <tr height='69' style='mso-height-source:userset;height:51.95pt' id='r27'>
			 							
			 </tr>
			<![if supportMisalignedColumns]>
			 <tr height='0' style='display:none'>
			  <td width='72' style='width:54pt'></td>
			  <td width='72' style='width:54pt'></td>
			  <td width='189' style='width:141.75pt'></td>
			  <td width='64' style='width:48pt'></td>
			  <td width='64' style='width:48pt'></td>
			  <td width='64' style='width:48pt'></td>
			  <td width='64' style='width:48pt'></td>
			  <td width='64' style='width:48pt'></td>
			 </tr>
			
			</table>
		</div>
</html>
