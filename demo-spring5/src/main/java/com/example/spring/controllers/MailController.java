package com.example.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.mail.MailSender;


@RestController
public class MailController {

//		private MailSender mailSender = new MockMailSender();
	
	private MailSender mailSender;
	// @Autowired
	public MailController(MailSender smtp) {
		this.mailSender = smtp;
	}

	@RequestMapping("/mail")
	public String mail() {
		mailSender.send("mail@example.com", "A test mail", "Body of the test mail");
		return "Mail send";
	}
}
