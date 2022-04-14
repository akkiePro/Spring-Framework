package com.telusko.SpringTelusko6JAVAappConf;

import org.springframework.context.annotation.Bean; // require for @Bean
import org.springframework.context.annotation.Configuration; // require for @Configuration

@Configuration // now we can say it's a conf file just like bean.xml
public class BeanJAVAconf {
	@Bean // now it became BEAN
	public Samsung getPhone() {
		return new Samsung();
	}

	@Bean
	public MobileProcessor getProcessor() {
		// linkage through @Autowired & matched bcz of return type is MobileProcessor
		return new Snapdragon();
	}
}
