package com.bsys.portifoliohenrique.domain.portifolio.entity;

import com.bsys.portifoliohenrique.domain.portifolio.entity.about.About;
import com.bsys.portifoliohenrique.domain.portifolio.entity.certifications.Certifications;
import com.bsys.portifoliohenrique.domain.portifolio.entity.contact.Contact;
import com.bsys.portifoliohenrique.domain.portifolio.entity.footer.Footer;
import com.bsys.portifoliohenrique.domain.portifolio.entity.header.Header;
import com.bsys.portifoliohenrique.domain.portifolio.entity.hero.Hero;
import com.bsys.portifoliohenrique.domain.portifolio.entity.journey.Journey;
import com.bsys.portifoliohenrique.domain.portifolio.entity.projects.Projects;
import com.bsys.portifoliohenrique.domain.portifolio.entity.stacks.Stacks;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "portifolio")
public class Portifolio {

    @Id
    private String id;

    private String name;
    private String description;

    private Header header;
    private Hero hero;
    private About about;
    private Journey journey;
    private Stacks stacks;
    private Projects projects;
    private Certifications certifications;
    private Contact contact;
    private Footer footer;
}
