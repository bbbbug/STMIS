package app.core.service;

import java.util.List;

import app.core.po.CourseFeedbackQuestion;

public interface CourseFeedbackQuestionService_m {
	/**
	 * 导入Excel反馈表模板进行课程反馈表模板添加,批量导入所有题目
	 * @author chen
	 * @param courseFeedbackQuestion
	 */
	public abstract void addCourseFeedbackQuestion(List<CourseFeedbackQuestion> courseFeedbackQuestions);
	
	/**
	 * 查找所有的反馈信息题目形成反馈题目表
	 * @author chen
	 * @return
	 */
	public abstract List<CourseFeedbackQuestion> getAllCourseFeedbackQuestion();
	
	/**
	 * 根据主键批量更新数据库中的题目
	 * @author chen
	 * @param courseFeedbackQuestion
	 */
	public abstract void updateCourseFeedbackQuestion(List<CourseFeedbackQuestion> courseFeedbackQuestions);
}
