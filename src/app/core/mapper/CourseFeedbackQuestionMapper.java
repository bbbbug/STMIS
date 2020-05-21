package app.core.mapper;

import app.core.po.CourseFeedbackQuestion;
import app.core.po.CourseFeedbackQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseFeedbackQuestionMapper {
	//�Զ���
	//�������뷴����Ŀ�����ݿ�
	public void addCourseFeedbackQuestion(List<CourseFeedbackQuestion> courseFeedbackQuestions);
	//�������·�����Ŀ�����ݿ�
	public void updateCourseFeedbackQuestion(List<CourseFeedbackQuestion> courseFeedbackQuestions);
	
	//�Զ�����
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