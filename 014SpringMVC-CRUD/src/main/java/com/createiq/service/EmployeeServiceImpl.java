package com.createiq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.dao.EmployeeDAO;
import com.createiq.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public void add(Employee employee) {
		employeeDAO.add(employee);
	}

	@Override
	public void update(Employee employee) {
		employeeDAO.update(employee);
	}

	@Override
	public void delete(Integer eid) {
		employeeDAO.delete(eid);
	}

	@Override
	public Employee findByID(Integer eid) {
		return employeeDAO.findByID(eid);
	}

	@Override
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

}
