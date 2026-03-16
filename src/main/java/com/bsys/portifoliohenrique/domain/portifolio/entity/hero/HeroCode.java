package com.bsys.portifoliohenrique.domain.portifolio.entity.hero;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HeroCode {
    private String archiveName;
    private HeroSnippet snippet;
    private String icon;
    private String iconColor;
}
