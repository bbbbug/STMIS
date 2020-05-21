package app.core.service;

import java.util.List;

import app.core.po.Manager;

public interface ManagerService_m {
	public abstract List<Manager> getAllManager();
	public abstract Manager findManager(String glyzh,Integer id);
	public abstract void modifyManagerPassword(Manager manager);
	public abstract void addManager(Manager manager);
	public abstract void removeManager(String glyzh);
	public abstract void setupManager(String glyzh);
	public abstract void updateManager(Manager manager);
}
