package com.example.EmployeeMgmtSystem.Models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
public class Employee {

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesign() {
		return empDesign;
	}

	public void setEmpDesign(String empDesign) {
		this.empDesign = empDesign;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;		
	}

	@Id									
	@GeneratedValue(strategy=GenerationType.AUTO)
	public 
	int empId;
	
	//@NotNull
	public String empName;
	
	//@NotNull
	@Column(name="designation")
	public String empDesign;
	
	@ManyToOne		
	@JoinColumn
	Manager manager;  //managerId will be added as foreign key.
}
//while passing data thru postman we don't need to specify the value for the primary key.
//Below is the Example of how to pass data for createEmployee Api in Postman. 
//{     
//    "empName":"Munna",
//    "empDesign":"SE",
//    "manager": {             
//    "managerId": 4,   //if we don't provide managerName and managerDesign, then also it will work,but we need to specify the managerId.
//    "managerName":"Shiva",
//    "managerDesign":"Prime"
//  }
//}