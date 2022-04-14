package com.telusko.SpringTelusko7JAVAconfWithComponentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// JAVA Annotation configuration without @Bean methods

public class App {
	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(BeanJAVAconf.class);
		Samsung s7 = (Samsung) factory.getBean(Samsung.class); // no ""
		s7.config();
	}
}
