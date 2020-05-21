package app.core.mapper;

import app.core.po.CourseOnsite;
import app.core.po.CourseOnsiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseOnsiteMapper {
	//�Զ���
	//��ѯ����������ѵ��¼��
	public List<CourseOnsite> getAllCourseOnsite();
	//ɾ����ѵ��¼������ѡ�ֶ�1��0
	public void delCourseOnsite(CourseOnsite courseOnsite);
	
	//�Զ�����
    int countByExample(CourseOnsiteExample example);

    int deleteByExample(CourseOnsiteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseOnsite record);

    int insertSelective(CourseOnsite record);

    List<CourseOnsite> selectByExample(CourseOnsiteExample example);

    CourseOnsite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseOnsite record, @Param("example") CourseOnsiteExample example);

    int updateByExample(@Param("record") CourseOnsite record, @Param("example") CourseOnsiteExample example);

    int updateByPrimaryKeySelective(CourseOnsite record);

    int updateByPrimaryKey(CourseOnsite record);
}