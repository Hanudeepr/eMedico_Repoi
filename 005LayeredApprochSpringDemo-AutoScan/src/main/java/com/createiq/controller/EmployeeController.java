package com.createiq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.createiq.model.Employee;
import com.createiq.service.EmployeeService;
@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	public void save(Employee employee) {
		employeeService.save(employee);
		System.out.println("Controoler save method Called ");

	}

}
