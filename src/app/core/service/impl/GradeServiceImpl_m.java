package app.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.GradeMapper;
import app.core.po.CourseOnsiteCreditAggregation;
import app.core.po.Grade;
import app.core.service.GradeService_m;
@Service
public class GradeServiceImpl_m implements GradeService_m {

	@Autowired
	public GradeMapper gradeMapper;
	
	
	/**
	 * 初始化员工成绩总评表
	 * @author chen
	 * @param grade
	 * 修改时间:2019.7.11
	 */
	@Override
	public void initGrade(Grade grade) {		
		gradeMapper.insertSelective(grade);
	}


	/**
	 * 将线下员工培训的学分更新至grade表中对应的员工账户Bxzd3中，数据批量回插
	 * @author chen
	 * @param grade
	 * 修改时间:2019.7.11
	 */
	@Override
	public void updateBatchGradeWithEmp(List<CourseOnsiteCreditAggregation> list) {
		gradeMapper.updateBatchGradeWithEmp(list);
	}

	
}
