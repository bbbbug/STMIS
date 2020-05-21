package app.core.mapper;

import app.core.po.Progress;
import app.core.po.ProgressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProgressMapper {
    int countByExample(ProgressExample example);

    int deleteByExample(ProgressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Progress record);

    int insertSelective(Progress record);

    List<Progress> selectByExample(ProgressExample example);

    Progress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Progress record, @Param("example") ProgressExample example);

    int updateByExample(@Param("record") Progress record, @Param("example") ProgressExample example);

    int updateByPrimaryKeySelective(Progress record);

    int updateByPrimaryKey(Progress record);
    
    int deleteProgress(Progress progress);
    
    int proKCJD(Progress progress);
    
    int selectCourseKCJD(Progress progress);
    
    int selectCourseCount(Progress progress);
    
    List<Progress> selectProgress(Progress progress);
}