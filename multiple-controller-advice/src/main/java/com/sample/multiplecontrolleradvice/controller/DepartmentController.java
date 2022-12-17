package com.sample.multiplecontrolleradvice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sample.multiplecontrolleradvice.model.Department;
import com.sample.multiplecontrolleradvice.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@GetMapping(path = "/department")
	@CrossOrigin
	public List<Department> getAllDepartments() {
		List<Department> departments = new ArrayList<>();
		departmentService.findAll().forEach(departments::add);
		return departments;
	}

	@GetMapping(path = "/department/{id}")
	@CrossOrigin
	public Department getDepartment(@PathVariable("id") String id) {
		return departmentService.findById(id);
	}

}
