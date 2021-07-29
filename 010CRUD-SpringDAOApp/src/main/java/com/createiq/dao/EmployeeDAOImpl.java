package com.createiq.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.createiq.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void add(Employee employee) {
		jdbcTemplate.update("INSERT INTO EMPLOYEE VALUES(?,?,?)", employee.getEid(), employee.getEname(),
				employee.getEsal());
	}

	public void update(Employee employee) {
		jdbcTemplate.update("UPDATE EMPLOYEE SET ENAME = ?, ESAL = ? WHERE EID = ?", employee.getEname(),
				employee.getEsal(), employee.getEid());

	}

	public void delete(Integer eid) {
		jdbcTemplate.update("DELETE FROM EMPLOYEE WHERE EID = ?", eid);

	}

	public Employee findByID(Integer eid) {
		return jdbcTemplate.queryForObject("SELECT * FROM EMPLOYEE WHERE EID = ?", new Object[] { eid },
				new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	public Integer count() {
		return (Integer) jdbcTemplate.queryForObject("SELECT COUNT(*) FROM EMPLOYEE", Integer.class);
	}

	public Double avgSal() {
		return jdbcTemplate.queryForObject("SELECT AVG(esal) FROM EMPLOYEE", Double.class);
	}

	public List<Map<String, Double>> nameSalMap() {
		return jdbcTemplate.query("SELECT ENAME,ESAL FROM EMPLOYEE", (rs, num) -> {
			Map<String, Double> map = new HashMap<String, Double>();
			map.put(rs.getString(1), rs.getDouble(2));
			return map;
		});
	}

	public List<Employee> findAll() {

		// List<Employee> employees = jdbcTemplate.query("SELECT * FROM EMPLOYEE", new
		// RowMapper<Employee>() {
		// @Override
		// public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// Employee employee = new Employee();
		// employee.setEid(rs.getInt(1));
		// employee.setEname(rs.getString(2));
		// employee.setEsal(rs.getDouble(3));
		// return employee;
		// }
		// });

		List<Employee> employees = jdbcTemplate.query("SELECT * FROM EMPLOYEE", (rs, num) -> {
			Employee employee = new Employee();
			employee.setEid(rs.getInt(1));
			employee.setEname(rs.getString(2));
			employee.setEsal(rs.getDouble(3));
			return employee;
		});

		// List<Employee> employees = jdbcTemplate.query("SELECT * FROM EMPLOYEE", new
		// BeanPropertyRowMapper<Employee>(Employee.class));

		return employees;

	}

}
