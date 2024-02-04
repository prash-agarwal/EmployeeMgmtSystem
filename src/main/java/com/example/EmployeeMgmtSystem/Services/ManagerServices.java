package com.example.EmployeeMgmtSystem.Services;
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

	public Manager createOrGetManager(Employee emp) {
		
		return managerRepo.findById(emp.getManager().getManagerId()).orElse(null);
		//In above code if we don't place this ".orElse(null)", then it will give error.
	}
		
}