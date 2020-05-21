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
	
	/*�������пγ�����*/
	@RequestMapping("/resourceList")
	@ResponseBody
	public List<CourseResource> getAllResource(Model model){
		List<CourseResource> resourceList=new ArrayList<CourseResource>();
		resourceList=courseResourceService.getAllResource();
		return resourceList;
	}
	
	/*����id�Ϳγ̱�Ų�ѯ*/
	@RequestMapping("/findCourseResource")
	@ResponseBody
	public CourseResource findCourseResource(Model model,@RequestParam("id") Integer id,@RequestParam("kcbh") String kcbh){
		CourseResource courseResource=new CourseResource();
		courseResource=courseResourceService.findCourseResource(id, kcbh);
		return courseResource;
	}
	
	/*����id�������ͨ��*/
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
		if(resourceList.size()>0){//��û�����ͨ������Դ�����޸Ŀγ�״̬Ϊ5			
			course.setKczt(5);
			courseService.updateCourseByKCBH(course);
		}else{
			course.setKczt(4);
			courseService.updateCourseByKCBH(course);
		}			
		courseResourcePass.put("courseResourcePass", "success");
		return courseResourcePass;
	}
	
	/*����id������˲�ͨ��*/
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
		if(resourceList.size()>0){//��û�����ͨ������Դ�����޸Ŀγ�״̬Ϊ5			
			course.setKczt(5);
			courseService.updateCourseByKCBH(course);
		}else{
			course.setKczt(4);
			courseService.updateCourseByKCBH(course);
		}	
		courseResourceRefuse.put("courseResourceRefuse", "success");
		return courseResourceRefuse;
	}
	
	/*����id�������ͨ���γ���Դ*/
	@RequestMapping("/batchPassCourseResource")
	@ResponseBody
	public HashMap<String,String> batchPassCourseResource(Model model,@RequestParam("batchPass[]") List<Integer> batchPass){
		
		HashMap<String,String> courseResourceBatchPass=new HashMap<String, String>();
		for(Integer id : batchPass){
			//��������
			courseResourceService.batchPassCourseResource(id);
		}
		courseResourceBatchPass.put("courseResourceBatchPass","success");
		return courseResourceBatchPass;
	}
	
	/*����id������˾ܾ�*/
	@RequestMapping("/batchRefuseCourseResource")
	@ResponseBody
	public HashMap<String,String> batchRefuseCourseResource(Model model,@RequestParam("batchRefuse[]") List<Integer> batchRefuse){
		HashMap<String,String> courseResourceBatchRefuse=new HashMap<String, String>();
		for(Integer id : batchRefuse){
			//��������
			courseResourceService.batchRefuseCourseResource(id);
		}
		courseResourceBatchRefuse.put("courseResourceBatchRefuse","success");
		return courseResourceBatchRefuse;
	}
	
	/*���ݿγ̱�Ŷ�Ӧ�Ŀγ���Դ״̬�����޸Ŀγ�״̬*/
	@RequestMapping("/batchUpdateCourseByKCBH")
	@ResponseBody
	public HashMap<String,String> batchUpdateCourseByKCBH(Model model,@RequestBody List<CourseResource> batchCourseResource){
		List<CourseResource> resourceList=new ArrayList<CourseResource>();
		System.out.println(batchCourseResource.size());
		for(CourseResource cr:batchCourseResource){//���ݿγ̱�Ų��Ҷ�Ӧ�Ŀγ���Դ�Ƿ����ͨ�����
			resourceList=courseResourceService.selectCourseResourceByKCBH(cr);
			if(resourceList.size()>0){//�޸Ŀγ�״̬��Ϣ,�в�ͨ���Ŀγ���Ϊ5
				Course course=new Course();	
				course.setKcbh(cr.getKcbh());
				course.setKczt(5);
				System.out.println(cr.getKcbh());
				courseService.updateCourseByKCBH(course);
			}else{//����Ϊ4
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
	
	/*���ݶ�Ӧ��������ѯ��Ӧ�Ŀγ���Դ�б�*/
	@RequestMapping("/getCourseResourceByCondition")
	@ResponseBody
	public List<CourseResource> getCourseResourceByCondition(Model model,@RequestBody CourseResource courseResource){
		List<CourseResource> resourceList=new ArrayList<CourseResource>();
		resourceList=courseResourceService.getCourseResourceByCondition(courseResource);
		return resourceList;
	}
	
}
