package app.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.CourseFeedbackMapper;
import app.core.po.CourseFeedback;
import app.core.po.CourseFeedbackExample;
import app.core.po.CourseFeedbackExample.Criteria;
import app.core.service.CourseFeedbackService_m;

@Service
public class CourseFeedbackServiceImpl_m implements CourseFeedbackService_m {
	
	@Autowired
	public CourseFeedbackMapper courseFeedbackMapper;
	
	
//	@Override
//	public List<CourseFeedback> getAllCourseFeedback() {
//		List<CourseFeedback> courseFeedbackList=new ArrayList<CourseFeedback>();
//		List<Feedback> feedbacks=new ArrayList<Feedback>();
//		Map<String,Double> kcbhsMap=new HashMap<String,Double>();//记录课程编号
//		courseFeedbackList=courseFeedbackMapper.selectByExample(null);//无条件的查询为null
//		boolean flag=false;//课程编号是否重复标志
//		//添加第一个课程编号到课程编号map中
//		if(courseFeedbackList!=null){
//			kcbhsMap.put(courseFeedbackList.get(0).getKcbh(),0.0);
//		}
//		//统计有多少门课程存在反馈信息，创建课程编号列表
//		for(CourseFeedback cf:courseFeedbackList){
////			kcbhs.forEach((key,value)->{lambda表达式支持jdk1.8以上的环境
////				
////			});
//			for(Map.Entry<String, Double> entry:kcbhsMap.entrySet()){
//				if(cf.getKcbh().equals(entry.getKey())){//存在相同的课程编号
//					flag=true;
//					break;
//				}else{
//					flag=false;
//					continue;
//				}
//			}
//			if(!flag){//有新的课程出现,添加到课程编号对应的map中
//				kcbhsMap.put(cf.getKcbh(),0.0);
//			}
//		}
//		//处理课程反馈表，计算课程反馈的分数
//		for(Map.Entry<String, Double> entry:kcbhsMap.entrySet()){
//			
//			for(CourseFeedback cf:courseFeedbackList){//分数叠加
//				
//			}
//		}
//		
//		return null;
//	}

	@Override
	public List<CourseFeedback> getAllCourseFeedbackWithExample(CourseFeedback courseFeedback) {	
		List<CourseFeedback> courseFeedbackList=new ArrayList<CourseFeedback>();
		CourseFeedbackExample example=new CourseFeedbackExample();
		Criteria criteria=example.createCriteria();
		criteria.andYgzhEqualTo(courseFeedback.getYgzh());//构造查询条件
		courseFeedbackList=courseFeedbackMapper.selectByExample(example);
		return courseFeedbackList;
	}

	@Override
	public List<CourseFeedback> findCourseFeedbackByExample(CourseFeedback courseFeedback) {
		List<CourseFeedback> courseFeedbackList=new ArrayList<CourseFeedback>();
		CourseFeedbackExample example=new CourseFeedbackExample();
		Criteria criteria=example.createCriteria();
		criteria.andYgzhEqualTo(courseFeedback.getYgzh());//构造查询条件-员工账号
		criteria.andKcbhEqualTo(courseFeedback.getKcbh());//构造查询条件-课程编号
		courseFeedbackList=courseFeedbackMapper.selectByExample(example);
		return courseFeedbackMapper.selectByExample(example);
	}

	@Override
	public void addBatchCourseFeedback(List<CourseFeedback> courseFeedbackList) {
		courseFeedbackMapper.addBatchCourseFeedback(courseFeedbackList);
	}

}
