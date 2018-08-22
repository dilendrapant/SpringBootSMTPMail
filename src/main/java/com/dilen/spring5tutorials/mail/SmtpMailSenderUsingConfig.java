package com.dilen.spring5tutorials.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;


public class SmtpMailSenderUsingConfig implements MailSender {

	private static Log log = LogFactory.getLog(SmtpMailSenderUsingConfig.class);
	
	@Override
	public void send(String to, String subject, String body) {
		// TODO Auto-generated method stub
	log.info("Sending SMTP Mail to :: "+to);
	log.info("With subjects :: "+subject);
	log.info("and body :: "+body);
		
	}

}
