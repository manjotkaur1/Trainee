package com.cvl.spring.Lab9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("Bean is Ready");
		Hello h1=(Hello) ctx.getBean("hello");
		h1.show();
	}

}
