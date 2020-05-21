package app.core.service;

import java.util.List;

import app.core.po.Department;

public interface DepartmentService_m {
	/**
	 * 查询所有的部门列表
	 * @author chen
	 * @return
	 */
	public abstract List<Department> getAllDepartment();
	
	/**
	 * 根据id编号查找单个部门详情信息
	 * @author chen
	 * @param id
	 * @return
	 */
	public abstract Department findDepartment(String bmbh);
	
	/**
	 * 添加新部门
	 * @author chen
	 * @param department
	 */
	public abstract void addDepartment(Department department);
	
	/**
	 * 更新部门信息
	 * @author chen
	 * @param department
	 */
	public abstract void updateDepartment(Department department);
	
	/**
	 * 删除部门信息,将bxzd2变成1则不显示
	 * @author chen
	 * @param bmbh
	 */
	public abstract void delDepartment(String bmbh);
}
