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
public class Projects {
    private String title;
    private String subtitle;
    private String githubButtonText;
    private String githubButtonHref;
    private String caseStudyButtonText;
    private String showLessText;
    private String showMoreText;

    private List<ProjectItem> items;
}
