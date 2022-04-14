package com.telusko.SpringTelusko8JAVAconfPrimaryAndQualified;

//import org.springframework.context.annotation.Primary; // require for @Primary
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MediaTek implements MobileProcessor {
	public void process() {
		System.out.println("2nd Best CPU");
	}
}
