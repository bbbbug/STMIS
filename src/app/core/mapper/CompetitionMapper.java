package app.core.mapper;

import app.core.po.Competition;
import app.core.po.CompetitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompetitionMapper {
    int countByExample(CompetitionExample example);

    int deleteByExample(CompetitionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Competition record);

    int insertSelective(Competition record);

    List<Competition> selectByExample(CompetitionExample example);

    Competition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Competition record, @Param("example") CompetitionExample example);

    int updateByExample(@Param("record") Competition record, @Param("example") CompetitionExample example);

    int updateByPrimaryKeySelective(Competition record);

    int updateByPrimaryKey(Competition record);
}