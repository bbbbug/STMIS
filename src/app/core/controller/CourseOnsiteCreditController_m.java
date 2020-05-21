package app.core.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import app.core.mapper.CourseOnsiteCreditMapper;
import app.core.po.CourseOnsiteCredit;
import app.core.po.Msg;
import app.core.service.CourseOnsiteCreditService_m;

@RequestMapping("/course")
@Controller
public class CourseOnsiteCreditController_m {
	@Autowired
	public CourseOnsiteCreditService_m courseOnsiteCreditService;

	/**
	 * �㿪��ѵ��¼������ʱ��ѯ��Ӧ�ļ�¼���вμӵ�Ա����Ϣ��������ѵ��¼���id���в�ѯ��Ӧ�γ̲μӵ�ѧԱ
	 * 
	 * @author chen
	 * @return
	 */
	@RequestMapping("/findCourseOnsiteCredit")
	@ResponseBody
	public Msg findCourseOnsiteCredit(@RequestParam("id") Integer id,HttpServletResponse response) {
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
		List<CourseOnsiteCredit> courseOnsiteCreditList = new ArrayList<CourseOnsiteCredit>();
		courseOnsiteCreditList = courseOnsiteCreditService.findCourseOnsiteCredit(id);
		return Msg.success().add("CourseOnsiteCreditList", courseOnsiteCreditList);
	}
}
