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
	 * 查询所有的部门列表
	 * @author chen
	 * @param response
	 * @return
	 */
	@RequestMapping("/departmentList")
	@ResponseBody
	public Msg getAllDepartment(HttpServletResponse response){
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
        
        List<Department> departmentList=new ArrayList<Department>();
        departmentList=departmentService.getAllDepartment();
		return Msg.success().add("departmentList", departmentList);
	}
	
	/**
	 * 根据部门编号查询对应部门的详细信息
	 * @author chen
	 * @param response
	 * @param bmbh
	 * @return
	 */
	@RequestMapping("/findDepartment")
	@ResponseBody
	public Msg findDepartment(HttpServletResponse response,@RequestParam("bmbh") String bmbh){
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");		
        
        Department department=new Department();
        department=departmentService.findDepartment(bmbh);
        
		return Msg.success().add("department", department);
	}
	
	/**
	 * 添加一条新的部门
	 * @author chen
	 * @param response
	 * @param department
	 * @return
	 */
	@RequestMapping("/addDepartment")
	@ResponseBody
	public JSONPObject addDepartment(HttpServletResponse response,Department department,String callback){
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");		
        
		departmentService.addDepartment(department);
		
		JSONPObject jsonpObject=new JSONPObject(callback,Msg.success());
		return jsonpObject;
//		return Msg.success();
	}
	
	/**
	 * 更新部门信息
	 * @author chen
	 * @param response
	 * @param department
	 * @return
	 */
	@RequestMapping("/updateDepartment")
	@ResponseBody
	public JSONPObject updateDepartment(HttpServletResponse response,Department department,String callback){
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
		
		departmentService.updateDepartment(department);
		JSONPObject jsonpObject=new JSONPObject(callback,Msg.success());
		return jsonpObject;
//		return Msg.success();
	}

	/**
	 * 删除部门信息
	 * @author chen
	 * @param response
	 * @param bmbh
	 * @return
	 */
	@RequestMapping("/deleteDepartment")
	@ResponseBody
	public Msg deleteDepartment(HttpServletResponse response,@RequestParam("bmbh") String bmbh){
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
		
		departmentService.delDepartment(bmbh);
		return Msg.success();
	}
	
}
