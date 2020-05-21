package app.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.CourseResourceMapper;
import app.core.po.CourseResource;
import app.core.po.CourseResourceExample;
import app.core.po.CourseResourceExample.Criteria;
import app.core.service.CourseResourceService_m;

@Service
public class CourseResourceServiceImpl_m implements CourseResourceService_m {

	@Autowired
	public CourseResourceMapper courseResourceMapper;

	@Override
	public List<CourseResource> getAllResource() {
		// TODO Auto-generated method stub
		return courseResourceMapper.getAllResource();
	}

	@Override
	public CourseResource findCourseResource(Integer id, String kcbh) {
		// TODO Auto-generated method stub
		return courseResourceMapper.findCourseResource(id, kcbh);
	}

	@Override
	public void passCourseResource(CourseResource courseResource) {
		courseResourceMapper.passCourseResource(courseResource);
	}

	@Override
	public void refuseCourseResource(CourseResource courseResource) {
		courseResourceMapper.refuseCourseResource(courseResource);
	}

	@Override
	public void batchPassCourseResource(Integer id) {
		courseResourceMapper.batchPassCourseResource(id);
	}

	@Override
	public void batchRefuseCourseResource(Integer id) {
		courseResourceMapper.batchRefuseCourseResource(id);
	}

	@Override
	public List<CourseResource> getCourseResourceByCondition(CourseResource courseResource) {
		return courseResourceMapper.getCourseResourceByCondition(courseResource);
	}

	@Override
	public List<CourseResource> selectCourseResourceByKCBH(CourseResource courseResource) {
		return courseResourceMapper.selectCourseResourceByKCBH(courseResource);
	}

	/**
	 * 查找对应编号的课程资源，根据课程资源状态返回不同的状态信息
	 * 
	 * @author chen
	 * @param KCBH
	 * @return 修改时间 2019.7.12
	 */
	@Override
	public int getCourseResourceByKCBH(String kcbh) {
		List<CourseResource> courseOnsiteCreditList = new ArrayList<CourseResource>();
		CourseResourceExample example = new CourseResourceExample();
		Criteria criteria = example.createCriteria();
		criteria.andKcbhEqualTo(kcbh);
		List<CourseResource> courseResourceList = new ArrayList<CourseResource>();
		courseResourceList = courseResourceMapper.selectByExample(example);
		System.out.println(courseResourceList);
		int pass = 0;// 通过
		int refuse = 0;// 未通过
		int undo = 0;// 未处理
		int flag = 0;// 判断标识,1有资源未通过,2资源没有审核,3资源全部未通过,0资源全部通过,-1没有资源
		if (courseResourceList != null) {
			for (CourseResource cr : courseResourceList) {
//				System.out.println(cr);
				if(cr!=null){
					String bxzd1="0";
					if(cr.getBxzd_1()==null){
						bxzd1="0";
					}else{
						bxzd1=cr.getBxzd_1();
					}
					if (bxzd1.equals("1")) {					
						pass++;
					} else if (bxzd1.equals("2")) {
						refuse++;
					} else {
						undo++;
					}
				}
			}
		}
		if (refuse > 0) {// 有没有通过的资源
			if (refuse == courseResourceList.size()) {
				// 资源全部未通过
				flag = 3;
			} else {
				flag = 1;
			}
		} else {// 资源全部通过或者没有审核
			if (undo > 0) {// 资源没有审核
				flag = 2;
			} else {
				if (pass > 0) {// 资源全部通过
					flag = 0;
				} else {// 没有资源
					flag = -1;
				}
			}
		}
		return flag;
	}

	/**
	 * 修改对应课程的所有课程状态
	 * 
	 * @author chen
	 * @param KCBH
	 * @return 修改时间 2019.7.12
	 */
	@Override
	public void updateCourseResourceStatus(CourseResource courseResource) {
		// TODO Auto-generated method stub
		courseResourceMapper.updateCourseResourceStatus(courseResource);
	}

}
