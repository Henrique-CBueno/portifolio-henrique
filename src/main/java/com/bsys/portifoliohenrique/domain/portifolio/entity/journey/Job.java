package com.bsys.portifoliohenrique.domain.portifolio.entity.journey;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Job {

    private String startTime;
    private String endTime;
    private String whiteTitle;
    private String enterprise;
    private String description;
}
