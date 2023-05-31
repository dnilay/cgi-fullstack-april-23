package com.example.demo.dto;

public class UserDto {
	

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String encrytedPassword;
	public UserDto(String firstName, String lastName, String email, String password,
			String encrytedPassword) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.encrytedPassword = encrytedPassword;
	}
	
	public UserDto() {
		super();
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEncrytedPassword() {
		return encrytedPassword;
	}

	public void setEncrytedPassword(String encrytedPassword) {
		this.encrytedPassword = encrytedPassword;
	}

	@Override
	public String toString() {
		return "UserDto [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", encrytedPassword=" + encrytedPassword + "]";
	}


	
	
	
}
