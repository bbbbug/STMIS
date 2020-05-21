package app.core.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.util.JSONPObject;

import app.core.po.CourseFeedback;
import app.core.po.CourseFeedbackAll;
import app.core.po.Msg;
import app.core.service.CourseFeedbackAllService_m;
import app.core.service.CourseFeedbackService_m;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@RequestMapping("/course")
@Controller
public class CourseFeedbackController_m {
	@Autowired
	public CourseFeedbackService_m courseFeedbackServcie;	
	
	@Autowired
	public CourseFeedbackAllService_m courseFeedbackAllService;
	
	/**
	 * ����������ѯ���еķ������¼(Ա���˻�)
	 * @author chen
	 * @return
	 */
	@RequestMapping("/getAllCourseFeedbackWithExample")
	@ResponseBody
	public Msg getAllCourseFeedbackWithExample(HttpServletResponse response/*,@RequestBody CourseFeedback courseFeedback*/){
		//����
		CourseFeedback courseFeedback=new CourseFeedback();
		courseFeedback.setYgzh("bbbug");
		
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
        //���¼�¼������(һ��Ա��һ����¼)
		List<CourseFeedback> courseFeedbackList=new ArrayList<CourseFeedback>();
		courseFeedbackList=courseFeedbackServcie.getAllCourseFeedbackWithExample(courseFeedback);
		return Msg.success().add("getAllCourseFeedbackWithExample", courseFeedbackList);
	}
	
	/**
	 * ���ݿγ̷������Ա���˺źͿγ̱�Ų�ѯ��Ӧ�ļ�¼�б���ʾ�ڸ��˶��ڿγ̵ļ�¼����,
	 * ÿһ����¼��Ӧһ��ѡ��
	 * @author chen
	 * @param id
	 * @param response
	 * @return
	 */
	@RequestMapping("/findCourseFeedbackByExample")
	@ResponseBody
	public JSONPObject findCourseFeedbackByExample(String callback,CourseFeedback courseFeedback,HttpServletResponse response){
		//����
//		CourseFeedback courseFeedback=new CourseFeedback();
//		courseFeedback.setYgzh("bbbug");
//		courseFeedback.setKcbh("dianzi385379");
		
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
		List<CourseFeedback> courseFeedbackList=new ArrayList<CourseFeedback>();
		courseFeedbackList=courseFeedbackServcie.findCourseFeedbackByExample(courseFeedback);
		JSONPObject jsonpObject=new JSONPObject(callback,Msg.success().add("findCourseFeedbackByExample", courseFeedbackList));
		return jsonpObject;
//		return Msg.success().add("findCourseFeedbackByExample", courseFeedbackList);
	}
	
