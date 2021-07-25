package com.createiq.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.spring.dao.EmployeeDAO;
import com.createiq.spring.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;

	public void add(Employee employee) {
		employeeDAO.add(employee);

	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub

	}

	public void delete(Integer eid) {
		// TODO Auto-generated method stub

	}

	public Employee findById(Integer eid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
