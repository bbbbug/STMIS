package app.core.service;

import java.util.List;

import app.core.po.CourseFeedbackAll;
import app.core.po.Feedback;

public interface CourseFeedbackAllService_m {
	/**
	 * 查询所有的课程反馈表记录，并且封装到处理后的反馈对象中
	 * @author chen
	 * @return
	 */
	public abstract List<Feedback> getAllFeedback();
	
	/**
	 * 根据课程编号查询对应的选择该门课程的所有员工，并且返回记录结果集
	 * @author chen
	 * @param kcbh
	 * @return
	 */
	public abstract List<CourseFeedbackAll> getAllFeedBackWithKCBH(String kcbh);
	
	/**
	 * 添加一条记录用户对每一个课程的分数记录
	 * @author chen
	 * @return
	 */
	public abstract void addCourseFeedbackAll(CourseFeedbackAll courseFeedbackAll);
	
	public CourseFeedbackAll selectfbcak(CourseFeedbackAll courseFeedbackAll);
}
