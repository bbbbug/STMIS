package app.core.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import app.core.po.Manager;
import app.core.po.Msg;
import app.core.service.ManagerService_m;

@Controller
@RequestMapping("/manager")
public class ManagerController_m {
	
	@Autowired
	public ManagerService_m managerService;
	
	/**
	 * 从session中获取当前登录的管理员账户信息
	 * 修改时间: 2019.9.2
	 * @author chen
	 * @return
	 */
	@RequestMapping("/managerAccount")
	@ResponseBody
	public Msg getCurrentManagerAccount(Model model,HttpServletRequest request){
		Manager manager=new Manager();
		String glyzh="";
		HttpSession session=request.getSession();
		glyzh=(String)session.getAttribute("username");
		System.out.println(glyzh);
		return Msg.success().add("managerAccount", glyzh);
	}
	
	/**
	 * 让当前管理员无法修改自身的信息和权限
	 * @author chen
	 * @param model
	 * @param request
	 * @return
	 * 修改时间：2019.9.8
	 */
	@RequestMapping("/managerList")
	@ResponseBody
	public List<Manager> getAllManager(Model model,HttpServletRequest request){
		List<Manager> managerList=new ArrayList<Manager>();
//		Manager manager=new Manager();
		String glyzh="";
		HttpSession session=request.getSession();
		glyzh=(String)session.getAttribute("username");
		managerList=managerService.getAllManager();
		for(Manager m:managerList){
			if(m.getGlyzh().equals(glyzh)){
				managerList.remove(m);
				break;
			}
		}
		return managerList;
	}
	
	@RequestMapping("/findManager")
	@ResponseBody
	public Manager findManager(Model model,@RequestParam("id") Integer id,@RequestParam("glyzh") String glyzh){
		//System.out.println("id"+id+"glyzh"+glyzh);
		Manager manager=new Manager();
		manager=managerService.findManager(glyzh, id);
		return manager;
	}
	
	@RequestMapping("/modifyManagerPassword")
	@ResponseBody
	public HashMap<String,String> modifyManagerPassword(Model model,@RequestBody Manager manager){
		HashMap<String,String> passwordModify=new HashMap<String,String>();
		managerService.modifyManagerPassword(manager);
		passwordModify.put("passwordModify", "success");
		return passwordModify;
	}
	
	@RequestMapping("/addManager")
	@ResponseBody
	public HashMap<String,String> addManager(Model model,@RequestBody Manager manager){
		HashMap<String,String> managerAdd=new HashMap<String,String>();
		managerService.addManager(manager);
		managerAdd.put("managerAdd", "success");
		return managerAdd;
	}
	
	@RequestMapping("/removeManager")
	@ResponseBody
	public HashMap<String,String> removeManager(Model model,@RequestParam("glyzh") String glyzh){
		HashMap<String,String> managerRemove=new HashMap<String,String>();
		managerService.removeManager(glyzh);
		managerRemove.put("managerRemove", "success");
		return managerRemove;
	}
	
	@RequestMapping("/setupManager")
	@ResponseBody
	public HashMap<String,String> setupManager(Model model,@RequestParam("glyzh") String glyzh){
		HashMap<String,String> managerSetup=new HashMap<String,String>();
		managerService.setupManager(glyzh);
		managerSetup.put("managerSetup", "success");
		return managerSetup;
	}
	
	@RequestMapping("/updateManager")
	@ResponseBody
	public HashMap<String,String> updateManager(Model model,@RequestBody Manager manager){
		HashMap<String,String> managerUpdate=new HashMap<String,String>();
		managerService.updateManager(manager);
		managerUpdate.put("managerUpdate", "success");
		return managerUpdate;
	} 
}
