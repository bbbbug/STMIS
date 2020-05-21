package app.core.mapper;

import app.core.po.Employee;
import app.core.po.EmployeeExample;
import app.core.po.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
	
	/**
	 * 管理员
	 * @return
	 */
	//获取所有的员工列表
	public List<Employee> getAllEmployee();
	//根据id和员工账号找到对应的员工
	public Employee findEmployee(@Param("id") Integer id,@Param("ygzh") String ygzh);
	//根据id修改员工信息
	public void saveEmployeeChange(Employee employee);
	//根据id修改员工学分信息
	public void saveEmployeeCreditChange(Employee employee);
	//根据员工匹配的条件返回员工信息
	public List<Employee> getEmployeeByCondition(Employee employee);
	//根据条件进行员工列表的排序
	public List<Employee> sortEmployeeListByCondition(@Param("condition") String condition);
	//解锁员工账户
	public void engageEmployee(Employee employee);
	//根据员工账户和id注销员工用户
	public void removeEmployee(Employee employee);
	//新增员工
	public void addEmployee(Employee employee);
	//根据员工账户判断是否有重复用户
	public Employee queryRepeatEmployee(Employee employee);
	
	/**
	 * 根据员工单位编号查询对应单位的员工信息
	 * 2019.6.27
	 * @return
	 */
	public List<Employee> getEmployeeWithDept(Employee employee);

	//自动生成
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