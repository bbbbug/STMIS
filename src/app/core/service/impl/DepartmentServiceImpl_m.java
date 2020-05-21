package app.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.DepartmentMapper;
import app.core.po.Department;
import app.core.po.DepartmentExample;
import app.core.po.DepartmentExample.Criteria;
import app.core.service.DepartmentService_m;

@Service
public class DepartmentServiceImpl_m implements DepartmentService_m {
	
	@Autowired
	public DepartmentMapper departmentMapper;

	@Override
	public List<Department> getAllDepartment() {
//		List<Department> departmentList=new ArrayList<Department>();
//		DepartmentExample example=new DepartmentExample();
//		Criteria criteria=example.createCriteria();
//		criteria.andBxzd2EqualTo("0");//构造查询条件
//		departmentList=departmentMapper.selectByExample(example);
		return departmentMapper.selectByExample(null);
	}

	@Override
	public Department findDepartment(String bmbh) {		
		return departmentMapper.selectByPrimaryKey(bmbh);
	}

	@Override
	public void addDepartment(Department department) {
		departmentMapper.insertSelective(department);
	}

	@Override
	public void updateDepartment(Department department) {
		departmentMapper.updateByPrimaryKeySelective(department);
	}

	@Override
	public void delDepartment(String bmbh) {
		//departmentMapper.deleteByPrimaryKey(bmbh);
		departmentMapper.delDepartment(bmbh);
	}
	
}
