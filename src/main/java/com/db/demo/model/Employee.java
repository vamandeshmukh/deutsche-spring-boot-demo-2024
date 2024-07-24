package com.db.demo.model;

public class Employee {

	private Integer id;
	private String firstName;
	private Double salary;
	
	// constructors, getters, setters, toString etc 

	public Employee() {
		super();
	}

	public Employee(Integer id, String firstName, Double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}
