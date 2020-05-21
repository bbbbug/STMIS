package app.core.mapper;

import app.core.po.Course;
import app.core.po.CourseSelection;
import app.core.po.CourseSelectionExample;
import app.core.po.Course_Selection;
import app.core.po.Page;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseSelectionMapper {
	
	/**
	 * 管理员
	 * @return
	 */
	//获取所有员工学分
	public List<CourseSelection> getAllCourseSelection();
	//根据id查询对应的员工选课的学分
	public CourseSelection viewCourseSelection(CourseSelection courseSelection);
	//用关联数组解决键名是变量的问题
	public List<CourseSelection> getCourseSelectionByCondition(CourseSelection courseSelection);
	//根据排列条件进行排序
	public List<CourseSelection> sortCourseSelectionListByCondition(@Param("condition") String condition);
    //author by Jaylin_yang
	List selectYGDetialFrom2(String ygzh);
	
    int countByExample(CourseSelectionExample example);

    int deleteByExample(CourseSelection example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseSelection record);

    int insertSelective(CourseSelection record);

    List<CourseSelection> selectByExample(CourseSelectionExample example);

    CourseSelection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseSelection record, @Param("example") CourseSelectionExample example);

    int updateByExample(@Param("record") CourseSelection record, @Param("example") CourseSelectionExample example);

    int updateByPrimaryKeySelective(CourseSelection record);

    int updateByPrimaryKey(CourseSelection record);
    
    boolean addCartCourse(CourseSelection courseSelection);
    
    List<Course> showMyCourse(CourseSelection courseSelection);
    
    int checkCourse(CourseSelection courseSelection);
    
    int removeCourse(CourseSelection courseSelection);
    
    int saveFraction(CourseSelection courseSelection);
    
    CourseSelection checkFraction(CourseSelection courseSelection);
    
    CourseSelection checkCourseSelection(CourseSelection courseSelection);
    
    List<Course> gotoCredit(CourseSelection courseSelection);
    
    int proCourseJD(CourseSelection courseSelection);
    
    int updateKCJD(CourseSelection courseSelection);
    
    List<CourseSelection> selectReCourse(CourseSelection courseSelection);
    
    int learnCount(CourseSelection courseSelection);
    
    List<CourseSelection> showHotCourse(Page page);
    
    int updateKCXF(CourseSelection courseSelection);
}