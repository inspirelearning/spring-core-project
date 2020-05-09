package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controller","service","model"})
public class SpringHelloWorldJenkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHelloWorldJenkinApplication.class, args);
		System.out.println("Welcome to Spring boot Application");
	}

}
