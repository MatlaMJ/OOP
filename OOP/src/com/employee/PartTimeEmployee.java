package com.employee;

public class PartTimeEmployee extends Employee {
	
	//All the properties are inherited from the Parent class(Employee class)
	
		/*private int employeeId;
		private String firstName;
		private String LastName;
		private String address;
		private String department;**/
	
	//Except for hourlyWage

	private double hourlyWage;

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
	
	//Method Overriding [Polymorphism]
	
	public void responsibilities() {
        System.out.println("Part time Employee is a cleaner");
  }
}
