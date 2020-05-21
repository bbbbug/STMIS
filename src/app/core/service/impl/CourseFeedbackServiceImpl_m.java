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
//		Map<String,Double> kcbhsMap=new HashMap<String,Double>();//��¼�γ̱��
//		courseFeedbackList=courseFeedbackMapper.selectByExample(null);//�������Ĳ�ѯΪnull
//		boolean flag=false;//�γ̱���Ƿ��ظ���־
//		//��ӵ�һ���γ̱�ŵ��γ̱��map��
//		if(courseFeedbackList!=null){
//			kcbhsMap.put(courseFeedbackList.get(0).getKcbh(),0.0);
//		}
//		//ͳ���ж����ſγ̴��ڷ�����Ϣ�������γ̱���б�
//		for(CourseFeedback cf:courseFeedbackList){
////			kcbhs.forEach((key,value)->{lambda���ʽ֧��jdk1.8���ϵĻ���
////				
////			});
//			for(Map.Entry<String, Double> entry:kcbhsMap.entrySet()){
//				if(cf.getKcbh().equals(entry.getKey())){//������ͬ�Ŀγ̱��
//					flag=true;
//					break;
//				}else{
//					flag=false;
//					continue;
//				}
//			}
//			if(!flag){//���µĿγ̳���,��ӵ��γ̱�Ŷ�Ӧ��map��
//				kcbhsMap.put(cf.getKcbh(),0.0);
//			}
//		}
//		//����γ̷���������γ̷����ķ���
//		for(Map.Entry<String, Double> entry:kcbhsMap.entrySet()){
//			
//			for(CourseFeedback cf:courseFeedbackList){//��������
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
		criteria.andYgzhEqualTo(courseFeedback.getYgzh());//�����ѯ����
		courseFeedbackList=courseFeedbackMapper.selectByExample(example);
		return courseFeedbackList;
	}

	@Override
	public List<CourseFeedback> findCourseFeedbackByExample(CourseFeedback courseFeedback) {
		List<CourseFeedback> courseFeedbackList=new ArrayList<CourseFeedback>();
		CourseFeedbackExample example=new CourseFeedbackExample();
		Criteria criteria=example.createCriteria();
		criteria.andYgzhEqualTo(courseFeedback.getYgzh());//�����ѯ����-Ա���˺�
		criteria.andKcbhEqualTo(courseFeedback.getKcbh());//�����ѯ����-�γ̱��
		courseFeedbackList=courseFeedbackMapper.selectByExample(example);
		return courseFeedbackMapper.selectByExample(example);
	}

	@Override
	public void addBatchCourseFeedback(List<CourseFeedback> courseFeedbackList) {
		courseFeedbackMapper.addBatchCourseFeedback(courseFeedbackList);
	}

}
