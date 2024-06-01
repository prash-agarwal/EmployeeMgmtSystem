package com.example.EmployeeMgmtSystem.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Disabled;
//import org.glassfish.jaxb.runtime.v2.schemagen.xmlschema.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.EmployeeMgmtSystem.Models.Employee;
import com.example.EmployeeMgmtSystem.Repos.EmployeeRepo;

@SpringBootTest      //Its used to start the ApplicationContext or the Application.
public class EmployeeServicesTests {

//	@Autowired
//	EmployeeRepo empRepo;  //Since we are using the method of empRepo, We are injecting it here. 
//	
//	@Test     //we annotate the method with @Test which we are testing.
//	public void getEmployees() {
//		
////		assertEquals();  //Check if the value passed in the method is equal to the value mathod is returning.
//		assertNotNull(empRepo.findAll());  //checks if the method is not null.
//	}
//	
//	@Disabled    //Disables the particular test case when the whole test cases of the class are ran.
//	@Test    
//	public void getEmployee() {
//		
//		List<Employee> list=empRepo.findAll();
//		assertNotNull(list.get(0));  //This test will fail as will return value as null.
//		//assertTrue();
//	}
//	
//	@ParameterizedTest //We use this when we want to pass parameters for testing by our own.
//	@CsvSource({"1,1,2","2,10,12","3,3,9"})
//	public void getEmployee1(int a,int b,int expected) {
//		assertEquals(expected,a+b,"failed for "+a+b);
//	}
	
	
}
