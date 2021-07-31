package com.createiq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.createiq.model.Employee;

@Repository("empDAO")
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void add(Employee employee) {
		hibernateTemplate.save(employee);
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer eid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee findByID(Integer eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
