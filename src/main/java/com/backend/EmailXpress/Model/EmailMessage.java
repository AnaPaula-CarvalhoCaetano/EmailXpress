package com.backend.EmailXpress.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailMessage {
	private String destinatario;
	private String assunto;
	private String corpo;
	

	public EmailMessage(String destinatario, String assunto, String corpo) {
		super();
		this.destinatario = destinatario;
		this.assunto = assunto;
		this.corpo = corpo;
	}

}
