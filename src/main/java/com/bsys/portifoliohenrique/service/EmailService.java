package com.bsys.portifoliohenrique.service;

import com.bsys.portifoliohenrique.domain.dto.SendEmailDTO;
import com.resend.Resend;
import com.resend.core.exception.ResendException;
import com.resend.services.emails.model.CreateEmailOptions;
import com.resend.services.emails.model.CreateEmailResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailService {

    @Value("${config.email.api-key}")
    private String apiKey;

    @Value("${config.email.from}")
    private String emailFrom;

    @Value("${config.email.to}")
    private String emailTo;

    @Value("${config.email.mail-subject}")
    private String emailSubject;

    public void sendEmail(SendEmailDTO dto) {

        Resend resend = new Resend(apiKey);

        String htmlBody = String.format("<h2>Novo contato recebido</h2>\n" +
                "    <p><strong>Nome:</strong> %s</p>\n" +
                "    <p><strong>Email:</strong> %s</p>\n" +
                "    <p><strong>Mensagem:</strong></p>\n" +
                "    <p>%s</p>",
                dto.name(),
                dto.email(),
                dto.message());

        String textBody = String.format("Nome: %s\n Email: %s\n\n Mensagem: \n %s",
                dto.name(),
                dto.email(),
                dto.message());

        CreateEmailOptions params = CreateEmailOptions
                .builder()
                .from(emailFrom)
                .to(emailTo)
                .subject(emailSubject)
                .html(htmlBody)
                .build();

        try {
            CreateEmailResponse data = resend.emails().send(params);
            log.info("email enviado com sucesso");
        } catch (ResendException e) {
            log.error("ERRO AO ENVIAR O EMAIL");
            throw new RuntimeException(e);
        }

    }


}
