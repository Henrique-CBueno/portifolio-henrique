package com.bsys.portifoliohenrique.domain.portifolio.service;

import com.bsys.portifoliohenrique.domain.portifolio.PortifolioRepository;
import com.bsys.portifoliohenrique.domain.portifolio.dto.ChangeImgDTO;
import com.bsys.portifoliohenrique.domain.portifolio.entity.Portifolio;
import com.bsys.portifoliohenrique.infra.constants.ErrorConstants;
import com.bsys.portifoliohenrique.infra.exceptions.EmptyPortifolioException;
import com.bsys.portifoliohenrique.infra.minio.MinioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PortifolioService {

    private final PortifolioRepository portifolioRepository;
    private final MinioService minioService;

    public Portifolio getPortifolio(String id) {
        return portifolioRepository.findById(id)
                .orElseThrow(() -> new EmptyPortifolioException(ErrorConstants.EMPTY_PORTIFOLIO));
    }

    public Portifolio createPortfolio(Portifolio portifolio) {
        return portifolioRepository.save(portifolio);
    }

    public void updateImages(String id, List<ChangeImgDTO> imgs) {

        imgs.forEach(
                img -> {
                    minioService.uploadImg(id, img);
                }
        );

    }
}
