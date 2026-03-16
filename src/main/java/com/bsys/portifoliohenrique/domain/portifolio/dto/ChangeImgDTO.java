package com.bsys.portifoliohenrique.domain.portifolio.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
public class ChangeImgDTO {
    private String section;
    private MultipartFile file;
    private String name;
}
