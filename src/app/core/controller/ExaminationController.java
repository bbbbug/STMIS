package app.core.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;

import app.core.po.Category;
import app.core.po.Course;
import app.core.po.CourseFeedbackAll;
import app.core.po.CourseResource;
import app.core.po.CourseSelection;
import app.core.po.CourseType;
import app.core.po.Exam;
import app.core.po.ExamResult;
import app.core.po.ExamResultList;
import app.core.po.Grade;
import app.core.po.Msg;
import app.core.service.CourseFeedbackAllService_m;
import app.core.service.CourseService;
import app.core.service.ExamService;
import app.core.util.m.ExcelUtil;
import net.sf.json.JSONArray;

@Controller
public class ExaminationController {
	private static final Logger logger = Logger.getLogger(ExaminationController.class);
	@Autowired
	public ExamService examService;//�Զ�ע��teacherService
	
	@Autowired
	public CourseService courseService;//�Զ�ע��teacherService
	
	@Autowired
	public CourseFeedbackAllService_m courseFeedbackAllService_m;//�Զ�ע��teacherService
	
	HttpServletRequest request;
	
	ExcelUtil excelUtil = new ExcelUtil(); 
	//author by Jaylin_Yang 2019 7.16
	@RequestMapping(value="/exam/submitExam", method ={RequestMethod.POST})
	public String submitExam(ExamResultList examResultList,HttpSession session,
							@RequestParam("ktsl") String ktsl,
							HttpServletRequest request){
		System.out.println("submitExam");
		List<ExamResult> examResults=examResultList.getExamResults();
		System.out.println(examResults.size());
		double fenshu=0;
		int count = 0;
		double score = 0;
		String ygzh = "";
		ygzh=(String) session.getAttribute("username");
		String kcbh=null;
		Course course = new Course();
		if (examResults !=null){
			for (ExamResult er : examResults) {
				if(er.getKcbh()!=null){
					kcbh = er.getKcbh();
					course.setKcbh(er.getKcbh());
					course = examService.selectCourseByKcbh(course);
					score = 100/Double.parseDouble(ktsl);
				}
				if(er.getStid()!=null){
					Exam exam =new Exam();
					exam.setId(er.getStid());
					Exam ex=examService.checkExamResult(exam);
					//set right answer and rrange to STMIS_ExamAnswer.jsp
					er.setRight_answer(ex.getAnswer());
					er.setRrange(ex.getRrange());
					er.setKtsl(ktsl);
					// judege the answer is ture
					if(ex.getAnswer().equals(er.getAnswer())){
						count++;
					}
					er.setYgzh(ygzh);
					examService.saveExamResult(er);
				}
			}
		}
		CourseSelection cSelection =new CourseSelection();
		cSelection.setYgzh(ygzh);
		cSelection.setKcbh(kcbh);
		fenshu =(int)Math.ceil(count*score);
		int f = (int) Math.ceil(fenshu);
		System.out.println("分数"+f);
		cSelection.setFraction(""+f);
		int examKcxf=0;
		if(f>=60){
			if(course !=null){
				examKcxf= course.getKcxf();	
				cSelection.setThreshold(examKcxf);
				System.out.println(examKcxf);
			}else{
				examKcxf = 0;
				cSelection.setThreshold(examKcxf);
				System.out.println(examKcxf);
			}
		int result=examService.saveFraction(cSelection);
		//add xuefen to grade table
		CourseType course_type = new CourseType();
		course_type = examService.selectXXBXByKcbh(kcbh,ygzh);
		Grade grade = examService.selectGradeByYgzh(ygzh);
		if(course_type !=null){
			if(course_type.getXxbx().equals("必修") ){
				grade.setYgbxxf(grade.getYgbxxf()+examKcxf);
			}else{
				grade.setYgxxxf(grade.getYgxxxf()+examKcxf);
			}
		}else{
			grade.setYgxxxf(grade.getYgxxxf()+examKcxf);
		}
		int res = examService.updateGrade(grade);
		}
		// select the feedbackall record  
		CourseFeedbackAll fback =new CourseFeedbackAll();
		fback.setKcbh(kcbh);
		fback.setYgzh(ygzh);
		fback = courseFeedbackAllService_m.selectfbcak(fback);
		//send the ygzh,kcmc,kcbh to feedback
		request.setAttribute("course", course);
		//save the right answer and caption to STMIS_ExamAnswer.jsp
		JSONArray examResult=JSONArray.fromObject(examResults);
		session.setAttribute("examResult", examResult);
		session.setAttribute("fraction", ""+f);
		if (fback == null){
			return "kcfkb";
		}
			return "redirect:/exam/showAnswer";
	}
	
