package com.basic.springcore.fourthspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com/basic/springcore/fourthspring/config.xml");
	    Customer customer=(Customer) context.getBean("customer");
	System.out.println("my customer id "+ customer.getId());
	System.out.println("all laptop names "+ customer.getProducts());
	}
}
