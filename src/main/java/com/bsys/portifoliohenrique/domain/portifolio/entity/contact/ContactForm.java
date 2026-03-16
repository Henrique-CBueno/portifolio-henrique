package com.bsys.portifoliohenrique.domain.portifolio.entity.contact;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactForm {
    private String nameLabel;
    private String namePlaceholder;

    private String emailLabel;
    private String emailPlaceholder;

    private String detailsLabel;
    private String detailsPlaceholder;

    private String submitButtonText;
}
