package com.basic.springcore.firstspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Employee employee = (Employee)context.getBean("emp");
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
	}
}
