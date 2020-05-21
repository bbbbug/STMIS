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
	 * ����Excel������ģ����пγ̷�����ģ�����
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
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
        
        CourseFeedbackQuestion courseFeedbackQuestion=new CourseFeedbackQuestion();
        String fileSavePath="";		
		String fileName="";
		if (!file.isEmpty()) {
			try{
				InputStream inputStream = file.getInputStream();				
				//ȡ�õ�ǰ�ϴ��ļ����ļ�����
				String originalFilename=file.getOriginalFilename();
				//��ȡ��ǰ��Ŀ�ڷ�����������·��
				String path = request.getServletContext().getRealPath("/");
//				long seed = System.currentTimeMillis();//��õ�ǰʱ��ĺ�����
//		        Random rd = new Random(seed);//��Ϊ���������뵽Random�Ĺ�������				
		        fileName=UUID.randomUUID()+originalFilename;//�����ƴ���ļ�
		        //�����ļ������ļ���
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
		        	return Msg.fail().add("inform", "���ϴ���ȷExcel�ļ�");
		        }
		        
			}catch (Exception e) {
				// TODO: handle exception
			}
			String realFilePath=fileSavePath+File.separator+fileName;
			realFilePath=realFilePath.replace("\\", "/");
			
			//��ȡExcel�ļ�ģ����ʾ�����������CourseFeedbackQuestion�����н��з�װ
			ExcelUtil excelUtil=new ExcelUtil();
			List<CourseFeedbackQuestion> courseFeedbackQuestionList=excelUtil.importExcelToPo_feedbackQuestion(realFilePath);
			
			courseFeedbackQuestionService.addCourseFeedbackQuestion(courseFeedbackQuestionList);	
			return Msg.success().add("path", realFilePath);
		}else{
			return Msg.fail().add("inform", "���ϴ��ļ�");
		}					
	}
	
	/**
	 * �������еķ�����Ϣ��Ŀ�γɷ�����Ŀ��
	 * @author chen
	 * @return
	 */
	@RequestMapping("/courseFeedbackQuestionList")
	@ResponseBody
	public Msg getAllCourseFeedbackQuestion(HttpServletResponse response){
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
		        		
		List<CourseFeedbackQuestion> courseFeedbackQuestionList=new ArrayList<CourseFeedbackQuestion>();
		courseFeedbackQuestionList=courseFeedbackQuestionService.getAllCourseFeedbackQuestion();
		return Msg.success().add("courseFeedbackQuestionList", courseFeedbackQuestionList);
	}
	
	/**
	 * �����������⣬�޸ķ�����Ŀ����������Ŀ,�����������и���
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
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
        CourseFeedbackQuestion courseFeedbackQuestion=new CourseFeedbackQuestion();
        String fileSavePath="";		
		String fileName="";
		if (!file.isEmpty()) {
			try{
				InputStream inputStream = file.getInputStream();				
				//ȡ�õ�ǰ�ϴ��ļ����ļ�����
				String originalFilename=file.getOriginalFilename();
				//��ȡ��ǰ��Ŀ�ڷ�����������·��
				String path = request.getServletContext().getRealPath("/");
//				long seed = System.currentTimeMillis();//��õ�ǰʱ��ĺ�����
//		        Random rd = new Random(seed);//��Ϊ���������뵽Random�Ĺ�������				
		        fileName=UUID.randomUUID()+originalFilename;//�����ƴ���ļ�
		        //�����ļ������ļ���
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
		        	return Msg.fail().add("inform", "���ϴ���ȷExcel�ļ�");
		        }
		        
			}catch (Exception e) {
				// TODO: handle exception
			}
			String realFilePath=fileSavePath+File.separator+fileName;
			realFilePath=realFilePath.replace("\\", "/");
			
			//��ȡExcel�ļ�ģ����ʾ�����������CourseFeedbackQuestion�����н��з�װ
			ExcelUtil excelUtil=new ExcelUtil();
			List<CourseFeedbackQuestion> courseFeedbackQuestionList=excelUtil.importExcelToPo_feedbackQuestion(realFilePath);
			
			courseFeedbackQuestionService.updateCourseFeedbackQuestion(courseFeedbackQuestionList);	
			return Msg.success().add("path", realFilePath);
		}else{
			return Msg.fail().add("inform", "���ϴ��ļ�");
		}			
	}
}
