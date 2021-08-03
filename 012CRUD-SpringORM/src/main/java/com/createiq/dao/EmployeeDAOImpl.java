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
		hibernateTemplate.update(employee);

	}

	@Override
	public void delete(Integer eid) {
		Employee employee = new Employee();
		employee.setEid(eid);
		hibernateTemplate.delete(employee);
	}

	@Override
	public Employee findByID(Integer eid) {
		return hibernateTemplate.get(Employee.class, eid);
	}

	@Override
	public List<Employee> findAll() {
		return hibernateTemplate.loadAll(Employee.class);
		// return hibernateTemplate.getSessionFactory().openSession().createQuery("from
		// Employee").list();
	}

}
