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
	 * �����������ǩ
	 */
	@RequestMapping("/selectCategory")
	public String selectCategory(
			Model model/* ,@RequestParam("lbbh") String lbbh */) {
		List<Category> categoryList = new ArrayList<Category>();
		categoryList = categoryService.getAllCategory();
		model.addAttribute("categoryList_", categoryList);
		//��ȡ�б������һ��ʵ��
		model.addAttribute("lastCategory", categoryList.get(categoryList.size()-1));
		return "STMIS_categoryUpdate";
	}
	/*
	 * ����json���͵�Ŀ¼�б�
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
	 * ���ݿγ̲���
	 */
	@RequestMapping("/findCategory")
	public @ResponseBody Category findCategory(Model model,@RequestParam("lbbh") String lbbh,@RequestParam("id") String id){
		Integer _id=Integer.parseInt(id);
		Category category=categoryService.findCategory(_id, lbbh);
		return category;
	}
	/*
	 * �޸�����ǩ
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
	 * ��������ǩ
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
	 * ����γ�����ǩ����
	 */
	@RequestMapping("/calCategory")
	public @ResponseBody HashMap calCategory(Model model){
		HashMap categoryCount=new HashMap();
		int categoryNum=categoryService.calCategory();
		categoryCount.put("categoryCount", categoryNum);
		return categoryCount;
	}
	/*
	 * ɾ���γ�����ǩ
	 */
	@RequestMapping("/delCategory")
	public String delCategory(Model model,@RequestParam("lbbh") String lbbh){
		categoryService.delCategory(lbbh);
		return "forward: /selectCategory";
	}
	/*
	 * �Ƴ��γ̱�ǩ
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
	 * �޸Ŀγ�Ŀ¼״̬������δ��ͨ�Ŀγ�
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
	 * ���ݿγ̱�Ų��ؿγ����
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
	 * ���ݿγ�������Ʋ�ѯ��Ӧ���
	 */
	@RequestMapping("/getCategoryByName")
	@ResponseBody
	public List<Category> getCategoryByName(Model model,@RequestBody Category category){
		List<Category> categoryList=new ArrayList<Category>();
		categoryList=categoryService.getCategoryByName(category);
		return categoryList;
	}
}
