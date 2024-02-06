package com.example.EmployeeMgmtSystem.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.EmployeeMgmtSystem.Models.Manager;
import com.example.EmployeeMgmtSystem.Models.Employee;
import com.example.EmployeeMgmtSystem.Repos.EmployeeRepo;
import com.example.EmployeeMgmtSystem.Repos.ManagerRepo;

@Service
public class EmployeeServices {
	
	@Autowired
	EmployeeRepo empRepo;
	
//	@Autowired
//	ManagerRepo managerRepo;
	@Autowired
	ManagerServices managerService; //Following the SOLID principles that Service file should
	//interact with service file instead of directly interacting with repo file.
	
	public void createEmployee(Employee emp ) {
		
		//we will have to create a object of class whose column is passed as foreign key in the
		//other class. For example here we are creating object of Manager class and passing
		//managerId from emp JSON object.
		//We are extracting manager object from emp object by passing the managerId in 
		//ManagerService Class.
		Manager manager = managerService.createOrGetManager(emp);

	    // Set the manager for the employee
	    emp.setManager(manager);
		empRepo.save(emp);
	}
}
