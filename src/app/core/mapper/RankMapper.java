package app.core.mapper;

import app.core.po.Rank;
import app.core.po.RankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RankMapper {
    int countByExample(RankExample example);

    int deleteByExample(RankExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Rank record);

    int insertSelective(Rank record);

    List<Rank> selectByExample(RankExample example);

    Rank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Rank record, @Param("example") RankExample example);

    int updateByExample(@Param("record") Rank record, @Param("example") RankExample example);

    int updateByPrimaryKeySelective(Rank record);

    int updateByPrimaryKey(Rank record);
}