package app.core.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import app.core.po.Course;
import app.core.po.CourseCollection;
import app.core.po.CourseFeedbackAll;
import app.core.po.CourseSelection;
import app.core.po.Department;
import app.core.po.Employee;
import app.core.po.Grade;
import app.core.po.Manager;
import app.core.po.Progress;
import app.core.po.Teacher;
import app.core.service.CourseService;
import app.core.service.DepartmentService_m;
import app.core.service.UserService;
import net.sf.json.JSONObject;

@Controller
public class UserController {
	@Autowired
	@Qualifier("userService")
	private UserService userService;//自动注入userService
	@Qualifier("courseService")
	private CourseService courseService;//自动注入userService
	@Autowired
	public DepartmentService_m departmentService;
	/**
	 * 8-29  程默
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/user/updatePerson", method=RequestMethod.POST)
	public String updatePerson(Model model,HttpSession session,Employee employee
			){
		employee.setYgzh( (String) session.getAttribute("username"));
		userService.saveEmChange(employee);
		return "redirect:/user/showMyCourse";
	}
	
	/**
	 * 8-29  程默
	 * @param session
	 * @return
	 */
	@RequestMapping("/user/person")
	public String gotoPerson(Model model,HttpSession session){
		List<Department> departmens = departmentService.getAllDepartment();
		String ygzh = (String) session.getAttribute("username");
		Employee employee = userService.findEm(ygzh);
		for (Department d : departmens) {
			if(d.getBmbh().equals(employee.getYgdwbh())) 
				employee.setYgdwbh(d.getBmmc());
		}
		System.out.println("employee"+employee);
		model.addAttribute("employee", employee);
		return "person";
	}
	/**
	 * 7-12 程默
	 * @param session
	 * @return
	 */
	@RequestMapping("/user/gradeAlert")
	@ResponseBody
	public Boolean gradeAlert(HttpSession session){
		Boolean isXFalert=false;
		Employee employee = new Employee();
		String ygzh = (String) session.getAttribute("username");
		employee.setYgzh(ygzh);
		employee = userService.findEmployee(employee);
		if(employee != null){
			Department gradeRequirement = userService.getGradeRe(employee.getYgdwbh());
			Grade gradeAcquire = userService.getGrade(ygzh);
				if(gradeRequirement !=null && gradeAcquire !=null){
				if(gradeAcquire.getYgzxf() < gradeRequirement.getZfyq()*0.75){		
					isXFalert = true;
				}
				if(gradeAcquire.getYgbxxf() < gradeRequirement.getBxxfyq()*0.75){
					isXFalert = true;
				}
			}
		}
		return isXFalert;
	}
	
	@RequestMapping(value="/user/showMyCollection", method=RequestMethod.GET)
	public String showMyCollection(
			Model model,
			HttpSession session
			){
		System.out.println("进入showMyCollection方法");
		String ygzh = (String) session.getAttribute("username");
		String jsbs = (String) session.getAttribute("jsbs");
		System.out.println("jsbs"+jsbs);
		if (jsbs.equals("2")){
			return "redirect:/teacher/showCourse";
		}
		CourseCollection courseCollection=new CourseCollection();
		courseCollection.setYgzh(ygzh);
		List<Course> course_Collection = userService.showMyCollection(courseCollection);
		int selectSize = course_Collection.size();
		model.addAttribute("courses", course_Collection);
		model.addAttribute("selectSize", selectSize);
		return "STMIS_collection";
	}
	
	
	@RequestMapping(value="/user/proKCJD", method=RequestMethod.POST)
	public @ResponseBody Boolean proKCJD(
			@RequestParam(value = "kcbh") String kcbh,
			@RequestParam(value = "zjxh") Integer zjxh,
			@RequestParam(value = "username") String ygzh
			){
			System.out.println("进入proKCJD方法");
			Progress progress =new Progress();
			progress.setYgzh(ygzh);
			progress.setKcbh(kcbh);
			progress.setZjxh(zjxh);
			userService.proKCJD(progress);
			return true;
	}
	
