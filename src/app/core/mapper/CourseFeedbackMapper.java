package app.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import app.core.po.CourseFeedback;
import app.core.po.CourseFeedbackExample;

public interface CourseFeedbackMapper {
	//自定义
	public abstract void addBatchCourseFeedback(List<CourseFeedback> courseFeedbackList);
	
	//自动生成
    int countByExample(CourseFeedbackExample example);

    int deleteByExample(CourseFeedbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseFeedback record);

    int insertSelective(CourseFeedback record);

    List<CourseFeedback> selectByExample(CourseFeedbackExample example);

    CourseFeedback selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseFeedback record, @Param("example") CourseFeedbackExample example);

    int updateByExample(@Param("record") CourseFeedback record, @Param("example") CourseFeedbackExample example);

    int updateByPrimaryKeySelective(CourseFeedback record);

    int updateByPrimaryKey(CourseFeedback record);
}