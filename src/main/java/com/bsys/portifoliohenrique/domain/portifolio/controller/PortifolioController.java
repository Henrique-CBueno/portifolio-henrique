package com.bsys.portifoliohenrique.domain.portifolio.controller;

import com.bsys.portifoliohenrique.domain.portifolio.dto.ChangeImgsRequest;
import com.bsys.portifoliohenrique.domain.portifolio.entity.Portifolio;
import com.bsys.portifoliohenrique.domain.portifolio.service.PortifolioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("portifolio")
@RequiredArgsConstructor
public class PortifolioController {

    private final PortifolioService portifolioService;

    @GetMapping
    public ResponseEntity<Portifolio> getPortifolio(String id) {
        if (id == null || id.isBlank()) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return ResponseEntity.ok(portifolioService.getPortifolio(id));
    }

    @PostMapping
    public ResponseEntity<Portifolio> postPortifolio(@RequestBody Portifolio portifolio) {

        Portifolio created = portifolioService.createPortfolio(portifolio);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PostMapping(value = "{id}/img", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Void> updateImage(@PathVariable String id,
                                            @ModelAttribute ChangeImgsRequest request) {

        var imgs = request.getImgs();
        if (!imgs.isEmpty()) {
            portifolioService.updateImages(id, imgs);
        }
        return ResponseEntity.ok().build();
    }

}
