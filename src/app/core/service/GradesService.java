package app.core.service;

import java.util.List;

import app.core.po.CourseSelection;

public interface GradesService {
	public abstract List yearEndSelect();

	//author by Jaylin 2019.7.1
	public abstract List searchYearEnd(String ygzh);

}
