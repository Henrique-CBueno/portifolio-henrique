package com.bsys.portifoliohenrique.domain.portifolio.entity.stacks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stacks {
    private String title;
    private String showLessText;
    private String showMoreText;
    private List<StackItem> items;
}
