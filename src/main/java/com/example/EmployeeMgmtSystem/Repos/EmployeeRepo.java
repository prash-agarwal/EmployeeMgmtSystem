package com.example.EmployeeMgmtSystem.Repos;
import org.springframework.stereotype.Repository;

import com.example.EmployeeMgmtSystem.Models.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
