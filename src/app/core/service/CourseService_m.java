package app.core.service;

import java.util.List;

import app.core.po.Course;
import app.core.po.CourseType;

public interface CourseService_m {
	public abstract List<Course> getAllCourse();
	public abstract Course getCourseByKCBH(String kcbh);
	public abstract void updateCourse(Course course);
	public abstract void removeCourse(String kcbh);
	public abstract List<Course> getUnsetCourse();
	public abstract void setupCourse(Course course);
	public abstract List<Course> getCourseByCondition(Course course);
	public abstract void updateCourseByKCBH(Course course);
	
	/**
	 * @author chengmo
	 * @param courseType
	 * @return
	 */
	public List<CourseType> selectCourseTypes(CourseType courseType);

	public void updateCourseType(CourseType[] courseTypes);
	
	public void insertCourseTypes(CourseType[] courseTypes);
}
