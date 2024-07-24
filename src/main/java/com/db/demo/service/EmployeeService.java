package com.db.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.db.demo.model.Employee;

@Service
public class EmployeeService implements IEmployeeService {

	private List<Employee> empList = Arrays.asList(new Employee(101, "Sonu", 90.50), new Employee(102, "Monu", 95.75),
			new Employee(103, "Tonu", 92.25));

	@Override
	public Employee getEmployeeById(Integer id) {
		System.out.println("getEmployeeById " + id);
		return empList.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null); 
	}

	@Override
	public List<Employee> getAllEmployees() {
		return null;
	}

	@Override
	public Employee getEmployeeByName(String name) {
		return null;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return null;
	}

	@Override
	public Employee deleteEmployee(Integer id) {
		return null;
	}

}
