package com.example.EmployeeMgmtSystem.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.EmployeeMgmtSystem.Models.Employee;
import com.example.EmployeeMgmtSystem.Services.EmployeeServices;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServices empService;	
	
	@PostMapping("/createEmployee")
	public void createEmployee(@RequestBody Employee emp) {
		empService.createEmployee(emp);
	}
}
