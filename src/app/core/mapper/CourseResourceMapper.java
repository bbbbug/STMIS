package app.core.mapper;

import app.core.po.Course;
import app.core.po.CourseResource;
import app.core.po.CourseResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseResourceMapper {
	
	/**
	 * 管理员
	 * @return
	 */
	//获取所有课程资源
	public List<CourseResource> getAllResource();
	//根绝课程编号和id获取课程资源
	public CourseResource findCourseResource(@Param("id") Integer id,@Param("kcbh") String kcbh);
	//设置视频文件通过审核
	public void passCourseResource(CourseResource courseResource);
	//设置视频文件不通过审核
	public void refuseCourseResource(CourseResource courseResource);
	//批量审核视频资料
	public void batchPassCourseResource(@Param("id") Integer id);
	//批量审核不通过视频资料
	public void batchRefuseCourseResource(@Param("id") Integer id);
	//根据条件查询对应的课程资源信息
	public List<CourseResource> getCourseResourceByCondition(CourseResource courseResource);
	//根据课程编号查询对应课程资源是否全部审核通过
	public List<CourseResource> selectCourseResourceByKCBH(CourseResource courseResource);
	/**
	 * 修改对应课程的所有课程状态
	 * @author chen
	 * @param KCBH
	 * @return
	 * 修改时间 2019.7.12
	 */
	public void updateCourseResourceStatus(CourseResource courseResource);
	
	//自动生成
    int countByExample(CourseResourceExample example);

    int deleteByExample(CourseResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseResource record);

    int insertSelective(CourseResource record);

    List<CourseResource> selectByExample(CourseResourceExample example);

    CourseResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseResource record, @Param("example") CourseResourceExample example);

    int updateByExample(@Param("record") CourseResource record, @Param("example") CourseResourceExample example);

    int updateByPrimaryKeySelective(CourseResource record);

    int updateByPrimaryKey(CourseResource record);
    
    List<CourseResource> selectByKCBH(String kcbh);
    
    List<CourseResource> adminCourseResource(CourseResource courseResource);
    
    int adminRemoveCourseResource(CourseResource courseResource);
    
    CourseResource courseResourceEdit(CourseResource courseResource);
    
    int adminUpdateResourceCourse(CourseResource courseResource); 
    
    int courseResourceAdd(CourseResource courseResource);
    
    int selectZJXH(CourseResource courseResource);
    
    List<CourseResource> selectCourseResource(CourseResource courseResource);
}