	@RequestMapping(value="/user/gotoCredit")
	public String gotoCredit(
			HttpSession session,Model model
			){
		System.out.println("进入gotoCredit方法");
		CourseSelection courseSelection=new CourseSelection();
		CourseFeedbackAll courseFeedbackAll =new CourseFeedbackAll();
		courseFeedbackAll.setYgzh((String) session.getAttribute("username"));
		courseSelection.setYgzh((String) session.getAttribute("username"));
		System.out.println(courseSelection.getYgzh());
		List<Course> course_Selection = userService.gotoCredit(courseSelection);
		System.out.println("学分课程"+course_Selection.size());
		List<CourseFeedbackAll> course_feedbacks = userService.selectFeedbacks(courseFeedbackAll);
		List<String> feedbacks =new ArrayList<String>();
		for (CourseFeedbackAll cfb : course_feedbacks) {
			feedbacks.add(cfb.getKcbh());
		}
		
		int totalCredit= 0;
		for (Course course : course_Selection) {
			String fraction = course.getCourseSelection().getFraction();
			System.out.println(fraction);
			if(fraction==null || fraction.equals("")){
				if(course.getCourseSelection().getKcjd()==2){
					course.getCourseSelection().setFraction("暂未考试");
				}else{
					course.getCourseSelection().setFraction("暂未结课");
				}
				course.getCourseSelection().setBxzd2("否");
			}else{
				if(Double.valueOf(fraction)>=60){
					course.getCourseSelection().setBxzd2("是");
					totalCredit += course.getKcxf();
				}else{
					course.getCourseSelection().setBxzd2("否");
				}
				}
				if(!feedbacks.contains(course.getKcbh())){					
					course.getCourseSelection().setFraction("<a href='/STMIS/exam/gotoFeedBack?kcbh="+course.getKcbh()+"&ygzh="+courseSelection.getYgzh()+"'>请先填写反馈表</a>");
					//<span style='cursor:pointer;' id='gotofeedback' onclick='gotoFeedback()' content='"+course.getKcbh()+"'> 请填写反馈表 </span>
					//<a href='/STMIS/exam/gotoFeedBack?kcbh="+course.getKcbh()+"&ygzh="+courseSelection.getYgzh()+"'>请先填写反馈表</a>
				}
		}
		model.addAttribute("course_Selection", course_Selection);
		model.addAttribute("totalCredit", totalCredit);
		return "STMIS_Credit";
	}
	
	@RequestMapping(value="/user/removeMyCourse", method=RequestMethod.GET)
	public String removeMyCourse(
			Model model,
			@RequestParam(value = "kcbh") String kcbh,
			@RequestParam(value = "username") String ygzh
			){
			System.out.println("进入removeMyCourse方法");
			CourseSelection courseSelection=new CourseSelection();
			courseSelection.setYgzh(ygzh);
			courseSelection.setKcbh(kcbh);
			userService.removeCourse(courseSelection);
			return "redirect:/user/showMyCourse";
		}
	
	@RequestMapping(value="/user/removeMyCollection", method=RequestMethod.GET)
	public String removeMyCollection(
			@RequestParam(value = "kcbh") String kcbh,
			@RequestParam(value = "username") String ygzh
			){
			System.out.println("进入removeMyCourse方法");
			CourseCollection courseCollection=new CourseCollection();
			courseCollection.setYgzh(ygzh);
			courseCollection.setKcbh(kcbh);
			userService.removeCollection(courseCollection);
			return  "redirect:/user/showMyCollection";
		}
	
	@RequestMapping(value="/user/checkCourse", method=RequestMethod.POST)
	@ResponseBody
	public String checkCourse(
			Model model,
			@RequestParam(value = "kcbh") String kcbh,
			@RequestParam(value = "username") String ygzh
			){
			System.out.println("进入checkCourse方法");
			CourseSelection courseSelection=new CourseSelection();
			courseSelection.setYgzh(ygzh);
			courseSelection.setKcbh(kcbh);
			System.out.println(courseSelection.getKcbh());
			boolean exitcourse = userService.checkCourse(courseSelection);
			System.out.println(exitcourse);
			model.addAttribute("exitcourse", exitcourse);
			return "STMIS_NVideo";
	}
	
