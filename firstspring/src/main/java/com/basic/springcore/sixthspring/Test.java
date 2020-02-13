package com.basic.springcore.sixthspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com/basic/springcore/sixthspring/config.xml");
             Student s = (Student) context.getBean("student");
		System.out.println(s);
	}
}
