package com.example;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	public Employee() {
		super();
	}
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
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee ID: "+getEmployeeId()+" First Name: "+getFirstName()+" Last Name: "+getLastName()+" Email: "+getEmail();
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee employee=null;
		if(obj instanceof Employee)
		{
			employee=(Employee)obj;
		}
		
		if((this.getEmployeeId()==employee.getEmployeeId())&&(this.getFirstName().equals(employee.getFirstName()))&&(this.getLastName().equals(employee.getLastName()))&&(this.email.equals(employee.getEmail())))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
