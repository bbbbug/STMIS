package app.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import app.core.po.CourseType;
import app.core.service.CourseService_m;

@Controller
@RequestMapping("/course")
public class CourseTypeController_m {
	
	@Autowired
	public CourseService_m courseService;
	
	/**
	 * 批量保存必修选修配置
	 * 程默 7-9
	 * @param model
	 * @return
	 */
	@RequestMapping("/saveCourseTypes")
	public void saveCourseTypes(Model model,@RequestBody CourseType[] courseTypes){
		System.out.println("进入saveCourseTypes");
		courseService.updateCourseType(courseTypes);
	}
	
	@RequestMapping("/insertCourseTypes")
	public void insertCourseTypes(@RequestBody CourseType[] courseTypes){
		System.out.println("进入insertCourseTypes");
		for (CourseType ct : courseTypes) {
			System.out.println(ct.getKcbh()+ct.getKcmc()+ct.getBmid());
		}
		courseService.insertCourseTypes(courseTypes);
	}
	
	@RequestMapping("/selectCourseTypes")
	@ResponseBody
	public List<CourseType> selectCourseTypes(Model model,@RequestBody CourseType courseType){
		List<CourseType> courseTypes = courseService.selectCourseTypes(courseType);	
		for (CourseType ct : courseTypes) {
			System.out.println(ct.getKcmc());
		}
		/*List<Category> categoryList=categoryService.getAllCategory();
//		System.out.println(categoryList);
		model.addAttribute("courseList",courseList);
		model.addAttribute("categoryList",categoryList);*/
		return courseTypes;
	}

}