package app.core.service;

import java.util.List;

import app.core.po.CourseFeedbackQuestion;

public interface CourseFeedbackQuestionService_m {
	/**
	 * ����Excel������ģ����пγ̷�����ģ�����,��������������Ŀ
	 * @author chen
	 * @param courseFeedbackQuestion
	 */
	public abstract void addCourseFeedbackQuestion(List<CourseFeedbackQuestion> courseFeedbackQuestions);
	
	/**
	 * �������еķ�����Ϣ��Ŀ�γɷ�����Ŀ��
	 * @author chen
	 * @return
	 */
	public abstract List<CourseFeedbackQuestion> getAllCourseFeedbackQuestion();
	
	/**
	 * �������������������ݿ��е���Ŀ
	 * @author chen
	 * @param courseFeedbackQuestion
	 */
	public abstract void updateCourseFeedbackQuestion(List<CourseFeedbackQuestion> courseFeedbackQuestions);
}
