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
	 * ���Ҷ�Ӧ��ŵĿγ���Դ�����ݿγ���Դ״̬���ز�ͬ��״̬��Ϣ
	 * 
	 * @author chen
	 * @param KCBH
	 * @return �޸�ʱ�� 2019.7.12
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
		int pass = 0;// ͨ��
		int refuse = 0;// δͨ��
		int undo = 0;// δ����
		int flag = 0;// �жϱ�ʶ,1����Դδͨ��,2��Դû�����,3��Դȫ��δͨ��,0��Դȫ��ͨ��,-1û����Դ
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
		if (refuse > 0) {// ��û��ͨ������Դ
			if (refuse == courseResourceList.size()) {
				// ��Դȫ��δͨ��
				flag = 3;
			} else {
				flag = 1;
			}
		} else {// ��Դȫ��ͨ������û�����
			if (undo > 0) {// ��Դû�����
				flag = 2;
			} else {
				if (pass > 0) {// ��Դȫ��ͨ��
					flag = 0;
				} else {// û����Դ
					flag = -1;
				}
			}
		}
		return flag;
	}

	/**
	 * �޸Ķ�Ӧ�γ̵����пγ�״̬
	 * 
	 * @author chen
	 * @param KCBH
	 * @return �޸�ʱ�� 2019.7.12
	 */
	@Override
	public void updateCourseResourceStatus(CourseResource courseResource) {
		// TODO Auto-generated method stub
		courseResourceMapper.updateCourseResourceStatus(courseResource);
	}

}
