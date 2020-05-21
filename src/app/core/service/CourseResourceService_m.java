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
	 * 查找对应编号的课程资源,根据课程资源状态返回不同的状态信息
	 * @author chen
	 * @param KCBH
	 * @return
	 * 修改时间 2019.7.12
	 */
	public abstract int getCourseResourceByKCBH(String kcbh);
	
	/**
	 * 修改对应课程的所有课程状态
	 * @author chen
	 * @param KCBH
	 * @return
	 * 修改时间 2019.7.12
	 */
	public abstract void updateCourseResourceStatus(CourseResource courseResource);
}
