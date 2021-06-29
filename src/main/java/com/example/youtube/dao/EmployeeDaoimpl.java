package com.example.youtube.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.youtube.model.Employee;
@Repository
public class EmployeeDaoimpl  implements EmployeeDao{

	
	List<Employee> employees=new ArrayList<Employee>();
	@Override
	public int addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employees.add(emp);
		return 1;
		
	}
	@Override
	public List<Employee> getAllEmloyees() {
		// TODO Auto-generated method stub
		
		return employees;
	}
//	@Override
//	public Employee getEmployee(int id) {
//		// TODO Auto-generated method stub
//		for(Employee emp:employees)
//		{
//			if(emp.getId()==id) 
//				return emp;
//			
//		}
//		return null;
//	
//	}
	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		
		for(Employee emp:employees) {
			if(emp.getId()==id)
				return emp;
		}
		return null;
	}
	@Override
	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		Employee empToDelete =null;
		for(Employee emp:employees) {
			if(emp.getId()==id)
				empToDelete=emp;
				
		}
		if(empToDelete !=null)
		{
			employees.remove(empToDelete);
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
	
}