	@RequestMapping("/exam/gotoFeedBack")
	public String gotoFeedBack(@RequestParam("kcbh") String kcbh,
			HttpServletRequest request){
		Course course =new Course();
		course.setKcbh(kcbh);
		course = examService.selectCourseByKcbh(course);
		request.setAttribute("course", course);
		return "kcfkb";
	}
	
	//author by Jaylin_Yang
	@RequestMapping("/exam/startExam")
	public String startExam(
			@RequestParam("kcbh") String kcbh,Model model){
		System.out.println("startExam");
		//select DTSJ,KTSL from course by KCBH
		Course course = new Course();
		course.setKcbh(kcbh);
		course = examService.selectCourseByKcbh(course);
//System.out.println("答题时间"+course.getBxzd1()+"\t考题数量："+course.getBxzd2());
		Exam exam =new Exam();
		exam.setKcbh(kcbh);
		course.getBxzd2();
 		List<Exam> exams =examService.startExam(exam,Integer.parseInt(course.getBxzd2()));
		System.out.println("size:"+exams.size());
		List<Map<String, Object>> exam_list=new ArrayList<Map<String, Object>>(); 
		for (Exam e : exams) {
			Map<String, Object> examMap = new HashMap<String, Object>();
			List<String> ranges = Arrays.asList(e.getRrange().split("#"));
			examMap.put("caption", e.getCaption());
			System.out.println(ranges.size());
			examMap.put("Arange", ranges.get(0));
			examMap.put("Brange", ranges.get(1));
			examMap.put("Crange", ranges.get(2));
			examMap.put("Drange", ranges.get(ranges.size()-1));
			examMap.put("id", e.getId());
			exam_list.add(examMap);
		}
		model.addAttribute("exam_list", exam_list);
		model.addAttribute("kcbh", kcbh);
		model.addAttribute("ktsl",course.getBxzd2());
		model.addAttribute("time",course.getBxzd1());
		int kt = Integer.parseInt(course.getBxzd2());
		model.addAttribute("score",100/kt);
		return "STMIS_Examination";
	}
	
	@RequestMapping("/exam/showExam")
	public String showExam(
			HttpSession session,Model model){
		System.out.println("����showExam����");
		Exam exam =new Exam();
		exam.setKcjs((String) session.getAttribute("username"));
		List<Exam> exams =examService.adminShowExam(exam);
		System.out.println("����"+exams.size());
		model.addAttribute("exams", exams);
		return "AdminShowExam";
	}
	
	@RequestMapping("/exam/adminShowExam")
	public String adminShowExam(
			HttpSession session,Model model){
		System.out.println("adminShowExam");
		Exam exam =new Exam();
		exam.setKcjs((String) session.getAttribute("username"));
		List<Exam> exams =examService.adminShowExam(exam);
		System.out.println("exams.size"+exams.size());
		for (Exam e : exams) {
			System.out.println(e.getRrange().replace(' ', '#'));
		}
		//author by Jaylin 2019.7.11
		Course course = new Course();
		course.setKcjs((String) session.getAttribute("username"));
		System.out.println("上传试卷课程教师："+session.getAttribute("username"));
		List<Course> courselist = examService.selectCourseByKcjs(course);
		model.addAttribute("courselist", courselist);
		model.addAttribute("exams", exams);
		return "AdminShowExam";
	}
	// author by Jaylin_Yang
	// date: 2019.5.10
	// add exam info to exam table
	@ResponseBody
	@RequestMapping("/exam/addExam")
	public String addExam(
			HttpSession session,
			@RequestParam("caption") String caption,
			@RequestParam("kcbh") String kcbh,
			@RequestParam("rrangeA") String rrangeA,
			@RequestParam("rrangeB") String rrangeB,
			@RequestParam("rrangeC") String rrangeC,
			@RequestParam("rrangeD") String rrangeD,
			@RequestParam("answer") String answer,
			@RequestParam("dtsj") String dtsj, 
			@RequestParam("ktsl") String ktsl, 
			Model model){
		System.out.println("����addExam����");
		Exam exam =new Exam();
		exam.setAnswer(answer);
		exam.setCaption(caption);
		exam.setKcbh(kcbh);
		String rrange = rrangeA+"#"+rrangeB+"#"+rrangeC+"#"+rrangeD;
		exam.setRrange(rrange);
		exam.setKcjs((String) session.getAttribute("username"));
		int result = examService.adminAddExam(exam);
		Course course = new Course();
		course.setKcbh(kcbh);
		course.setBxzd1(dtsj);
		course.setBxzd2(ktsl);
		course.setKcjs((String) session.getAttribute("username"));
		int result2 = examService.addKSinfo(course);
		return JSON.toJSONString(result);
	}
	
