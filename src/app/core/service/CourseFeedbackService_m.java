package app.core.service;

import java.util.List;

import app.core.po.CourseFeedback;

public interface CourseFeedbackService_m {
	/**
	 * 根据条件查询所有的反馈表记录(员工账户)
	 * @author chen
	 * @return
	 */
	public abstract List<CourseFeedback> getAllCourseFeedbackWithExample(CourseFeedback courseFeedback);
	
	/**
	 * 根据课程反馈表的员工账号和课程编号查询对应的记录列表显示在个人对于课程的记录表中,
	 * 每一条记录对应一个选项
	 * @author chen
	 * @param id
	 * @return
	 */
	public abstract List<CourseFeedback> findCourseFeedbackByExample(CourseFeedback courseFeedback);
	
	/**
	 * 添加反馈信息记录,批量插入每一道选项相关信息
	 * @author chen
	 * @param courseFeedback
	 */
	public abstract void addBatchCourseFeedback(List<CourseFeedback> courseFeedback);
}
