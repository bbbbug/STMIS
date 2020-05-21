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
	 * 点开培训记录表详情时查询对应的记录表中参加的员工信息，根据培训记录表的id进行查询对应课程参加的学员
	 * 
	 * @author chen
	 * @return
	 */
	@RequestMapping("/findCourseOnsiteCredit")
	@ResponseBody
	public Msg findCourseOnsiteCredit(@RequestParam("id") Integer id,HttpServletResponse response) {
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
		List<CourseOnsiteCredit> courseOnsiteCreditList = new ArrayList<CourseOnsiteCredit>();
		courseOnsiteCreditList = courseOnsiteCreditService.findCourseOnsiteCredit(id);
		return Msg.success().add("CourseOnsiteCreditList", courseOnsiteCreditList);
	}
}
