package com.bsys.portifoliohenrique.domain.portifolio.entity.certifications;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CertificationItem {
    private String icon;
    private String iconClassName;
    private String iconWrapperClassName;
    private String title;
    private String issuer;
    private String description;
}
