package app.core.mapper;

import app.core.po.Course;
import app.core.po.CourseResource;
import app.core.po.CourseResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseResourceMapper {
	
	/**
	 * ����Ա
	 * @return
	 */
	//��ȡ���пγ���Դ
	public List<CourseResource> getAllResource();
	//�����γ̱�ź�id��ȡ�γ���Դ
	public CourseResource findCourseResource(@Param("id") Integer id,@Param("kcbh") String kcbh);
	//������Ƶ�ļ�ͨ�����
	public void passCourseResource(CourseResource courseResource);
	//������Ƶ�ļ���ͨ�����
	public void refuseCourseResource(CourseResource courseResource);
	//���������Ƶ����
	public void batchPassCourseResource(@Param("id") Integer id);
	//������˲�ͨ����Ƶ����
	public void batchRefuseCourseResource(@Param("id") Integer id);
	//����������ѯ��Ӧ�Ŀγ���Դ��Ϣ
	public List<CourseResource> getCourseResourceByCondition(CourseResource courseResource);
	//���ݿγ̱�Ų�ѯ��Ӧ�γ���Դ�Ƿ�ȫ�����ͨ��
	public List<CourseResource> selectCourseResourceByKCBH(CourseResource courseResource);
	/**
	 * �޸Ķ�Ӧ�γ̵����пγ�״̬
	 * @author chen
	 * @param KCBH
	 * @return
	 * �޸�ʱ�� 2019.7.12
	 */
	public void updateCourseResourceStatus(CourseResource courseResource);
	
	//�Զ�����
    int countByExample(CourseResourceExample example);

    int deleteByExample(CourseResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseResource record);

    int insertSelective(CourseResource record);

    List<CourseResource> selectByExample(CourseResourceExample example);

    CourseResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseResource record, @Param("example") CourseResourceExample example);

    int updateByExample(@Param("record") CourseResource record, @Param("example") CourseResourceExample example);

    int updateByPrimaryKeySelective(CourseResource record);

    int updateByPrimaryKey(CourseResource record);
    
    List<CourseResource> selectByKCBH(String kcbh);
    
    List<CourseResource> adminCourseResource(CourseResource courseResource);
    
    int adminRemoveCourseResource(CourseResource courseResource);
    
    CourseResource courseResourceEdit(CourseResource courseResource);
    
    int adminUpdateResourceCourse(CourseResource courseResource); 
    
    int courseResourceAdd(CourseResource courseResource);
    
    int selectZJXH(CourseResource courseResource);
    
    List<CourseResource> selectCourseResource(CourseResource courseResource);
}