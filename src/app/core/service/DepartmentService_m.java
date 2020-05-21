package app.core.service;

import java.util.List;

import app.core.po.Department;

public interface DepartmentService_m {
	/**
	 * ��ѯ���еĲ����б�
	 * @author chen
	 * @return
	 */
	public abstract List<Department> getAllDepartment();
	
	/**
	 * ����id��Ų��ҵ�������������Ϣ
	 * @author chen
	 * @param id
	 * @return
	 */
	public abstract Department findDepartment(String bmbh);
	
	/**
	 * ����²���
	 * @author chen
	 * @param department
	 */
	public abstract void addDepartment(Department department);
	
	/**
	 * ���²�����Ϣ
	 * @author chen
	 * @param department
	 */
	public abstract void updateDepartment(Department department);
	
	/**
	 * ɾ��������Ϣ,��bxzd2���1����ʾ
	 * @author chen
	 * @param bmbh
	 */
	public abstract void delDepartment(String bmbh);
}
