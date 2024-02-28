package com.bharath.usermanagement.model;

import com.bharath.usermanagement.entity.UserType;

public class RegisterUserDTO {
private String phoneNumber;
private String email;
private String password;
private UserType userType;
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
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
public UserType getUserType() {
	// TODO Auto-generated method stub
	return this.userType;
}

}
