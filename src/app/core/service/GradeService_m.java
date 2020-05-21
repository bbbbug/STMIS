package app.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import app.core.mapper.GradeMapper;
import app.core.po.CourseOnsiteCreditAggregation;
import app.core.po.Grade;

public interface GradeService_m {
	
	/**
	 * ��ʼ��Ա���ɼ�������
	 * @author chen
	 * @param grade
	 * �޸�ʱ��:2019.7.11
	 */
	public abstract void initGrade(Grade grade);
	
	/**
	 * ������Ա����ѵ��ѧ�ָ�����grade���ж�Ӧ��Ա���˻�Bxzd3�У����ݻز�
	 * @author chen
	 * @param grade
	 * �޸�ʱ��:2019.7.11
	 */
	public abstract void updateBatchGradeWithEmp(List<CourseOnsiteCreditAggregation> list);
}
