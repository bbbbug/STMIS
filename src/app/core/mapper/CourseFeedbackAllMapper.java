package app.core.mapper;

import app.core.po.CourseFeedbackAll;
import app.core.po.CourseFeedbackAllExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseFeedbackAllMapper {
    int countByExample(CourseFeedbackAllExample example);

    int deleteByExample(CourseFeedbackAllExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseFeedbackAll record);

    int insertSelective(CourseFeedbackAll record);

    List<CourseFeedbackAll> selectByExample(CourseFeedbackAllExample example);

    CourseFeedbackAll selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseFeedbackAll record, @Param("example") CourseFeedbackAllExample example);

    int updateByExample(@Param("record") CourseFeedbackAll record, @Param("example") CourseFeedbackAllExample example);

    int updateByPrimaryKeySelective(CourseFeedbackAll record);

    int updateByPrimaryKey(CourseFeedbackAll record);
    
    List<CourseFeedbackAll> selectFeedbacks(CourseFeedbackAll courseFeedbackAll);
    
    CourseFeedbackAll selectfback(CourseFeedbackAll courseFeedbackAll);
}