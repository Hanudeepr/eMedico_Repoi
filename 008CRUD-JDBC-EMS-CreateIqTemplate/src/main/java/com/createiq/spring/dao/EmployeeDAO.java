package com.createiq.spring.dao;

import com.createiq.spring.model.Employee;

public interface EmployeeDAO {
	void add(Employee employee);

	void update(Employee employee);

	void delete(Integer eid);

}
