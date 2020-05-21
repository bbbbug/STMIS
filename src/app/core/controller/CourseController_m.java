package app.core.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import app.core.po.Category;
import app.core.po.Course;
import app.core.po.CourseResource;
import app.core.po.CourseType;
import app.core.service.CategoryService_m;
import app.core.service.CourseResourceService_m;
import app.core.service.CourseService_m;

@SessionAttributes(value={"courseList","categoryList"})
@Controller
@RequestMapping("/course")
public class CourseController_m {
	
	@Autowired
	public CourseService_m courseService;
	@Autowired
	public CategoryService_m categoryService;
	@Autowired
	public CourseResourceService_m courseResourceService;
	
	
	/**
	 * 批量保存必修选修配置
	 * 程默 7-9
	 * @param model
	 * @return
	 */
/*	@RequestMapping("/saveCourseTypes")
	public void saveCourseTypes(Model model,@RequestBody CourseType[] courseTypes){
		courseService.updateCourseType(courseTypes);		
		List<Category> categoryList=categoryService.getAllCategory();
//		System.out.println(categoryList);
		model.addAttribute("courseList",courseList);
		model.addAttribute("categoryList",categoryList);
		return "STMIS_course";
	}*/
	
	/*@RequestMapping("/selectCourseTypes")
	@ResponseBody
	public List<CourseType> selectCourseTypes(Model model,@RequestBody CourseType courseType){
		List<CourseType> courseTypes = courseService.selectCourseTypes(courseType);	
		for (CourseType ct : courseTypes) {
			System.out.println(ct.getKcmc());
		}
		List<Category> categoryList=categoryService.getAllCategory();
//		System.out.println(categoryList);
		model.addAttribute("courseList",courseList);
		model.addAttribute("categoryList",categoryList);
		return courseTypes;
	}
	
	*//**
	 * 保存必修选修配置
	 * 程默 6-29
	 * @param model
	 * @return
	 *//*
	@RequestMapping("/saveCourseType")
	public void saveCourseType(Model model,@RequestBody CourseType[] courseTypes){
		courseService.updateCourseType(courseTypes);
		
		
		List<Category> categoryList=categoryService.getAllCategory();
//		System.out.println(categoryList);
		model.addAttribute("courseList",courseList);
		model.addAttribute("categoryList",categoryList);
		return "STMIS_course";
	}
	*/
	
	/*
	 * 查找课程列表
	 */
	@RequestMapping("/_courseList")
	public String _courseList(Model model){
		List<Course> courseList=courseService.getAllCourse();
		List<Category> categoryList=categoryService.getAllCategory();
//		System.out.println(categoryList);
		model.addAttribute("courseList",courseList);
		model.addAttribute("categoryList",categoryList);
		return "STMIS_course";
	}
	
	@RequestMapping("/courseList")
	@ResponseBody
	public List<Course> courseList(Model model){
		List<Course> courseList=courseService.getAllCourse();
		return courseList;
		/*List<Category> categoryList=categoryService.getAllCategory();
//		System.out.println(categoryList);
		model.addAttribute("courseList",courseList);
		model.addAttribute("categoryList",categoryList);
		return "STMIS_course";*/
	}
	
	@RequestMapping("/categoryList")
	@ResponseBody
	public List<Category> categoryList(Model model){
		List<Category> categoryList=categoryService.getAllCategory();
		return categoryList;
	}
//	public ModelAndView courseList(){
//		ModelAndView mav=new ModelAndView();
//		courseService.getAllCourse();
//		mav.setViewName("STMIS_course");
//		return mav;
//	}
	
	/*
	 * 根据课程编号查找课程
	 */
	@RequestMapping("/findCourse")
	public @ResponseBody HashMap findCourse(Model model,@RequestParam("kcbh") String kcbh){
		Course course=courseService.getCourseByKCBH(kcbh);
		HashMap courseMap=new HashMap();
		courseMap.put("course",course);
		System.out.println(course);
		return courseMap;
	}
	
