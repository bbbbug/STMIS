package app.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import app.core.po.Category;
import app.core.po.CategoryExample;

public interface CategoryMapper {
	
	/**
	 * ����Ա
	 * @return
	 */
	//��ȡ���пγ������Ϣ
	public List<Category> getAllCategory();
	//���¿γ����Ŀ¼
	public void updateCategory(Category category);
	//�����γ����
	public void addCategory(Category category);
	//����γ�����ǩ�ĵ�ǰ����
	public int calCategory();
	//ɾ���γ����
	public void delCategory(String lbbh);
	//�Ƴ��γ����
	public void removeCategory(String lbbh);
	//��ͨ�Ѵ��ڵĿγ����
	public void setupCategory(Category category);
	//����id��������ҵ���Ӧ�����Ŀ¼
	public Category findCategory(@Param("id") Integer id,@Param("lbbh") String lbbh);
	//��������Ų������Ŀ¼
	public Category queryRepeatCategory(Category category);
	//����������Ʋ�ѯ��Ӧ���
	public List<Category> getCategoryByName(Category category);
	
	
    int countByExample(CategoryExample example);

    int deleteByExample(CategoryExample example);

    int deleteByPrimaryKey(String lbbh);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryExample example);

    Category selectByPrimaryKey(String lbbh);

    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
    
	public Category queryRepeatCategory(@Param("LBBH") String LBBH);
}