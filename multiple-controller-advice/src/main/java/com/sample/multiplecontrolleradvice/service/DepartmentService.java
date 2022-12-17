package com.sample.multiplecontrolleradvice.service;

import java.util.Collections;

import org.springframework.stereotype.Service;

import com.sample.multiplecontrolleradvice.exception.DepartmentServiceException;
import com.sample.multiplecontrolleradvice.model.Department;

@Service
public class DepartmentService {

	public Department findById(String id) {
		throw new DepartmentServiceException();
	}

	public Iterable<Department> findAll() {
		return Collections.emptyList();
	}
}
