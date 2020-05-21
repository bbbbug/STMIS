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
	 * �����������ѡ������
	 * ��Ĭ 7-9
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
	 * �������ѡ������
	 * ��Ĭ 6-29
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
	 * ���ҿγ��б�
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
	 * ���ݿγ̱�Ų��ҿγ�
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
	 * ���¿γ���Ϣ
	 */
	@RequestMapping("/updateCourse")
	public @ResponseBody HashMap updateCourse(Model model,@RequestBody Course course){
		courseService.updateCourse(course);
		HashMap courseUpdate=new HashMap();
		courseUpdate.put("updateFlag", "success");
		return courseUpdate;
	}
	
	/*
	 * �Ƴ��γ���Ϣ
	 */
	@RequestMapping("/removeCourse")	
	public @ResponseBody HashMap removeCourse(Model model,@RequestParam("kcbh") String kcbh){		
		HashMap courseRemove=new HashMap();		
		/**
		 * ���ݿγ̱�Ų�ѯ��Ӧ�Ŀγ���Դ��������Դ״̬���в���
		 * @author chen
		 * �޸�ʱ�䣻2019.7.12
		 */
		int flag=courseResourceService.getCourseResourceByKCBH(kcbh);
		if(flag==-1){//�жϱ�ʶ,1����Դδͨ��,2����Դû�����,3��Դȫ��δͨ��,0��Դȫ��ͨ��,-1û����Դ
			System.out.println("û����Դ");
			courseRemove.put("removeFlag", "fail");
		}else if(flag==0){
			System.out.println("��Դȫ��ͨ��");
			//�Ƴ�������Դ�����״̬ 2
			CourseResource courseResource=new CourseResource();
			courseResource.setBxzd_1("0");
			courseResource.setKcbh(kcbh);
			courseService.removeCourse(kcbh);
			courseResourceService.updateCourseResourceStatus(courseResource);
			courseRemove.put("removeFlag", "success");
		}else if(flag==1){
			System.out.println("����Դδͨ��");
			courseRemove.put("removeFlag", "fail");
		}else if(flag==2){
			System.out.println("����Դû�����");
			courseRemove.put("removeFlag", "fail");
		}else if(flag==3){
			System.out.println("��Դȫ��δͨ��");	
			courseRemove.put("removeFlag", "fail");
		}
		return courseRemove;
		//return "forward: /courseList";
	}
	/*
	 * ���пγ̿�������
	 */
	@RequestMapping("/setupCourse")
	public @ResponseBody HashMap setupCourse(Model model,@RequestBody Course course){
		
		HashMap courseSetup=new HashMap();
		
		/**
		 * ���ݿγ̱�Ų�ѯ��Ӧ�Ŀγ���Դ��������Դ״̬���в���
		 * @author chen
		 * �޸�ʱ�䣻2019.7.12
		 */
		System.out.println(course.getKcbh());
		int flag=courseResourceService.getCourseResourceByKCBH(course.getKcbh());
		
		if(flag==-1){//�жϱ�ʶ,1����Դδͨ��,2����Դû�����,3��Դȫ��δͨ��,0��Դȫ��ͨ��,-1û����Դ
			System.out.println("û����Դ");
			courseSetup.put("setupFlag", "fail");
		}else if(flag==0){
			System.out.println("��Դȫ��ͨ��");
			courseSetup.put("setupFlag", "fail");
		}else if(flag==1){
			System.out.println("����Դδͨ��");
			courseSetup.put("setupFlag", "fail");
		}else if(flag==2){
			System.out.println("����Դû�����");
			courseSetup.put("setupFlag", "fail");
		}else if(flag==3){
			System.out.println("��Դȫ��δͨ��");
			//��ͨ������Դ�����״̬ 1
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
	 * ��ȡδ���εĿγ���Ϣ
	 */
	@RequestMapping("/getUnsetCourse")	
	public String getUnsetCourse(Model model){
		List<Course> unsetCourseList=new ArrayList<Course>();
		unsetCourseList=courseService.getUnsetCourse();
		model.addAttribute("unsetCourseList",unsetCourseList);
		return "STMIS_courseAdd";
	}
	
	/*
	 * ������ʦ���Ʋ�ѯ�γ�
	 */
	@RequestMapping("getCourseByCondition")
	@ResponseBody
	public List<Course> getCourseByTeacher(Model model,@RequestBody Course course){
		List<Course> courseList=new ArrayList<Course>();
		courseList=courseService.getCourseByCondition(course);
		return courseList;
	}
}
