package com.telusko.SpringTeluskoAnnotationConf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Vehicle obj = (Vehicle) context.getBean("bike"); // write bike instead of Bike OR car instead of Car
		obj.drive();
	}
}
