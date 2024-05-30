package com.example.EmployeeMgmtSystem.Models;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
	
@Entity
public class Manager {
	
	public Manager() {
		
	}
	public Manager(int managerId, String managerName,String managerDesign,List<Employee> emp) {
		this.managerId=managerId;
		this.managerName=managerName;
		this.managerDesign=managerDesign;
		this.emp=emp;
	}
	public Manager(int managerId, String managerName,String managerDesign) {
		this.managerId=managerId;
		this.managerName=managerName;
		this.managerDesign=managerDesign;
		//this.emp=emp;
	}
	
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
	@JsonIgnoreProperties(value="manager")
	List<Employee> emp;  //if we don't declare here List of Emlpoyees when we are using 
	//@OneToMany annotation, then table won't get created in db
	
	
//	The @JsonIgnoreProperties annotation in the context of the @OneToMany relationship 
//	helps manage the serialization and deserialization of JSON objects, preventing 
//	issues such as infinite recursion or redundant data.
	
	//From above if we remove JsonIgnoreProperties, then getEmployee in Employee class 
	//and getManager in Manager class won't work.
	//JSON example
//	{
//		  "managerName": "John Doe",
//		  "managerDesign": "Senior Manager",
//		  "emp": [
//		    {
//		      "empId": 1,
//		      "empName": "Alice",
//		      "empDesign": "Developer"
//		    },
//		    {
//		      "empId": 2,
//		      "empName": "Bob",
//		      "empDesign": "Tester"
//		    }
//		  ]
//		}
}
//above mentioned attributes were'nt declared alongwith accessModifier as public and 
//their values were'nt getting inserted in the Manager table. Kindly check.