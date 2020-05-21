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
	<title>在线考试</title>
	<link href="css/main_1.css" rel="stylesheet" type="text/css" />
	<link href="css/iconfont.css" rel="stylesheet" type="text/css" />
	<link href="css/test.css" rel="stylesheet" type="text/css" />
	<style type="text/css">
		  input[type="radio"],
		
		   {
		
		    border: none;
		
		    width: 100%;
		
		  }
		
		  .test_content_nr_main.active {
		
		    border: 1px #32BC61 solid;
		
		    background-color: #fff;
		
		  }
		
		  .test_content_nr_main.error {
		
		    border: 1px #f00 solid;
		
		    background-color: #FBF9BB;
		
		  }
		
		  .test_content_nr_main.error input[type="radio"],
		
		   {
		
		    background-color: #FBF9BB;
		
		    color: #f00;
		
		  }
		
		  input[type="radio"]:focus,
		
		  {
		
		    border: none;
		
		    outline: none;
		
		  }
		
		  .test_content_nr_main .valid_message {
		
		    color: #32BC61;
		
		    position: absolute;
		
		    left: 50%;
		
		    top: 5px;
		
		    width: 200px;
		
		  }
		
		  .test_content_nr_main.error .valid_message {
		
		    color: #f00;
		
		  }
		
		  .test_content_nr_main.success .valid_message {
		
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
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-15" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/STMIS_Examination.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-15" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/STMIS_Examination.jsp">
  <div class="main" style="height:2000px" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-15" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/STMIS_Examination.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-15" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/STMIS_Examination.jsp">
		<!--nr start-->
		<div class="test_main">
			<div class="nr_left">
				<div class="test">
					<form action="exam/submitExam" method="post" id="examID" odelAttribute="ExamResult" >
						<div class="test_title">
							<p class="test_time">
								<i class="icon iconfont">&#xe6fb;</i><b class="alt-1"><c:out value="${time}"/></b>
							</p>
							<font><input type="submit" value="交卷" ></font>
						</div>
							
							<div class="test_content">
								<div class="test_content_title">
									<h2>单选题</h2>
									<p>
										<span>共</span><i class="content_lit"><c:out value="${ktsl}"/></i><span>题，</span><span>合计</span><i class="content_fs">100</i><span>分</span>
									</p>
								</div>
							</div>
							<br><br>
							<div class="test_content_nr">
								<ul>
									<c:choose>
									<c:when test="${empty exam_list}">
										<script>alert("暂无试题");window.location="#";</script>
									</c:when>
									<c:otherwise>
										<c:set var="index" value="0" />
										<c:forEach items="${exam_list}" var="item" >
										<c:set var="index" value="${index+1}" />
										<li id="qu_${index}">
											<div class="test_content_nr_tt">
												<i><c:out value="${index}"/></i><span id="score_per">(<c:out value="${score}"/>)</span>
												<font>${item.caption}（  ）</font><b class="icon iconfont">&#xe881;</b>
											</div>
											<div class="test_content_nr_main" id="selected">
												<ul>
														<li class="option">
																
																<input type="radio" class="radioOrCheck" value="A" name="examResults[${index+1 }].answer"
																	id="Aanswer${index+1 }" required
																/>
															
															
															<label for="Aanswer${index+1 }">
																A.
																<p class="ue" style="display: inline;">${item.Arange }</p>
															</label>
														</li>
													
														<li class="option">
															
																<input type="radio" class="radioOrCheck" value="B" name="examResults[${index+1 }].answer"
																	id="Banswer${index+1 }" required
																/>
															
															
															<label for="Banswer${index+1 }">
																B.
																<p class="ue" style="display: inline;">${item.Brange }</p>
															</label>
														</li>
													
														<li class="option">
															
																<input type="radio" class="radioOrCheck" value="C" name="examResults[${index+1 }].answer"
																	id="Canswer${index+1 }" required
																/>
															
															
															<label for="Canswer${index+1 }">
																C.
																<p class="ue" style="display: inline;">${item.Crange }</p>
															</label>
														</li>
													
														<li class="option">
															
																<input type="radio" class="radioOrCheck" value="D" name="examResults[${index+1 }].answer"
																	id="Danswer${index+1 }" required
																/>
															
															
															<label for="Danswer${index+1 }">
																D.
																<p class="ue" style="display: inline;">${item.Drange }</p>
															</label>
														</li>
												</ul>
											</div>
										</li>
										<input name="examResults[${index+1}].caption" type = "hidden" value="${item.caption}"/>
										<input name="examResults[${index+1 }].kcbh" type="hidden" value="${kcbh }"> 
										<input name="examResults[${index+1 }].stid" type="hidden" value="${item.id }">
										</br></br></br>
									</c:forEach>
										<input name="ktsl" type="hidden" value="${index}">
									</c:otherwise>
									</c:choose>
								</ul>
							</div>
					</form>
				</div>

			</div>
			<div class="nr_right">
				<div class="nr_rt_main">
					<div class="rt_nr1">
						<div class="rt_nr1_title">
							<h1>
								<i class="icon iconfont">&#xe692;</i>答题卡
							</h1>
							<p class="test_time">
								<i class="icon iconfont">&#xe6fb;</i><b class="alt-1"><c:out value="${time}"/></b>
							</p>
						</div>
						
							<div class="rt_content">
								<div class="rt_content_tt">
									<h2>单选题</h2>
									<p>
										<span>共</span><i class="content_lit">${index}</i><span>题</span>
									</p>
								</div>
								<br><br>
								<div class="rt_content_nr answerSheet">
									<ul>
										<c:forEach begin="1" end="${index}" step="1" var="i">
											<li><a id="dt_qu_${i}" onclick="question(${i})" href="javascript:void(0);"><c:out value="${i}"/></a></li>
										</c:forEach>
									</ul>
								</div>
							</div>
						
					</div>

				</div>
			</div>
		</div>
		<!--nr end-->
		<div class="foot"></div>
	</div>

	<script src="Jquery/jquery-1.11.3.min.js"></script>
	<script src="Jquery/jquery.easy-pie-chart.js"></script>
	<!--时间js-->
	<script src="Jquery/jquery.countdown.js"></script>
	 <script type="text/javascript" src="js/jquery-validate.js"></script>

	  <script type="text/javascript">
	    $.validator.setDefaults({
		    submitHandler: function() {
		      alert("提交事件!");
		    }
		});
		$().ready(function() {
		    $("#selected").validate();
		});

	</script>
	<script>
		
		window.jQuery(function($) {
			"use strict";
			
			$('time').countDown({
				with_separators : false
			});
			$('.alt-1').countDown({
				css_class : 'countdown-alt-1'
			});
			$('.alt-2').countDown({
				css_class : 'countdown-alt-2'
			});
			
		});
		
		
		$(function() {
			$('li.option').click(function() {
				var examId = $(this).closest('.test_content_nr_main').closest('li').attr('id'); // 得到题目ID
				$('#dt_'+examId).css("background-color","cornflowerblue")
				// 设置已答题
				//console.log("datika:"+cardLi);
				//$("#"+cardLi).style("color","red");
				/* if(!examId.hasClass('hasBeenAnswer')){
					examId.addClass('hasBeenAnswer');
				} */
				
			});
		});
		
		function question(index){
			var bottombox = document.getElementById("qu_"+index);
			console.log(bottombox);
			bottombox.scrollIntoView(true);
		}
		
	</script>
	

	
<div style="text-align:center;">
</div>
</body>
<script type="text/javascript">
</script>
</html>
