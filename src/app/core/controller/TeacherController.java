package app.core.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import app.core.po.*;
import app.core.service.CourseService;
import app.core.service.TeacherService;

@Controller
public class TeacherController {
	@Autowired
	@Qualifier("teacherService")
	private TeacherService teacherService;//自动注入teacherService
	
	@RequestMapping("/teacher/adminRemoveCourseResource")
	public String adminRemoveCourseResource(
			@RequestParam("kcbh") String kcbh,
			@RequestParam("zjxh") Integer zjxh,
			Model model){
		System.out.println("进入adminRemoveCourseResource方法");
		System.out.println(kcbh+':'+zjxh);
		CourseResource courseResource =new CourseResource();
		courseResource.setKcbh(kcbh);
		courseResource.setZjxh(zjxh);
		int flag=teacherService.adminRemoveCourseResource(courseResource);
		System.out.println(flag);
		return "AdminIndex";
	}
	
	@RequestMapping("/teacher/adminRemoveCourse")
	public String adminRemoveCourse(
			@RequestParam("kcbh") String kcbh,
			Model model){
		System.out.println("进入adminRemoveCourse方法");
		int flag=teacherService.adminRemoveCourse(kcbh);
		System.out.println(flag);
		return "redirect:/teacher/showCourse";
	}
	
