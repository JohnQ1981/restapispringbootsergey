package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Student student = new Student();
		student.setFirstNmae("John");
		student.setLatName("Qosimi");
		student.setId(100);
		
		System.out.println(student.toString());
	}

}
