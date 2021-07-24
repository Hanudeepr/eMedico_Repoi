package com.createiq.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Demo {

	static ComboPooledDataSource comboPooledDataSource = null;

	static {
		comboPooledDataSource = new ComboPooledDataSource();

		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/productcatalog?useSSL=false");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("root");

		comboPooledDataSource.setMinPoolSize(3);
		comboPooledDataSource.setAcquireIncrement(3);
		comboPooledDataSource.setMaxPoolSize(30);

	}

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		
		try {
			connection = comboPooledDataSource.getConnection();
			System.out.println(connection);
		} finally {
			connection.close();
		}
	}

}