	@RequestMapping("/teacher/adminSearchCourse")
	public String adminSearchCourse(
			HttpSession session,
			@RequestParam("kclb") String kclb, 
			@RequestParam("keyword") String keyword,
			Model model){
		System.out.println("进入adminSearchCourse方法");
		String kcjs = (String) session.getAttribute("username");
		System.out.println("kclbbbbb"+kclb);
		System.out.println(keyword);
		Course course =new Course();
		course.setKcmc(keyword);
		course.setKclb(kclb);
		course.setKcjs(kcjs);
		List<Course> courses=teacherService.adminSearchCourse(course);
		System.out.println(courses.size());
		model.addAttribute("courses", courses);
		return "AdminIndex";
	}
	
	
	@RequestMapping(value="/teacher/updateCourse")
	public String updateCourse(HttpServletRequest req,
			HttpSession session,
			@RequestParam(value="kctb") MultipartFile file,
			@RequestParam("kcmc") String kcmc,
			@RequestParam("kcbh") String kcbh,
			@RequestParam("kcxf") Integer kcxf,
			@RequestParam("kcjj") String kcjj){
		System.out.println("进入updateCourse方法");
		Course course = new Course();
		course.setKcmc(kcmc);
		course.setKcxf(kcxf);
		course.setKcjj(kcjj);
		course.setKcbh(kcbh);
		String path = req.getSession().getServletContext().getRealPath("/source");
		File sourceFolder = new File(path);
		//在项目的相对路径下创建保存文件的文件夹
		if (!sourceFolder.exists()) 
			sourceFolder.mkdir();
		if (!file.isEmpty()){
				try {
						//生成一个唯一标识符给文件
						String fileName =UUID.randomUUID().toString().replaceAll("-", "");
						//file.getOriginalFilename()的到文件的原始扩展名
						String extendName = FilenameUtils.getExtension(file.getOriginalFilename());
						//上传到服务器的文件名
						String sourceName = path+"/"+fileName+"."+extendName;
						File sourceFile =new File(sourceName);
						//transferTo方法将上传的文件写到服务器的指定位置
						file.transferTo(sourceFile);
						//保存到数据库的路径
						String sourcePath = "source/"+fileName+"."+extendName;
						//打印以便于查看
						course.setKctb(sourcePath);
						System.out.println("数据库路径："+sourcePath);
						//保存至数据库
						//course.setKclj(sourceName);
					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		}
		int flag = teacherService.adminUpdateCourse(course);
		System.out.println(flag);
		return "redirect:/teacher/showCourse";
	}
	
	@RequestMapping(value="/teacher/showCourse")
	public String showCourse(HttpSession session,Model model){
		System.out.println("进入showCourse方法");
		String kcjs = (String) session.getAttribute("username");
		Course course = new Course();
		course.setKcjs(kcjs);
		List<Course> courses = teacherService.adminShowCourse(course);
		System.out.println(courses.size());
		model.addAttribute("courses", courses);
		return "AdminIndex";
	}
	@RequestMapping("/teacher/courseEdit")
	public String courseEdit(@RequestParam("kcbh") String kcbh, Model model){
		System.out.println("进入courseEdit方法");
		CourseResource courseResource =new CourseResource();
		Course course = new Course();
		courseResource.setKcbh(kcbh);
		course.setKcbh(kcbh);
		List<CourseResource> courseResources=teacherService.adminCourseResource(courseResource);
		course = teacherService.adminCourse(course);
		System.out.println(course);
		model.addAttribute("courseResources", courseResources);
		model.addAttribute("course", course);
		return "AdminForm";
	}
	
	@RequestMapping("/teacher/courseResourceEdit")
	public String courseResourceEdit(
			@RequestParam("kcbh") String kcbh, 
			@RequestParam("zjxh") Integer zjxh,
			Model model){
		System.out.println("进入courseResourceEdit方法");
		CourseResource courseResource =new CourseResource();
		courseResource.setKcbh(kcbh);
		courseResource.setZjxh(zjxh);
		System.out.println(kcbh);
		System.out.println(zjxh);
		CourseResource cResource = teacherService.courseResourceEdit(courseResource);
		System.out.println(cResource.getZjmc());
		model.addAttribute("cResource", cResource);
		return "AdminResourceForm";
	}
	
	@RequestMapping(value="/teacher/updateResourceCourse",method ={RequestMethod.POST})
	public String updateResourceCourse(
			HttpServletRequest req,
			@RequestParam("kcbh") String kcbh,
			@RequestParam("zjxh") Integer zjxh,
			@RequestParam(value="zylj") MultipartFile file,
			@RequestParam("zjmc") String zjmc,
			Model model){
		System.out.println("进入updateResourceCourse方法");
		CourseResource courseResource =new CourseResource();
		courseResource.setKcbh(kcbh);
		courseResource.setZjxh(zjxh);
		courseResource.setZjmc(zjmc);
		String path = req.getSession().getServletContext().getRealPath("/source");
		File sourceFolder = new File(path);
		//在项目的相对路径下创建保存文件的文件夹
		if (!sourceFolder.exists()) 
			sourceFolder.mkdir();
		if (!file.isEmpty()){
				try {
						//生成一个唯一标识符给文件
						String fileName =UUID.randomUUID().toString().replaceAll("-", "");
						//file.getOriginalFilename()的到文件的原始扩展名
						String extendName = FilenameUtils.getExtension(file.getOriginalFilename());
						//上传到服务器的文件名
						String sourceName = path+"/"+fileName+"."+extendName;
						File sourceFile =new File(sourceName);
						//transferTo方法将上传的文件写到服务器的指定位置
						file.transferTo(sourceFile);
						//保存到数据库的路径
						String sourcePath = "source/"+fileName+"."+extendName;
						//打印以便于查看
						courseResource.setZylj(sourcePath);
						System.out.println("数据库路径："+sourcePath);
						//保存至数据库
						//course.setKclj(sourceName);
					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		}
		teacherService.adminUpdateResourceCourse(courseResource);
		return "redirect:/teacher/showCourse";
	}
	
	@RequestMapping("/teacher/gotoResourceAdd")
	public String gotoResourceAdd(
			@RequestParam("kcbh") String kcbh,
			@RequestParam("kcmc") String kcmc,
			Model model){
		System.out.println("进入gotoResourceAdd方法");
		model.addAttribute("kcbh", kcbh);
		model.addAttribute("kcmc", kcmc);
		return "AdminAddResourceForm";
	}
	
	@RequestMapping(value="/teacher/courseResourceAdd")
	public String courseResourceAdd(HttpServletRequest req,
			HttpSession session,
			@RequestParam(value="zylj") MultipartFile file,
			@RequestParam("kcbh") String kcbh,
			@RequestParam("kcmc") String kcmc,
			@RequestParam("zjmc") String zjmc){
		System.out.println("进入courseResourceAdd方法");
		CourseResource courseResource =new CourseResource();
		courseResource.setZjmc(zjmc);
		courseResource.setKcbh(kcbh);
		courseResource.setKcmc(kcmc);
		String path = req.getSession().getServletContext().getRealPath("/source");
		File sourceFolder = new File(path);
		//在项目的相对路径下创建保存文件的文件夹
		if (!sourceFolder.exists()) 
			sourceFolder.mkdir();
		if (!file.isEmpty()){
				try {
						//生成一个唯一标识符给文件
						String fileName =UUID.randomUUID().toString().replaceAll("-", "");
						//file.getOriginalFilename()的到文件的原始扩展名
						String extendName = FilenameUtils.getExtension(file.getOriginalFilename());
						//上传到服务器的文件名
						String sourceName = path+"/"+fileName+"."+extendName;
						File sourceFile =new File(sourceName);
						//transferTo方法将上传的文件写到服务器的指定位置
						file.transferTo(sourceFile);
						//保存到数据库的路径
						String sourcePath = "source/"+fileName+"."+extendName;
						//打印以便于查看
						courseResource.setZylj(sourcePath);
						System.out.println("数据库路径："+sourcePath);
						//保存至数据库
						//course.setKclj(sourceName);
					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		}
		int flag = teacherService.courseResourceAdd(courseResource);
		System.out.println(flag);
		return "redirect:/teacher/courseEdit?kcbh="+kcbh;
	}
}
