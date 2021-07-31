package com.createiq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.createiq.dao.EmployeeDAO;
import com.createiq.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDAO employeeDAO = (EmployeeDAO) applicationContext.getBean("empDAO");
        
		employeeDAO.add(new Employee(1, "Balaji", 20000.00));
		
	}

}
