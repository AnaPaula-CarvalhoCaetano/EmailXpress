package com.backend.EmailXpress.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.EmailXpress.Model.EmailMessage;
import com.backend.EmailXpress.Service.EmailService;

@RestController
@RequestMapping("/enviar-email")
public class EmailController {
    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public ResponseEntity<String> enviarEmail(@RequestBody EmailMessage email) {
        emailService.enviarEmail(email);
        return ResponseEntity.ok("Email enviado com sucesso.");
    }
}

