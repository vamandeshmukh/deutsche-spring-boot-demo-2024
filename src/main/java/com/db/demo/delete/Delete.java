package com.db.demo.delete;

public class Delete {

}



//package com.lti.demo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.lti.demo.model.Employee;
//import com.lti.demo.service.IEmployeeService;
//
//@RestController
////@CrossOrigin(origins = "*")
////@CrossOrigin(origins = "localhost://3000")
//@CrossOrigin(origins = { "localhost://3000", "localhost://3003" })
//@RequestMapping(value = "/emp")
//public class EmployeeController {
// 
//	@Autowired
//	IEmployeeService empService;
//
//	@RequestMapping(value = "/get-all-emps", method = RequestMethod.GET, produces = "application/json")
//	public ResponseEntity<List<Employee>> getAllEmployees() {
//		List<Employee> empList = empService.getAllEmployees();
//		HttpStatus status = HttpStatus.FOUND;
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Message", "Employee were found successfully!");
//		ResponseEntity<List<Employee>> response = new ResponseEntity<>(empList, headers, status);
//		return response;
//	}
//
//	@RequestMapping(value = "/get-emp-by-id/{eid}", method = RequestMethod.GET, produces = "application/json")
//	public ResponseEntity<Employee> getEmpById(@PathVariable(name = "eid") int employeeId) {
//		Employee emp = empService.getEmployeeById(employeeId);
//		HttpStatus status = HttpStatus.FOUND;
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Message", "Employee was found successfully!");
//		ResponseEntity<Employee> response = new ResponseEntity<>(emp, headers, status);
//		return response;
//	}
//
//	@RequestMapping(value = "/get-emp-by-first-name/{first-name}", method = RequestMethod.GET, produces = "application/json")
//	public ResponseEntity<List<Employee>> getEmpsByFirstName(@PathVariable(name = "first-name") String firstName) {
//		List<Employee> empList = empService.getEmployeesByFirstName(firstName);
//		HttpStatus status = HttpStatus.FOUND;
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Message", "Employees were found successfully!");
//		ResponseEntity<List<Employee>> response = new ResponseEntity<>(empList, headers, status);
//		return response;
//	}
//
//	@RequestMapping(value = "/add-emp", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
//	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
//		Employee emp = empService.addEmployee(employee);
//		HttpStatus status = HttpStatus.CREATED;
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Message", "Employee was created successfully!");
//		ResponseEntity<Employee> response = new ResponseEntity<>(emp, headers, status);
//		return response;
//	}
//
//	@RequestMapping(value = "/update-emp", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
//	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
//		Employee emp = empService.updateEmployee(employee);
//		HttpStatus status = HttpStatus.CREATED;
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Message", "Employee was updated successfully!");
//		ResponseEntity<Employee> response = new ResponseEntity<>(emp, headers, status);
//		return response;
//	}
//
//	@RequestMapping(value = "/delete-emp/{eid}", method = RequestMethod.DELETE, produces = "application/json")
//	public ResponseEntity<Employee> deleteEmployee(@PathVariable(name = "eid") int employeeId) {
//		Employee emp = empService.deleteEmployee(employeeId);
//		HttpStatus status = HttpStatus.ACCEPTED;
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Message", "Employee was deleted successfully!");
//		ResponseEntity<Employee> response = new ResponseEntity<>(emp, headers, status);
//		return response;
//	}
//
//	// create other APIs
//
//}



//package com.lti.demo.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.lti.demo.exception.EmployeeNotFoundException;
//import com.lti.demo.model.Employee;
//import com.lti.demo.repository.EmployeeRepository;
//
//@Service
//public class EmployeeService implements IEmployeeService {
//
//	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
//
//	@Autowired
//	EmployeeRepository empRepository;
//
//	@Autowired
//	DepartmentService deptService;
//
//	@Override
//	public List<Employee> getAllEmployees() {
//		List<Employee> empList = empRepository.findAll();
//		LOG.info(empList.toString());
//		return empList;
//	}
//
//	@Override
//	public Employee getEmployeeById(int employeeId) {
//		Optional<Employee> empOptional = empRepository.findById(employeeId);
//		if (empOptional.isPresent()) {
//			LOG.info(empOptional.get().toString());
//			return empOptional.get();
//		} else {
//			String errorMessage = "Employee with eid " + employeeId + " was not found.";
//			LOG.warn(errorMessage);
//			throw new EmployeeNotFoundException(errorMessage);
//		}
//	}
//
//	@Override
//	public List<Employee> getEmployeesByFirstName(String firstName) {
//		List<Employee> empList = empRepository.findByFirstName(firstName);
//		LOG.info(empList.toString());
//		return empList;
//	}
//
//	@Override
//	public Employee addEmployee(Employee employee) {
//		LOG.info(employee.toString());
//		if (null != employee.getDepartment()) {
//			deptService.getDepartmentById(employee.getDepartment().getDepartmentId());
//		}
//		return empRepository.save(employee);
//	}
//
//	@Override
//	public Employee updateEmployee(Employee employee) {
//		this.getEmployeeById(employee.getEmployeeId());
//		LOG.info(employee.toString());
//		return empRepository.save(employee);
//	}
//
//	@Override
//	public Employee deleteEmployee(int employeeId) {
//		Employee emp = this.getEmployeeById(employeeId);
//		empRepository.deleteById(employeeId);
//		return emp;
//	}
//
//}





//package com.lti.demo.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import com.lti.demo.model.Employee;
//
//@Repository
//public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//
////	https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
//
////	basic CRUD Ops - no need to write any methods 
//
////	select - findAll();
////	select - findById();
////	insert - save();
////	update - save();
////	delete - deleteById();
//
////	syntax 
////	public abstract List<Employee> findByFieldName(String firstName);
//
//	public abstract List<Employee> findByFirstName(String firstName);
//
//	public abstract List<Employee> findBySalaryGreaterThan(double salary);
//
////	@Query(nativeQuery = true, name = "salarySelectQuery") // using SQL 
//	@Query("select e from Employee e where salary = ?1") // using JPQL 
////	@Query("select e from Employee e where salary > ?1 and salary < ?2")
//	public abstract List<Employee> findBySalary(double salary);
//
//	//
////	public abstract List<Employee> findBySalaryLessThan(double salary);
////
////	public abstract List<Employee> findBySalaryBetween(double salary1, double salary2);
//
//	// Employee findByFirstName();
//
//}

