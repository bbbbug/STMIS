package app.core.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import app.core.mapper.CourseFeedbackQuestionMapper;
import app.core.po.CourseFeedbackQuestion;
import app.core.po.Msg;
import app.core.service.CourseFeedbackQuestionService_m;
import app.core.util.m.ExcelUtil;

@RequestMapping("/course")
@Controller
public class CourseFeedbackQuestionController_m {
	
	@Autowired
	public CourseFeedbackQuestionService_m courseFeedbackQuestionService;
	
	/**
	 * 导入Excel反馈表模板进行课程反馈表模板更新
	 * @author chen
	 * @param file
	 * @param response
	 * @param request
	 * @return
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws FileNotFoundException 
	 */
	@RequestMapping("/addCourseFeedbackQuestion")
	@ResponseBody
	public Msg addCourseFeedbackQuestion(@RequestParam("file") MultipartFile file,HttpServletResponse response,HttpServletRequest request) throws FileNotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException{
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
        
        CourseFeedbackQuestion courseFeedbackQuestion=new CourseFeedbackQuestion();
        String fileSavePath="";		
		String fileName="";
		if (!file.isEmpty()) {
			try{
				InputStream inputStream = file.getInputStream();				
				//取得当前上传文件的文件名称
				String originalFilename=file.getOriginalFilename();
				//获取当前项目在服务器的虚拟路径
				String path = request.getServletContext().getRealPath("/");
//				long seed = System.currentTimeMillis();//获得当前时间的毫秒数
//		        Random rd = new Random(seed);//作为种子数传入到Random的构造器中				
		        fileName=UUID.randomUUID()+originalFilename;//随机数拼接文件
		        //创建文件保存文件夹
		        File fdir=new File(path+"course_feedback_file");		        
		        if(!fdir.exists()){
		        	fdir.mkdirs();
		        }
		       
		        fileSavePath=path+"course_feedback_file";
		        System.out.println(path);
		        System.out.println(fileName);
		        if(fileName.endsWith(".xlsx")||fileName.endsWith(".xls")){
		        	File uploadPath=new File(fileSavePath,fileName);		        
			        file.transferTo(uploadPath);
		        }else{
		        	return Msg.fail().add("inform", "请上传正确Excel文件");
		        }
		        
			}catch (Exception e) {
				// TODO: handle exception
			}
			String realFilePath=fileSavePath+File.separator+fileName;
			realFilePath=realFilePath.replace("\\", "/");
			
			//读取Excel文件模板显示，将结果放入CourseFeedbackQuestion对象中进行封装
			ExcelUtil excelUtil=new ExcelUtil();
			List<CourseFeedbackQuestion> courseFeedbackQuestionList=excelUtil.importExcelToPo_feedbackQuestion(realFilePath);
			
			courseFeedbackQuestionService.addCourseFeedbackQuestion(courseFeedbackQuestionList);	
			return Msg.success().add("path", realFilePath);
		}else{
			return Msg.fail().add("inform", "请上传文件");
		}					
	}
	
	/**
	 * 查找所有的反馈信息题目形成反馈题目表
	 * @author chen
	 * @return
	 */
	@RequestMapping("/courseFeedbackQuestionList")
	@ResponseBody
	public Msg getAllCourseFeedbackQuestion(HttpServletResponse response){
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
		        		
		List<CourseFeedbackQuestion> courseFeedbackQuestionList=new ArrayList<CourseFeedbackQuestion>();
		courseFeedbackQuestionList=courseFeedbackQuestionService.getAllCourseFeedbackQuestion();
		return Msg.success().add("courseFeedbackQuestionList", courseFeedbackQuestionList);
	}
	
	/**
	 * 更新所有问题，修改反馈题目表中所有题目,根据主键进行更新
	 * @author chen
	 * @param courseFeedbackQuestion
	 * @return
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws FileNotFoundException 
	 */
	@RequestMapping("/updateCourseFeedbackQuestion")
	@ResponseBody
	public Msg updateCourseFeedbackQuestion(@RequestParam("file") MultipartFile file,HttpServletResponse response,HttpServletRequest request) throws FileNotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException{
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
        CourseFeedbackQuestion courseFeedbackQuestion=new CourseFeedbackQuestion();
        String fileSavePath="";		
		String fileName="";
		if (!file.isEmpty()) {
			try{
				InputStream inputStream = file.getInputStream();				
				//取得当前上传文件的文件名称
				String originalFilename=file.getOriginalFilename();
				//获取当前项目在服务器的虚拟路径
				String path = request.getServletContext().getRealPath("/");
//				long seed = System.currentTimeMillis();//获得当前时间的毫秒数
//		        Random rd = new Random(seed);//作为种子数传入到Random的构造器中				
		        fileName=UUID.randomUUID()+originalFilename;//随机数拼接文件
		        //创建文件保存文件夹
		        File fdir=new File(path+"course_feedback_file");		        
		        if(!fdir.exists()){
		        	fdir.mkdirs();
		        }
		       
		        fileSavePath=path+"course_feedback_file";
		        System.out.println(path);
		        System.out.println(fileName);
		        if(fileName.endsWith(".xlsx")||fileName.endsWith(".xls")){
		        	File uploadPath=new File(fileSavePath,fileName);		        
			        file.transferTo(uploadPath);
		        }else{
		        	return Msg.fail().add("inform", "请上传正确Excel文件");
		        }
		        
			}catch (Exception e) {
				// TODO: handle exception
			}
			String realFilePath=fileSavePath+File.separator+fileName;
			realFilePath=realFilePath.replace("\\", "/");
			
			//读取Excel文件模板显示，将结果放入CourseFeedbackQuestion对象中进行封装
			ExcelUtil excelUtil=new ExcelUtil();
			List<CourseFeedbackQuestion> courseFeedbackQuestionList=excelUtil.importExcelToPo_feedbackQuestion(realFilePath);
			
			courseFeedbackQuestionService.updateCourseFeedbackQuestion(courseFeedbackQuestionList);	
			return Msg.success().add("path", realFilePath);
		}else{
			return Msg.fail().add("inform", "请上传文件");
		}			
	}
}
