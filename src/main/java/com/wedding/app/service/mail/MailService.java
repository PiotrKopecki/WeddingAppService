package com.wedding.app.service.mail;

import com.wedding.app.service.mail.dto.MailDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MailService {
	private final JavaMailSender javaMailSender;

	@Value("${spring.mail.username}")
	private String hostMail;

	public void sendMail(MailDto mailDto) {
		SimpleMailMessage simpleMailMessage = prepareMessage(mailDto);
		javaMailSender.send(simpleMailMessage);
		log.info("Email sent to: " + mailDto.getMail());
	}

	private SimpleMailMessage prepareMessage(MailDto mailDto) {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom(hostMail);
		simpleMailMessage.setText(MailConstants.getText(mailDto));
		simpleMailMessage.setTo(mailDto.getMail());
		simpleMailMessage.setSubject(MailConstants.getSubject(mailDto.getGuestName(), mailDto.getGuestSurname()));
		return simpleMailMessage;
	}
}
