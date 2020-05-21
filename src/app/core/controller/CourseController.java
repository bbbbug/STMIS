package app.core.controller;

import java.awt.print.Printable;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.json.Json;
import javax.json.JsonArray;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.apache.tools.ant.taskdefs.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

import app.core.po.CourseResource;
import app.core.po.CourseSelection;
import app.core.po.Course_Selection;
import app.core.po.Note;
import app.core.po.Page;
import app.core.po.Progress;
import app.core.po.Review;
import app.core.po.CourseResource;
import app.core.service.CourseService;
import app.core.po.Course;
import app.core.po.CourseCollection;

@Controller
public class CourseController {
	/*
	 * 自动注入
	 * 
	 */
	@Autowired
	@Qualifier("courseService")
	private CourseService courseService;
	ArrayList<CourseResource> course_list=new ArrayList<CourseResource>();
	
	
	@RequestMapping("/course/addNote")
	public String addNote(@RequestParam("kcbh") String kcbh, 
						  @RequestParam("zjxh") Integer zjxh, 
						  @RequestParam("bjnr") String bjnr, 
						  @RequestParam("bjzt") Boolean bjzt, 
							 HttpSession session,Model model){
		System.out.println("进入addNote方法");
		Note note =new Note();
		note.setKcbh(kcbh);
		note.setBjnr(bjnr);
		note.setZjxh(zjxh);
		if(bjzt){
			note.setBjzt(0);
		}else{
			note.setBjzt(1);
		}
		note.setYgzh((String) session.getAttribute("username"));
		courseService.addNote(note);
		return "redirect:/course/selectHomeCourse?kcbh="+kcbh;
	}
	
	@ResponseBody
	@RequestMapping("/course/note")
	public String gotoNote(@RequestParam("kcbh") String kcbh, Model model){
		System.out.println("����gotoNote����");
		Course course =new Course();
		course.setKcbh(kcbh);
		Course homecourse = courseService.selectCourse(course);
		List<CourseResource> courseresourses = courseService.selectByKCBH(course);
		JSONObject json=new JSONObject();
		json.put("courseresourses", courseresourses);
		json.put("kcmc",homecourse.getKcmc());
		return JSONObject.toJSONString(json);
	}
	
	@RequestMapping("/course/addComment")
	public String addComment(@RequestParam("kcbh") String kcbh, 
							 @RequestParam("plnr") String plnr, 
							 HttpSession session,Model model){
		System.out.println("进入addComment方法");
		Review review =new Review();
		review.setKcbh(kcbh);
		review.setPlnr(plnr);
		review.setYgzh((String) session.getAttribute("username"));
		courseService.addComment(review);
		return "redirect:/course/selectCourse?kcbh="+kcbh+"&kcxh="+1;
	}
	
	@RequestMapping("/course/comment")
	public String gotoComment(@RequestParam("kcbh") String kcbh, Model model){
		System.out.println("进入gotoComment方法");
		model.addAttribute("kcbh", kcbh);
		return "Comment";
	}
	
	@RequestMapping("/course/add")
	public String gotoAddCource(){
		System.out.println("进入gotoAddCource方法");
		return "adminAddCourse";
	}
	
	@RequestMapping("/course/goto404")
	public String goto404(){
		System.out.println("进入goto404方法");
		return "Bug404";
	}
	
	@RequestMapping("/course/gotoindex")
	public String gotoindex(){
		System.out.println("进入gotoindex方法");
		return "redirect:/course/showCourse";
	}
	
	@RequestMapping("/course/gotoSearch")
	public String gotoSearch(){
		System.out.println("进入gotoSearch方法");
		return "STMIS_courseSearch";
	}
	
	public Course Checkkclb(Course course){
		String kclb = course.getKclb();
        switch(kclb){
        case "jisuanji":
        	course.setKclb("计算机");break;
        case "dianzi":
        	course.setKclb("电子");break;
        default:
        	course.setKclb("经管");break;
        }
        return course;
	}
	/**
	 * 通过类别进行查询
	 * @param keyword
	 * @param model
	 * @return
	 */
	@RequestMapping("/course/showByKclb")
	public String showByKclb(@RequestParam("kclb") String kclb, Model model){
		System.out.println("进入showByKclb方法");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		System.out.println(kclb);
		Course course =new Course();
		course.setKclb(kclb);
		List<Course> course_list=courseService.showByKclb(course);
		System.out.println(course_list.size());
		for (Course c2 : course_list) {
			String dateString = formatter.format(c2.getKksj());
			String kcnf = dateString.substring(0, 4);
			c2.setKcjj(kcnf);
			System.out.println(kcnf);
		}
		model.addAttribute("course_list", course_list);
		return "STMIS_CourseKCLB";
	}
	
