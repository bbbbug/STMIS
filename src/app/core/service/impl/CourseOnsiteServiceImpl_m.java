package app.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.CourseOnsiteMapper;
import app.core.po.CourseOnsite;
import app.core.po.CourseOnsiteExample;
import app.core.po.CourseOnsiteExample.Criteria;
import app.core.service.CourseOnsiteService_m;

@Service
public class CourseOnsiteServiceImpl_m implements CourseOnsiteService_m {
	
	@Autowired
	public CourseOnsiteMapper courseOnsiteMapper;
	
	@Override
	public void addCourseOnsite(CourseOnsite courseOnsite) {
		courseOnsiteMapper.insertSelective(courseOnsite);		
	}

	@Override
	public CourseOnsite findCourseOnsite(Integer id) {
		return courseOnsiteMapper.selectByPrimaryKey(id);		
	}

	@Override
	public List<CourseOnsite> getAllCourseOnsite() {		
		return courseOnsiteMapper.getAllCourseOnsite();
	}
	
	@Override
	public void updateCourseOnsite(CourseOnsite courseOnsite){
		courseOnsiteMapper.updateByPrimaryKey(courseOnsite);
	}

	@Override
	public void delCourseOnsite(CourseOnsite courseOnsite) {
		courseOnsiteMapper.delCourseOnsite(courseOnsite);
	}


	/**
	 * 通过培训组织部门进行筛选
	 * @author chen
	 * 修改时间:2019.7.11
	 *  7.11晚上22.06未更新部分
	 */
	@Override
	public List<CourseOnsite> getCourseOnsiteWithExample(CourseOnsite courseOnsite) {
		List<CourseOnsite> courseOnsiteList=new ArrayList<CourseOnsite>();
		CourseOnsiteExample example=new CourseOnsiteExample();
		Criteria criteria=example.createCriteria();
//		criteria.andPxsjLessThanOrEqualTo(courseOnsite.getPxsj());//构造查询条件
		if(courseOnsite.getPxzzbm().equals("")){
			example=null;
		}else{
			criteria.andPxzzbmEqualTo(courseOnsite.getPxzzbm());//根据培训组织部门筛选查询
		}
	
		courseOnsiteList=courseOnsiteMapper.selectByExample(example);
		return courseOnsiteList;
	}
	

}
