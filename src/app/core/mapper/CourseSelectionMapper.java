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
	 * ����Ա
	 * @return
	 */
	//��ȡ����Ա��ѧ��
	public List<CourseSelection> getAllCourseSelection();
	//����id��ѯ��Ӧ��Ա��ѡ�ε�ѧ��
	public CourseSelection viewCourseSelection(CourseSelection courseSelection);
	//�ù��������������Ǳ���������
	public List<CourseSelection> getCourseSelectionByCondition(CourseSelection courseSelection);
	//��������������������
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