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
import org.springframework.web.bind.annotation.SessionAttributes;

import app.core.po.Category;
import app.core.service.CategoryService_m;
import app.core.util.m.GenerateNumber;

@SessionAttributes(value = { "categoryList_" })
@Controller
@RequestMapping("/course")
public class CategoryController_m {
	@Autowired
	public CategoryService_m categoryService;

	/*
	 * 查找类别管理标签
	 */
	@RequestMapping("/selectCategory")
	public String selectCategory(
			Model model/* ,@RequestParam("lbbh") String lbbh */) {
		List<Category> categoryList = new ArrayList<Category>();
		categoryList = categoryService.getAllCategory();
		model.addAttribute("categoryList_", categoryList);
		//获取列表中最后一个实体
		model.addAttribute("lastCategory", categoryList.get(categoryList.size()-1));
		return "STMIS_categoryUpdate";
	}
	/*
	 * 返回json类型的目录列表
	 */
	@RequestMapping("/selectAllCategory")
	public @ResponseBody List<Category> selectAllCategory(
			Model model/* ,@RequestParam("lbbh") String lbbh */) {
		List<Category> categoryList = new ArrayList<Category>();
		categoryList = categoryService.getAllCategory();
		System.out.println(categoryList);
//		HashMap categoryMap=new HashMap();
//		categoryMap.compute("categoryMap", categoryList);
		return categoryList;
	}
	/*
	 * 根据课程查找
	 */
	@RequestMapping("/findCategory")
	public @ResponseBody Category findCategory(Model model,@RequestParam("lbbh") String lbbh,@RequestParam("id") String id){
		Integer _id=Integer.parseInt(id);
		Category category=categoryService.findCategory(_id, lbbh);
		return category;
	}
	/*
	 * 修改类别标签
	 */
	@RequestMapping("/updateCategory")
	@ResponseBody
	public HashMap<String,String> updateCategory(Model model, @RequestBody Category category) {
		// System.out.println(lbbh);
		categoryService.updateCategory(category);
		HashMap<String,String> categoryUpdate=new HashMap<String,String>();
		categoryUpdate.put("updateFlag", "success");
		return categoryUpdate;
	}

	/*
	 * 新增类别标签
	 */
	@RequestMapping("/addCategory")
	public @ResponseBody HashMap addCategory(Model model, @RequestBody Category category) {
		System.out.println(category);
		String lbmc=category.getLBMC();
		String lbbh=GenerateNumber.converterToSpell(lbmc, "0");
		category.setLBBH(lbbh);
		categoryService.addCategory(category);
		HashMap categoryAdd=new HashMap();
		categoryAdd.put("addFlag", "success");
		return categoryAdd;
	}
	/*
	 * 计算课程类别标签数量
	 */
	@RequestMapping("/calCategory")
	public @ResponseBody HashMap calCategory(Model model){
		HashMap categoryCount=new HashMap();
		int categoryNum=categoryService.calCategory();
		categoryCount.put("categoryCount", categoryNum);
		return categoryCount;
	}
	/*
	 * 删除课程类别标签
	 */
	@RequestMapping("/delCategory")
	public String delCategory(Model model,@RequestParam("lbbh") String lbbh){
		categoryService.delCategory(lbbh);
		return "forward: /selectCategory";
	}
	/*
	 * 移除课程标签
	 */
	@RequestMapping("/removeCategory")
	@ResponseBody
	public HashMap<String,String> removeCategory(Model model,@RequestParam("lbbh") String lbbh){
		HashMap<String,String> categoryRemove=new HashMap<String,String>();
		categoryService.removeCategory(lbbh);
		categoryRemove.put("removeFlag", "success");
		return categoryRemove;
	}
	/*
	 * 修改课程目录状态，开启未开通的课程
	 */
	@RequestMapping("/setupCategory")
	@ResponseBody
	public HashMap<String,String> setupCategory(Model model,@RequestBody Category category){
		HashMap<String,String> categorySetup=new HashMap<String,String>();
		categoryService.setupCategory(category);
		categorySetup.put("categorySetup", "success");
		return categorySetup;
	}
	
	/*
	 * 根据课程编号查重课程类别
	 */
	@RequestMapping("/queryRepeatCategory")
	@ResponseBody
	public Category queryRepeatCategory(Model model,@RequestBody Category category){
		String lbmc = category.getLBMC();
		String lbbh = GenerateNumber.converterToSpell(lbmc, "0");
		category.setLBBH(lbbh);
		System.out.println(categoryService.queryRepeatCategory(category));
		return categoryService.queryRepeatCategory(category);
	}
	
	/*
	 * 根据课程类别名称查询对应类别
	 */
	@RequestMapping("/getCategoryByName")
	@ResponseBody
	public List<Category> getCategoryByName(Model model,@RequestBody Category category){
		List<Category> categoryList=new ArrayList<Category>();
		categoryList=categoryService.getCategoryByName(category);
		return categoryList;
	}
}
