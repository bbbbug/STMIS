package app.core.service;


import java.util.List;

import app.core.po.Course;
import app.core.po.CourseResource;
import app.core.po.CourseSelection;
import app.core.po.Course_Selection;
import app.core.po.Employee;
import app.core.po.Manager;
import app.core.po.Teacher;
import app.core.po.User;

public interface TeacherService {
	public List<Course> adminShowCourse(Course course);
	
	public List<CourseResource> adminCourseResource(CourseResource courseResource);
	
	public Course adminCourse(Course course);
	
	public int adminUpdateCourse(Course course);
	
	public List<Course> adminSearchCourse(Course course);
	
	public int adminRemoveCourseResource(CourseResource courseResource);
	
	public CourseResource courseResourceEdit(CourseResource courseResource);
	
	public int adminUpdateResourceCourse(CourseResource courseResource);
	
	public int courseResourceAdd(CourseResource courseResource);
	
	public int adminRemoveCourse(String kcbh);
}
