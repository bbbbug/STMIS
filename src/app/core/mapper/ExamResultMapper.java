package app.core.mapper;

import app.core.po.ExamResult;
import app.core.po.ExamResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamResultMapper {
    int countByExample(ExamResultExample example);

    int deleteByExample(ExamResultExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExamResult record);

    int insertSelective(ExamResult record);

    List<ExamResult> selectByExample(ExamResultExample example);

    ExamResult selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ExamResult record, @Param("example") ExamResultExample example);

    int updateByExample(@Param("record") ExamResult record, @Param("example") ExamResultExample example);

    int updateByPrimaryKeySelective(ExamResult record);

    int updateByPrimaryKey(ExamResult record);
}