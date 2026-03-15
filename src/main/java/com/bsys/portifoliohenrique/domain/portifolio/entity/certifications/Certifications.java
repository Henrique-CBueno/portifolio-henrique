package com.bsys.portifoliohenrique.domain.portifolio.entity.certifications;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Certifications {
    private String title;
    private List<CertificationItem> items;
}
