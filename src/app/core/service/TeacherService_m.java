package app.core.service;

import java.util.List;

import app.core.po.Teacher;

public interface TeacherService_m {
	public abstract List<Teacher> getAllTeacher();
	public abstract void updateTeacher(Teacher teacher);
	public abstract Teacher findTeacher(String jszh,Integer id);
	public abstract void engageTeacher(Teacher teacher);
	public abstract void fireTeacher(Teacher teacher);
	public abstract void addTeacher(Teacher teacher);
	public abstract List<Teacher> getTeacherByName(String name);
}
