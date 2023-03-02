package com.wedding.app.service.mail;

import com.wedding.app.service.mail.dto.MailDto;

public class MailConstants {
	public static String GUEST = "Guest";
	public static String ATTENDENCE = "attendence";
	public static String SUCCESSFULLY_SENT = "Message Sent Successfully";

	public static String getSubject(String name, String surname) {
		return GUEST + " " + name + " " + surname + ATTENDENCE;
	}

	public static String getText(MailDto mailDto) {
		String text = "";
		text += "Guest: " + mailDto.getGuestName() + " " + mailDto.getGuestSurname();
		if (mailDto.isComing()) {
			text += " is coming";
			if (mailDto.getAccompanyingPersonDto() != null) {
				text += "\nwith person " + mailDto.getAccompanyingPersonDto().getName() + " "
						+ mailDto.getAccompanyingPersonDto().getSurname();
			}
		}
		else {
			text += " is not coming";
		}
		text += "\n";
		return text;
	}
}
