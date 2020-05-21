package app.core.mapper;

import app.core.po.Course;
import app.core.po.CourseCollection;
import app.core.po.CourseCollectionExample;
import app.core.po.CourseSelection;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseCollectionMapper {
    int countByExample(CourseCollectionExample example);

    int deleteByExample(CourseCollectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseCollection record);

    int insertSelective(CourseCollection record);

    List<CourseCollection> selectByExample(CourseCollectionExample example);

    CourseCollection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseCollection record, @Param("example") CourseCollectionExample example);

    int updateByExample(@Param("record") CourseCollection record, @Param("example") CourseCollectionExample example);

    int updateByPrimaryKeySelective(CourseCollection record);

    int updateByPrimaryKey(CourseCollection record);
    
    int checkCollectCourse(CourseCollection courseCollection);
    
    int addCollectCourse(CourseCollection courseCollection);
    
    CourseCollection checkCourseCollect(CourseCollection courseCollection);
    
    List<Course> showMyCollection(CourseCollection courseCollection);
    
    int removeCollection(CourseCollection courseCollection);
}