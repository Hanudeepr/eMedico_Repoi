package com.createiq.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		HelloWorldBean helloWorldBean = (HelloWorldBean) context.getBean("helloWorld");
//		helloWorldBean.sayHelloWorld();
		
		
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
	}

}
