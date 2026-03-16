package com.bsys.portifoliohenrique.domain.portifolio.entity.footer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SocialLink {
    private String icon;
    private String href;
    private String ariaLabel;
}
