package com.example.EmployeeMgmtSystem.Service;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.EmployeeMgmtSystem.Models.Manager;
import com.example.EmployeeMgmtSystem.Repos.ManagerRepo;
import com.example.EmployeeMgmtSystem.Services.ManagerServices;

@SpringBootTest
public class ManagerServiceTests {
//
//	@Autowired
//	ManagerServices managerService;
//	
//	@MockBean  //Using mock to mock the methods present in ManagerRepo class.
//	ManagerRepo managerRepo;
//	//Difference between @Mock and @MockBean and @InjectMock
//	//What is @BeforeEach
//	
//	@Test
//	public void getManagerTest() {
//		//when(managerRepo.findById(ArgumentMatchers.anyInt())).
//		when(managerRepo.findById(1).orElse(null)).thenReturn(new Manager(1,"Ram","SDE",null));
//		Manager manager1=managerService.getManager(1);
//		Assertions.assertNotNull(manager1);
//	}
}
