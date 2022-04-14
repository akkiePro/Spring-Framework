package com.telusko.SpringTeluskoPropertyTyre;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * using SETTER INJECTION => means we are using setter method[setBrand(String brand)] for injection
 * property added by bean.xml file 
 * */

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//		Vehicle obj = (Vehicle) context.getBean("bike");
//		obj.drive();
		Tyre t = (Tyre) context.getBean("tyre");
		System.out.println(t);
	}
}
