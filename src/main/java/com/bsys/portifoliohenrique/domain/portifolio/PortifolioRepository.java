package com.bsys.portifoliohenrique.domain.portifolio;

import com.bsys.portifoliohenrique.domain.portifolio.entity.Portifolio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortifolioRepository extends MongoRepository<Portifolio, String> {
}
