package com.telusko.SpringTeluskoPropertyTyreUsingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * using CONSTRUCTOR INJECTION => means we are using constructor[in Tyre class Tyre() constructor] for injection
 * SETTER property removed in bean.xml
 */

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//		Vehicle obj = (Vehicle) context.getBean("bike");
//		obj.drive();
		Tyre t = (Tyre) context.getBean("tyre");
		System.out.println(t);
	}
}
