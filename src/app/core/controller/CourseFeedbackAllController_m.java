package app.core.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import app.core.po.CourseFeedbackAll;
import app.core.po.Feedback;
import app.core.po.Msg;
import app.core.service.CourseFeedbackAllService_m;

@Controller
@RequestMapping("/course")
public class CourseFeedbackAllController_m {
	@Autowired
	public CourseFeedbackAllService_m courseFeedbackAllService;
	
	/**
	 * 查询所有的反馈记录，并且将多条个人记录封装成一条记录作为课程的反馈记录进行显示,查询的表是course_feedback_all
	 * @author chen
	 * @param response
	 * @return
	 */
	@RequestMapping("/feedbackList")
	@ResponseBody
	public Msg getAllCourseFeedback(HttpServletResponse response){
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
        List<CourseFeedbackAll> courseFeedbackAllList=new ArrayList<CourseFeedbackAll>();
        List<Feedback> feedbackList=new ArrayList<Feedback>();
        feedbackList=courseFeedbackAllService.getAllFeedback();
        return Msg.success().add("feedbackList", feedbackList);
	}
	
	/**
	 * 根据课程编号查询所有的上课人员的反馈信息记录列表
	 * @author chen
	 * @param response
	 * @return
	 */
	@RequestMapping("/courseFeedbackAllList")
	@ResponseBody
	public Msg getAllFeedBackWithKCBH(@RequestParam("kcbh") String kcbh,HttpServletResponse response){
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");		
		//String kcbh="dianzi385379";
		List<CourseFeedbackAll> courseFeedbackAllList=new ArrayList<CourseFeedbackAll>();
		courseFeedbackAllList=courseFeedbackAllService.getAllFeedBackWithKCBH(kcbh);
		return Msg.success().add("courseFeedbackAllList", courseFeedbackAllList);
	}
	

}
