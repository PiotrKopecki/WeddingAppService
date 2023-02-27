package com.wedding.app.service.mail.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailDto {
	private String mail;
	private String guestName;
	private String guestSurname;
	private boolean isComing;
	private AccompanyingPersonDto accompanyingPersonDto;
}
