package com.example.EmployeeMgmtSystem.Services;
import java.util.List;

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
	
	@Autowired
	ManagerServices managerService; //Following the SOLID principles that Service file should
	//interact with service file instead of directly interacting with repo file.
	
	public void createEmployee(Employee emp ) {
		//Below code will create duplicate entries in Manager Table. 
		managerService.insertManager(emp);
		empRepo.save(emp);
		
		//OR
			
		//Below code won't create duplicate entries in Manager Table.
		//Manager manager=managerService.insertOrGetManager(emp);
		
	}
	/*API call will be same for both of them.
	{     
		  "empName":"Ravi",
		  "empDesign":"SDE",
		  "manager": {             
		  "managerId": 4,   
		  "managerName":"Shiva",
		  "managerDesign":"Prime"
		}
		}*/

	public List<Employee> getEmployees() {
		return empRepo.findAll();
	}
}


//we will have to create a object of class whose column is passed as foreign key in the
		//other class. For example here we are creating object of Manager class and passing
		//managerId from emp JSON object.
		//We are extracting manager object from emp object by passing the managerId in 
		//ManagerService Class.	 
	

		
		//if directly save the details of employee without specifying the details of author
		//then below will be the API Call.
//		{     
//		    "empName":"Munna",
//		    "empDesign":"SE"
//		}