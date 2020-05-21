package app.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.CourseSelectionMapper;
import app.core.mapper.GradeMapper;
import app.core.po.CourseSelection;
import app.core.service.GradesService;

@Service
public class GradesServiceImpl implements GradesService {
	@Autowired
	public GradeMapper gradeMapper;
	
	@Override
	public List yearEndSelect() {		
		return gradeMapper.selectAllFrom3Table();
	}
	
	//author by Jaylin_yang 2019.6.26
	@Override
	public List searchYearEnd(String ygzh) {		
		return gradeMapper.searchYearEnd(ygzh);
	}
	
}
