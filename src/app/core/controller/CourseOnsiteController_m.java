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
	 * 批量/单个插入线下学员学分
	 * @author chen
	 * @param courseOnsite
	 * 参数 @RequestBody CourseOnsite courseOnsite,
	 * @return
	 */
	@RequestMapping(value="/addBatchCourseOnsiteCredit")
	@ResponseBody
	public JSONPObject addBatchCourseOnsiteCredit(CourseOnsite courseOnsite,String callback,HttpServletResponse response){//将需要插入的学员账号用#隔开存入记录表中的一个字段中，当做一个字符串传入后进行处理		
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
		        
		//测试
//		CourseOnsite courseOnsite=new CourseOnsite();
//		courseOnsite.setId(5);
//		courseOnsite.setPxkc("测试");
//		courseOnsite.setPxdd("测试");
//		courseOnsite.setPxfs("线下");
//		courseOnsite.setSkls("陈思明");
//		courseOnsite.setSkxf(5.0);
//		courseOnsite.setCjrs(10.0);
//		courseOnsite.setPxnr("测试");
//		courseOnsite.setPxjlr("黄金明");
//		courseOnsite.setPxsj(new Date());
//		courseOnsite.setPxzzbm("1102");
//		courseOnsite.setBxzd1("0");
//		courseOnsite.setBxzd2("bbbug#无心#程默#黄金明");
		
		//将线下学分记录表保存至数据库
		courseOnsiteService.addCourseOnsite(courseOnsite);
		//获取所有参加学员的账号
		String xyzhs=courseOnsite.getBxzd2();
		//线下培训学分表
		List<CourseOnsiteCredit> courseOnsiteCreditList=new ArrayList<CourseOnsiteCredit>();
		if(xyzhs.contains("#")){//批量插入中有#
			String[] insert_xyzhs=xyzhs.split("#");//获取需要插入的学员账号数组
			for(String xyzh:insert_xyzhs){
				CourseOnsiteCredit courseOnsiteCredit=new CourseOnsiteCredit();
				courseOnsiteCredit.setXxpxid(courseOnsite.getId());
				courseOnsiteCredit.setXyzh(xyzh);
				/**
				 * 根据学员账号查询学员所在的对应部门
				 * @author chen
				 * 修改时间:2019.7.16
				 */
				Employee e=new Employee();
				e=employeeService.findEmployeeWithYgzh(xyzh);
				courseOnsiteCredit.setBxzd1(e.getYgdwbh());
				/**
				 * 修改结束
				 */

				courseOnsiteCredit.setXxkcmc(courseOnsite.getPxkc());
				courseOnsiteCredit.setXxkcxf(courseOnsite.getSkxf());				
				courseOnsiteCredit.setXxskls(courseOnsite.getSkls());
				courseOnsiteCreditList.add(courseOnsiteCredit);
			}
			//将线下学员的学分信息插入到学分表
			courseOnsiteCreditService.addBatchCourseOnsiteCredit(courseOnsiteCreditList);
		}else{//单个学员插入
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
		 * 将学员账号分组查询，计算每个员工的线下总学分
		 * @author chen
		 * @return
		 * 修改时间:2019.7.11
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
	 * 根据线下培训记录表的id进行单个查询对应的记录信息
	 * @author chen
	 */
	@RequestMapping("/findCourseOnsite")
	@ResponseBody
	public Msg findCourseOnsite(@RequestParam("id") Integer id,HttpServletResponse response){
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
        
		CourseOnsite courseOnsite=new CourseOnsite();
		courseOnsite=courseOnsiteService.findCourseOnsite(id);
		return Msg.success().add("findCourseOnsite", courseOnsite);
	}
	
	/**
	 * 根据时间查询培训记录,查询结果是小于等于选择时间的日期
	 * @author chen
	 */
	/**
	 * 通过培训组织部门进行筛选
	 * @author chen
	 * 修改时间:2019.7.11
	 * 7.11晚上22.06未更新部分
	 */
	@RequestMapping("/getCourseOnsiteWithExample")
	@ResponseBody
	public JSONPObject getCourseOnsiteWithExample(String callback,HttpServletResponse response,CourseOnsite courseOnsite){
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
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
	 * 根据主键修改培训记录信息
	 * @author chen
	 */
	@RequestMapping("/updateCourseOnsite")
	@ResponseBody
	public Msg updateCourseOnsite(@RequestBody CourseOnsite courseOnsite,HttpServletResponse response){
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
        
		//CourseOnsite courseOnsite=new CourseOnsite();
		//courseOnsite.setPxdd(pxdd);
		courseOnsiteService.updateCourseOnsite(courseOnsite);
		//System.out.println(courseOnsite.getPxdd());
		return Msg.success();
	}
	
	/**
	 * 查询培训记录总表
	 * @author chen
	 */
	@RequestMapping("/courseOnsiteList")
	@ResponseBody
	public Msg getAllCourseOnsite(HttpServletResponse response){
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
		List<CourseOnsite> courseOnsiteList=new ArrayList<CourseOnsite>();
		courseOnsiteList=courseOnsiteService.getAllCourseOnsite();
		return Msg.success().add("courseOnsiteList", courseOnsiteList);
	}
	
	/**
	 * 删除一条线下屏蔽记录，将显示状态由0改成1
	 * @author chen
	 */
	@RequestMapping(value="/delCourseOnsite",method=RequestMethod.POST)
	@ResponseBody
	public Msg delCourseOnsite(@RequestBody CourseOnsite courseOnsite,HttpServletResponse response){
		//测试
		//CourseOnsite courseOnsite=new CourseOnsite();
		//courseOnsite.setPxkc("礼仪培训");
		//测试
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
		
		courseOnsiteService.delCourseOnsite(courseOnsite);
		return Msg.success();
	}
	
	/**
	 * 文件上传,返回保存的线下培训资源路径
	 * @author chen
	 */
	@RequestMapping("/upload/do")
	@ResponseBody
	public Msg doUploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request, 
			String basePath,HttpServletResponse response){
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
        
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
	 * 文件下载
	 * @throws IOException 
	 * @author chen
	 */
	@RequestMapping("/download")
	@ResponseBody
	public ResponseEntity<byte[]> downloadFile(@RequestParam(value="filepath") String filepath,HttpServletRequest request,HttpServletResponse response) throws IOException{
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
		//获取当前项目在服务器的虚拟路径
		String path = request.getServletContext().getRealPath("/");
		String downloadPath="D:/员工培训管理信息系统/下载文件保存测试";
		//下载文件路径
		String downloadpath=request.getServletContext().getRealPath(downloadPath);
		//获取文件名
		String[] filenames=filepath.split("/");
		String filename=filenames[filenames.length-1];
		System.out.println("下载的文件名"+filename);
		File file=new File(filepath);
		HttpHeaders headers=new HttpHeaders();
		//下载显示的文件名
		String downloadFileName=new String(filename.getBytes("UTF-8"),"iso-8859-1");
		//通知浏览器打开文件的方式
		headers.setContentDispositionFormData("attachment", downloadFileName);
		//二进制流数据
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);
	}
	
	/**
	 * 文件下载
	 * @throws IOException 
	 * @author cheng
	 */
	@RequestMapping("/downloadType")
	@ResponseBody
	public ResponseEntity<byte[]> downloadType(@RequestParam(value="filepath") String filepath,HttpServletRequest request,HttpServletResponse response) throws IOException{
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
		//获取当前项目在服务器的虚拟路径
		String path = request.getServletContext().getRealPath("/");
		String downloadPath="D:/员工培训管理信息系统/下载文件保存测试";
		//下载文件路径
		String downloadpath=request.getServletContext().getRealPath(downloadPath);
		//获取文件名
		String[] filenames=filepath.split("/");
		String filename=filenames[filenames.length-1];
		System.out.println("下载的文件名"+filename);
		filepath = path+filepath;
		File file=new File(filepath);
		HttpHeaders headers=new HttpHeaders();
		//下载显示的文件名
		String downloadFileName=new String(filename.getBytes("UTF-8"),"iso-8859-1");
		//通知浏览器打开文件的方式
		headers.setContentDispositionFormData("attachment", downloadFileName);
		//二进制流数据
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);
	}
}
