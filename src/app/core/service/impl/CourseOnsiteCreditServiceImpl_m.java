package app.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.CourseOnsiteCreditMapper;
import app.core.po.CourseOnsite;
import app.core.po.CourseOnsiteCredit;
import app.core.po.CourseOnsiteCreditAggregation;
import app.core.po.CourseOnsiteCreditExample;
import app.core.po.CourseOnsiteExample;
import app.core.po.CourseOnsiteCreditExample.Criteria;
import app.core.service.CourseOnsiteCreditService_m;

@Service
public class CourseOnsiteCreditServiceImpl_m implements CourseOnsiteCreditService_m{

	@Autowired
	public CourseOnsiteCreditMapper courseOnsiteCreditMapper;

	@Override
	public void addBatchCourseOnsiteCredit(List<CourseOnsiteCredit> courseOnsiteCredits) {
		courseOnsiteCreditMapper.addBatchCourseOnsiteCredit(courseOnsiteCredits);
	}

	@Override
	public void addCourseOnsiteCredit(CourseOnsiteCredit courseOnsiteCredit) {
		courseOnsiteCreditMapper.insertSelective(courseOnsiteCredit);
	}

	@Override
	public List<CourseOnsiteCredit> findCourseOnsiteCredit(Integer id) {
		List<CourseOnsiteCredit> courseOnsiteCreditList=new ArrayList<CourseOnsiteCredit>();
		CourseOnsiteCreditExample example=new CourseOnsiteCreditExample();
		Criteria criteria=example.createCriteria();
		criteria.andXxpxidEqualTo(id);
		return courseOnsiteCreditMapper.selectByExample(example);	
	}

	/**
	 * 将学员账号分组查询，计算每个员工的线下总学分
	 * @author chen
	 * @return
	 * 修改时间:2019.7.11
	 */
	@Override
	public List<CourseOnsiteCreditAggregation> selectCourseOnsiteCreditWithEmp() {
		return courseOnsiteCreditMapper.selectCourseOnsiteCreditWithEmp();
	}
	
}
