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
		//���ݿγ̱�ż����Ӧ�Ŀγ̷���
		List<String> kcbhs=new ArrayList<String>();//��¼�γ̱��
        boolean flag=false;//�γ̱���Ƿ��ظ��ı�ʶ
        if(courseFeedbackAllList.size()>0){
        	kcbhs.add(courseFeedbackAllList.get(0).getKcbh());//����γ̱��
        }
        //ͳ���ж��ٸ���ͬ�Ŀγ�(���տγ̱��ͳ��)
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
        	if(!flag){//û����ͬ�Ŀγ̱��
        		kcbhs.add(cfa.getKcbh());
        	}
        }
        //���㲻ͬ�γ̵��ܷ�        
        for(String kcbh:kcbhs){
        	Feedback feedback=new Feedback();  
        	Double kcfs=new Double(0);
        	feedback.setKcbh(kcbh);
        	int totalPerson=0;//����ÿ�ſγ̵Ĳμ�����
        	for(CourseFeedbackAll cfa:courseFeedbackAllList){//�����Ȩ�ܷ�        		
        		if(cfa.getKcbh().equals(kcbh)){
        			totalPerson++;//�����Ӧ�γ̵Ĳμ�����
        			kcfs+=cfa.getPjfs();        			
        			feedback.setKcmc(cfa.getKcmc());
        			feedback.setKcjs(cfa.getKcjs());
        			feedback.setJksj(cfa.getJksj());
        		}
        	}
        	feedback.setFkfs(kcfs/totalPerson);//����Ӧ�γ̵��ַܷ������
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
