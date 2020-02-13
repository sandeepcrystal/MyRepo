package com.basic.springcore.fifthspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com/basic/springcore/fifthspring/config.xml");
              Languages lang = (Languages) context.getBean("lang");
		System.out.println("my language "+ lang.getCountriesandLang());
	}
}
