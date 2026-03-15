package com.bsys.portifoliohenrique.domain.portifolio.service;

import com.bsys.portifoliohenrique.domain.portifolio.PortifolioRepository;
import com.bsys.portifoliohenrique.domain.portifolio.entity.Portifolio;
import com.bsys.portifoliohenrique.infra.constants.ErrorConstants;
import com.bsys.portifoliohenrique.infra.exceptions.EmptyPortifolioException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PortifolioService {

    private final PortifolioRepository portifolioRepository;

    public Portifolio getPortifolio(String id) {
        return portifolioRepository.findById(id)
                .orElseThrow(() -> new EmptyPortifolioException(ErrorConstants.EMPTY_PORTIFOLIO));
    }

    public Portifolio createPortfolio(Portifolio portifolio) {
        return portifolioRepository.save(portifolio);
    }
}
