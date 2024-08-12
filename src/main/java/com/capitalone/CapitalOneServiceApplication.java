package com.capitalone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CapitalOneServiceApplication {

	
	
	
	static int test() {
		int a = 1;
		System.out.println("Hello from test");
		return a;
	}
	
	//
	
	/* 
	 * access specifiers   -- public, private , protected, default 
	 * static is key word   
	 * void is a return type 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(CapitalOneServiceApplication.class, args);
		
		test();
		
		System.out.println("Hello Team");
		
	}

}
