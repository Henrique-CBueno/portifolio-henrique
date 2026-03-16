package com.bsys.portifoliohenrique.domain.portifolio.entity.about;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class About {
    private String id;
    private String img;
    private String title;
    private List<String> description;
    private List<AboutCard> cards;
}
