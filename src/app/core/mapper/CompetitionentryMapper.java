package app.core.mapper;

import app.core.po.Competitionentry;
import app.core.po.CompetitionentryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompetitionentryMapper {
    int countByExample(CompetitionentryExample example);

    int deleteByExample(CompetitionentryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Competitionentry record);

    int insertSelective(Competitionentry record);

    List<Competitionentry> selectByExample(CompetitionentryExample example);

    Competitionentry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Competitionentry record, @Param("example") CompetitionentryExample example);

    int updateByExample(@Param("record") Competitionentry record, @Param("example") CompetitionentryExample example);

    int updateByPrimaryKeySelective(Competitionentry record);

    int updateByPrimaryKey(Competitionentry record);
}