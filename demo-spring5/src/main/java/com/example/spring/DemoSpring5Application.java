package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //(scanBasePackageClasses = {DemoSpring5Application.class})
public class DemoSpring5Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpring5Application.class, args);
	}

}
