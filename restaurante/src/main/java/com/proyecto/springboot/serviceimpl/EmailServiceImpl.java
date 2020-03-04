package com.proyecto.springboot.serviceimpl;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import com.proyecto.springboot.service.EmailService;

// TODO: Auto-generated Javadoc
/**
 * The Class EmailServiceImpl.
 */
@Service
public class EmailServiceImpl implements EmailService {

	/**
	 * Enviar correo.
	 *
	 * @param correo the correo
	 */
	@Override
	public void enviarCorreo(String correo) {
		
		final String username = "oktaypruebaxd@gmail.com";
		final String password = "123456xd@";
		String toEmail = "oktaypruebaxd@gmail.com";
		
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");

		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
			
		});
		
		MimeMessage msg = new MimeMessage(session);
		try {
			msg.addRecipient (Message.RecipientType.TO, new InternetAddress(toEmail));
			msg.setSubject("Pedido realizado");
			msg.setText("Pedido realizado con éxito");
			Transport.send(msg);
		}catch(MessagingException e) {
			e.printStackTrace();
		}
	}
}
