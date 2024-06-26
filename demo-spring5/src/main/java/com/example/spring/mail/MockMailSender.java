package com.example.spring.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class MockMailSender implements MailSender {

	private static Log Log = LogFactory.getLog(MockMailSender.class);

	@Override
	public void send(String to, String subject, String body) {
		Log.info("Send me MOCK mail to " + to);
		Log.info("with the subject " + subject);
		Log.info("and body " + body);
	}

}
