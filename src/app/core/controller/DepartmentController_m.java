package app.core.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.util.JSONPObject;

import app.core.po.Department;
import app.core.po.Msg;
import app.core.service.DepartmentService_m;

@Controller
@RequestMapping("/department")
public class DepartmentController_m {
	
	@Autowired
	public DepartmentService_m departmentService;
	
	@RequestMapping("/departments")
	@ResponseBody
	public List<Department> getDepartments(){
		List<Department> departmentList=new ArrayList<Department>();
        departmentList=departmentService.getAllDepartment();
        return departmentList;
	}
	
	/**
	 * ��ѯ���еĲ����б�
	 * @author chen
	 * @param response
	 * @return
	 */
	@RequestMapping("/departmentList")
	@ResponseBody
	public Msg getAllDepartment(HttpServletResponse response){
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
        
        List<Department> departmentList=new ArrayList<Department>();
        departmentList=departmentService.getAllDepartment();
		return Msg.success().add("departmentList", departmentList);
	}
	
	/**
	 * ���ݲ��ű�Ų�ѯ��Ӧ���ŵ���ϸ��Ϣ
	 * @author chen
	 * @param response
	 * @param bmbh
	 * @return
	 */
	@RequestMapping("/findDepartment")
	@ResponseBody
	public Msg findDepartment(HttpServletResponse response,@RequestParam("bmbh") String bmbh){
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");		
        
        Department department=new Department();
        department=departmentService.findDepartment(bmbh);
        
		return Msg.success().add("department", department);
	}
	
	/**
	 * ���һ���µĲ���
	 * @author chen
	 * @param response
	 * @param department
	 * @return
	 */
	@RequestMapping("/addDepartment")
	@ResponseBody
	public JSONPObject addDepartment(HttpServletResponse response,Department department,String callback){
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");		
        
		departmentService.addDepartment(department);
		
		JSONPObject jsonpObject=new JSONPObject(callback,Msg.success());
		return jsonpObject;
//		return Msg.success();
	}
	
	/**
	 * ���²�����Ϣ
	 * @author chen
	 * @param response
	 * @param department
	 * @return
	 */
	@RequestMapping("/updateDepartment")
	@ResponseBody
	public JSONPObject updateDepartment(HttpServletResponse response,Department department,String callback){
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
		
		departmentService.updateDepartment(department);
		JSONPObject jsonpObject=new JSONPObject(callback,Msg.success());
		return jsonpObject;
//		return Msg.success();
	}

	/**
	 * ɾ��������Ϣ
	 * @author chen
	 * @param response
	 * @param bmbh
	 * @return
	 */
	@RequestMapping("/deleteDepartment")
	@ResponseBody
	public Msg deleteDepartment(HttpServletResponse response,@RequestParam("bmbh") String bmbh){
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
		
		departmentService.delDepartment(bmbh);
		return Msg.success();
	}
	
}
