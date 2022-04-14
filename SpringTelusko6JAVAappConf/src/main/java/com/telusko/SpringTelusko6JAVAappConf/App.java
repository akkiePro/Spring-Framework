package com.telusko.SpringTelusko6JAVAappConf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// JAVA Annotation instead of XML configuration 

public class App {
	public static void main(String[] args) {
		/*
		 * Samsung s7 = new Samsung(); s7.config(); Aam zindagi
		 */
		ApplicationContext factory = new AnnotationConfigApplicationContext(BeanJAVAconf.class);
		// for JAVA Annotation Configuration
		// NOTE : in JAVA Annotation, don't put double inverted comma("").
		Samsung s7 = (Samsung) factory.getBean(Samsung.class); // no ""
		s7.config();
	}
}

// flow :
/*
 * App.java => refer Bean file(BeanJAVAconf.java) => App.java => Samsung s7 will
 * getBean() of Samsung from BeanJAVAconf => App.java => s7.config() =>
 * Samsung.java => inside config() => println(); => cpu.process() => cpu will
 * fetch it's new object of Snapdragon() from BeanJAVAconf with the help
 * of @Autowired => .process() is declared in MobileProcessor interface and
 * implemented in Snapdragon class => so, in Snapdragon, process() runs
 * println(); => That's it.
 */