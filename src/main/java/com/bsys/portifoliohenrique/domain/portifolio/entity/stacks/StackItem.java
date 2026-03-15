package com.bsys.portifoliohenrique.domain.portifolio.entity.stacks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StackItem {
    private String name;
    private String icon;
    private String iconColor;
    private String helperText;
}
