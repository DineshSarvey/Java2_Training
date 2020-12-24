package com.iiht.training.eloan.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDto {
	private Long id;
	
	@NotNull
	@Size(min=3,max=100, message="User First Name should be atleast 3 characters and max 100 characters")
	private String firstName;
	
	@NotNull
	@Size(min=3,max=100, message="User Last Name should be atleast 3 characters and max 100 characters")
	private String lastName;
	
	@NotNull
	@Email
	@Size(min=3,max=100, message="EmailId should be atleast 3 characters and max of 100 characters,should be in proper email format")
	private String email;
	
	@NotNull
	@Size(min=10,max=10, message="Mobile Number should be of length 10 characters")
	private String mobile;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
