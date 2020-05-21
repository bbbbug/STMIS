package app.core.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import app.core.po.Teacher;
import app.core.service.TeacherService_m;

@Controller
@RequestMapping("/employee")
public class TeacherController_m {
	
	@Autowired
	public TeacherService_m teacherService;
	
	/*查找所有的教师列表*/
	@RequestMapping("/teacherList")
	@ResponseBody
	public List<Teacher> teacherList(Model model){
		List<Teacher> teacherList=new ArrayList<Teacher>();
		teacherList=teacherService.getAllTeacher();
		return teacherList;
	}
	
	/*根据教师账号修改教师信息*/
	@RequestMapping("/updateTeacher")
	@ResponseBody
	public HashMap<String,String> updateTeacher(Model model,@RequestBody Teacher teacher){
		HashMap<String ,String> teacherUpdate=new HashMap<String, String>();
		teacherService.updateTeacher(teacher);
		teacherUpdate.put("teacherUpdate","success");
		return teacherUpdate;
	}
	
	/*根据教师账号和id查询教师信息*/
	@RequestMapping("/findTeacher")
	@ResponseBody
	public Teacher findTeacher(Model model,@RequestParam("id") Integer id ,@RequestParam("jszh") String jszh){
		Teacher teacher=new Teacher();
		teacher=teacherService.findTeacher(jszh, id);
		return teacher;
	}
	
	/*聘用教师*/
	@RequestMapping("/engageTeacher")
	@ResponseBody
	public HashMap<String,String> engageTeacher(Model model,@RequestBody Teacher teacher){
		HashMap<String, String> teacherEngage=new HashMap<String,String>();
		teacherService.engageTeacher(teacher);
		teacherEngage.put("teacherEngage", "success");
		return teacherEngage;
	}
	
	/*解约教师*/
	@RequestMapping("/fireTeacher")
	@ResponseBody
	public HashMap<String,String> fireTeacher(Model model,@RequestBody Teacher teacher){
		HashMap<String, String> teacherFire=new HashMap<String,String>();
		teacherService.fireTeacher(teacher);
		teacherFire.put("teacherFire", "success");
		return teacherFire;
	}
	
	/*添加教師*/
	@RequestMapping("addTeacher")
	@ResponseBody
	public HashMap<String,String> addTeacher(Model model,@RequestBody Teacher teacher){
		HashMap<String, String> teacherAdd=new HashMap<String,String>();
		teacherService.addTeacher(teacher);
		teacherAdd.put("teacherAdd","success");
		return teacherAdd;
	}
	
	/*根据教师姓名查询教师*/
	@RequestMapping("getTeacherByName")
	@ResponseBody
	public List<Teacher> getTeacherByName(Model model,@RequestParam("name") String name){
		List<Teacher> teacherList=new ArrayList<Teacher>();
		teacherList=teacherService.getTeacherByName(name);
		return teacherList;
	}
	
	
}
