package com.bsys.portifoliohenrique.domain.entity;

import java.util.List;

public record Project(Long id,
                      String name,
                      String smallDescription,
                      String image,
                      List<Tech> techs,
                      Link links
                      ) {

    public record Tech(Long id,
                        String img,
                        String name) {}

    public record Link(List<String> github,
                        String live) {}
}
