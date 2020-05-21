package app.core.service;

import java.util.List;

import app.core.po.CourseOnsiteCredit;
import app.core.po.CourseOnsiteCreditAggregation;


public interface CourseOnsiteCreditService_m {
	/**
	 * ������������ѧԱѧ��
	 * @author chen
	 * @param courseOnsiteCredits
	 */
	public abstract void addBatchCourseOnsiteCredit(List<CourseOnsiteCredit> courseOnsiteCredits);
	
	/**
	 * ���뵥��ѧԱѧ��
	 * @author chen
	 * @param courseOnsiteCredit
	 */
	public abstract void addCourseOnsiteCredit(CourseOnsiteCredit courseOnsiteCredit);
	
	/**
	 * ������ѵ��¼id��ѯ��Ӧ�Ĳ�����Ա
	 * @param id
	 * @return
	 */
	public abstract List<CourseOnsiteCredit> findCourseOnsiteCredit(Integer id);

	/**
	 * ��ѧԱ�˺ŷ����ѯ������ÿ��Ա����������ѧ��
	 * @author chen
	 * @return
	 * �޸�ʱ��:2019.7.11
	 */
	public abstract List<CourseOnsiteCreditAggregation> selectCourseOnsiteCreditWithEmp();
}
