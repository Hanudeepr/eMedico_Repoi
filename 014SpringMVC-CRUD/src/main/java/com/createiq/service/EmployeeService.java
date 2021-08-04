package com.createiq.service;

import java.util.List;

import com.createiq.model.Employee;

public interface EmployeeService {
	void add(Employee employee);

	void update(Employee employee);

	void delete(Integer eid);

	Employee findByID(Integer eid);

	List<Employee> findAll();
}
