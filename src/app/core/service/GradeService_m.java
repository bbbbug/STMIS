package app.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import app.core.mapper.GradeMapper;
import app.core.po.CourseOnsiteCreditAggregation;
import app.core.po.Grade;

public interface GradeService_m {
	
	/**
	 * 初始化员工成绩总评表
	 * @author chen
	 * @param grade
	 * 修改时间:2019.7.11
	 */
	public abstract void initGrade(Grade grade);
	
	/**
	 * 将线下员工培训的学分更新至grade表中对应的员工账户Bxzd3中，数据回插
	 * @author chen
	 * @param grade
	 * 修改时间:2019.7.11
	 */
	public abstract void updateBatchGradeWithEmp(List<CourseOnsiteCreditAggregation> list);
}
