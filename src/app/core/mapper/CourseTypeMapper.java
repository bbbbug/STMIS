package app.core.mapper;

import app.core.po.CourseType;
import app.core.po.CourseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseTypeMapper {
	//自定义
	/**
	 * @author chengmo
	 * @param courseType
	 * @return
	 */
	public List<CourseType> selectCourseTypes(CourseType courseType);
    
	public List<CourseType> selectCTypes(CourseType courseType);
	
	List<CourseType> selectCourses(CourseType courseType);
    
	void insertCourseType(CourseType courseType);
	
    void saveCourseType(CourseType courseType);
    
    void deleteCourseType(CourseType courseType);
	
	//自动生成
    int countByExample(CourseTypeExample example);

    int deleteByExample(CourseTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseType record);

    int insertSelective(CourseType record);

    List<CourseType> selectByExample(CourseTypeExample example);

    CourseType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseType record, @Param("example") CourseTypeExample example);

    int updateByExample(@Param("record") CourseType record, @Param("example") CourseTypeExample example);

    int updateByPrimaryKeySelective(CourseType record);

    int updateByPrimaryKey(CourseType record);
    //author by Jaylin 2019.7.10
   	public CourseType selectXXBXByKcbh(@Param("kcbh") String kcbh,@Param("ygzh") String ygzh);
}