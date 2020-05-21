package app.core.service;

import java.util.List;

import app.core.po.Course;
import app.core.po.CourseOnsite;

public interface CourseOnsiteService_m {
	/**
	 * ����µļ�¼
	 * @author chen 
	 * @param courseOnsite
	 */
	public abstract void addCourseOnsite(CourseOnsite courseOnsite);
	/**
	 * ����id�ҵ�������Ӧ������ѧ�ּ�¼
	 * @author chen
	 * @param id
	 */
	public abstract CourseOnsite findCourseOnsite(Integer id);
	/**
	 * ��ѯ���е�����ѧ�ּ�¼
	 * @author chen
	 * @return
	 */	
	public abstract List<CourseOnsite> getAllCourseOnsite();
	/**
	 * ��������ѧ�ּ�¼��
	 * @author chen
	 * @param courseOnsite
	 */
	public abstract void updateCourseOnsite(CourseOnsite courseOnsite);
	/**
	 * ɾ������ѧ�ּ�¼���޸ı�ѡ�ֶ�1 �ĳɲ���ʾ״̬
	 * @author chen
	 * @param courseOnsite
	 */
	public abstract void delCourseOnsite(CourseOnsite courseOnsite);
	/**
	 * ����������ȡ����ѧ�ּ�¼����(ʱ��)
	 * @author chen
	 * @param courseOnsite
	 * @return
	 */
	/**
	 * ͨ����ѵ��֯���Ž���ɸѡ
	 * 
	 * @author chen �޸�ʱ��:2019.7.11
	 */
	public abstract List<CourseOnsite> getCourseOnsiteWithExample(CourseOnsite courseOnsite);
}
