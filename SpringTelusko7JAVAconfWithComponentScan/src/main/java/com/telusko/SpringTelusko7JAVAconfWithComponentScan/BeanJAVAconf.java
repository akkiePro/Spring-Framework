package com.telusko.SpringTelusko7JAVAconfWithComponentScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration; // require for @Configuration

@Configuration
@ComponentScan(basePackages = "com.telusko.SpringTelusko7JAVAconfWithComponentScan")
// for not using @Bean methods
public class BeanJAVAconf {
	/*
	 * @Bean public Samsung getPhone() { return new Samsung(); }
	 * 
	 * @Bean public MobileProcessor getProcessor() { return new Snapdragon(); }
	 */
}
