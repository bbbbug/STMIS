package app.core.mapper;

import app.core.po.CourseResource;
import app.core.po.Teacher;
import app.core.po.TeacherExample;
import app.core.po.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
	
	/**
	 * 管理员
	 * @return
	 */
	//查询所有的教师信息
	public List<Teacher> getAllTeacher();	
	//根据教师账号修改教师信息
	public void updateTeacher(Teacher teacher);
	//根据教师账户和id找到对应的教师
	public Teacher findTeacher(@Param("jszh") String jszh,@Param("id") Integer id);
	//聘用教师
	public void engageTeacher(Teacher teacher);
	//解约教师聘用关系
	public void fireTeacher(Teacher teacher);
	//添加教師
	public void addTeacher(Teacher teacher);
	//根据教师姓名查询教师
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