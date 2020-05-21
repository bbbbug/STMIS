package app.core.mapper;

import app.core.po.CourseFeedbackQuestion;
import app.core.po.CourseFeedbackQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseFeedbackQuestionMapper {
	//自定义
	//批量导入反馈题目到数据库
	public void addCourseFeedbackQuestion(List<CourseFeedbackQuestion> courseFeedbackQuestions);
	//批量更新反馈题目至数据库
	public void updateCourseFeedbackQuestion(List<CourseFeedbackQuestion> courseFeedbackQuestions);
	
	//自动生成
    int countByExample(CourseFeedbackQuestionExample example);

    int deleteByExample(CourseFeedbackQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseFeedbackQuestion record);

    int insertSelective(CourseFeedbackQuestion record);

    List<CourseFeedbackQuestion> selectByExample(CourseFeedbackQuestionExample example);

    CourseFeedbackQuestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseFeedbackQuestion record, @Param("example") CourseFeedbackQuestionExample example);

    int updateByExample(@Param("record") CourseFeedbackQuestion record, @Param("example") CourseFeedbackQuestionExample example);

    int updateByPrimaryKeySelective(CourseFeedbackQuestion record);

    int updateByPrimaryKey(CourseFeedbackQuestion record);
}