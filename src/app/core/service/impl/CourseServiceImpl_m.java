package app.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.CourseMapper;
import app.core.mapper.CourseResourceMapper;
import app.core.mapper.CourseSelectionMapper;
import app.core.mapper.CourseTypeMapper;
import app.core.mapper.EmployeeMapper;
import app.core.mapper.ProgressMapper;
import app.core.po.Course;
import app.core.po.CourseResource;
import app.core.po.CourseSelection;
import app.core.po.CourseType;
import app.core.po.Employee;
import app.core.po.Progress;
import app.core.service.CourseService_m;

@Service
public class CourseServiceImpl_m implements CourseService_m {

	@Autowired
	public CourseMapper courseMapper;
	@Autowired
	public CourseTypeMapper courseTypeMapper;
	@Autowired
	public EmployeeMapper employeeMapper;
	@Autowired
	public CourseSelectionMapper courseSelectionMapper;
	@Autowired
	public CourseResourceMapper courseResourceMapper;
	@Autowired
	public ProgressMapper progressMapper;
	
	@Override
	public List<Course> getAllCourse() {
		//System.out.println(courseMapper.getAllCourse());
		return courseMapper.getAllCourse();
	}

	@Override
	public Course getCourseByKCBH(String kcbh) {
		//System.out.println(courseMapper.getCourseByKCBH(kcbh));
		return courseMapper.getCourseByKCBH(kcbh);
	}

	@Override
	public void updateCourse(Course course) {
		courseMapper.updateCourse(course);	
	}

	@Override
	public void removeCourse(String kcbh) {
		courseMapper.removeCourse(kcbh);
	}

	@Override
	public List<Course> getUnsetCourse() {
		return courseMapper.getUnsetCourse();
	}

	@Override
	public void setupCourse(Course course) {
		courseMapper.setupCourse(course);
	}

	@Override
	public List<Course> getCourseByCondition(Course course) {		
		return courseMapper.getCourseByCondition(course);
	}

	@Override
	public void updateCourseByKCBH(Course course) {
		courseMapper.updateCourseByKCBH(course);
	}	
	
	/**
	 * @author chengmo
	 */
	@Override
	public List<CourseType> selectCourseTypes(CourseType courseType) {
		return courseTypeMapper.selectCourseTypes(courseType);
	}
	@Override
	public void updateCourseType(CourseType[] courseTypes) {
		for (CourseType ct : courseTypes) {
			System.out.println(ct.getKcbh()+ct.getBmid()+ct.getKcmc());
		}
		for (CourseType courseType : courseTypes) {
			if(courseType.getXxbx().equals("—°–ﬁ")){
				courseType.setXxbx("±ÿ–ﬁ");
				courseTypeMapper.saveCourseType(courseType);
				System.out.println("≤‚ ‘");
				Employee employee = new Employee();
				employee.setYgdwbh(courseType.getBmid().toString());
				List<Employee> Employees = employeeMapper.selectEmployeeByDepartment(employee);
				for (Employee e : Employees) {
					List<CourseResource> course_resources = courseResourceMapper.selectByKCBH(courseType.getKcbh());
					for (CourseResource cr : course_resources) {
						Progress progress=new Progress();
						progress.setKcbh(courseType.getKcbh());
						progress.setYgzh(e.getYgzh());
						progress.setZjxh(cr.getZjxh());
						progress.setKcjd(0);
						progressMapper.insert(progress);
					}
					CourseSelection courseSelection =new CourseSelection();
					courseSelection.setKcbh(courseType.getKcbh());
					courseSelection.setYgzh(e.getYgzh());
					courseSelection.setThreshold(0);
					CourseSelection cs = courseSelectionMapper.checkCourseSelection(courseSelection);
					if(cs == null){
						courseSelectionMapper.addCartCourse(courseSelection);
					}
				}
			}
		}
	}

	@Override
	public void insertCourseTypes(CourseType[] courseTypes) {
		for (CourseType ct : courseTypes) {
			courseTypeMapper.insertCourseType(ct);
		}
	}	
}
