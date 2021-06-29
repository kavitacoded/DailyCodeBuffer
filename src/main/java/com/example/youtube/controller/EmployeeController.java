package com.example.youtube.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.youtube.model.Employee;
import com.example.youtube.service.EmployeeService;
@RequestMapping("/api/employee")
@RestController
public class EmployeeController {

	
	@Autowired
	private EmployeeService empservice;
	@PostMapping
	public int addEmployee(@RequestBody Employee emp) {
		return empservice.addEmployee(emp);
	}
	@GetMapping
	public List<Employee> getAllEmloyees(){
		return empservice.getAllEmployee();
	}	
}
