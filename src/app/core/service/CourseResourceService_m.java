package app.core.service;

import java.util.List;

import app.core.po.CourseResource;

public interface CourseResourceService_m {
	public abstract List<CourseResource> getAllResource();
	public abstract CourseResource findCourseResource(Integer id,String kcbh);
	public abstract void passCourseResource(CourseResource courseResource);
	public abstract void refuseCourseResource(CourseResource courseResource);
	public abstract void batchPassCourseResource(Integer id);
	public abstract void batchRefuseCourseResource(Integer id);
	public abstract List<CourseResource> getCourseResourceByCondition(CourseResource courseResource);
	public abstract List<CourseResource> selectCourseResourceByKCBH(CourseResource courseResource);
	
	/**
	 * ���Ҷ�Ӧ��ŵĿγ���Դ,���ݿγ���Դ״̬���ز�ͬ��״̬��Ϣ
	 * @author chen
	 * @param KCBH
	 * @return
	 * �޸�ʱ�� 2019.7.12
	 */
	public abstract int getCourseResourceByKCBH(String kcbh);
	
	/**
	 * �޸Ķ�Ӧ�γ̵����пγ�״̬
	 * @author chen
	 * @param KCBH
	 * @return
	 * �޸�ʱ�� 2019.7.12
	 */
	public abstract void updateCourseResourceStatus(CourseResource courseResource);
}
