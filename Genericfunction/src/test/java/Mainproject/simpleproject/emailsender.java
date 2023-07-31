package Mainproject.simpleproject;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class emailsender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		  String recipient = "jayeshpatle51@gmail.com";
		  
	      // email ID of  Sender.
	      String sender = "jpatle519@gmail.com";
	 
	      // using host as localhost
	      String host = "192.168.43.150";
	 
	      // Getting system properties
	      Properties properties = System.getProperties();
	 
	      // Setting up mail server
	      properties.setProperty("mail.smtp.host", host);
	 
	      // creating session object to get properties
	      Session session = Session.getDefaultInstance(properties);
	 
	      try
	      {
	         // MimeMessage object.
	         MimeMessage message = new MimeMessage(session);
	 
	         // Set From Field: adding senders email to from field.
	         message.setFrom(new InternetAddress(sender));
	 
	         // Set To Field: adding recipient's email to from field.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
	 
	         // Set Subject: subject of the email
	         message.setSubject("This is Subject");
	 
	         // set body of the email.
	         message.setText("This is a test mail");
	 
	         // Send email.
	         Transport.send(message);
	         System.out.println("Mail successfully sent");
	      }
	      catch (MessagingException mex)
	      {
	         mex.printStackTrace();
	      }
	   
	
		
	}

}
