package com.example.youtube.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.youtube.dao.EmployeeDao;
import com.example.youtube.model.Employee;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeDao empdao;
	public int addEmployee(Employee emp) {
		return empdao.addEmployee(emp);
	}
	
	public List<Employee> getAllEmployee(){
		return empdao.getAllEmloyees();
	}
	
	public Employee getEmployee(int id) {
		return empdao.getEmployee(id);
	}
	
	public int deleteEmployee(int id) {
		return empdao.deleteEmployee(id);
	}
}
