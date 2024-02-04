package com.example.EmployeeMgmtSystem.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeMgmtSystem.Models.Employee;
import com.example.EmployeeMgmtSystem.Models.Manager;
import com.example.EmployeeMgmtSystem.Services.ManagerServices;

@RestController
public class ManagerController {

	@Autowired
	ManagerServices managerService;
	
	@PostMapping("/createManager")
	public void createManager(@RequestBody Manager manager) {
		if(manager!=null) 
			managerService.createEmployee(manager);
	}
}
