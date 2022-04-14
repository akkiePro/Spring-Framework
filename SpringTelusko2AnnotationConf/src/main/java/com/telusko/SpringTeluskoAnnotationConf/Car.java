package com.telusko.SpringTeluskoAnnotationConf;

import org.springframework.stereotype.Component; // import for @Component

@Component
public class Car implements Vehicle {
	public void drive() {
		System.out.println("You are in 4 wheeler...");
	}
}
