package app.core.service;

import java.util.List;

import app.core.po.Employee;

public interface EmployeeService_m {
	public abstract List<Employee> getAllEmployee();
	public abstract Employee findEmployee(Integer id,String ygzh);
	public abstract void saveEmployeeChange(Employee employee);
	public abstract void saveEmployeeCreditChange(Employee employee);
	public abstract List<Employee> getEmployeeByCondition(Employee employee);
	public abstract List<Employee> sortEmployeeListByCondition(String condition);
	public abstract void removeEmployee(Employee employee);
	public abstract void addEmployee(Employee employee);
	public abstract Employee queryRepeatEmployee(Employee employee);
	public abstract void engageEmployee(Employee employee);
	
	/**
	 * 根据员工单位编号查询对应单位的员工信息
	 * 2019.6.27
	 * @return
	 */
	public abstract List<Employee> getEmployeeWithDept(Employee employee);
	
	/**
	 * 根据员工账号查找对应的员工信息
	 * @param ygzh
	 * @return
	 * 修改时间:2019.7.16
	 */
	public abstract Employee findEmployeeWithYgzh(String ygzh);

}
