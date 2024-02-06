package com.example.EmployeeMgmtSystem.Models;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
	
@Entity
public class Manager {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	public int managerId;
	
	public String managerName;
	
	@Column(name="designation")
	public String managerDesign;
	
	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerDesign() {
		return managerDesign;
	}

	public void setManagerDesign(String managerDesign) {
		this.managerDesign = managerDesign;
	}

	public List<Employee> getEmp() {
		return emp;
	}								

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	@OneToMany(mappedBy="manager") 			  
	List<Employee> emp;  //if we don't declare here List of Emlpoyees when we are using 
	//@OneToMany annotation, then table won't get created in db
}
//above mentioned attributes were'nt declared alongwith accessModifier as public and 
//their values were'nt getting inserted in the Manager table. Kindly check.