package com.db.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.demo.model.Employee;
import com.db.demo.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public Employee getEmployeeById(Integer id) {
		System.out.println("getEmployeeById " + id);
//		empRepository.
		return empRepository.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		System.out.println("getAllEmployees");
		return empRepository.findAll();
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		return empRepository.findByFirstName(name);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		System.out.println(employee.toString());
		return empRepository.save(employee);
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

//package com.db.demo.service;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.db.demo.model.Employee;
//
//@Service
//public class EmployeeService implements IEmployeeService {
//
//	private List<Employee> empList = Arrays.asList(new Employee(101, "Sonu", 90.50), new Employee(102, "Monu", 95.75),
//			new Employee(103, "Tonu", 92.25));
//
//	@Override
//	public Employee getEmployeeById(Integer id) {
//		System.out.println("getEmployeeById " + id);
//		return empList.stream()
//                .filter(e -> e.getId().equals(id))
//                .findFirst()
//                .orElse(null); 
//	}
//
//	@Override
//	public List<Employee> getAllEmployees() {
//		System.out.println("getAllEmployees");
//		return empList;
//	}
//
//	@Override
//	public Employee getEmployeeByName(String name) {
//		return null;
//	}
//
//	@Override
//	public Employee addEmployee(Employee employee) {
//		return null;
//	}
//
//	@Override
//	public Employee updateEmployee(Employee employee) {
//		return null;
//	}
//
//	@Override
//	public Employee deleteEmployee(Integer id) {
//		return null;
//	}
//
//}
