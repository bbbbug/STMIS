package app.core.mapper;

import app.core.po.Course;
import app.core.po.CourseExample;
import app.core.po.Exam;
import app.core.po.Page;
import app.core.po.Teacher;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMapper {
	
	/**
	 * 锟斤拷锟斤拷员
	 * @return
	 */
	//锟斤拷取锟斤拷锟叫课筹拷
	public List<Course> getAllCourse();
	//锟斤拷锟捷课程憋拷呕锟饺★拷纬锟�
	public Course getCourseByKCBH(String kcbh);
	//锟斤拷锟斤拷纬锟斤拷薷锟�
	public void updateCourse(Course course);
	//锟狡筹拷锟轿筹拷
	public void removeCourse(String kcbh);
	//锟斤拷取未锟斤拷锟斤拷锟斤拷锟叫课筹拷
	public List<Course> getUnsetCourse(); 
	//锟斤拷锟斤拷锟斤拷锟叫课筹拷
	public void setupCourse(Course course);
	//锟斤拷锟捷斤拷师锟斤拷锟街伙拷取锟斤拷应锟侥课筹拷锟叫憋拷
	public List<Course> getCourseByCondition(Course course);
	//锟斤拷锟捷课程憋拷锟斤拷薷目纬瘫锟斤拷状态
	public void updateCourseByKCBH(Course course);
	
    int countByExample(CourseExample example);

    int deleteByExample(CourseExample example);

    int deleteByPrimaryKey(String kcbh);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseExample example);

    Course selectByPrimaryKey(String kcbh);

    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
    
    List<Course> selectChoose(Page page);
    
    List<Course> searchCourse(Course course);
    
    List<Course> showByKclb(Course course);
    
    List<Course> showAllCourse();
    
    List<Course> adminShowCourse(Course course);
    
    Course adminCourse(Course course);
    
    int adminUpdateCourse(Course course);
    
    List<Course> adminSearchCourse(Course course);
    
    List<Course> recommendCourse(Course course);
    
    List<Course> showNewCourse(Page page);
    
    //author by Jaylin_Yang
  	List<Course> selectCourseByKcjs(Course course);

  	int addKSinfo(Course course);

  	Course selectCourseByKcbh(Course course);
  	//author by Jaylin_yang 2019.7.9
	List selectLbmcByKcbh(@Param("kcbh") String kcbh);
	
	public int adminRemoveCourse(String kcbh);
	
}