package com.bsys.portifoliohenrique.domain.portifolio.entity.projects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectItem {

    private String imageAlt;
    private String imageSrc;
    private List<String> tags;
    private String title;
    private String description;
    private String href;
}
