package app.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.GradeMapper;
import app.core.po.CourseOnsiteCreditAggregation;
import app.core.po.Grade;
import app.core.service.GradeService_m;
@Service
public class GradeServiceImpl_m implements GradeService_m {

	@Autowired
	public GradeMapper gradeMapper;
	
	
	/**
	 * ��ʼ��Ա���ɼ�������
	 * @author chen
	 * @param grade
	 * �޸�ʱ��:2019.7.11
	 */
	@Override
	public void initGrade(Grade grade) {		
		gradeMapper.insertSelective(grade);
	}


	/**
	 * ������Ա����ѵ��ѧ�ָ�����grade���ж�Ӧ��Ա���˻�Bxzd3�У����������ز�
	 * @author chen
	 * @param grade
	 * �޸�ʱ��:2019.7.11
	 */
	@Override
	public void updateBatchGradeWithEmp(List<CourseOnsiteCreditAggregation> list) {
		gradeMapper.updateBatchGradeWithEmp(list);
	}

	
}
