package com.example.EmployeeMgmtSystem.Controllers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class UsingCRONScheduler {

	@Scheduled(cron="0 */3 * * * ?")   //used to schedule a particular method using cron for particular time interval.
	public void testing() {
		System.out.println("Hello world using CRON");
	}
}
