package com.bharath.usermanagement.service.classes;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bharath.usermanagement.entity.UserDetails;
import com.bharath.usermanagement.exception.UserManagementServiceException;
import com.bharath.usermanagement.model.RegisterUserDTO;
import com.bharath.usermanagement.repository.UserRepository;
import com.bharath.usermanagement.service.interfaces.UserService;
import com.bharath.usermanagement.utility.UserServiceConstants;

@Service(value = "userServiceImpl")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional(rollbackForClassName = "UserManagementServiceException")
	public void registerUser(RegisterUserDTO userdata) throws UserManagementServiceException {
		if (userdata.getEmail() != null) {
			UserDetails userDetails = userRepository.findByEmail(userdata.getEmail());
			if (userDetails != null)
				throw new UserManagementServiceException(UserServiceConstants.EMAIL_ALREADY_REGISTERED);

		}
		if (userdata.getPhoneNumber() != null) {
			UserDetails userDetails = userRepository.findByPhoneNumber(userdata.getPhoneNumber());
			if (userDetails != null)
				throw new UserManagementServiceException(UserServiceConstants.PHONE_NUMBER_ALREADY_REGISTERED);

		}
		saveUser(userdata);
	}

	private UserDetails saveUser(RegisterUserDTO userdata) {
		UserDetails newUserDetails = new UserDetails();
		newUserDetails.setEmail(userdata.getEmail());
		newUserDetails.setPhoneNumber(userdata.getPhoneNumber());
		newUserDetails.setPassword(userdata.getPassword());
		newUserDetails.setRegisteredAt(LocalDateTime.now());
		newUserDetails.setUserType(userdata.getUserType());
		return userRepository.save(newUserDetails);
	}

}
