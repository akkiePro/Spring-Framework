package com.telusko.SpringTelusko6JAVAappConf;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	@Autowired // it works on basis of return type. like here is MobileProcessor Type. then in
				// Bean file ther must be MobileProcessor return typed method.
	MobileProcessor cpu; // cpu is just a variable not an object
	// after including @Autowire it will become object throgh BeanJAVAconf.java

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Octa Core, 4 GB RAM, 12 MP Camera");
		cpu.process();
	}
}
