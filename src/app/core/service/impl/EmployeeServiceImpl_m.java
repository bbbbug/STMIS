package app.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.CourseResourceMapper;
import app.core.mapper.CourseSelectionMapper;
import app.core.mapper.CourseTypeMapper;
import app.core.mapper.EmployeeMapper;
import app.core.mapper.ProgressMapper;
import app.core.po.CourseResource;
import app.core.po.CourseSelection;
import app.core.po.CourseType;
import app.core.po.Employee;
import app.core.po.Progress;
import app.core.service.EmployeeService_m;

@Service
public class EmployeeServiceImpl_m implements EmployeeService_m {

	@Autowired
	public EmployeeMapper employeeMapper;
	@Autowired
	public CourseTypeMapper courseTypeMapper;
	@Autowired
	public CourseResourceMapper courseResourceMapper;
	@Autowired
	public ProgressMapper progressMapper ;
	@Autowired
	public CourseSelectionMapper courseSelectionMapper ;
	@Override
	public List<Employee> getAllEmployee() {		
		return employeeMapper.getAllEmployee();
	}

	@Override
	public Employee findEmployee(Integer id,String ygzh) {		
		return employeeMapper.findEmployee(id,ygzh);
	}

	@Override
	public void saveEmployeeChange(Employee employee) {
		employeeMapper.saveEmployeeChange(employee);
	}

	@Override
	public List<Employee> getEmployeeByCondition(Employee employee) {		
		return employeeMapper.getEmployeeByCondition(employee);
	}

	@Override
	public List<Employee> sortEmployeeListByCondition(String condition) {		
		return employeeMapper.sortEmployeeListByCondition(condition);
	}
	
	@Override
	public void engageEmployee(Employee employee) {
		employeeMapper.engageEmployee(employee);
	}
	
	@Override
	public void removeEmployee(Employee employee) {
		employeeMapper.removeEmployee(employee);
	}

	@Override
	public void saveEmployeeCreditChange(Employee employee) {
		employeeMapper.saveEmployeeCreditChange(employee);
	}

	/**
	 * 添加员工，增加必修课
	 * 7-9
	 */
	@Override
	public void addEmployee(Employee employee) {
		CourseType courseType =new CourseType();
		courseType.setBmid(Integer.parseInt(employee.getYgdwbh()));
		List<CourseType> courseTypes = courseTypeMapper.selectCTypes(courseType);
		System.out.println(employee);
		employeeMapper.addEmployee(employee);
		for (CourseType ct : courseTypes) {
				System.out.println("测试");
				List<CourseResource> course_resources = courseResourceMapper.selectByKCBH(ct.getKcbh());
					for (CourseResource cr : course_resources) {
						Progress progress=new Progress();
						progress.setKcbh(ct.getKcbh());
						progress.setYgzh(employee.getYgzh());
						progress.setZjxh(cr.getZjxh());
						progress.setKcjd(0);
						progressMapper.insert(progress);
					}
					CourseSelection courseSelection =new CourseSelection();
					courseSelection.setKcbh(ct.getKcbh());
					courseSelection.setYgzh(employee.getYgzh());
					courseSelection.setThreshold(0);
					CourseSelection cs = courseSelectionMapper.checkCourseSelection(courseSelection);
					if(cs == null){
						System.out.println(courseSelection.getKcbh());
						System.out.println(courseSelection.getYgzh());
						courseSelectionMapper.addCartCourse(courseSelection);
					}
		}
		
	}

	@Override
	public Employee queryRepeatEmployee(Employee employee) {		
		return employeeMapper.queryRepeatEmployee(employee);
	}

	/**
	 * 根据员工单位编号查询对应单位的员工信息
	 * 2019.6.27
	 * @author chen
	 * @return
	 */
	@Override
	public List<Employee> getEmployeeWithDept(Employee employee) {		
		return employeeMapper.getEmployeeWithDept(employee);
	}
	
	/**
	 * 根据员工账号查找对应的员工信息
	 * @param ygzh
	 * @return
	 * 修改时间:2019.7.16
	 */
	public Employee findEmployeeWithYgzh(String ygzh){
		return employeeMapper.selectByPrimaryKey(ygzh);
	}


}
