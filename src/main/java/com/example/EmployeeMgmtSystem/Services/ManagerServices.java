package com.example.EmployeeMgmtSystem.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeMgmtSystem.Models.Employee;
import com.example.EmployeeMgmtSystem.Models.Manager;
import com.example.EmployeeMgmtSystem.Repos.ManagerRepo;

@Service
public class ManagerServices {

	@Autowired
	ManagerRepo managerRepo;

	public void createEmployee(Manager manager) {
		managerRepo.save(manager);	
	}

	public void insertManager(Employee emp) {
	
		Manager manager=emp.getManager();
		managerRepo.save(manager);
	}
	
	public Manager insertOrGetManager(Employee emp) {
		
		Manager manager=managerRepo.findById(emp.getManager().getManagerId()).orElse(null);
		//In above code if we don't place this ".orElse(null)", then it will give error.
		
		if(manager==null)
			managerRepo.save(manager);
		return manager;
	}

	public List<Manager> getManagers() {
		
		return managerRepo.findAll();
	}
}
