package app.core.service;

import java.util.List;

import app.core.po.CourseOnsiteCredit;
import app.core.po.CourseOnsiteCreditAggregation;


public interface CourseOnsiteCreditService_m {
	/**
	 * 批量插入线下学员学分
	 * @author chen
	 * @param courseOnsiteCredits
	 */
	public abstract void addBatchCourseOnsiteCredit(List<CourseOnsiteCredit> courseOnsiteCredits);
	
	/**
	 * 插入单个学员学分
	 * @author chen
	 * @param courseOnsiteCredit
	 */
	public abstract void addCourseOnsiteCredit(CourseOnsiteCredit courseOnsiteCredit);
	
	/**
	 * 根据培训记录id查询对应的参与人员
	 * @param id
	 * @return
	 */
	public abstract List<CourseOnsiteCredit> findCourseOnsiteCredit(Integer id);

	/**
	 * 将学员账号分组查询，计算每个员工的线下总学分
	 * @author chen
	 * @return
	 * 修改时间:2019.7.11
	 */
	public abstract List<CourseOnsiteCreditAggregation> selectCourseOnsiteCreditWithEmp();
}
