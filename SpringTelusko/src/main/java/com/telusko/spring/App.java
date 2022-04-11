package com.telusko.spring;

import org.springframework.context.ApplicationContext; // required to use getBean()
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Vehicle obj = (Vehicle) context.getBean("vehicle"); // EITHER getBean() could be used from BeanFactory OR
															// ApplicationContext
		/*
		 * ApplicationContext is a super set of BeanFactory. for small projects we can
		 * use BeanFactory. but here we'll practice not for small. so, we'll use
		 * ApplicationContext.
		 */
		obj.drive();
	}
}
