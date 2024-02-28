package com.bharath.usermanagement.service.interfaces;

import com.bharath.usermanagement.exception.UserManagementServiceException;
import com.bharath.usermanagement.model.RegisterUserDTO;

public interface UserService {
public void registerUser(RegisterUserDTO userdata) throws UserManagementServiceException;
}
