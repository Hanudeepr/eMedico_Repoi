package com.createiq.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.createiq.spring.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private DataSource dataSource;

	public void add(Employee employee) {

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = dataSource.getConnection();
			statement = connection.prepareStatement("INSERT INTO EMPLOYEE(eid,ename,esal) VALUES(?,?,?)");
			statement.setInt(1, employee.getEid());
			statement.setString(2, employee.getEname());
			statement.setDouble(3, employee.getEsal());

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void update(Employee employee) {
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = dataSource.getConnection();
			statement = connection.prepareStatement("UPDATE EMPLOYEE SET ENAME = ? ,ESAL = ? WHERE EID = ?");
			statement.setInt(3, employee.getEid());
			statement.setString(1, employee.getEname());
			statement.setDouble(2, employee.getEsal());

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void delete(Integer eid) {
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = dataSource.getConnection();
			statement = connection.prepareStatement("DELETE FROM EMPLOYEE WHERE EID = ?");
			statement.setInt(1, eid);

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public Employee findById(Integer eid) {
		return null;
	}

	public List<Employee> findAll() {
		return null;
	}

}
