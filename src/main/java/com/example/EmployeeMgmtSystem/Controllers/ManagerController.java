package com.example.EmployeeMgmtSystem.Controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.EmployeeMgmtSystem.Models.Employee;
import com.example.EmployeeMgmtSystem.Models.Manager;
import com.example.EmployeeMgmtSystem.Services.ManagerServices;

//import jakarta.websocket.server.PathParam;

@RestController
public class ManagerController {

	@Autowired
	ManagerServices managerService;
	
	@PostMapping("/createManager")
	public void createManager(@RequestBody Manager manager) {
		if(manager!=null) 
			managerService.createEmployee(manager);
	}
	@GetMapping("/getManagers")
	public List<Manager> getManagers(){
		return managerService.getManagers();
	}
	
	@PostMapping("/getManager/{id}")
	public Manager getManager(@PathVariable int id) {
		return managerService.getManager(id);
	}	
}
