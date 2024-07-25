package com.db.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.db.demo.model.Employee;
import com.db.demo.service.IEmployeeService;

@RestController
public class EmployeeController {

	private final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IEmployeeService empService;

	@GetMapping("emp")
	public List<Employee> getAllEmps() {
		LOG.info("getAllEmps");
		return empService.getAllEmployees();
	}

	// http://localhost:8080/emp/101

	@GetMapping("emp/{id}")
	public Employee getEmpById(@PathVariable(name = "id") Integer id) {
		LOG.info(id.toString());
		return empService.getEmployeeById(id);
	}

	@GetMapping("emp/name/{name}")
	public List<Employee> getEmpByName(@PathVariable(name = "name") String name) {
		LOG.info(name);
		return empService.getEmployeeByName(name);
	}

	@PostMapping("emp/")
	public Employee addEmp(@RequestBody Employee employee) {
		LOG.info(employee.toString());
		return empService.addEmployee(employee);
	}

	// getEmpByName

	// getAllEmps

////	addEmp 
//	
////	updateEmp 
//	
////	deleteEmp 

}
