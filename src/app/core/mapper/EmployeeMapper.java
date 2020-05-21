package app.core.mapper;

import app.core.po.Employee;
import app.core.po.EmployeeExample;
import app.core.po.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
	
	/**
	 * ����Ա
	 * @return
	 */
	//��ȡ���е�Ա���б�
	public List<Employee> getAllEmployee();
	//����id��Ա���˺��ҵ���Ӧ��Ա��
	public Employee findEmployee(@Param("id") Integer id,@Param("ygzh") String ygzh);
	//����id�޸�Ա����Ϣ
	public void saveEmployeeChange(Employee employee);
	//����id�޸�Ա��ѧ����Ϣ
	public void saveEmployeeCreditChange(Employee employee);
	//����Ա��ƥ�����������Ա����Ϣ
	public List<Employee> getEmployeeByCondition(Employee employee);
	//������������Ա���б������
	public List<Employee> sortEmployeeListByCondition(@Param("condition") String condition);
	//����Ա���˻�
	public void engageEmployee(Employee employee);
	//����Ա���˻���idע��Ա���û�
	public void removeEmployee(Employee employee);
	//����Ա��
	public void addEmployee(Employee employee);
	//����Ա���˻��ж��Ƿ����ظ��û�
	public Employee queryRepeatEmployee(Employee employee);
	
	/**
	 * ����Ա����λ��Ų�ѯ��Ӧ��λ��Ա����Ϣ
	 * 2019.6.27
	 * @return
	 */
	public List<Employee> getEmployeeWithDept(Employee employee);

	//�Զ�����
    int countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(String ygzh);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(String ygzh);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
    
    Employee selectUser(Employee employee);
    
    int emCount();
    List<Employee> selectEmployeeByDepartment(Employee employee);
    /**
	 * cm 8.29
	 * @return
	 */
	public Employee findEm(String ygzh);
    public int saveEmChange(Employee employee);
}