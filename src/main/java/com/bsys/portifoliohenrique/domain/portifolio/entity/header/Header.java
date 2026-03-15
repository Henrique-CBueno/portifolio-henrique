package com.bsys.portifoliohenrique.domain.portifolio.entity.header;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Header {

    private String whiteTitle;
    private List<HeaderSection> sections;

}
