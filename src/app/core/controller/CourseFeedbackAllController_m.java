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
	 * ��ѯ���еķ�����¼�����ҽ��������˼�¼��װ��һ����¼��Ϊ�γ̵ķ�����¼������ʾ,��ѯ�ı���course_feedback_all
	 * @author chen
	 * @param response
	 * @return
	 */
	@RequestMapping("/feedbackList")
	@ResponseBody
	public Msg getAllCourseFeedback(HttpServletResponse response){
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
        List<CourseFeedbackAll> courseFeedbackAllList=new ArrayList<CourseFeedbackAll>();
        List<Feedback> feedbackList=new ArrayList<Feedback>();
        feedbackList=courseFeedbackAllService.getAllFeedback();
        return Msg.success().add("feedbackList", feedbackList);
	}
	
	/**
	 * ���ݿγ̱�Ų�ѯ���е��Ͽ���Ա�ķ�����Ϣ��¼�б�
	 * @author chen
	 * @param response
	 * @return
	 */
	@RequestMapping("/courseFeedbackAllList")
	@ResponseBody
	public Msg getAllFeedBackWithKCBH(@RequestParam("kcbh") String kcbh,HttpServletResponse response){
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");		
		//String kcbh="dianzi385379";
		List<CourseFeedbackAll> courseFeedbackAllList=new ArrayList<CourseFeedbackAll>();
		courseFeedbackAllList=courseFeedbackAllService.getAllFeedBackWithKCBH(kcbh);
		return Msg.success().add("courseFeedbackAllList", courseFeedbackAllList);
	}
	

}
