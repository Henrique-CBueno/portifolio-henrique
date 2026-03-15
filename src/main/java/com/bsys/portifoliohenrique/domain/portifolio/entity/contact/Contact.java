package com.bsys.portifoliohenrique.domain.portifolio.entity.contact;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    private String title;
    private String subtitle;
    private ContactForm form;
}
