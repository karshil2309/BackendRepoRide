package com.project.api.controller;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.model.ShareRideModel;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


@CrossOrigin
@RequestMapping("/adminapiCall")
@RestController
@Configuration
public class ShareRideController {
	
//	@Value("${gmail.username}")
	private String username="wick02783@gmail.com";
	
//	@Value("${gmail.password}")
	private String password="9428431023Ka";
	
	
	@RequestMapping(value="/shareride", method=RequestMethod.POST)
	public String sendEmail(@RequestBody ShareRideModel emailmessage) throws AddressException, MessagingException, IOException {
		sendmail(emailmessage);
		return "Share Ride successfully";
	}
	
	
	private void sendmail(ShareRideModel emailmessage) throws AddressException, MessagingException, IOException {
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance(props,
				  new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				  });
		
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(username, false));

		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailmessage.getTo_address()));
		msg.setSubject(emailmessage.getSubject());
//		msg.setContent(emailmessage.getMessage(), "text/html");
//		msg.setContent(emailmessage.getSource(),"text/html");
//		msg.setContent(emailmessage.getDestination(),"text/html");
//		msg.setContent(emailmessage.getDateofride(),"text/html");
//		msg.setContent(emailmessage.getTimeofride(),"text/html");
			
				
		msg.setSentDate(new Date());
		
		MimeBodyPart messageBodyPart = new MimeBodyPart();
		StringBuilder content= new StringBuilder(emailmessage.getSubject());
		content.append(emailmessage.getSource());
		content.append("<br>");
		content.append(emailmessage.getDestination());
		content.append("<br>");
		content.append(emailmessage.getDateofride());
		content.append("<br>");
		content.append(emailmessage.getTimeofride());
		
		
		messageBodyPart.setContent(content.toString(), "text/html");
//		messageBodyPart.setContent(emailmessage.getSource(), "text/html");
//		messageBodyPart.setContent(emailmessage.getDestination(), "text/html");
//		messageBodyPart.setContent(emailmessage.getDateofride(), "text/html");
//		messageBodyPart.setContent(emailmessage.getTimeofride(), "text/html");

		Multipart multipart = new MimeMultipart();
		multipart.addBodyPart(messageBodyPart);
		MimeBodyPart attachPart = new MimeBodyPart();

		attachPart.attachFile("C:\\Users\\KARSHIL\\Pictures\\Screenshots\\1.png");

		multipart.addBodyPart(attachPart);
		msg.setContent(multipart);
		// sends the e-mail
		Transport.send(msg);
		
	}
}
