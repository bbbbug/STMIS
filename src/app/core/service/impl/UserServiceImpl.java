package app.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.CourseCollectionMapper;
import app.core.mapper.CourseFeedbackAllMapper;
import app.core.mapper.CourseResourceMapper;
import app.core.mapper.CourseSelectionMapper;
import app.core.mapper.DepartmentMapper;
import app.core.mapper.EmployeeMapper;
import app.core.mapper.GradeMapper;
import app.core.mapper.ManagerMapper;
import app.core.mapper.ProgressMapper;
import app.core.mapper.TeacherMapper;
import app.core.po.Course;
import app.core.po.CourseCollection;
import app.core.po.CourseFeedbackAll;
import app.core.po.CourseResource;
import app.core.po.CourseSelection;
import app.core.po.Department;
import app.core.po.Employee;
import app.core.po.Grade;
import app.core.po.Manager;
import app.core.po.Progress;
import app.core.po.Teacher;
import app.core.po.User;
import app.core.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private TeacherMapper teacherMapper;
	@Autowired
	private EmployeeMapper employeeMapper;
	@Autowired
	private ManagerMapper managerMapper;
	@Autowired
	private CourseSelectionMapper courseSelectionMapper;
	@Autowired
	private CourseResourceMapper courseRecourseMapper;
	@Autowired
	private CourseCollectionMapper courseCollectionMapper;
	@Autowired
	private ProgressMapper progressMapper;
	@Autowired
	private CourseFeedbackAllMapper courseFeedbackAllMapper;
	@Autowired
	private DepartmentMapper departmentMapper;
	@Autowired
	private GradeMapper gradeMapper;
	@Override
	public Employee selectEmployee(Employee employee) {
		//System.out.println("����selectEmployeeImpl����"+employee.getPassword());
		return employeeMapper.selectUser(employee);
	}
	@Override
	public Manager selectManager(User user) {
		System.out.println("����selectManagerImpl����"+user);
		return managerMapper.selectUser(user);
	}
	@Override
	public Teacher selectTeacher(Teacher teacher) {
		System.out.println("����selectTeacherImpl����"+teacher);
		return teacherMapper.selectUser(teacher);
	}
	@Override
	public void addCartCourse(CourseSelection courseSelection) {
		System.out.println("����addCartCourseImpl����");
		List<CourseResource> course_resources = courseRecourseMapper.selectByKCBH(courseSelection.getKcbh());
		for (CourseResource cr : course_resources) {
			Progress progress=new Progress();
			progress.setKcbh(courseSelection.getKcbh());
			progress.setYgzh(courseSelection.getYgzh());
			progress.setZjxh(cr.getZjxh());
			progress.setKcjd(0);
			progressMapper.insert(progress);
		}
		courseSelectionMapper.addCartCourse(courseSelection);
	}
	@Override
	public List<Course> showMyCourse(CourseSelection courseSelection) {
		System.out.println("����showMyCourseImpl����");
		return courseSelectionMapper.showMyCourse(courseSelection);
	}
	@Override
	public boolean checkCourse(CourseSelection courseSelection) {
		System.out.println("����checkCourseImpl����");
		System.out.println("courseSelection"+courseSelection.getKcbh()+courseSelection.getYgzh());
		int cou =courseSelectionMapper.checkCourse(courseSelection);
		System.out.println("cou"+cou);
		if(cou<1){
			return true;
		}
		return false;
	}
	@Override
	public void removeCourse(CourseSelection courseSelection) {
		System.out.println("����removeCourseImpl����");
		Progress progress =new Progress();
		progress.setKcbh(courseSelection.getKcbh());
		progress.setYgzh(courseSelection.getYgzh());
		progressMapper.deleteProgress(progress);
		courseSelectionMapper.removeCourse(courseSelection);
	}
	@Override
	public boolean checkCollectCourse(CourseCollection courseCollection) {
		int cou =courseCollectionMapper.checkCollectCourse(courseCollection);
		System.out.println("cou"+cou);
		if(cou<1){
			return true;
		}
		return false;
	}
	@Override
	public void addCollectCourse(CourseCollection courseCollection) {
		System.out.println("����addCollectCourseImpl����");
		courseCollectionMapper.addCollectCourse(courseCollection);
	}
	@Override
	public List<Course> gotoCredit(CourseSelection courseSelection) {
		return courseSelectionMapper.gotoCredit(courseSelection);
	}
	@Override
	public void proKCJD(Progress progress) {
		System.out.println("����proKCJDImpl����");
		progressMapper.proKCJD(progress);
		CourseSelection courseSelection= new CourseSelection();
		courseSelection.setYgzh(progress.getYgzh());
		courseSelection.setKcbh(progress.getKcbh());
		courseSelectionMapper.proCourseJD(courseSelection);
	}
	@Override
	public int selectCourseKCJD(Progress progress) {
		return progressMapper.selectCourseKCJD(progress);
	}
	@Override
	public int selectCourseCount(Progress progress) {
		return progressMapper.selectCourseCount(progress);
	}
	@Override
	public void updateKCJD(CourseSelection courseSelection) {
		System.out.println("����kcjd"+courseSelection.getKcbh());
		courseSelectionMapper.updateKCJD(courseSelection);
	}
	@Override
	public List<Course> showMyCollection(CourseCollection courseCollection) {
		System.out.println("����showMyCollection����");
		return courseCollectionMapper.showMyCollection(courseCollection);
	}
	@Override
	public void removeCollection(CourseCollection courseCollection) {
		System.out.println("����removeCollectionImpl����");
		courseCollectionMapper.removeCollection(courseCollection);
	}
	@Override
	public List<CourseFeedbackAll> selectFeedbacks(CourseFeedbackAll courseFeedbackAll) {
		return courseFeedbackAllMapper.selectFeedbacks(courseFeedbackAll);
	}
	
	@Override
	public Employee findEmployee(Employee employee) {
		return employeeMapper.selectByPrimaryKey(employee.getYgzh());
	}
	@Override
	public Department getGradeRe(String bmbh) {
		return departmentMapper.selectByPrimaryKey(bmbh);
	}
	@Override
	public Grade getGrade(String ygzh) {
		return gradeMapper.selectGradeByYgzh(ygzh);
	}
	//author by Jaylin_yang 2019.7.18
	@Override
	public Manager selectManager(Manager manager){
		return managerMapper.selectManager(manager);
	}
	/**
	 * cm 8.29
	 */
	@Override
	public Employee findEm(String ygzh) {		
		return employeeMapper.findEm(ygzh);
	}
	@Override
	public void saveEmChange(Employee employee) {
		System.out.println("saveEmChange"+employee);
		employeeMapper.saveEmChange(employee);
	}
}
