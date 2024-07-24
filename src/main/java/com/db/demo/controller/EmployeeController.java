package com.db.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.demo.model.Employee;

@RestController
public class EmployeeController {

	@GetMapping("emp/eid")
	public Employee getEmpById(Integer eid) {
		Employee obj = new Employee(eid, "Sonu", 90000.50);
		return obj;
	}

}
