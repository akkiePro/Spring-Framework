package com.telusko.SpringTelusko5AutowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

		// manual #AamZindagi
		Car c = (Car) context.getBean("car");
		c.drive();

		// using @Autowired
		Bike b = (Bike) context.getBean("bike"); // for Bike we added
		// now for bike we have to add .xml config.
		// but, we can use @Autowired instead in "Bike.java" file
		b.drive();
	}
}
