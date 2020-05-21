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
	 * 根据条件查询所有的反馈表记录(员工账户)
	 * @author chen
	 * @return
	 */
	@RequestMapping("/getAllCourseFeedbackWithExample")
	@ResponseBody
	public Msg getAllCourseFeedbackWithExample(HttpServletResponse response/*,@RequestBody CourseFeedback courseFeedback*/){
		//测试
		CourseFeedback courseFeedback=new CourseFeedback();
		courseFeedback.setYgzh("bbbug");
		
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
        //线下记录反馈表(一个员工一条记录)
		List<CourseFeedback> courseFeedbackList=new ArrayList<CourseFeedback>();
		courseFeedbackList=courseFeedbackServcie.getAllCourseFeedbackWithExample(courseFeedback);
		return Msg.success().add("getAllCourseFeedbackWithExample", courseFeedbackList);
	}
	
	/**
	 * 根据课程反馈表的员工账号和课程编号查询对应的记录列表显示在个人对于课程的记录表中,
	 * 每一条记录对应一个选项
	 * @author chen
	 * @param id
	 * @param response
	 * @return
	 */
	@RequestMapping("/findCourseFeedbackByExample")
	@ResponseBody
	public JSONPObject findCourseFeedbackByExample(String callback,CourseFeedback courseFeedback,HttpServletResponse response){
		//测试
//		CourseFeedback courseFeedback=new CourseFeedback();
//		courseFeedback.setYgzh("bbbug");
//		courseFeedback.setKcbh("dianzi385379");
		
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
		List<CourseFeedback> courseFeedbackList=new ArrayList<CourseFeedback>();
		courseFeedbackList=courseFeedbackServcie.findCourseFeedbackByExample(courseFeedback);
		JSONPObject jsonpObject=new JSONPObject(callback,Msg.success().add("findCourseFeedbackByExample", courseFeedbackList));
		return jsonpObject;
//		return Msg.success().add("findCourseFeedbackByExample", courseFeedbackList);
	}
	
	/**
	 * 学员添加课程反馈记录，通过每道题以批量处理的形式插入
	 * @param courseFeedback
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping("/addCourseFeedback")//用批量的形式将题目传到后台@RequestParam("batchAddCourseFeedback[]") List<Integer> courseFeedbackList
	@ResponseBody
	public JSONPObject addCourseFeedback(@RequestParam("batchAddCourseFeedback[]") String batchAddCourseFeedback,String callback ,HttpServletResponse response) throws ParseException{
		//批量插入测试
		//记录1
		List<CourseFeedback> courseFeedbackList=new ArrayList<CourseFeedback>();
//		CourseFeedback courseFeedback=new CourseFeedback();
//		courseFeedback.setKcbh("dianzi385379");
//		courseFeedback.setKcmc("AutoCAD免费教程");
//		courseFeedback.setKcjs("面团老师");
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date date = dateFormat.parse("2019-07-05 16:27:32");
//		courseFeedback.setJksj(date);
//		courseFeedback.setYgmc("bbbug");
//		courseFeedback.setYgzh("bbbug");
//		courseFeedback.setFkjg("A");//拼接形式到后台
//		courseFeedback.setFktmlx("选择题");
//		courseFeedback.setTmbh(3);
		//记录2
//		CourseFeedback courseFeedback1=new CourseFeedback();
//		courseFeedback1.setKcbh("dianzi385379");
//		courseFeedback1.setKcmc("AutoCAD免费教程");
//		courseFeedback1.setKcjs("面团老师");
//		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date date1 = dateFormat.parse("2019-07-05 16:27:32");
//		courseFeedback1.setJksj(date1);
//		courseFeedback1.setYgmc("bbbug");
//		courseFeedback1.setYgzh("bbbug");
//		courseFeedback1.setFkjg("B");//拼接形式到后台
//		courseFeedback1.setFktmlx("选择题");
//		courseFeedback1.setTmbh(4);
//		courseFeedbackList.add(courseFeedback);
//		courseFeedbackList.add(courseFeedback1);
		
		
		//跨域
		response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Max-Age","100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        //允许客户端发送cookies true表示接收，false不接受 默认为false
        response.addHeader("Access-Control-Allow-Credentials","true");
        
        //将json数组转换成list
        JSONArray jsonArray=JSONArray.fromObject(batchAddCourseFeedback);
        System.out.println(jsonArray);
        for(int i=0;i<jsonArray.size();i++){
        	JSONObject jsonObject=new JSONObject();
        	jsonObject=jsonArray.getJSONObject(i);
        	CourseFeedback courseFeedback=new CourseFeedback();
        	courseFeedback.setKcbh((String)jsonObject.get("kcbh"));
        	courseFeedback.setKcmc((String)jsonObject.get("kcmc"));
        	System.out.println("课程编号"+jsonObject);
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
        
        //课程反馈答案记录表，将每道题目插入到答案中
        courseFeedbackServcie.addBatchCourseFeedback(courseFeedbackList); 
        //计算分数，同时插入到course_feedback_all表中
        CourseFeedbackAll courseFeedbackAll=new CourseFeedbackAll();//构造总分记录       
        //遍历课程反馈答案记录表，组装成课程反馈总记录一张表，插入course_feedback_all,一次交互形成一条记录
        CourseFeedback courseFeedback=new CourseFeedback();
        courseFeedback=courseFeedbackList.get(0);
        courseFeedbackAll.setKcbh(courseFeedback.getKcbh());
        courseFeedbackAll.setKcmc(courseFeedback.getKcmc());
        courseFeedbackAll.setKcjs(courseFeedback.getKcjs());
        courseFeedbackAll.setJksj(courseFeedback.getJksj());
        courseFeedbackAll.setYgzh(courseFeedback.getYgzh());
        courseFeedbackAll.setYgmc(courseFeedback.getYgmc());      
        //组装每个人反馈的基本信息
        double pjfs=0.0;//最终评价分数
        double score=0.0;//累计分数
        int totalLevel=45;//总指标数
        double totalScore=100;//总分数
        for(CourseFeedback cf:courseFeedbackList){//计算课程反馈表的分数        	        	
        	if(cf.getFktmlx().equals("选择题")){
        		//计算选择题分数
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
        	}else{//文本题不做处理
        		
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
