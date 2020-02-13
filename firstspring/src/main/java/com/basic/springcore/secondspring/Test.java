package com.basic.springcore.secondspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/basic/springcore/secondspring/config.xml");
	Hospital hos =(Hospital)context.getBean("hospital");
	
	System.out.println(hos.getName());
	System.out.println(hos.getDepartments());
	}
}
