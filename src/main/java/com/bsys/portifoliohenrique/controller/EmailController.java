package com.bsys.portifoliohenrique.controller;

import com.bsys.portifoliohenrique.domain.dto.SendEmailDTO;
import com.bsys.portifoliohenrique.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contact")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<String> sendEmail(@RequestBody SendEmailDTO dto) {

        emailService.sendEmail(dto);
        return ResponseEntity.ok("EMAIL ENVIADO COM SUCESSO");
    }
}
