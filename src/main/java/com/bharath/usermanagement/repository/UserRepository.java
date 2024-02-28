package com.bharath.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.usermanagement.entity.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Long>{

	UserDetails findByEmail(String email);

	UserDetails findByPhoneNumber(String phoneNumber);

}
