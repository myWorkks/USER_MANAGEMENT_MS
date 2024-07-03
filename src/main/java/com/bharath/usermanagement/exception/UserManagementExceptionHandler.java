package com.bharath.usermanagement.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserManagementExceptionHandler {
	@ExceptionHandler(UserManagementServiceException.class)
	public ResponseEntity<ErrorInformation> handleUserServiceException(UserManagementServiceException exception) {

		ErrorInformation errorInformation = new ErrorInformation();
		errorInformation.setErrorMessage(exception.getMessage());
		errorInformation.setOccuredAt(LocalDateTime.now());
		errorInformation.setErrorCode(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<ErrorInformation>(errorInformation, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorInformation> handleGeneralException(Exception exception) {

		ErrorInformation errorInformation = new ErrorInformation();
		errorInformation.setErrorMessage(exception.getMessage());
		errorInformation.setOccuredAt(LocalDateTime.now());
		errorInformation.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		return new ResponseEntity<ErrorInformation>(errorInformation, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
