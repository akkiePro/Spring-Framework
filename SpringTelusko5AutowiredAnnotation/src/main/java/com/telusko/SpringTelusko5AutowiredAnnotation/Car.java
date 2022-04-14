package com.telusko.SpringTelusko5AutowiredAnnotation;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component; // import for @Component

// not using @Autowired here. I'll do manual configuration in bean2.xml file for adding property.
// see the difference

@Component
public class Car implements Vehicle {
	public void drive() {
		BeanFactory factory = new ClassPathXmlApplicationContext("bean2.xml");
		TyreMRF tyreMRF = (TyreMRF) factory.getBean("tyremrf");
		System.out.println("You are in 4 wheeler..." + tyreMRF + "(using XML configuration)");
	}
}
