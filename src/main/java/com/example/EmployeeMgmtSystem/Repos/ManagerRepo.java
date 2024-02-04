package com.example.EmployeeMgmtSystem.Repos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeMgmtSystem.Models.Employee;
import com.example.EmployeeMgmtSystem.Models.Manager;

public interface ManagerRepo extends JpaRepository<Manager, Integer>{

}
