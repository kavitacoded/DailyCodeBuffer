package com.example.youtube.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.youtube.model.Employee;

public interface EmployeeDao {

	
	int addEmployee(Employee emp);
	 List<Employee> getAllEmloyees();
}
