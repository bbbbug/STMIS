package app.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.TeacherMapper;
import app.core.po.Teacher;
import app.core.service.TeacherService_m;

@Service
public class TeacherServiceImpl_m implements TeacherService_m {

	@Autowired
	public TeacherMapper teacherMapper;
	
	@Override
	public List<Teacher> getAllTeacher() {		
		return teacherMapper.getAllTeacher();
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		teacherMapper.updateTeacher(teacher);
	}

	@Override
	public Teacher findTeacher(String jszh, Integer id) {
		return teacherMapper.findTeacher(jszh, id);
	}

	@Override
	public void engageTeacher(Teacher teacher) {
		teacherMapper.engageTeacher(teacher);
	}

	@Override
	public void fireTeacher(Teacher teacher) {
		teacherMapper.fireTeacher(teacher);		
	}

	@Override
	public void addTeacher(Teacher teacher) {
		teacherMapper.addTeacher(teacher);
	}

	@Override
	public List<Teacher> getTeacherByName(String name) {		
		return teacherMapper.getTeacherByName(name);
	}

}
