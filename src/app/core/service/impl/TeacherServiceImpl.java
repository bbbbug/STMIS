package app.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.TeacherMapper;
import app.core.po.Teacher;
import app.core.po.User;
import app.core.mapper.CourseMapper;
import app.core.mapper.CourseResourceMapper;
import app.core.mapper.CourseSelectionMapper;
import app.core.mapper.EmployeeMapper;
import app.core.po.Course;
import app.core.po.CourseResource;
import app.core.po.CourseSelection;
import app.core.po.Course_Selection;
import app.core.po.Employee;
import app.core.mapper.ManagerMapper;
import app.core.po.Manager;
import app.core.service.TeacherService;
import app.core.service.UserService;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherMapper teacherMapper;
	@Autowired
	private EmployeeMapper employeeMapper;
	@Autowired
	private ManagerMapper managerMapper;
	@Autowired
	private CourseSelectionMapper courseSelectionMapper;
	@Autowired
	private CourseMapper courseMapper;
	@Autowired
	private CourseResourceMapper courseResourceMapper;
	
	@Override
	public List<Course> adminShowCourse(Course course) {
		System.out.println("进入adminShowCourseImpl方法");
		return courseMapper.adminShowCourse(course) ;
	}

	@Override
	public List<CourseResource> adminCourseResource(CourseResource courseResource) {
		System.out.println("进入adminCourseResourceImpl方法");
		return courseResourceMapper.adminCourseResource(courseResource);
	}

	@Override
	public Course adminCourse(Course course) {
		return courseMapper.adminCourse(course);
	}

	@Override
	public int adminUpdateCourse(Course course) {
		System.out.println("更新后"+course);
		return courseMapper.adminUpdateCourse(course);
	}

	@Override
	public List<Course> adminSearchCourse(Course course) {
		System.out.println("查找"+course);
		return courseMapper.adminSearchCourse(course);
	}

	@Override
	public int adminRemoveCourseResource(CourseResource courseResource) {
		System.out.println("删除"+courseResource);
		return courseResourceMapper.adminRemoveCourseResource(courseResource);
	}

	@Override
	public CourseResource courseResourceEdit(CourseResource courseResource) {
		return courseResourceMapper.courseResourceEdit(courseResource);
	}

	@Override
	public int adminUpdateResourceCourse(CourseResource courseResource) {
		System.out.println(courseResource.getZjmc()+'+'+courseResource.getZylj());
		return courseResourceMapper.adminUpdateResourceCourse(courseResource);
	}

	@Override
	public int courseResourceAdd(CourseResource courseResource) {
		List<CourseResource> cResources = courseResourceMapper.selectCourseResource(courseResource);
		System.out.println("资源数"+cResources.size());
		courseResource.setKcmc(courseResource.getKcmc());
		courseResource.setZylx(".mp4");
		if(cResources.isEmpty()){
			courseResource.setZjxh(1);
		}else{
			courseResource.setZjxh(cResources.get(0).getZjxh()+1);
		}
		return courseResourceMapper.insert(courseResource);
	}

	@Override
	public int adminRemoveCourse(String kcbh) {
		return courseMapper.adminRemoveCourse(kcbh);
	}
}
