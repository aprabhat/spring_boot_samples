package com.sample.multiplecontrolleradvice.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class DepartmentExceptionhandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(DepartmentServiceException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ResponseEntity<Object> handleDepartmentException() {
		return new ResponseEntity<>("department not found", new HttpHeaders(), HttpStatus.NOT_FOUND);
	}
}
