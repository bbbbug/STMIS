package app.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.CourseFeedbackAllMapper;
import app.core.po.CourseFeedbackAll;
import app.core.po.CourseFeedbackAllExample;
import app.core.po.CourseFeedbackAllExample.Criteria;
import app.core.po.Feedback;
import app.core.service.CourseFeedbackAllService_m;

@Service
public class CourseFeedbackAllServiceImpl_m implements CourseFeedbackAllService_m {
	
	@Autowired
	CourseFeedbackAllMapper courseFeedbackAllMapper;

	@Override
	public List<Feedback> getAllFeedback() {
		List<CourseFeedbackAll> courseFeedbackAllList=new ArrayList<CourseFeedbackAll>();
		List<Feedback> feedbackList=new ArrayList<Feedback>();
		courseFeedbackAllList=courseFeedbackAllMapper.selectByExample(null);
		//根据课程编号计算对应的课程分数
		List<String> kcbhs=new ArrayList<String>();//记录课程编号
        boolean flag=false;//课程编号是否重复的标识
        if(courseFeedbackAllList.size()>0){
        	kcbhs.add(courseFeedbackAllList.get(0).getKcbh());//放入课程编号
        }
        //统计有多少个不同的课程(按照课程编号统计)
        for(CourseFeedbackAll cfa:courseFeedbackAllList){
        	for(String kcbh:kcbhs){
        		if(cfa.getKcbh().equals(kcbh)){
        			flag=true;
        			break;
        		}else{
        			flag=false;
        			continue;
        		}
        	}
        	if(!flag){//没有相同的课程编号
        		kcbhs.add(cfa.getKcbh());
        	}
        }
        //计算不同课程的总分        
        for(String kcbh:kcbhs){
        	Feedback feedback=new Feedback();  
        	Double kcfs=new Double(0);
        	feedback.setKcbh(kcbh);
        	int totalPerson=0;//计算每门课程的参加人数
        	for(CourseFeedbackAll cfa:courseFeedbackAllList){//计算加权总分        		
        		if(cfa.getKcbh().equals(kcbh)){
        			totalPerson++;//计算对应课程的参加人数
        			kcfs+=cfa.getPjfs();        			
        			feedback.setKcmc(cfa.getKcmc());
        			feedback.setKcjs(cfa.getKcjs());
        			feedback.setJksj(cfa.getJksj());
        		}
        	}
        	feedback.setFkfs(kcfs/totalPerson);//将对应课程的总分放入表中
        	feedbackList.add(feedback);
        }
		
		return feedbackList;
	}
	
	@Override
	public List<CourseFeedbackAll> getAllFeedBackWithKCBH(String kcbh) {
		List<CourseFeedbackAll> courseFeedbackAllList=new ArrayList<CourseFeedbackAll>();
		CourseFeedbackAllExample example=new CourseFeedbackAllExample();
		Criteria criteria=example.createCriteria();
		criteria.andKcbhEqualTo(kcbh);
		courseFeedbackAllList=courseFeedbackAllMapper.selectByExample(example);
		return courseFeedbackAllList;
	}

	@Override
	public void addCourseFeedbackAll(CourseFeedbackAll courseFeedbackAll) {		
		courseFeedbackAllMapper.insertSelective(courseFeedbackAll);
	}

	@Override
	public CourseFeedbackAll selectfbcak(CourseFeedbackAll courseFeedbackAll) {
		return courseFeedbackAllMapper.selectfback(courseFeedbackAll);
	}

}
