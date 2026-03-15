package com.bsys.portifoliohenrique.domain.portifolio.entity.hero;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HeroTitle {
    private String whiteTitle;
    private List<String> rotatingWords;
}
