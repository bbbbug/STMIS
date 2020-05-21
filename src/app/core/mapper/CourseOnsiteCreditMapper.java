package app.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import app.core.po.CourseOnsiteCredit;
import app.core.po.CourseOnsiteCreditAggregation;
import app.core.po.CourseOnsiteCreditExample;

public interface CourseOnsiteCreditMapper {
	//�Զ���
	//������������Ա��ѧ��
	public void addBatchCourseOnsiteCredit(List<CourseOnsiteCredit> courseOnsiteCredits);
	
	/**
	 * ��ѧԱ�˺ŷ����ѯ������ÿ��Ա����������ѧ��
	 * @author chen
	 * @return
	 * �޸�ʱ��:2019.7.11
	 */
	public List<CourseOnsiteCreditAggregation> selectCourseOnsiteCreditWithEmp();
	
	
	//�Զ�����
    int countByExample(CourseOnsiteCreditExample example);

    int deleteByExample(CourseOnsiteCreditExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseOnsiteCredit record);

    int insertSelective(CourseOnsiteCredit record);

    List<CourseOnsiteCredit> selectByExample(CourseOnsiteCreditExample example);

    CourseOnsiteCredit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseOnsiteCredit record, @Param("example") CourseOnsiteCreditExample example);

    int updateByExample(@Param("record") CourseOnsiteCredit record, @Param("example") CourseOnsiteCreditExample example);

    int updateByPrimaryKeySelective(CourseOnsiteCredit record);

    int updateByPrimaryKey(CourseOnsiteCredit record);
}