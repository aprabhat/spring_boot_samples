package com.sample.multiplecontrolleradvice.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.sample.multiplecontrolleradvice.controller.DepartmentController;

@ControllerAdvice(assignableTypes = { DepartmentController.class })
public class EmployeeExceptionhandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(EmployeeServiceException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ResponseEntity<Object> handleEmployeeException() {
		return new ResponseEntity<>("employee not found", new HttpHeaders(), HttpStatus.NOT_FOUND);
	}
}
