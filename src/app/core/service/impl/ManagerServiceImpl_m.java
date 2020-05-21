package app.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.ManagerMapper;
import app.core.po.Manager;
import app.core.service.ManagerService_m;

@Service
public class ManagerServiceImpl_m implements ManagerService_m {
	
	@Autowired
	public ManagerMapper managerMapper;

	@Override
	public List<Manager> getAllManager() {		
		return managerMapper.getAllManager();
	}

	@Override
	public Manager findManager(String glyzh,Integer id) {	
		return managerMapper.findManager(glyzh,id);
	}

	@Override
	public void modifyManagerPassword(Manager manager) {
		managerMapper.modifyManagerPassword(manager);
	}

	@Override
	public void addManager(Manager manager) {
		managerMapper.addManager(manager);
	}

	@Override
	public void removeManager(String glyzh) {
		managerMapper.removeManager(glyzh);
	}

	@Override
	public void setupManager(String glyzh) {
		managerMapper.setupManager(glyzh);
	}

	@Override
	public void updateManager(Manager manager) {
		managerMapper.updateManager(manager);
	}
	
}
