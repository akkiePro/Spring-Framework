package com.telusko.SpringTelusko8JAVAconfPrimaryAndQualified;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// JAVA Annotation configuration without @Bean methods : @Primary & @Qualified

public class App {
	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(BeanJAVAconf.class);
		Samsung s7 = (Samsung) factory.getBean(Samsung.class);
		s7.config();
	}
}
