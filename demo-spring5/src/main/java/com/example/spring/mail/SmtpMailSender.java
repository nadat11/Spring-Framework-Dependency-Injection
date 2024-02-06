package com.example.spring.mail;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("smtpMail")
public class SmtpMailSender implements MailSender{

	private static Log Log= LogFactory.getLog(SmtpMailSender.class);
	
	@Override
	public void send(String to, String subject, String body) {
		Log.info("Send SMPT mail to " + to);
		Log.info("with the subject " + subject);
		Log.info("and body " + body);
	}

}