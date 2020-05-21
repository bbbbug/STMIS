package app.core.service;


import java.util.List;

import app.core.po.Course;
import app.core.po.CourseCollection;
import app.core.po.CourseFeedbackAll;
import app.core.po.CourseSelection;
import app.core.po.Department;
import app.core.po.Employee;
import app.core.po.Grade;
import app.core.po.Manager;
import app.core.po.Progress;
import app.core.po.Teacher;
import app.core.po.User;

public interface UserService {
	public Employee selectEmployee(Employee employee);
	public Manager selectManager(User user);
	public Teacher selectTeacher(Teacher teacher);
	
	public Employee findEmployee(Employee employee);
	public Department getGradeRe(String bmbh);
	public Grade getGrade(String ygzh);
	
	
	public void addCartCourse(CourseSelection courseSelection);
	
	public List<Course> showMyCourse(CourseSelection courseSelection);
	
	public boolean checkCourse(CourseSelection courseSelection);
	
	public boolean checkCollectCourse(CourseCollection courseCollection);
	
	public void addCollectCourse(CourseCollection courseCollection);
	
	public void removeCourse(CourseSelection courseSelection);
	
	public List<Course> gotoCredit(CourseSelection courseSelection);
	
	public void proKCJD(Progress progress);
	
	public int selectCourseKCJD(Progress progress);
	
	public int selectCourseCount(Progress progress);
	
	public void updateKCJD(CourseSelection courseSelection);
	
	public List<Course> showMyCollection(CourseCollection courseCollection);
	
	public void removeCollection(CourseCollection courseCollection);
	
	public List<CourseFeedbackAll> selectFeedbacks(CourseFeedbackAll courseFeedbackAll);
	//author by Jaylin_yang 2019.7.18
	public Manager selectManager(Manager manager);
	//author by cm 2019.8.29
	public Employee findEm(String ygzh);
	public void saveEmChange(Employee employee);
}
