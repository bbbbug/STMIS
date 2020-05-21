package app.core.mapper;

import app.core.po.CourseStructure;
import app.core.po.CourseStructureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseStructureMapper {
    int countByExample(CourseStructureExample example);

    int deleteByExample(CourseStructureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseStructure record);

    int insertSelective(CourseStructure record);

    List<CourseStructure> selectByExample(CourseStructureExample example);

    CourseStructure selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseStructure record, @Param("example") CourseStructureExample example);

    int updateByExample(@Param("record") CourseStructure record, @Param("example") CourseStructureExample example);

    int updateByPrimaryKeySelective(CourseStructure record);

    int updateByPrimaryKey(CourseStructure record);
}