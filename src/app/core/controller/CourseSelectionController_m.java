package app.core.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import app.core.po.CourseSelection;
import app.core.service.CourseSelectionService_m;

@Controller
@RequestMapping("/course")
public class CourseSelectionController_m {
	@Autowired
	public CourseSelectionService_m courseSelectionService;
	
	/*
	 * ���ҿγ�ѡ���б�
	 */
	@RequestMapping("/courseSelectionList")
	@ResponseBody
	public List<CourseSelection> courseList(Model model){
		List<CourseSelection> courseSelectionList=courseSelectionService.getAllCourseSelection();
		System.out.println(courseSelectionList);
		return courseSelectionList;
	}
	
	/*
	 * ���ݿγ�id���Ҷ�Ӧ�γ�
	 */
	@RequestMapping("/viewCourseSelection")
	@ResponseBody
	public CourseSelection viewCourseSelection(Model model,@RequestBody CourseSelection courseSelection){
		CourseSelection cs=new CourseSelection();
		cs=courseSelectionService.viewCourseSelection(courseSelection);
		return cs;
	}
	
	/*
	 * ����������ѯ��Ӧ��ѡ����Ϣ
	 */
	@RequestMapping("/getCourseSelectionByCondition")
	@ResponseBody
	public List<CourseSelection> getCourseSelectionByCondition(Model model,@RequestBody CourseSelection courseSelection){
		List<CourseSelection> courseSelectionList=new ArrayList<CourseSelection>();
		courseSelectionList=courseSelectionService.getCourseSelectionByCondition(courseSelection);
		return courseSelectionList;
	}
	
	/*
	 * �����������ж�ӦԱ��ѡ����Ϣ����
	 */
	@RequestMapping("/sortCourseSelectionListByCondition")
	@ResponseBody
	public List<CourseSelection> sortCourseSelectionListByCondition(Model model,@RequestParam("sort") String condition){
		List<CourseSelection> courseSelectionList=new ArrayList<CourseSelection>();
		courseSelectionList=courseSelectionService.sortCourseSelectionListByCondition(condition);
		return courseSelectionList;
	}
	
}
