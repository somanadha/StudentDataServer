package com.bst.sds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentDataServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDataServerApplication.class, args);
		System.out.println("Hello World, Tomcat is running...");
	}

}
