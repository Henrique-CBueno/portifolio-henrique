package com.bsys.portifoliohenrique.domain.portifolio.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ChangeImgsRequest {

    private List<ChangeImgDTO> imgs = new ArrayList<>();

}
