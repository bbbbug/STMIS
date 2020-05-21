package app.core.service;

import java.util.List;

import app.core.po.CourseFeedbackAll;
import app.core.po.Feedback;

public interface CourseFeedbackAllService_m {
	/**
	 * ��ѯ���еĿγ̷������¼�����ҷ�װ�������ķ���������
	 * @author chen
	 * @return
	 */
	public abstract List<Feedback> getAllFeedback();
	
	/**
	 * ���ݿγ̱�Ų�ѯ��Ӧ��ѡ����ſγ̵�����Ա�������ҷ��ؼ�¼�����
	 * @author chen
	 * @param kcbh
	 * @return
	 */
	public abstract List<CourseFeedbackAll> getAllFeedBackWithKCBH(String kcbh);
	
	/**
	 * ���һ����¼�û���ÿһ���γ̵ķ�����¼
	 * @author chen
	 * @return
	 */
	public abstract void addCourseFeedbackAll(CourseFeedbackAll courseFeedbackAll);
	
	public CourseFeedbackAll selectfbcak(CourseFeedbackAll courseFeedbackAll);
}