	/**
	 * ѧԱ��ӿγ̷�����¼��ͨ��ÿ�����������������ʽ����
	 * @param courseFeedback
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping("/addCourseFeedback")//����������ʽ����Ŀ������̨@RequestParam("batchAddCourseFeedback[]") List<Integer> courseFeedbackList
	@ResponseBody
	public JSONPObject addCourseFeedback(@RequestParam("batchAddCourseFeedback[]") String batchAddCourseFeedback,String callback ,HttpServletResponse response) throws ParseException{
		//�����������
		//��¼1
		List<CourseFeedback> courseFeedbackList=new ArrayList<CourseFeedback>();
//		CourseFeedback courseFeedback=new CourseFeedback();
//		courseFeedback.setKcbh("dianzi385379");
//		courseFeedback.setKcmc("AutoCAD��ѽ̳�");
//		courseFeedback.setKcjs("������ʦ");
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date date = dateFormat.parse("2019-07-05 16:27:32");
//		courseFeedback.setJksj(date);
//		courseFeedback.setYgmc("bbbug");
//		courseFeedback.setYgzh("bbbug");
//		courseFeedback.setFkjg("A");//ƴ����ʽ����̨
//		courseFeedback.setFktmlx("ѡ����");
//		courseFeedback.setTmbh(3);
		//��¼2
//		CourseFeedback courseFeedback1=new CourseFeedback();
//		courseFeedback1.setKcbh("dianzi385379");
//		courseFeedback1.setKcmc("AutoCAD��ѽ̳�");
//		courseFeedback1.setKcjs("������ʦ");
//		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date date1 = dateFormat.parse("2019-07-05 16:27:32");
//		courseFeedback1.setJksj(date1);
//		courseFeedback1.setYgmc("bbbug");
//		courseFeedback1.setYgzh("bbbug");
//		courseFeedback1.setFkjg("B");//ƴ����ʽ����̨
//		courseFeedback1.setFktmlx("ѡ����");
//		courseFeedback1.setTmbh(4);
//		courseFeedbackList.add(courseFeedback);
//		courseFeedbackList.add(courseFeedback1);
		
		
		//����
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //����ͻ��˷���cookies true��ʾ���գ�false������ Ĭ��Ϊfalse
        response.addHeader("Access-Control-Allow-Credentials","true");
        
        //��json����ת����list
        JSONArray jsonArray=JSONArray.fromObject(batchAddCourseFeedback);
        System.out.println(jsonArray);
        for(int i=0;i<jsonArray.size();i++){
        	JSONObject jsonObject=new JSONObject();
        	jsonObject=jsonArray.getJSONObject(i);
        	CourseFeedback courseFeedback=new CourseFeedback();
        	courseFeedback.setKcbh((String)jsonObject.get("kcbh"));
        	courseFeedback.setKcmc((String)jsonObject.get("kcmc"));
        	System.out.println("�γ̱��"+jsonObject);
        	courseFeedback.setKcjs((String)jsonObject.get("kcjs"));
        	String date=(String)jsonObject.get("jksj");
        	courseFeedback.setJksj(new Date());
//        	courseFeedback.setYgmc(jsonObject.getString("ygmc"));
        	courseFeedback.setYgzh((String)jsonObject.get("ygzh"));
        	courseFeedback.setYgmc((String)jsonObject.get("ygmc"));
        	courseFeedback.setFkjg((String)jsonObject.get("fkjg"));
        	courseFeedback.setFktmlx((String)jsonObject.get("fktmlx"));
        	courseFeedback.setTmbh(Integer.parseInt((String)jsonObject.get("tmbh")));
        	courseFeedbackList.add(courseFeedback);
        }
        
        //�γ̷����𰸼�¼����ÿ����Ŀ���뵽����
        courseFeedbackServcie.addBatchCourseFeedback(courseFeedbackList); 
        //���������ͬʱ���뵽course_feedback_all����
        CourseFeedbackAll courseFeedbackAll=new CourseFeedbackAll();//�����ּܷ�¼       
        //�����γ̷����𰸼�¼����װ�ɿγ̷����ܼ�¼һ�ű�����course_feedback_all,һ�ν����γ�һ����¼
        CourseFeedback courseFeedback=new CourseFeedback();
        courseFeedback=courseFeedbackList.get(0);
        courseFeedbackAll.setKcbh(courseFeedback.getKcbh());
        courseFeedbackAll.setKcmc(courseFeedback.getKcmc());
        courseFeedbackAll.setKcjs(courseFeedback.getKcjs());
        courseFeedbackAll.setJksj(courseFeedback.getJksj());
        courseFeedbackAll.setYgzh(courseFeedback.getYgzh());
        courseFeedbackAll.setYgmc(courseFeedback.getYgmc());      
        //��װÿ���˷����Ļ�����Ϣ
        double pjfs=0.0;//�������۷���
        double score=0.0;//�ۼƷ���
        int totalLevel=45;//��ָ����
        double totalScore=100;//�ܷ���
        for(CourseFeedback cf:courseFeedbackList){//����γ̷�����ķ���        	        	
        	if(cf.getFktmlx().equals("ѡ����")){
        		//����ѡ�������
        		if(cf.getFkjg().equals("A")){
        			score+=5;
        		}else if(cf.getFkjg().equals("B")){
        			score+=4;
        		}else if(cf.getFkjg().equals("C")){
        			score+=3;
        		}else if(cf.getFkjg().equals("D")){
        			score+=2;
        		}else if(cf.getFkjg().equals("E")){
        			score+=1;
        		}
        	}else{//�ı��ⲻ������
        		
        	}
        }
        pjfs=(score/totalLevel)*totalScore;
        courseFeedbackAll.setPjfs(pjfs);
        courseFeedbackAllService.addCourseFeedbackAll(courseFeedbackAll);
		JSONPObject jsonpObject=new JSONPObject(callback,Msg.success());
		return jsonpObject;
		//return Msg.success();
	}
	
}
