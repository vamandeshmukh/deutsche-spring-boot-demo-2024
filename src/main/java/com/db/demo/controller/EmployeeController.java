package com.db.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.demo.model.Employee;

@RestController
public class EmployeeController {

//	http://localhost:8080/emp/101

	@GetMapping("emp/{eid}")
	public Employee getEmpById(Integer eid) {
		Employee obj = new Employee(eid, "Sonu", 90000.50);
		System.out.println(obj.toString());
		return obj;
	}

}
