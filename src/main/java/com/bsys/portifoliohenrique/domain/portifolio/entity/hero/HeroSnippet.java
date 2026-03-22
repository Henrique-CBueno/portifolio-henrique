package com.bsys.portifoliohenrique.domain.portifolio.entity.hero;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HeroSnippet {
    private String serviceAnnotation;
    private String classKeyword;
    private String className;
    private String infrastructureComment;
    private String autowiredAnnotation;
    private String awsField;
    private String deploySignature;
    private String deployCallPrefix;
    private String region;
    private String deployCallSuffix;
    private String uptimeComment;
}