	/*
	 * 更新课程信息
	 */
	@RequestMapping("/updateCourse")
	public @ResponseBody HashMap updateCourse(Model model,@RequestBody Course course){
		courseService.updateCourse(course);
		HashMap courseUpdate=new HashMap();
		courseUpdate.put("updateFlag", "success");
		return courseUpdate;
	}
	
	/*
	 * 移除课程信息
	 */
	@RequestMapping("/removeCourse")	
	public @ResponseBody HashMap removeCourse(Model model,@RequestParam("kcbh") String kcbh){		
		HashMap courseRemove=new HashMap();		
		/**
		 * 根据课程编号查询对应的课程资源，根据资源状态进行操作
		 * @author chen
		 * 修改时间；2019.7.12
		 */
		int flag=courseResourceService.getCourseResourceByKCBH(kcbh);
		if(flag==-1){//判断标识,1有资源未通过,2有资源没有审核,3资源全部未通过,0资源全部通过,-1没有资源
			System.out.println("没有资源");
			courseRemove.put("removeFlag", "fail");
		}else if(flag==0){
			System.out.println("资源全部通过");
			//移除所有资源的审核状态 2
			CourseResource courseResource=new CourseResource();
			courseResource.setBxzd_1("0");
			courseResource.setKcbh(kcbh);
			courseService.removeCourse(kcbh);
			courseResourceService.updateCourseResourceStatus(courseResource);
			courseRemove.put("removeFlag", "success");
		}else if(flag==1){
			System.out.println("有资源未通过");
			courseRemove.put("removeFlag", "fail");
		}else if(flag==2){
			System.out.println("有资源没有审核");
			courseRemove.put("removeFlag", "fail");
		}else if(flag==3){
			System.out.println("资源全部未通过");	
			courseRemove.put("removeFlag", "fail");
		}
		return courseRemove;
		//return "forward: /courseList";
	}
	/*
	 * 已有课程开课设置
	 */
	@RequestMapping("/setupCourse")
	public @ResponseBody HashMap setupCourse(Model model,@RequestBody Course course){
		
		HashMap courseSetup=new HashMap();
		
		/**
		 * 根据课程编号查询对应的课程资源，根据资源状态进行操作
		 * @author chen
		 * 修改时间；2019.7.12
		 */
		System.out.println(course.getKcbh());
		int flag=courseResourceService.getCourseResourceByKCBH(course.getKcbh());
		
		if(flag==-1){//判断标识,1有资源未通过,2有资源没有审核,3资源全部未通过,0资源全部通过,-1没有资源
			System.out.println("没有资源");
			courseSetup.put("setupFlag", "fail");
		}else if(flag==0){
			System.out.println("资源全部通过");
			courseSetup.put("setupFlag", "fail");
		}else if(flag==1){
			System.out.println("有资源未通过");
			courseSetup.put("setupFlag", "fail");
		}else if(flag==2){
			System.out.println("有资源没有审核");
			courseSetup.put("setupFlag", "fail");
		}else if(flag==3){
			System.out.println("资源全部未通过");
			//开通所有资源的审核状态 1
			CourseResource courseResource=new CourseResource();
			courseResource.setBxzd_1("1");
			courseResource.setKcbh(course.getKcbh());
			courseResourceService.updateCourseResourceStatus(courseResource);
			courseService.setupCourse(course);
			courseSetup.put("setupFlag", "success");
		}
		return courseSetup;
	}
	
	/*
	 * 获取未开课的课程信息
	 */
	@RequestMapping("/getUnsetCourse")	
	public String getUnsetCourse(Model model){
		List<Course> unsetCourseList=new ArrayList<Course>();
		unsetCourseList=courseService.getUnsetCourse();
		model.addAttribute("unsetCourseList",unsetCourseList);
		return "STMIS_courseAdd";
	}
	
	/*
	 * 根据老师名称查询课程
	 */
	@RequestMapping("getCourseByCondition")
	@ResponseBody
	public List<Course> getCourseByTeacher(Model model,@RequestBody Course course){
		List<Course> courseList=new ArrayList<Course>();
		courseList=courseService.getCourseByCondition(course);
		return courseList;
	}
}
