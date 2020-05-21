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

import app.core.po.Course;
import app.core.po.CourseResource;
import app.core.po.Msg;
import app.core.service.CourseResourceService_m;
import app.core.service.CourseService_m;

@Controller
@RequestMapping("/course")
public class CourseResourceController_m {
	
	@Autowired
	public CourseResourceService_m courseResourceService;
	
	@Autowired
	public CourseService_m courseService;
	
	/*查找所有课程资料*/
	@RequestMapping("/resourceList")
	@ResponseBody
	public List<CourseResource> getAllResource(Model model){
		List<CourseResource> resourceList=new ArrayList<CourseResource>();
		resourceList=courseResourceService.getAllResource();
		return resourceList;
	}
	
	/*根据id和课程编号查询*/
	@RequestMapping("/findCourseResource")
	@ResponseBody
	public CourseResource findCourseResource(Model model,@RequestParam("id") Integer id,@RequestParam("kcbh") String kcbh){
		CourseResource courseResource=new CourseResource();
		courseResource=courseResourceService.findCourseResource(id, kcbh);
		return courseResource;
	}
	
	/*根据id设置审核通过*/
	@RequestMapping("/passCourseResource")
	@ResponseBody
	public HashMap<String,String> passCourseResource(Model model,@RequestBody CourseResource courseResource){
		List<CourseResource> resourceList=new ArrayList<CourseResource>();
		HashMap<String,String> courseResourcePass=new HashMap<String, String>();
		courseResourceService.passCourseResource(courseResource);	
		Course course=new Course();		
		course.setKcbh(courseResource.getKcbh());
		System.out.println(courseResource.getKcbh());
		resourceList=courseResourceService.selectCourseResourceByKCBH(courseResource);
		System.out.println(resourceList.size());		
		if(resourceList.size()>0){//有没有审核通过的资源，则修改课程状态为5			
			course.setKczt(5);
			courseService.updateCourseByKCBH(course);
		}else{
			course.setKczt(4);
			courseService.updateCourseByKCBH(course);
		}			
		courseResourcePass.put("courseResourcePass", "success");
		return courseResourcePass;
	}
	
	/*根据id设置审核不通过*/
	@RequestMapping("/refuseCourseResource")
	@ResponseBody
	public HashMap<String,String> refuseCourseResource(Model model,@RequestBody CourseResource courseResource){
		List<CourseResource> resourceList=new ArrayList<CourseResource>();
		HashMap<String,String> courseResourceRefuse=new HashMap<String, String>();
		courseResourceService.refuseCourseResource(courseResource);	
		Course course=new Course();		
		course.setKcbh(courseResource.getKcbh());
		System.out.println(courseResource.getKcbh());
		resourceList=courseResourceService.selectCourseResourceByKCBH(courseResource);
		System.out.println(resourceList.size());		
		if(resourceList.size()>0){//有没有审核通过的资源，则修改课程状态为5			
			course.setKczt(5);
			courseService.updateCourseByKCBH(course);
		}else{
			course.setKczt(4);
			courseService.updateCourseByKCBH(course);
		}	
		courseResourceRefuse.put("courseResourceRefuse", "success");
		return courseResourceRefuse;
	}
	
	/*根据id批量审核通过课程资源*/
	@RequestMapping("/batchPassCourseResource")
	@ResponseBody
	public HashMap<String,String> batchPassCourseResource(Model model,@RequestParam("batchPass[]") List<Integer> batchPass){
		
		HashMap<String,String> courseResourceBatchPass=new HashMap<String, String>();
		for(Integer id : batchPass){
			//批量设置
			courseResourceService.batchPassCourseResource(id);
		}
		courseResourceBatchPass.put("courseResourceBatchPass","success");
		return courseResourceBatchPass;
	}
	
	/*根据id批量审核拒绝*/
	@RequestMapping("/batchRefuseCourseResource")
	@ResponseBody
	public HashMap<String,String> batchRefuseCourseResource(Model model,@RequestParam("batchRefuse[]") List<Integer> batchRefuse){
		HashMap<String,String> courseResourceBatchRefuse=new HashMap<String, String>();
		for(Integer id : batchRefuse){
			//批量设置
			courseResourceService.batchRefuseCourseResource(id);
		}
		courseResourceBatchRefuse.put("courseResourceBatchRefuse","success");
		return courseResourceBatchRefuse;
	}
	
	/*根据课程编号对应的课程资源状态批量修改课程状态*/
	@RequestMapping("/batchUpdateCourseByKCBH")
	@ResponseBody
	public HashMap<String,String> batchUpdateCourseByKCBH(Model model,@RequestBody List<CourseResource> batchCourseResource){
		List<CourseResource> resourceList=new ArrayList<CourseResource>();
		System.out.println(batchCourseResource.size());
		for(CourseResource cr:batchCourseResource){//根据课程编号查找对应的课程资源是否审核通过完成
			resourceList=courseResourceService.selectCourseResourceByKCBH(cr);
			if(resourceList.size()>0){//修改课程状态信息,有不通过的课程则为5
				Course course=new Course();	
				course.setKcbh(cr.getKcbh());
				course.setKczt(5);
				System.out.println(cr.getKcbh());
				courseService.updateCourseByKCBH(course);
			}else{//否则为4
				Course course=new Course();	
				course.setKcbh(cr.getKcbh());
				course.setKczt(4);
				System.out.println(cr.getKcbh());
				courseService.updateCourseByKCBH(course);
			}
		}
		HashMap<String,String> courseBatchUpdate=new HashMap<String, String>();	
		courseBatchUpdate.put("courseBatchUpdate", "success");
		return courseBatchUpdate;
	}
	
	/*根据对应的条件查询对应的课程资源列表*/
	@RequestMapping("/getCourseResourceByCondition")
	@ResponseBody
	public List<CourseResource> getCourseResourceByCondition(Model model,@RequestBody CourseResource courseResource){
		List<CourseResource> resourceList=new ArrayList<CourseResource>();
		resourceList=courseResourceService.getCourseResourceByCondition(courseResource);
		return resourceList;
	}
	
}
