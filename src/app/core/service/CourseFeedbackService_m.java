package app.core.service;

import java.util.List;

import app.core.po.CourseFeedback;

public interface CourseFeedbackService_m {
	/**
	 * ����������ѯ���еķ������¼(Ա���˻�)
	 * @author chen
	 * @return
	 */
	public abstract List<CourseFeedback> getAllCourseFeedbackWithExample(CourseFeedback courseFeedback);
	
	/**
	 * ���ݿγ̷������Ա���˺źͿγ̱�Ų�ѯ��Ӧ�ļ�¼�б���ʾ�ڸ��˶��ڿγ̵ļ�¼����,
	 * ÿһ����¼��Ӧһ��ѡ��
	 * @author chen
	 * @param id
	 * @return
	 */
	public abstract List<CourseFeedback> findCourseFeedbackByExample(CourseFeedback courseFeedback);
	
	/**
	 * ��ӷ�����Ϣ��¼,��������ÿһ��ѡ�������Ϣ
	 * @author chen
	 * @param courseFeedback
	 */
	public abstract void addBatchCourseFeedback(List<CourseFeedback> courseFeedback);
}
