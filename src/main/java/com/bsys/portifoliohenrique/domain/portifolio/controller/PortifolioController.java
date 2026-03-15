package com.bsys.portifoliohenrique.domain.portifolio.controller;

import com.bsys.portifoliohenrique.domain.portifolio.entity.Portifolio;
import com.bsys.portifoliohenrique.domain.portifolio.service.PortifolioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("portifolio")
@RequiredArgsConstructor
public class PortifolioController {

    private final PortifolioService portifolioService;

    @GetMapping
    public ResponseEntity<Portifolio> getPortifolio(String id) {
        if (id == null || id.isBlank()) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return ResponseEntity.ok(portifolioService.getPortifolio(id));
    }
}
