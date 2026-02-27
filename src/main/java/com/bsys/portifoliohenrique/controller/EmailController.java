package com.bsys.portifoliohenrique.controller;

import com.bsys.portifoliohenrique.domain.dto.SendEmailDTO;
import com.bsys.portifoliohenrique.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("contact")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public String sendEmail(@RequestBody SendEmailDTO dto) {

        emailService.sendEmail(dto);
        return "EMAIL ENVIADO COM SUCESSO";
    }
}
