package app.core.service;

import java.util.List;

import app.core.po.CourseSelection;

public interface CourseSelectionService_m {
	public abstract List<CourseSelection> getAllCourseSelection();
	public abstract CourseSelection viewCourseSelection(CourseSelection courseSelection);
	public abstract List<CourseSelection> getCourseSelectionByCondition(CourseSelection courseSelection);
	public abstract List<CourseSelection> sortCourseSelectionListByCondition(String condition);
	//author by Jaylin_Yang 2019.6.26
	public abstract List EndYGZHDetail(String ygzh);
}
