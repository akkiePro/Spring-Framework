package com.telusko.SpringTelusko5AutowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired; // import for @Autowired
import org.springframework.stereotype.Component;

// Using @Autowired Annotation for adding the property "You're using CEAT tyre..."
// No XML configuration required + No <property> tag required...

@Component
public class Bike implements Vehicle {
	@Autowired
	private TyreCEAT tyreCEAT;

	public TyreCEAT getTyreCEAT() {
		return tyreCEAT;
	}

	public void setTyreCEAT(TyreCEAT tyreCEAT) {
		this.tyreCEAT = tyreCEAT;
	}

	public void drive() {
		System.out.println("You are on 2 wheeler..." + tyreCEAT + "(using @Autowired Annotation to add property)");
	}
}