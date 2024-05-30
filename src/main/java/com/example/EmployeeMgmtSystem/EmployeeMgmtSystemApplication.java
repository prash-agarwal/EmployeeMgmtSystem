package com.example.EmployeeMgmtSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling     //Used for scheduling CRon jobs in spring boot  //CRonmaker
public class EmployeeMgmtSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMgmtSystemApplication.class, args);
	}
}