	@RequestMapping("/exam/gotoExam")
	public String gotoExam(){
		System.out.println("����gotoExam����");
		return "STMIS_Examination";
	}
	
	// author by Jaylin_Yang
	// date: 2019.5.13
	// select kcmc from course table
	@RequestMapping("/exam/gotoAdminExam")
	public String gotoAdminExam(HttpSession session,Model model){
		System.out.println("����gotoAdminExam����");
		Course course = new Course();
		course.setKcjs((String) session.getAttribute("username"));
		System.out.println("上传试卷课程教师："+session.getAttribute("username"));
		List<Course> courselist = examService.selectCourseByKcjs(course);
		model.addAttribute("courselist", courselist);
		return "AdminExam";
	}
	
	
	// author by Jaylin_Yang
	// date: 2019.5.11
	// add dtsj,ktsl to course table
	@ResponseBody
	@RequestMapping("/course/addKSinfo")
	public String addKSinfo(@RequestParam("kcbh") String kcbh, 
						  @RequestParam("dtsj") String dtsj, 
						  @RequestParam("ktsl") String ktsl, 
							 HttpSession session){
		System.out.println("addKSinfo");
		Course course = new Course();
		course.setKcbh(kcbh);
		course.setBxzd1(dtsj);
		course.setBxzd2(ktsl);
		course.setKcjs((String) session.getAttribute("username"));
		int result = examService.addKSinfo(course);
		return JSON.toJSONString(result);
	}
	
	// author by Jaylin_Yang
	// date: 2019.5.15
	// add dtsj,ktsl to course table
	@ResponseBody
	@RequestMapping("/exam/selectKtnum")
	public String addKSinfo(@RequestParam("kcbh") String kcbh, 
							 HttpSession session,
							 Model model){
		Exam exam = new Exam();
		exam.setKcbh(kcbh);
		exam.setKcjs((String) session.getAttribute("username"));
		List<Exam> examlist = examService.selectExamByKcbhKcjs(exam);
		return JSON.toJSONString(examlist.size());
	}
	
