package app.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.CourseSelectionMapper;
import app.core.po.CourseSelection;
import app.core.service.CourseSelectionService_m;

@Service
public class CourseSelectionServiceimpl_m implements CourseSelectionService_m {
	
	@Autowired
	public CourseSelectionMapper courseSelectionMapper;

	@Override
	public List<CourseSelection> getAllCourseSelection() {		
		return courseSelectionMapper.getAllCourseSelection();
	}

	@Override
	public CourseSelection viewCourseSelection(CourseSelection courseSelection) {		
		return courseSelectionMapper.viewCourseSelection(courseSelection);
	}

	@Override
	public List<CourseSelection> getCourseSelectionByCondition(CourseSelection courseSelection) {
		return courseSelectionMapper.getCourseSelectionByCondition(courseSelection);
	}

	@Override
	public List<CourseSelection> sortCourseSelectionListByCondition(String condition) {		
		return courseSelectionMapper.sortCourseSelectionListByCondition(condition);
	}
	
	//author by Jaylin_yang 2019.6.26
	@Override
	public List EndYGZHDetail(String ygzh) {		
		return courseSelectionMapper.selectYGDetialFrom2(ygzh);
	}
	
}
