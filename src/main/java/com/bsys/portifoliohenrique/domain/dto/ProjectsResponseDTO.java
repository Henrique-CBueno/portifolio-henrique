package com.bsys.portifoliohenrique.domain.dto;

import com.bsys.portifoliohenrique.domain.entity.Project;

import java.util.List;

public record ProjectsResponseDTO(List<Project> projects) {
}
