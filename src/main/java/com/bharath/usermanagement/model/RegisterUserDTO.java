package com.bharath.usermanagement.model;

import com.bharath.usermanagement.entity.UserType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserDTO {
	private String phoneNumber;
	private String email;
	private String password;
	private UserType userType;

}
