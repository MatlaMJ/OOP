package com.employee;

public class Employee {

	
	//Making class properties private to avoid them to be modified outside the class
	//Encapsulation
	private int employeeId;
	private String firstName;
	private String LastName;
	private String address;
	private String department;
	
	private int age;
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//Method overriding [polymorphism]
	
	public void responsiblilites() {
        System.out.println("Full time Employee is a manager");
  }
	

}
