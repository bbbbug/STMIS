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
	<!-- <script type="text/javascript" src="ajax/myAnswer.js"></script> -->
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
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-14" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/STMIS_ExamAnswer.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-14" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/STMIS_ExamAnswer.jsp">
  <div class="main" style="height:2000px" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-14" data-genuitec-path="/STMIS/WebRoot/WEB-INF/content/STMIS_ExamAnswer.jsp" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-14" data-genuitec-path="/STMIS20190919/WebRoot/WEB-INF/content/STMIS_ExamAnswer.jsp">
		<!--nr start-->
		<div class="test_main">
			<div class="nr_left">
				<div class="test">
					<form action="javascript:void(0);" method="post" id="examID" odelAttribute="ExamResult" >
						<div class="test_title">
							<p class="test_time">
								<i class="icon iconfont">&#xe6fb;</i><b class="alt-1"><c:out value=""/></b>
							</p>
							<div id="chongkao">
							
							</div>
							<font onclick="showMycourse()"><input type="submit" value="我的课程" ></font>
						</div>
							
							<div class="test_content">
								<div class="test_content_title" id="fraction_show">
								</div>
							</div>
							<br><br>
							<div class="test_content_nr">
								<ul id="myAnswer">
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
							<%-- <p class="test_time">
								<i class="icon iconfont">&#xe6fb;</i><b class="alt-1"><c:out value="${time}"/></b>
							</p> --%>
						</div>
						
						<div class="rt_content" id="dt_card">
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
	   /*  $.validator.setDefaults({
		    submitHandler: function() {
		      alert("提交事件!");
		    }
		});
		$().ready(function() {
		    $("#selected").validate();
		}); */

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
var kcbh;
$(document).ready(function(){
	//接收后台传过来的json
	var jsonStr = '${sessionScope.examResult}';
	console.log(jsonStr);
	//使用JSON.parse();把json转换成js对象
	 
	var jsonarray = JSON.parse(jsonStr);
	console.log(jsonarray);
	//遍历到jsp
	
	var html ="";
	var j
	for(var i=0;i<jsonarray.length;i++){ //或者使用for(var subkey in jsonarray)
		if(jsonarray[i].ygzh){
			kcbh = jsonarray[i].kcbh;
			var score = parseInt(100/parseInt(jsonarray[i].ktsl));
			var range = jsonarray[i].rrange.split("#");
			j =i-1;
			html+='<li id="qu_'+i+'">'
				 +'<div class="test_content_nr_tt"><i>'+j+'</i><span>('
				 +score+'分)</span><font>'
				 +jsonarray[i].caption+'（  ）</font><b class="icon iconfont">&#xe881;</b></div>'
				 +'<div class="test_content_nr_main" id="selected">'
				 +'<ul>'
				 +'<li class="option"><span style="float:left;margin-left:-15px;" id="error_A'
				 +i+'"></span><label for="Aanswer'+i+'"'
				 +'id="answer_A'+i+'">A.<p class="ue" style="display: inline;">'
				 +range[0]+'</p></label></li>'
				 +'<li class="option"><span style="float:left;margin-left:-15px;" id="error_B' 
				 +i+'"></span><label for="Banswer'+i+'"'
				 +'id="answer_B'+i+'">B.<p class="ue" style="display: inline;">'
				 +range[1]+'</p></label></li>'
				 +'<li class="option"><span style="float:left;margin-left:-15px;" id="error_C'
				 +i+'"></span><label for="Canswer'+i+'"'
				 +'id="answer_C'+i+'">C.<p class="ue" style="display: inline;">'
				 +range[2]+'</p></label></li>'
				 +'<li class="option"><label for="Danswer'+i+'"' 
				 +'id="answer_D'+i+'">D.<p class="ue" style="display: inline;">'
				 +range[3]+'</p></label></li>'
				 +'<li class="option"><span style="float:left;margin-left:-15px;" id="error_D'
				 +i+'"></span><label style="color:red" for="Yanswer'
				 +i+'">正确答案：<p class="ue" style="display: inline;">'
				 +jsonarray[i].right_answer+'</p></label></li>'
				 +'</ul></div></li>';
		}
	}
	var answer = document.getElementById("myAnswer");
	answer.innerHTML=html;
	//add info to danxunti model
	var html_dt = "";
	html_dt +='<div class="rt_content_tt"><h2>单选题</h2><p><span>共</span><i class="content_lit">'
			+j+'</i><span>题</span></p></div><br><br>'
			+'<div class="rt_content_nr answerSheet"><ul>';
	var html_dt_li = "";
	for(var i=1;i<j+1;i++){
		html_dt_li+='<li><a id="dt_qu_'+i+'" onclick="question('
					+i+')" href="javascript:void(0);">'
					+i+'</a></li>&nbsp;&nbsp;'
	}
	html_dt += html_dt_li+'</ul></div></div>'
	var dt_card = document.getElementById("dt_card");
	dt_card.innerHTML=html_dt;
	// change the color in error answer
	for(var i=0;i<jsonarray.length;i++){ //或者使用for(var subkey in jsonarray)
		var k = i-1;
		if(jsonarray[i].right_answer != jsonarray[i].answer){
			var id = "#answer_"+jsonarray[i].answer+i;
			console.log("lable id:"+id);
			$(id).css("background-color","indianred");
			$(id).css("color","white");
			$("#dt_qu_"+k).css("background-color","indianred");
			$("#dt_qu_"+k).css("color","white");
			/* var error_id = "#error_"+jsonarray[i].answer+i;
			console.log(error_id);
			var error = document.getElementById(error_id);
			var error_html = "X";
			error.innerHTML = error_html;
			$(error_id).css("color","indianred"); */
		}else{
			$("#dt_qu_"+k).css("background-color","limegreen");
			$("#dt_qu_"+k).css("color","white");
			var id = "#answer_"+jsonarray[i].answer+i;
			console.log("lable id:"+id);
			$(id).css("background-color","darkseagreen");
			$(id).css("color","white");
		}
	}
	//Fraction show
	var fraction = '${sessionScope.fraction}';
	console.log(fraction);
	var html_fraction = "";
	var html_chongkao = ""
	html_fraction+='<h2>单选题</h2><p><span>得分：</span><i class="content_lit">'
				  +parseInt(fraction)+'</i><span>&nbsp;分</span></p><p style="background-color:white"></p>';
	var pass =parseInt(fraction);
	if(pass >= 60){
		html_fraction+='<p style="background-color:limegreen;color:white"><span></span><i class="content_lit">恭喜你，考试通过</i><span></span></p>';
	}else{
		html_chongkao+='<font style="margin-left:5px;" onclick="startExam()"><input style="background-color:orange;text-align: center;" value="重考"></font>';
		html_fraction+='<p style="background-color:indianred;color:white"><span></span><i class="content_lit" >很遗憾，考试不通过</i><span></span></p>';
	}
	var fraction_show = document.getElementById("fraction_show");
	fraction_show.innerHTML=html_fraction;		
	var chongkao = document.getElementById("chongkao");
	chongkao.innerHTML = html_chongkao;						
});

function startExam(){
	window.location.href="exam/startExam?kcbh="+kcbh;
}
function showMycourse(){
	window.location.href="user/showMyCourse"
}
</script>
</html>
