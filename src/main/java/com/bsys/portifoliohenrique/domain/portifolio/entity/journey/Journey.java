package com.bsys.portifoliohenrique.domain.portifolio.entity.journey;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Journey {
    private String title;
    private List<Job> jobs;
}
