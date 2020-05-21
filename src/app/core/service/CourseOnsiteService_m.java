package app.core.service;

import java.util.List;

import app.core.po.Course;
import app.core.po.CourseOnsite;

public interface CourseOnsiteService_m {
	/**
	 * 添加新的记录
	 * @author chen 
	 * @param courseOnsite
	 */
	public abstract void addCourseOnsite(CourseOnsite courseOnsite);
	/**
	 * 根据id找到单个对应的线下学分记录
	 * @author chen
	 * @param id
	 */
	public abstract CourseOnsite findCourseOnsite(Integer id);
	/**
	 * 查询所有的线下学分记录
	 * @author chen
	 * @return
	 */	
	public abstract List<CourseOnsite> getAllCourseOnsite();
	/**
	 * 更新线下学分记录表
	 * @author chen
	 * @param courseOnsite
	 */
	public abstract void updateCourseOnsite(CourseOnsite courseOnsite);
	/**
	 * 删除单个学分记录表，修改备选字段1 改成不显示状态
	 * @author chen
	 * @param courseOnsite
	 */
	public abstract void delCourseOnsite(CourseOnsite courseOnsite);
	/**
	 * 根据条件获取线下学分记录表集合(时间)
	 * @author chen
	 * @param courseOnsite
	 * @return
	 */
	/**
	 * 通过培训组织部门进行筛选
	 * 
	 * @author chen 修改时间:2019.7.11
	 */
	public abstract List<CourseOnsite> getCourseOnsiteWithExample(CourseOnsite courseOnsite);
}
