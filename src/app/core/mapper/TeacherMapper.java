package app.core.mapper;

import app.core.po.CourseResource;
import app.core.po.Teacher;
import app.core.po.TeacherExample;
import app.core.po.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
	
	/**
	 * ����Ա
	 * @return
	 */
	//��ѯ���еĽ�ʦ��Ϣ
	public List<Teacher> getAllTeacher();	
	//���ݽ�ʦ�˺��޸Ľ�ʦ��Ϣ
	public void updateTeacher(Teacher teacher);
	//���ݽ�ʦ�˻���id�ҵ���Ӧ�Ľ�ʦ
	public Teacher findTeacher(@Param("jszh") String jszh,@Param("id") Integer id);
	//Ƹ�ý�ʦ
	public void engageTeacher(Teacher teacher);
	//��Լ��ʦƸ�ù�ϵ
	public void fireTeacher(Teacher teacher);
	//��ӽ̎�
	public void addTeacher(Teacher teacher);
	//���ݽ�ʦ������ѯ��ʦ
	public List<Teacher> getTeacherByName(@Param("jsxm") String jsxm);
	
    int countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(String jszh);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(String jszh);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
    
    Teacher selectUser(Teacher user);
    
}