	@RequestMapping("/course/showAllCourse")
	public String showAllCourse( Model model){
		System.out.println("进入showAllCourse方法");
		List<Course> course_list=courseService.showAllCourse();
		System.out.println(course_list.size());
		model.addAttribute("course_list", course_list);
		return "STMIS_AllCourse";
	}
	
	/**
	 * 搜索功能
	 * @param kcbh
	 * @param model
	 * @return
	 */
	@RequestMapping("/course/search")
	public String search(@RequestParam("keyword") String keyword, Model model){
		System.out.println("进入search方法");
		System.out.println(keyword);
		Course course =new Course();
		course.setKcmc(keyword);
		List<Course> course_list=courseService.searchCourse(course);
		int searchSize = course_list.size();
		model.addAttribute("course_list", course_list);
		model.addAttribute("searchSize", searchSize);
		return "STMIS_courseSearch";
	}
	
	
	/**
	 * 进入主课程页面
	 * @param kcbh
	 * @param kcxh
	 * @param model
	 * @return
	 */
	@RequestMapping("/course/selectHomeCourse")
	public String selectCourse(@RequestParam("kcbh") String kcbh, Model model,HttpSession session){
		System.out.println("进入selectHomeCourse方法");
		Course course=new Course();
		course.setKcbh(kcbh);
		List<CourseResource> courseresourses = courseService.selectByKCBH(course);
		Course homecourse = courseService.selectCourse(course);
		System.out.println("homecourse的课程类别"+homecourse.getKclb());
		Review review =new Review();
		review.setKcbh(kcbh);
		List<Review> reviews =courseService.showReviews(review);
		if(!reviews.equals(null) || review.equals("")){
			System.out.println("评论数"+reviews.size());
		}
		Note note =new Note();
		note.setKcbh(kcbh);
		note.setYgzh((String) session.getAttribute("username"));
		List<Note> notes=courseService.showNotes(note);
		homecourse = Checkkclb(homecourse);
		CourseSelection courseSelection=new CourseSelection();
		courseSelection.setKcbh(kcbh);
		courseSelection.setYgzh((String) session.getAttribute("username"));
		CourseSelection cSelection =courseService.checkFraction(courseSelection);
		int learnCount = courseService.learnCount(courseSelection);
		model.addAttribute("courseresourses", courseresourses);
		model.addAttribute("homecourse", homecourse);
		model.addAttribute("cSelection", cSelection);
		model.addAttribute("reviews", reviews);
		model.addAttribute("notes", notes);
		model.addAttribute("learnCount", learnCount);
		return "STMIS_HomeVideo";
	}
	
