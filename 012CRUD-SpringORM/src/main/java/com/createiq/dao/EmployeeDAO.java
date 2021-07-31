package com.createiq.dao;

import java.util.List;
import java.util.Map;

import com.createiq.model.Employee;

public interface EmployeeDAO {

	void add(Employee employee);

	void update(Employee employee);

	void delete(Integer eid);

	Employee findByID(Integer eid);

	List<Employee> findAll();

}
