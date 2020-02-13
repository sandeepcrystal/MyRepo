package com.basic.springcore.thirdspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com/basic/springcore/thirdspring/config.xml");
	       CarDealer car = (CarDealer) context.getBean("cardealer");
	       System.out.println("my models "+car.getName());
	       System.out.println("car details "+ car.getModels());
	
	}
}
