package app.core.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.util.JSONPObject;

import app.core.po.CourseOnsite;
import app.core.po.CourseOnsiteCredit;
import app.core.po.CourseOnsiteCreditAggregation;
import app.core.po.Employee;
import app.core.po.Msg;
import app.core.service.CourseOnsiteCreditService_m;
import app.core.service.CourseOnsiteService_m;
import app.core.service.EmployeeService_m;
import app.core.service.GradeService_m;


@RequestMapping("/course")
@Controller
public class CourseOnsiteController_m {
	
	@Autowired
	public CourseOnsiteService_m courseOnsiteService;
	@Autowired
	public CourseOnsiteCreditService_m courseOnsiteCreditService;
	@Autowired
	public GradeService_m gradeService;
	@Autowired
	public EmployeeService_m employeeService;
	
	/**
	 * ����/������������ѧԱѧ��
	 * @author chen
	 * @param courseOnsite
	 * ���� @RequestBody CourseOnsite courseOnsite,
	 * @return
	 */
	@RequestMapping(value="/addBatchCourseOnsiteCredit")
	@ResponseBody
	public JSONPObject addBatchCourseOnsiteCredit(CourseOnsite courseOnsite,String callback,HttpServletResponse response){//����Ҫ�����ѧԱ�˺���#���������¼���е�һ���ֶ��У�����һ���ַ����������д���		
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
		        
		//����
//		CourseOnsite courseOnsite=new CourseOnsite();
//		courseOnsite.setId(5);
//		courseOnsite.setPxkc("����");
//		courseOnsite.setPxdd("����");
//		courseOnsite.setPxfs("����");
//		courseOnsite.setSkls("��˼��");
//		courseOnsite.setSkxf(5.0);
//		courseOnsite.setCjrs(10.0);
//		courseOnsite.setPxnr("����");
//		courseOnsite.setPxjlr("�ƽ���");
//		courseOnsite.setPxsj(new Date());
//		courseOnsite.setPxzzbm("1102");
//		courseOnsite.setBxzd1("0");
//		courseOnsite.setBxzd2("bbbug#����#��Ĭ#�ƽ���");
		
		//������ѧ�ּ�¼���������ݿ�
		courseOnsiteService.addCourseOnsite(courseOnsite);
		//��ȡ���вμ�ѧԱ���˺�
		String xyzhs=courseOnsite.getBxzd2();
		//������ѵѧ�ֱ�
		List<CourseOnsiteCredit> courseOnsiteCreditList=new ArrayList<CourseOnsiteCredit>();
		if(xyzhs.contains("#")){//������������#
			String[] insert_xyzhs=xyzhs.split("#");//��ȡ��Ҫ�����ѧԱ�˺�����
			for(String xyzh:insert_xyzhs){
				CourseOnsiteCredit courseOnsiteCredit=new CourseOnsiteCredit();
				courseOnsiteCredit.setXxpxid(courseOnsite.getId());
				courseOnsiteCredit.setXyzh(xyzh);
				/**
				 * ����ѧԱ�˺Ų�ѯѧԱ���ڵĶ�Ӧ����
				 * @author chen
				 * �޸�ʱ��:2019.7.16
				 */
				Employee e=new Employee();
				e=employeeService.findEmployeeWithYgzh(xyzh);
				courseOnsiteCredit.setBxzd1(e.getYgdwbh());
				/**
				 * �޸Ľ���
				 */

				courseOnsiteCredit.setXxkcmc(courseOnsite.getPxkc());
				courseOnsiteCredit.setXxkcxf(courseOnsite.getSkxf());				
				courseOnsiteCredit.setXxskls(courseOnsite.getSkls());
				courseOnsiteCreditList.add(courseOnsiteCredit);
			}
			//������ѧԱ��ѧ����Ϣ���뵽ѧ�ֱ�
			courseOnsiteCreditService.addBatchCourseOnsiteCredit(courseOnsiteCreditList);
		}else{//����ѧԱ����
			String xyzh=xyzhs;
			CourseOnsiteCredit courseOnsiteCredit=new CourseOnsiteCredit();
			courseOnsiteCredit.setXxpxid(courseOnsite.getId());
			courseOnsiteCredit.setXyzh(xyzh);
			courseOnsiteCredit.setXxkcmc(courseOnsite.getPxkc());
			courseOnsiteCredit.setXxkcxf(courseOnsite.getSkxf());				
			courseOnsiteCredit.setXxskls(courseOnsite.getSkls());
			courseOnsiteCreditService.addCourseOnsiteCredit(courseOnsiteCredit);;
		}
		
		/**
		 * ��ѧԱ�˺ŷ����ѯ������ÿ��Ա����������ѧ��
		 * @author chen
		 * @return
		 * �޸�ʱ��:2019.7.11
		 */
		List<CourseOnsiteCreditAggregation> list=new ArrayList<CourseOnsiteCreditAggregation>();
		list=courseOnsiteCreditService.selectCourseOnsiteCreditWithEmp();
		System.out.println(list);
		gradeService.updateBatchGradeWithEmp(list);
		JSONPObject jsonpObject=new JSONPObject(callback,Msg.success());
		return jsonpObject;
//		return Msg.success();
	}
	
