package app.core.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.TeacherMapper;
import app.core.po.Teacher;
import app.core.po.User;
import app.core.mapper.CategoryMapper;
import app.core.mapper.CourseFeedbackAllMapper;
import app.core.mapper.CourseMapper;
import app.core.mapper.CourseResourceMapper;
import app.core.mapper.CourseSelectionMapper;
import app.core.mapper.CourseTypeMapper;
import app.core.mapper.EmployeeMapper;
import app.core.mapper.ExamMapper;
import app.core.mapper.ExamResultMapper;
import app.core.mapper.GradeMapper;
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
import app.core.mapper.ManagerMapper;
import app.core.po.Manager;
import app.core.service.ExamService;
import app.core.service.TeacherService;
import app.core.service.UserService;

@Service("examService")
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamMapper examMapper;
	
	@Autowired
	private ExamResultMapper examResultMapper;
	
	@Autowired
	private CourseSelectionMapper courseSelectionMapper;
	
	@Autowired
	private CourseMapper courseMapper;
	
	@Autowired
	private CategoryMapper categoryMapper;
	
	@Autowired
	private CourseTypeMapper courseTypeMapper;
	
	@Autowired
	private GradeMapper gradeMapper;
	
	@Autowired
	private CourseFeedbackAllMapper courseFeedbackAllMapper;
	
	@Override
	public int adminAddExam(Exam exam) {
		return examMapper.insert(exam);
	}

	@Override
	public List<Exam> adminShowExam(Exam exam) {
		return examMapper.adminShowExam(exam);
	}

	@Override
	public List<Exam> startExam(Exam exam, int bxzd2) {
		return examMapper.startExam(exam, bxzd2);
	}

	@Override
	public int saveExamResult(ExamResult examResult) {
		return examResultMapper.insert(examResult);
	}

	@Override
	public Exam checkExamResult(Exam exam) {
		return examMapper.checkExamResult(exam);
	}
	@Override
	public int saveFraction(CourseSelection courseSelection) {
		System.out.println("����saveFraction");
		System.out.println(courseSelection.getKcbh());
		System.out.println(courseSelection.getFraction());
		System.out.println(courseSelection.getYgzh());
		System.out.println(courseSelection.getThreshold());
		return courseSelectionMapper.saveFraction(courseSelection);
	}


	// author by Jaylin_Yang
	// date: 2019.5.11
	// add dtsj,ktsl to course table
	@Override
	public List<Course> selectCourseByKcjs(Course course) {
		// TODO Auto-generated method stub
		System.out.println(course.getKcjs());
		return courseMapper.selectCourseByKcjs(course);
	}
	
	@Override
	public int addKSinfo(Course course) {
		// TODO Auto-generated method stub
		return courseMapper.addKSinfo(course);
	}
	
	@Override
	public Course selectCourseByKcbh(Course course){
		return courseMapper.selectCourseByKcbh(course);
	}
	
	public List<Exam> selectExamByKcbhKcjs(Exam exam){
		return examMapper.selectExamByKcbhKcjs(exam);
	}
	
	//author by Jaylin_yang 2019.7.9
	@Override
	public Category selectLbmcByLBBH(String lbbh) {
		// TODO Auto-generated method stub
		return categoryMapper.queryRepeatCategory(lbbh);
	}
	
	@Override
	public Course selectByKcbh(String kcbh) {
		// TODO Auto-generated method stub
		return courseMapper.getCourseByKCBH(kcbh);
	}
	
	@Override
	public List<Exam> searchFromExam(String caption) {
		// TODO Auto-generated method stub
		return examMapper.searchFromExam(caption);
	}
	
	@Override
	public Exam selectExamByID(Integer id) {
		// TODO Auto-generated method stub
		return examMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int updateExam(Exam exam) {
		// TODO Auto-generated method stub
		return examMapper.updateByPrimaryKey(exam);
	}
	
	@Override
	public int deleteExam(long id) {
		// TODO Auto-generated method stub
		return examMapper.deleteByPrimaryKey(id);
	}
	//author by Jaylin 2019.7.10
	@Override
	public CourseType selectXXBXByKcbh(String kcbh,String ygzh) {
		// TODO Auto-generated method stub
		return courseTypeMapper.selectXXBXByKcbh(kcbh,ygzh);
	}
	//author by Jaylin 2019.7.10
	@Override
	public Grade selectGradeByYgzh(String ygzh) {
		// TODO Auto-generated method stub
		return gradeMapper.selectGradeByYgzh(ygzh);
	}
	//author by Jaylin 2019.7.10
	@Override
	public int updateGrade(Grade grade){
		// TODO Auto-generated method stub
		return gradeMapper.updateByPrimaryKey(grade);
	}
	
	/*@Override
	public CourseFeedbackAll selectfeedbackByYgzh(String ygzh,String kcbh){
		// TODO Auto-generated method stub
		System.out.println("ygzh:"+ygzh+"kcbh:"+kcbh);
		return courseFeedbackAllMapper.selectFeedbackByYgzh(ygzh,kcbh);
	}*/
}
