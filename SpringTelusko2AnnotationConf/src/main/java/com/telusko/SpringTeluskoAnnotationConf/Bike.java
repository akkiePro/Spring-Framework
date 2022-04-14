package com.telusko.SpringTeluskoAnnotationConf;

import org.springframework.stereotype.Component; // import for @Component

@Component
public class Bike implements Vehicle {
	public void drive() {
		System.out.println("You are on 2 wheeler...");
	}
}
