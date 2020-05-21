package app.core.mapper;

import app.core.po.Totalgrades;
import app.core.po.TotalgradesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TotalgradesMapper {
    int countByExample(TotalgradesExample example);

    int deleteByExample(TotalgradesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Totalgrades record);

    int insertSelective(Totalgrades record);

    List<Totalgrades> selectByExample(TotalgradesExample example);

    Totalgrades selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Totalgrades record, @Param("example") TotalgradesExample example);

    int updateByExample(@Param("record") Totalgrades record, @Param("example") TotalgradesExample example);

    int updateByPrimaryKeySelective(Totalgrades record);

    int updateByPrimaryKey(Totalgrades record);
}