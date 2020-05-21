package app.core.mapper;

import app.core.po.Unitinfo;
import app.core.po.UnitinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitinfoMapper {
    int countByExample(UnitinfoExample example);

    int deleteByExample(UnitinfoExample example);

    int deleteByPrimaryKey(String dwbh);

    int insert(Unitinfo record);

    int insertSelective(Unitinfo record);

    List<Unitinfo> selectByExample(UnitinfoExample example);

    Unitinfo selectByPrimaryKey(String dwbh);

    int updateByExampleSelective(@Param("record") Unitinfo record, @Param("example") UnitinfoExample example);

    int updateByExample(@Param("record") Unitinfo record, @Param("example") UnitinfoExample example);

    int updateByPrimaryKeySelective(Unitinfo record);

    int updateByPrimaryKey(Unitinfo record);
}