package com.bsys.portifoliohenrique.service;

import com.bsys.portifoliohenrique.domain.dto.ProjectsResponseDTO;
import com.bsys.portifoliohenrique.domain.entity.ProjectsConstant;
import org.springframework.stereotype.Service;

@Service
public class RootService {

    public ProjectsResponseDTO getProjects() {
        return ProjectsConstant.PROJECTS;
    }
}
