package com.createiq.test;

/**
 * Java JDBC Connection pool using HikariCP example program
 * 
 * @author pankaj
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCPDemo {

	private static HikariDataSource dataSource = null;

	static {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/productcatalog");
		config.setUsername("root");
		config.setPassword("root");
		config.addDataSourceProperty("minimumIdle", "5");
		config.addDataSourceProperty("maximumPoolSize", "25");

		dataSource = new HikariDataSource(config);
	}

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
			System.out.println(connection);
		} finally {

			connection.close();
		}
	}
}