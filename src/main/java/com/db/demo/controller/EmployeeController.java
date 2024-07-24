package com.db.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.db.demo.model.Employee;
import com.db.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	EmployeeService empService;

//	http://localhost:8080/emp/101

	@GetMapping("emp/{id}")
	public Employee getEmpById(@PathVariable(name = "id") Integer id) {
		Employee obj = empService.getEmployeeById(id);
		System.out.println(obj.toString());
		return obj;
	}
	

	//	getAllEmps 
	
////	addEmp 
//	
////	updateEmp 
//	
////	deleteEmp 
	

}
