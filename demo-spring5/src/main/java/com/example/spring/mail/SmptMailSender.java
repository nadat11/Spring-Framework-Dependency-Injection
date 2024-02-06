package com.example.spring.mail;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("smtp")
public class SmptMailSender implements MailSender{

	private static Log Log= LogFactory.getLog(SmptMailSender.class);
	
	@Override
	public void send(String to, String subject, String body) {
		Log.info("Send SMPT mail to " + to);
		Log.info("with the subject " + subject);
		Log.info("and body " + body);
	}

}
