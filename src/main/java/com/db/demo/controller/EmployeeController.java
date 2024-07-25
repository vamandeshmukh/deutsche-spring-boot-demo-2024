package com.db.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.db.demo.model.Employee;
import com.db.demo.service.IEmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private IEmployeeService empService;

	@GetMapping("emp")
	public List<Employee> getAllEmps() {
		System.out.println("getAllEmps");
		return empService.getAllEmployees();
	}

	// http://localhost:8080/emp/101

	@GetMapping("emp/{id}")
	public Employee getEmpById(@PathVariable(name = "id") Integer id) {
		System.out.println("getEmpById " + id);
		return empService.getEmployeeById(id);
	}

	@GetMapping("emp/{name}")
	public List<Employee> getEmpByName(@PathVariable(name = "name") String name) {
		System.out.println("getEmpByName " + name);
		return empService.getEmployeeByName(name);
	}

	// getEmpByName

	// getAllEmps

////	addEmp 
//	
////	updateEmp 
//	
////	deleteEmp 

}
