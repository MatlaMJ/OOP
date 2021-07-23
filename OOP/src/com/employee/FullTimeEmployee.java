package com.employee;

public class FullTimeEmployee extends Employee {
	
	
	//All the properties are inherited from the Parent class(Employee class)
	
	//Except for salary
	/*private integer employeeId;
	private String firstName;
	private String LastName;
	private String address;
	private String department;
	
	**/
	
	 private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	 
	//Method Overriding [Polymorphism]
	
	public void responsiblilites() {
        System.out.println("Full time Employee is a Cashier");
  }
	
	}
