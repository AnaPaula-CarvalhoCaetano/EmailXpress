package com.backend.EmailXpress.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.backend.EmailXpress.Model.EmailMessage;

@Service
public class EmailService {
    private final JavaMailSender javaMailSender;

    @Autowired
    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void enviarEmail(EmailMessage email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email.getDestinatario());
        message.setSubject(email.getAssunto());
        message.setText(email.getCorpo());

        javaMailSender.send(message);
    }
}

