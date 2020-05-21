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
	 * 查找课程选择列表
	 */
	@RequestMapping("/courseSelectionList")
	@ResponseBody
	public List<CourseSelection> courseList(Model model){
		List<CourseSelection> courseSelectionList=courseSelectionService.getAllCourseSelection();
		System.out.println(courseSelectionList);
		return courseSelectionList;
	}
	
	/*
	 * 根据课程id查找对应课程
	 */
	@RequestMapping("/viewCourseSelection")
	@ResponseBody
	public CourseSelection viewCourseSelection(Model model,@RequestBody CourseSelection courseSelection){
		CourseSelection cs=new CourseSelection();
		cs=courseSelectionService.viewCourseSelection(courseSelection);
		return cs;
	}
	
	/*
	 * 根据条件查询对应的选课信息
	 */
	@RequestMapping("/getCourseSelectionByCondition")
	@ResponseBody
	public List<CourseSelection> getCourseSelectionByCondition(Model model,@RequestBody CourseSelection courseSelection){
		List<CourseSelection> courseSelectionList=new ArrayList<CourseSelection>();
		courseSelectionList=courseSelectionService.getCourseSelectionByCondition(courseSelection);
		return courseSelectionList;
	}
	
	/*
	 * 根据条件进行对应员工选课信息排序
	 */
	@RequestMapping("/sortCourseSelectionListByCondition")
	@ResponseBody
	public List<CourseSelection> sortCourseSelectionListByCondition(Model model,@RequestParam("sort") String condition){
		List<CourseSelection> courseSelectionList=new ArrayList<CourseSelection>();
		courseSelectionList=courseSelectionService.sortCourseSelectionListByCondition(condition);
		return courseSelectionList;
	}
	
}
