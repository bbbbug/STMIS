package app.core.mapper;

import app.core.po.CompetitionQuestion;
import app.core.po.CompetitionQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompetitionQuestionMapper {
    int countByExample(CompetitionQuestionExample example);

    int deleteByExample(CompetitionQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompetitionQuestion record);

    int insertSelective(CompetitionQuestion record);

    List<CompetitionQuestion> selectByExample(CompetitionQuestionExample example);

    CompetitionQuestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompetitionQuestion record, @Param("example") CompetitionQuestionExample example);

    int updateByExample(@Param("record") CompetitionQuestion record, @Param("example") CompetitionQuestionExample example);

    int updateByPrimaryKeySelective(CompetitionQuestion record);

    int updateByPrimaryKey(CompetitionQuestion record);
}