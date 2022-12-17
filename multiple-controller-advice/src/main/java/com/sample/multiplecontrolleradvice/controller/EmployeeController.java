package com.sample.multiplecontrolleradvice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sample.multiplecontrolleradvice.model.Employee;
import com.sample.multiplecontrolleradvice.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(path = "/employees")
	@CrossOrigin
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		employeeService.findAll().forEach(employees::add);
		return employees;
	}

	@GetMapping(path = "/employee/{id}")
	@CrossOrigin
	public Employee getEmployee(@PathVariable("id") String id) {
		return employeeService.findById(id);
	}

}
