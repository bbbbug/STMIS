package app.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import app.core.po.Msg;
import app.core.service.CourseSelectionService_m;
/*
 * author by Jaylin_Yang
 * */
import app.core.service.GradesService;
 
@Controller
public class GradesController {
	
	
	@Autowired
	public GradesService gradesService;
	@Autowired
	public CourseSelectionService_m courseSelectionService;
	
	@RequestMapping("/yearEndSelect")
	@ResponseBody
	public Msg yearEndList(Model model){
		List yearEndList=gradesService.yearEndSelect();
		System.out.println(yearEndList);
		return Msg.success().add("yearEndList", yearEndList);
	}
	
	@RequestMapping("/yearEndSelectByYGZH")
	@ResponseBody
	public Msg yearEndDetail(Model model,@RequestParam("ygzh") String ygzh){
		System.out.println("coming");
		List YGDetailList = courseSelectionService.EndYGZHDetail(ygzh);
		System.out.println(YGDetailList);
		return Msg.success().add("YGDetailList", YGDetailList);
	}
	
	//search everything from yuan gong infomtion in year end
	//2019.7.1 author by Jaylin_Yang
	@RequestMapping("/searchYearEnd")
	@ResponseBody
	public Msg searchYearEnd(Model model,@RequestParam("ygzh") String ygzh){
		System.out.println("coming");
		List searchYearEndResult = gradesService.searchYearEnd(ygzh);
		System.out.println(searchYearEndResult.size());
		return Msg.success().add("searchYearEndResult", searchYearEndResult);
	}
}