	@RequestMapping(value="/user/logout")
	public String logout(
			HttpSession session
			){
		System.out.println("进入logout方法");
		session.removeAttribute("username");
		session.removeAttribute("jsbs");
		return "index";
	}
	// update by author Jaylin
	@RequestMapping(value="/user/showMyCourse", method=RequestMethod.GET)
	public String showMyCourse(
			Model model,
			HttpSession session
			){
		System.out.println("进入showCourse方法");
		String ygzh = (String) session.getAttribute("username");
		String jsbs = (String) session.getAttribute("jsbs");
		System.out.println("jsbs"+jsbs);
		if (jsbs.equals("2")){
			return "redirect:/index.html";
		}
		CourseSelection courseSelection=new CourseSelection();
		courseSelection.setYgzh(ygzh);
		List<Course> course_Selection = userService.showMyCourse(courseSelection);
		for (Course course : course_Selection) {
			Progress progress =new Progress();
			progress.setKcbh(course.getKcbh());
			progress.setYgzh(ygzh);
			CourseSelection cSelection =new CourseSelection();
			cSelection.setKcbh(course.getKcbh());
			cSelection.setYgzh(ygzh);
			System.out.println("进度"+userService.selectCourseKCJD(progress));
			int courseKCJD=userService.selectCourseKCJD(progress);
			int courseCount=userService.selectCourseCount(progress);
			course.setCourseKCJD(""+courseKCJD);
			course.setCourseCount(""+courseCount);
			if(courseKCJD==courseCount){
				userService.updateKCJD(cSelection);
				course.getCourseSelection().setKcjd(2);
			}
		}
		int selectSize = course_Selection.size();
		model.addAttribute("courses", course_Selection);
		model.addAttribute("selectSize", selectSize);
		return "STMIS_course";
	}
	
	@RequestMapping(value="/user/addCollectCourse", method=RequestMethod.POST)
	public @ResponseBody Boolean addCollectCourse(
			@RequestParam(value = "kcbh") String kcbh,
			@RequestParam(value = "username") String ygzh
			){
			System.out.println("进入addMyCourse方法");
			CourseCollection courseCollection=new CourseCollection();
			courseCollection.setYgzh(ygzh);
			courseCollection.setKcbh(kcbh);
			boolean exitcourse = userService.checkCollectCourse(courseCollection);
			System.out.println("exitcourse"+exitcourse);
			if (exitcourse) {
				userService.addCollectCourse(courseCollection);
				return true;
			}
			return false;
	}
	
	@RequestMapping(value="/user/addMyCourse", method=RequestMethod.POST)
	public @ResponseBody Boolean addMyCourse(
			@RequestParam(value = "kcbh") String kcbh,
			@RequestParam(value = "username") String ygzh
			){
			System.out.println("进入addMyCourse方法");
			CourseSelection courseSelection=new CourseSelection();
			courseSelection.setYgzh(ygzh);
			courseSelection.setKcbh(kcbh);
			boolean exitcourse = userService.checkCourse(courseSelection);
			System.out.println("exitcourse"+exitcourse);
			if (exitcourse) {
				userService.addCartCourse(courseSelection);
				return true;
			}
			return false;
	}
	
	//author by Jaylin_yang 
		//date:2019.5.16
		@ResponseBody
		@RequestMapping("/user/login")
		public JSONObject login(
				HttpServletRequest request,
				HttpSession session, 
				@RequestParam("jsbs") String jsbs ,
				@RequestParam("username") String username ,			
				@RequestParam("password") String password){
			System.out.println("����login����");
			//HashMap<String,String> json = new HashMap<String,String>();
			JSONObject json=new JSONObject();
			if (jsbs.equals("1")){
				Employee employee=new Employee();
				employee.setYgzh(username);
				employee.setYgmm(password);
				employee.setJsbs(jsbs);
				System.out.println(password);
				System.out.println("employee");
				System.out.println("employee"+employee.getYgzh());
				Employee user=userService.selectEmployee(employee);
				if(user == null){
					json.put("error", "用户名或密码错误！");
				}
				else if(user.getYgdlzt() == 2){    //if the account is not freeze
					json.put("error", "该账户被冻结！");
				}else{   
					session.setAttribute("username", username);
					session.setAttribute("jsbs", jsbs);
					json.put("redirect","/user/showMyCourse");
				}
			}else{
				//change teacher to admin
				Manager manager =new Manager();
				System.out.println("����");
				manager.setGlyzh(username);
				manager.setGlymm(password);
				manager.setJsbs(jsbs);
				System.out.println("username:"+username+"password:"+password);
				Manager user =userService.selectManager(manager);
				System.out.println(user);
				if(user == null){
					json.put("error","用户名或密码错误！");
				}
				else if(user.getbxzd_1().equals("0")){
					json.put("error", "该账户被冻结！");
				}else{
					session.setAttribute("username", user.getGlyzh());
					session.setAttribute("jsbs", "2");
					json.put("redirect", "/index.html");
				}
			}
			return json;
		}


}
