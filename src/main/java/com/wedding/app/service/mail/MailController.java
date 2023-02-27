package com.wedding.app.service.mail;

import com.wedding.app.service.mail.dto.MailDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/${api.url}/mails")
@RestController
@RequiredArgsConstructor
public class MailController {
	private MailService mailService;

	@PostMapping
	public ResponseEntity<String> sendEmail(@RequestBody MailDto emailDto) {
		mailService.sendMail(emailDto);
		return new ResponseEntity<>(MailConstants.SUCCESSFULLY_SENT, HttpStatus.OK);
	}
}
