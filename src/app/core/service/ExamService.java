package app.core.service;


import java.util.List;

import app.core.po.Category;
import app.core.po.Course;
import app.core.po.CourseFeedbackAll;
import app.core.po.CourseResource;
import app.core.po.CourseSelection;
import app.core.po.CourseType;
import app.core.po.Course_Selection;
import app.core.po.Employee;
import app.core.po.Exam;
import app.core.po.ExamResult;
import app.core.po.Grade;
import app.core.po.Manager;
import app.core.po.Teacher;
import app.core.po.User;

public interface ExamService {

	public int adminAddExam(Exam exam);
	
	public List<Exam> adminShowExam(Exam exam);
	
	public List<Exam> startExam(Exam exam, int bxzd2);
	
	public int saveExamResult(ExamResult examResult);
	
	public Exam checkExamResult(Exam exam);
	
	public int saveFraction(CourseSelection courseSelection);

	//author by Jaylin_Yang
	public List<Course> selectCourseByKcjs(Course course);

	public int addKSinfo(Course course);

	public Course selectCourseByKcbh(Course course);
	
	public List<Exam> selectExamByKcbhKcjs(Exam exam);

	public Category selectLbmcByLBBH(String lbbh);
	
	public Course selectByKcbh(String kcbh);

	public List<Exam> searchFromExam(String caption);

	public Exam selectExamByID(Integer id);

	public int updateExam(Exam exam);

	public int deleteExam(long id);

	public CourseType selectXXBXByKcbh(String kcbh,String ygzh);
	//author by Jaylin_yang 2019.7.10
	public Grade selectGradeByYgzh(String ygzh);
	//author by Jaylin_yang 2019.7.10
	public int updateGrade(Grade grade);
	//author by Jaylin_yang 2019.7.10
	//public CourseFeedbackAll selectfeedbackByYgzh(String ygzh,String kcbh);

}
