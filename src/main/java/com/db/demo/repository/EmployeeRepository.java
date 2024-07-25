package com.db.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.db.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

//	no need to write methods for basic CRUD operations 

//	https://docs.spring.io/spring-data/jpa/docs/current-SNAPSHOT/reference/html/#reference
	
	public abstract List<Employee> findByFirstName(String firstName);
	
//	@Query("SELECT * FROM Employee")
//	public abstract List<Employee> findBySomeThingElse(String firstName);
	

}
