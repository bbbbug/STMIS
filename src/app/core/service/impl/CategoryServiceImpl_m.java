package app.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.CategoryMapper;
import app.core.po.Category;
import app.core.service.CategoryService_m;



@Service
public class CategoryServiceImpl_m implements CategoryService_m {

	@Autowired
	public CategoryMapper categoryMapper;
	
	@Override
	public List<Category> getAllCategory() {
		System.out.println(categoryMapper.getAllCategory());
		return categoryMapper.getAllCategory();
	}

	@Override
	public void updateCategory(Category category) {
		categoryMapper.updateCategory(category);
	}

	@Override
	public void addCategory(Category category) {
		categoryMapper.addCategory(category);
	}

	@Override
	public int calCategory() {
		return 	categoryMapper.calCategory();
	}

	@Override
	public void delCategory(String lbbh) {
		categoryMapper.delCategory(lbbh);
	}

	
	@Override
	public void removeCategory(String lbbh) {
		categoryMapper.removeCategory(lbbh);
		
	}
	
	@Override
	public void setupCategory(Category category) {
		categoryMapper.setupCategory(category);
	}

	@Override
	public Category findCategory(Integer id, String lbbh) {		
		return categoryMapper.findCategory(id, lbbh);
	}

	@Override
	public Category queryRepeatCategory(Category category) {		
		return categoryMapper.queryRepeatCategory(category);
	}

	@Override
	public List<Category> getCategoryByName(Category category) {		
		return categoryMapper.getCategoryByName(category);
	}
	
}
