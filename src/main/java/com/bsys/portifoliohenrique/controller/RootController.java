package com.bsys.portifoliohenrique.controller;

import com.bsys.portifoliohenrique.domain.dto.ProjectsResponseDTO;
import com.bsys.portifoliohenrique.service.RootService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
@RequiredArgsConstructor
public class RootController {

    private final RootService rootService;

    @GetMapping
    public ProjectsResponseDTO projectsResponseDTO() {

        return rootService.getProjects();
    }

}
