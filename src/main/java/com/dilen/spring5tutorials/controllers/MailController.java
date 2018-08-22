package com.dilen.spring5tutorials.controllers;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dilen.spring5tutorials.mail.MailSender;

@RestController
public class MailController {
	
//	@Autowired
//	private MailSender smtpMailSender;
//	
//	@Autowired
//	private MailSender mockMailSender; 
	
	@Autowired
	private MailSender mailSender;
	
	//@Autowired
	//private MailSender sntpMailSenderUsingConfig; 
	
	@RequestMapping("/mail")
	public String hello() throws MessagingException {
		
//		smtpMailSender.send("pant.dilendra@gmail.com", "Sending test mail", "This is body parts of mail");
//		System.out.println(">>>>>>>>>>>111111");
//		mockMailSender.send("pant.dilen@gmail.com", "Testing again...", "Body(here ...)");
		System.out.println(">>>>>>>>>>>222222");
		mailSender.send("pant.dilendra@gmail.com", "Sending test mail from Config bean ", "This is body parts of mail");
		System.out.println(">>>>>>>>>>>333333");
		//sntpMailSenderUsingConfig.send("pant.dilen@gmail.com", "Testing again... from config bean ", "Body(here ...)");
		return "Mail Sended ....";
	}

}
