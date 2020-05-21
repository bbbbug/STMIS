package app.core.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.util.JSONPObject;

import app.core.po.Department;
import app.core.po.Employee;
import app.core.po.Grade;
import app.core.po.Msg;
import app.core.service.DepartmentService_m;
import app.core.service.EmployeeService_m;
import app.core.service.GradeService_m;

@Controller
@RequestMapping("/employee")
public class EmployeeController_m {
	
	@Autowired
	public EmployeeService_m employeeService;
	@Autowired
	public GradeService_m gradeService;
	@Autowired
	public DepartmentService_m departmentService;
	@RequestMapping("/employeeList")
	@ResponseBody
	public List<Employee> getAllEmployee(){
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList=employeeService.getAllEmployee();
		return employeeList;
	}
	
	@RequestMapping("/findEmployee")
	@ResponseBody
	public Employee findEmployee(Model model,@RequestParam("id") Integer id,@RequestParam("ygzh") String ygzh){
		Employee employee=new Employee();
		employee=employeeService.findEmployee(id, ygzh);
		return employee;
	}
	
	@RequestMapping("/saveEmployeeChange")
	@ResponseBody
	public HashMap<String ,String> saveEmployeeChange(Model model,@RequestBody Employee employee){
		HashMap<String,String> employeeSave=new HashMap<String,String>();
		employeeService.saveEmployeeChange(employee);
		employeeSave.put("employeeSave","success");
		return employeeSave;
	}
	
	@RequestMapping("/saveEmployeeCreditChange")
	@ResponseBody
	public HashMap<String,String> saveEmployeeCreditChange(Model model,@RequestBody Employee employee){
		HashMap<String,String> employeeCreditSave=new HashMap<String,String>();
		employeeService.saveEmployeeCreditChange(employee);
		employeeCreditSave.put("employeeCreditSave","success");
		return employeeCreditSave;
	}
	
	@RequestMapping("/getEmployeeByCondition")
	@ResponseBody
	public List<Employee> getEmployeeByCondition(Model model,@RequestBody Employee employee){
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList=employeeService.getEmployeeByCondition(employee);
		return employeeList;
	}
	
	@RequestMapping("/sortEmployeeListByCondition")
	@ResponseBody
	public List<Employee> sortEmployeeListByCondition(Model model,@RequestParam("sort") String condition){
		System.out.println(condition);
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList=employeeService.sortEmployeeListByCondition(condition);
		return employeeList;
	}
	
	@RequestMapping("/engageEmployee")
	@ResponseBody
	public HashMap<String,String> engageEmployee(Model model,@RequestBody Employee employee){
		HashMap<String,String> employeeEngage=new HashMap<String,String>();
		employeeService.engageEmployee(employee);
		employeeEngage.put("employeeEngage", "success");
		return employeeEngage;
	} 
	
	@RequestMapping("/removeEmployee")
	@ResponseBody
	public HashMap<String,String> removeEmployee(Model model,@RequestBody Employee employee){
		HashMap<String,String> employeeRemove=new HashMap<String,String>();
		employeeService.removeEmployee(employee);
		employeeRemove.put("employeeRemove", "success");
		return employeeRemove;
	}
	
	@RequestMapping("/addEmployee")
	@ResponseBody
	public HashMap<String,String> addEmployee(Model model,@RequestBody Employee employee){
		HashMap<String,String> employeeAdd=new HashMap<String,String>();
		employeeService.addEmployee(employee);
		employeeAdd.put("employeeAdd", "success");
		/**
		 * ���Ա���˻���ͬʱ��Grade���г�ʼ��һ����¼
		 * @author chen
		 * �޸�ʱ�䣺2019.7.11
		 */
		Grade grade=new Grade();
		Department department=new Department();
		grade.setYgzh(employee.getYgzh());
		grade.setYgzxf(new Double(0));
		grade.setYgbxxf(new Double(0));
		grade.setYgxxxf(new Double(0));
		grade.setBxzd1(employee.getYgdwbh());
		grade.setBxzd3("0");
		String bmbh=employee.getYgdwbh();
		//���ݲ��ű�Ż�ȡ���ŵĶ�Ӧ����Ϣ
		department=departmentService.findDepartment(bmbh);
		grade.setBxzd2(department.getBmmc());
		gradeService.initGrade(grade);
		return employeeAdd;
	}
	
	@RequestMapping("/queryRepeatEmployee")
	@ResponseBody
	public Employee queryRepeatEmployee(Model model,@RequestBody Employee employee){
		return employeeService.queryRepeatEmployee(employee);
	}
	
	/**
	 * ����Ա����λ��Ų�ѯԱ����Ϣ
	 * 
	 * @author chen
	 * @param model
	 * @param employee
	 * @serialData 2019.6.28
	 * @return
	 */
	@RequestMapping(value="/getEmployeeWithDept")
	@ResponseBody
	public JSONPObject getEmployeeWithDept(Employee employee,String callback,HttpServletResponse response){
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
        
        System.out.println(employee);
		List<Employee> employeeList=employeeService.getEmployeeWithDept(employee);		
		JSONPObject jsonpObject=new JSONPObject(callback,Msg.success().add("EmployeeWithDeptList", employeeList));
		/*return Msg.success().add("EmployeeWithDeptList", employeeList);*/
        return jsonpObject;
	}
}
