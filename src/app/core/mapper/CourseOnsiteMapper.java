package app.core.mapper;

import app.core.po.CourseOnsite;
import app.core.po.CourseOnsiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseOnsiteMapper {
	//自定义
	//查询所有线下培训记录表
	public List<CourseOnsite> getAllCourseOnsite();
	//删除培训记录，将备选字段1置0
	public void delCourseOnsite(CourseOnsite courseOnsite);
	
	//自动生成
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