	/**
	 * 进入课程页面
	 */
	@RequestMapping("/course/selectCourse")
	public String selectCourseResource(@RequestParam("kcbh") String kcbh,
			@RequestParam("kcxh") Integer kcxh,HttpSession session, Model model){
		System.out.println("进入selectCourseResource方法");
		Course course=new Course();
		CourseSelection courseSelection=new CourseSelection();
		CourseCollection courseCollection=new CourseCollection();
		courseSelection.setKcbh(kcbh);
		courseSelection.setYgzh((String) session.getAttribute("username"));
		courseCollection.setKcbh(kcbh);
		courseCollection.setYgzh((String) session.getAttribute("username"));
		course.setKcbh(kcbh);
		course.setKclb(kcbh.substring(0,kcbh.length()-6));
		Review review =new Review();
		review.setKcbh(kcbh);
		List<CourseResource> courseresourses = courseService.selectByKCBH(course);
		Progress progress =new Progress();
		progress.setKcbh(kcbh);
		progress.setYgzh((String) session.getAttribute("username"));;
		List<Progress> progresses =  courseService.selectProgress(progress);
		if(progresses.size()>0){
			for (int i=0; i<progresses.size(); i++) {
				if(courseresourses.get(i).getZjxh()==progresses.get(i).getZjxh()){
					System.out.println("pro"+i);
					courseresourses.get(i).setBxzd_1(""+progresses.get(i).getKcjd());
				}
			}
		}
		for (CourseResource cc : courseresourses) {
			System.out.println("状态"+cc.getBxzd_1());
		}
		Course homecourse = courseService.selectCourse(course);
		CourseSelection cSelection = courseService.checkCourseSelection(courseSelection);
		CourseCollection cCollect = courseService.checkCourseCollect(courseCollection);
		List<Course> reCourse = courseService.reCourse(courseSelection);
		List<Review> reviews =courseService.showReviews(review);
		if(!reviews.equals(null) || review.equals("")){
			System.out.println("评论数"+reviews.size());
		}
		if(kcxh>0){
			kcxh-=1;
		}
		CourseResource courseResource =null;
		System.out.println(courseresourses);
		if(courseresourses.size()>0){
			courseResource =courseresourses.get(kcxh);
		}
		System.out.println("推荐课程数"+reCourse.size());
		System.out.println("cSelection"+cSelection);
		model.addAttribute("courseresourses", courseresourses);
		model.addAttribute("course", courseResource);
		model.addAttribute("kcbh", kcbh);
		model.addAttribute("homecourse", homecourse);
		model.addAttribute("cSelection", cSelection);
		model.addAttribute("cCollect", cCollect);
		model.addAttribute("reCourse", reCourse);
		model.addAttribute("reviews", reviews);
		return "STMIS_NVideo";
	}
	@RequestMapping(value="/course/showCourse", method=RequestMethod.POST)
	public @ResponseBody List<Course> showCourse(){
		System.out.println("进入showCourse方法");
		Page page =new Page();
		page.setStartPage(1);
		page.setSize(8);
		List<Course> newCourse = courseService.showNewCourse(page);
		List<Course> hotCourse = courseService.showHotCourse(page);
		List<Course> courses = new ArrayList<Course>();
		System.out.println("yidcbhdwuebcvhreujbchej课程"+newCourse.size() + hotCourse.size());
		for (Course nc : newCourse) {
			courses.add(nc);
		}
		for (Course hc : hotCourse) {
			courses.add(hc);
		}
		
		return courses;
	}
	@RequestMapping("/course/addcourse")
	public String addCourse(HttpServletRequest req,
			HttpSession session,
			@RequestParam(value="kctb") MultipartFile file,
			@RequestParam("kcmc") String kcmc,
			@RequestParam("kcbh") String kcbh,
			@RequestParam("kcxf") String kcxf,
			@RequestParam("kcjj") String kcjj,
			@RequestParam("kclb") String kclb)
{
			System.out.println("进入addcourse方法");
			Course course =new Course();
			System.out.println(kcmc);
			if(kcmc=="" || kcmc==null ||kcmc.equals("") || kcmc.equals(null)) kcmc="未知培训课程";
			if(kclb=="#" ||kclb.equals("#")){
				System.out.println("进入赋值");
				kclb="jisuanji";
				Double bh = Math.floor(Math.random() * 999999);
				kcbh = kclb+bh;
			}
				course.setKcmc(kcmc);
				course.setKcbh(kcbh);
				course.setKcjs((String) session.getAttribute("username"));
				course.setKcxf(Integer.parseInt(kcxf));
				course.setKcjj(kcjj);
				course.setKclb(kclb);
				course.setKczt(0);
				course.setBxzd1("00:30");
				course.setBxzd2("5");
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
			System.out.println(course);
			courseService.addCourse(course);
			if (!course_list.isEmpty())
				System.out.println(course_list.size());
				for (CourseResource courseResource : course_list) {
					courseResource.setKcbh(kcbh);
					courseResource.setKcmc(kcmc);
				}
			courseService.addCourse(course_list);
			course_list.clear();
			return "redirect:/teacher/showCourse";
}

	@RequestMapping(value="course/addCourseResource",method=RequestMethod.POST)
	@ResponseBody  
	public String addCourseResource(HttpServletRequest req, 
			@RequestParam(value = "zjmc") String zjmc,
			@RequestParam(value = "kcbh") String kcbh,
			@RequestParam(value = "kcmc") String kcmc,
			@RequestParam(value = "zylj") MultipartFile file)
	{
		System.out.println("进入addCourseResource方法");
		System.out.println(kcbh);
		CourseResource courseResource =new CourseResource();
		System.out.println(kcmc);
		courseResource.setKcbh(kcbh);
		courseResource.setKcmc(kcmc);
		courseResource.setZjmc(zjmc);
		System.out.println(file);
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
					courseResource.setZylx(extendName);
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
		System.out.println(courseResource);
		course_list.add(courseResource);
		return "index";
	}
	

	@RequestMapping("/test")
	public void mytest(){
		System.out.println("进入test方法");
	}
	

}
