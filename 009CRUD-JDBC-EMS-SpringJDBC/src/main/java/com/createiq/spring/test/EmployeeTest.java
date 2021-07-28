package com.createiq.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.createiq.spring.model.Employee;
import com.createiq.spring.service.EmployeeService;

public class EmployeeTest {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = (EmployeeService) applicationContext.getBean("employeeService");
	
		Employee employee = new Employee(3, "Ramu", 20000.00);
		employeeService.add(employee);
		System.out.println("Done !");
	
	}

}
