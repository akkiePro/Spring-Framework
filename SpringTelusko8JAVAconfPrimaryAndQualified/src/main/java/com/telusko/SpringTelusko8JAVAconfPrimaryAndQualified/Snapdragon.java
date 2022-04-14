package com.telusko.SpringTelusko8JAVAconfPrimaryAndQualified;

import org.springframework.stereotype.Component;

@Component("mySnapdragon")
public class Snapdragon implements MobileProcessor {
	public void process() {
		System.out.println("World best CPU");
	}
}