	/**
	 * ����������ѵ��¼���id���е�����ѯ��Ӧ�ļ�¼��Ϣ
	 * @author chen
	 */
	@RequestMapping("/findCourseOnsite")
	@ResponseBody
	public Msg findCourseOnsite(@RequestParam("id") Integer id,HttpServletResponse response){
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
        
		CourseOnsite courseOnsite=new CourseOnsite();
		courseOnsite=courseOnsiteService.findCourseOnsite(id);
		return Msg.success().add("findCourseOnsite", courseOnsite);
	}
	
	/**
	 * ����ʱ���ѯ��ѵ��¼,��ѯ�����С�ڵ���ѡ��ʱ�������
	 * @author chen
	 */
	/**
	 * ͨ����ѵ��֯���Ž���ɸѡ
	 * @author chen
	 * �޸�ʱ��:2019.7.11
	 * 7.11����22.06δ���²���
	 */
	@RequestMapping("/getCourseOnsiteWithExample")
	@ResponseBody
	public JSONPObject getCourseOnsiteWithExample(String callback,HttpServletResponse response,CourseOnsite courseOnsite){
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
        
		/*CourseOnsite courseOnsite=new CourseOnsite();
		Date date=new Date();		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		courseOnsite.setPxsj(date);*/
		List<CourseOnsite> courseOnsiteList=new ArrayList<CourseOnsite>();
		courseOnsiteList=courseOnsiteService.getCourseOnsiteWithExample(courseOnsite);
//		MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(courseOnsiteList);
//		mappingJacksonValue.setJsonpFunction(callback);
//		return mappingJacksonValue;
		JSONPObject jsonpObject=new JSONPObject(callback,Msg.success().add("courseOnsiteListWithExample", courseOnsiteList));
		return jsonpObject;
//		return Msg.success().add("courseOnsiteListWithExample", courseOnsiteList);
	}
	
	/**
	 * ���������޸���ѵ��¼��Ϣ
	 * @author chen
	 */
	@RequestMapping("/updateCourseOnsite")
	@ResponseBody
	public Msg updateCourseOnsite(@RequestBody CourseOnsite courseOnsite,HttpServletResponse response){
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
        
		//CourseOnsite courseOnsite=new CourseOnsite();
		//courseOnsite.setPxdd(pxdd);
		courseOnsiteService.updateCourseOnsite(courseOnsite);
		//System.out.println(courseOnsite.getPxdd());
		return Msg.success();
	}
	
	/**
	 * ��ѯ��ѵ��¼�ܱ�
	 * @author chen
	 */
	@RequestMapping("/courseOnsiteList")
	@ResponseBody
	public Msg getAllCourseOnsite(HttpServletResponse response){
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
		List<CourseOnsite> courseOnsiteList=new ArrayList<CourseOnsite>();
		courseOnsiteList=courseOnsiteService.getAllCourseOnsite();
		return Msg.success().add("courseOnsiteList", courseOnsiteList);
	}
	
