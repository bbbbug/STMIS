package app.core.service;

import java.util.List;

import app.core.po.Category;

public interface CategoryService_m {
	public abstract List<Category> getAllCategory();
	public abstract void updateCategory(Category category);
	public abstract void addCategory(Category category);
	public abstract int calCategory();
	public abstract void delCategory(String lbbh);
	public abstract void removeCategory(String lbbh);
	public abstract void setupCategory(Category category);
	public abstract Category findCategory(Integer id,String lbbh);
	public abstract Category queryRepeatCategory(Category category);
	public abstract List<Category> getCategoryByName(Category category);
}
