package com.createiq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.createiq.dao.EmployeeDAO;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDAO employeeDAO = (EmployeeDAO) applicationContext.getBean("empDAO");

//		employeeDAO.findAll().forEach(System.out::println);

//		System.out.println(employeeDAO.findByID(1));
		System.out.println("Count : "+employeeDAO.avgSal());
		
		System.out.println(employeeDAO.nameSalMap());
	}

}