	/**
	 * ɾ��һ���������μ�¼������ʾ״̬��0�ĳ�1
	 * @author chen
	 */
	@RequestMapping(value="/delCourseOnsite",method=RequestMethod.POST)
	@ResponseBody
	public Msg delCourseOnsite(@RequestBody CourseOnsite courseOnsite,HttpServletResponse response){
		//����
		//CourseOnsite courseOnsite=new CourseOnsite();
		//courseOnsite.setPxkc("������ѵ");
		//����
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
		
		courseOnsiteService.delCourseOnsite(courseOnsite);
		return Msg.success();
	}
	
	/**
	 * �ļ��ϴ�,���ر����������ѵ��Դ·��
	 * @author chen
	 */
	@RequestMapping("/upload/do")
	@ResponseBody
	public Msg doUploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request, 
			String basePath,HttpServletResponse response){
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
        
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
		        File fdir=new File(path+"file");		        
		        if(!fdir.exists()){
		        	fdir.mkdirs();
		        }
		       
		        fileSavePath=path+"file";
		        System.out.println(path);
		        System.out.println(fileSavePath);
		        File uploadPath=new File(fileSavePath,fileName);		        
		        file.transferTo(uploadPath);
		        
			}catch (Exception e) {
				// TODO: handle exception
			}
			String realFilePath=fileSavePath+File.separator+fileName;
			realFilePath=realFilePath.replace("\\", "/");
			return Msg.success().add("path", realFilePath);
		}else{
			return Msg.fail();
		}		
	}
	
	/**
	 * �ļ�����
	 * @throws IOException 
	 * @author chen
	 */
	@RequestMapping("/download")
	@ResponseBody
	public ResponseEntity<byte[]> downloadFile(@RequestParam(value="filepath") String filepath,HttpServletRequest request,HttpServletResponse response) throws IOException{
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
		//��ȡ��ǰ��Ŀ�ڷ�����������·��
		String path = request.getServletContext().getRealPath("/");
		String downloadPath="D:/Ա����ѵ������Ϣϵͳ/�����ļ��������";
		//�����ļ�·��
		String downloadpath=request.getServletContext().getRealPath(downloadPath);
		//��ȡ�ļ���
		String[] filenames=filepath.split("/");
		String filename=filenames[filenames.length-1];
		System.out.println("���ص��ļ���"+filename);
		File file=new File(filepath);
		HttpHeaders headers=new HttpHeaders();
		//������ʾ���ļ���
		String downloadFileName=new String(filename.getBytes("UTF-8"),"iso-8859-1");
		//֪ͨ��������ļ��ķ�ʽ
		headers.setContentDispositionFormData("attachment", downloadFileName);
		//������������
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);
	}
	
	/**
	 * �ļ�����
	 * @throws IOException 
	 * @author cheng
	 */
	@RequestMapping("/downloadType")
	@ResponseBody
	public ResponseEntity<byte[]> downloadType(@RequestParam(value="filepath") String filepath,HttpServletRequest request,HttpServletResponse response) throws IOException{
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
		//��ȡ��ǰ��Ŀ�ڷ�����������·��
		String path = request.getServletContext().getRealPath("/");
		String downloadPath="D:/Ա����ѵ������Ϣϵͳ/�����ļ��������";
		//�����ļ�·��
		String downloadpath=request.getServletContext().getRealPath(downloadPath);
		//��ȡ�ļ���
		String[] filenames=filepath.split("/");
		String filename=filenames[filenames.length-1];
		System.out.println("���ص��ļ���"+filename);
		filepath = path+filepath;
		File file=new File(filepath);
		HttpHeaders headers=new HttpHeaders();
		//������ʾ���ļ���
		String downloadFileName=new String(filename.getBytes("UTF-8"),"iso-8859-1");
		//֪ͨ��������ļ��ķ�ʽ
		headers.setContentDispositionFormData("attachment", downloadFileName);
		//������������
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);
	}
}
