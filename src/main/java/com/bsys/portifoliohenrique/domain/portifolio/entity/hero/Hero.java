package com.bsys.portifoliohenrique.domain.portifolio.entity.hero;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hero {

    private String blueHelperText;
    private HeroTitle title;
    private String subtitle;
    private HeroButtons buttons;
    private HeroCode code;
}
