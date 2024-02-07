package com.example.spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Value("${app.name}")
	private String appName;
	
	@RequestMapping("/hello")
	public String helo() {
		return "Hello " + appName;
	}
}