	//author by Jaylin_yang
	//date:2019.7.8
	//upload excel file to dataset
	@ResponseBody
	@RequestMapping("/exam/uploadXlsxExam")
	public String uploadExam(@RequestParam("filepath") MultipartFile filepath,
							 @RequestParam("kcbh") String kcbh,
							 @RequestParam("dtsj") String dtsj, 
							 @RequestParam("ktsl") String ktsl, 
							 HttpSession session,
							 HttpServletRequest request,
							 Model model) throws FileNotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException{
		String fileSavePath="";		
		String fileName="";
		List<Exam> examlist = new ArrayList<Exam>();
		int result2 = 0;
		if (!filepath.isEmpty()) {
			try{
				InputStream inputStream = filepath.getInputStream();				
				//取得当前上传文件的文件名称
				String originalFilename=filepath.getOriginalFilename();
				//获取当前项目在服务器的虚拟路径
				String path = request.getServletContext().getRealPath("/");
		        fileName=UUID.randomUUID()+originalFilename;//随机数拼接文件
		        //创建文件保存文件夹
		        File fdir=new File(path+"exam_file");		        
		        if(!fdir.exists()){
		        	fdir.mkdirs();
		        }
		        fileSavePath=path+"exam_file";
		        System.out.println(path);
		        System.out.println(fileName);
		        if(fileName.endsWith(".xlsx")||fileName.endsWith(".xls")){
		        	File uploadPath=new File(fileSavePath,fileName);		        
		        	filepath.transferTo(uploadPath);
		        }
			}catch (Exception e) {
				// TODO: handle exception
			}
			String realFilePath=fileSavePath+File.separator+fileName;
			realFilePath=realFilePath.replace("\\", "/");
			examlist = excelUtil.importExcelToPo_exam(realFilePath);
			System.out.println("examlist.size:"+examlist.size());
		}
		if(examlist != null){
			int result = 0;
			for(Exam exam:examlist){
				exam.setKcbh(kcbh);
				exam.setKcjs((String) session.getAttribute("username"));
				System.out.println("kcbh:"+kcbh);
				Course course = examService.selectByKcbh(kcbh);
				Category category = examService.selectLbmcByLBBH(course.getKclb());
				exam.setSjlb(category.getLBMC());
				result = examService.adminAddExam(exam);
			}
			if(result > 0){
				Course course = new Course();
				course.setKcbh(kcbh);
				course.setBxzd1(dtsj);
				course.setBxzd2(ktsl);
				course.setKcjs((String) session.getAttribute("username"));
				result2 = examService.addKSinfo(course);
			}
		}else{
			return JSON.toJSONString("上传失败");
		}
		return JSON.toJSONString(result2);
	}
	
	//author by Jaylin_Yang
	//2019.7.9
	//search examination by item and keyword
	@RequestMapping("/searchExam")
	@ResponseBody
	public Msg searchExamByItem(@RequestParam("caption") String caption, 
								Model model){
		List<Exam> searchResult = new ArrayList<Exam>();
		Exam exam = new Exam();
		exam.setCaption(caption);
		searchResult = examService.searchFromExam(caption);
		return Msg.success().add("searchResult", searchResult);
	}
	
	@RequestMapping("/updateExam")
	@ResponseBody
	public Msg updateExam(@RequestParam("id") String id,
						 Model model){
		Exam exam = new Exam();
		Integer int_id = Integer.parseInt(id);
		exam = examService.selectExamByID(int_id);
		return Msg.success().add("exam", exam);
	}
	
	@RequestMapping("/updateInfoExam")
	@ResponseBody
	public int updateInfoExam(
			@RequestParam("caption") String caption,
			@RequestParam("rrange") String rrange,
			@RequestParam("kcjs") String kcjs,
			@RequestParam("sjlb") String sjlb,
			@RequestParam("kcbh") String kcbh,
			@RequestParam("id") String id,
			@RequestParam("answer") String answer,
						 Model model){
		Exam exam = new Exam();
		exam.setId(Integer.parseInt(id));
		exam.setAnswer(answer);
		exam.setCaption(caption);
		exam.setKcbh(kcbh);
		exam.setKcjs(kcjs);
		exam.setRrange(rrange);
		exam.setSjlb(sjlb);
		int result = examService.updateExam(exam);
		return result;
	}
	@RequestMapping("/deleteExam")
	@ResponseBody
	public int deleteExam(@RequestParam("id") String id,
						 Model model){
		int result = examService.deleteExam(Long.parseLong(id));
		return result;
	}
	//author by Jaylin 2019.7.11
	@RequestMapping("/exam/screenExam")
	@ResponseBody
	public Msg screenExam(@RequestParam("kcbh") String kcbh,
						 HttpSession session,
						 Model model){
		Exam exam = new Exam();
		exam.setKcbh(kcbh);
		exam.setKcjs((String) session.getAttribute("username"));
		List<Exam> examlist = examService.selectExamByKcbhKcjs(exam);
		return Msg.success().add("examlist", examlist);
	}
	
	//author by Jaylin_Yang 2019.7.16
	
	@RequestMapping("/exam/showAnswer")
	public String showAnswer(HttpSession session,
							  HttpServletResponse response,
							 Model model) throws IOException{
		System.out.println("coming!");
		/*List<ExamResult> examResults = (List<ExamResult>) session.getAttribute("examResults");
		String jsonString = JSON.toJSONString(examResults);
		response.getWriter().print(jsonString);
		model.addAttribute("examResults",examResults);*/
		return "STMIS_ExamAnswer";
	}
	
}
