package com.sample.multiplecontrolleradvice.service;

import java.util.Collections;

import org.springframework.stereotype.Service;

import com.sample.multiplecontrolleradvice.exception.EmployeeServiceException;
import com.sample.multiplecontrolleradvice.model.Employee;

@Service
public class EmployeeService {

	public Employee findById(String id) {
		throw new EmployeeServiceException();
	}

	public Iterable<Employee> findAll() {
		return Collections.emptyList();
	}

}
