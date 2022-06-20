package com.greatlearning.oops;

public class Employee {
	private String firstName;
	private String lastName;
	private String department;
	private String emailId;
	private char[] password;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String firstName, String lastName, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department
				+ ", emailId=" + emailId + ", password=" + String.valueOf(password) + "]";
	}
	

}
