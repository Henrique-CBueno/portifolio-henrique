package com.bsys.portifoliohenrique.config;

import lombok.Getter;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Configuration
@Getter
@Slf4j
public class CorsConfig {

    @Value("${config.cors.origins}")
    private String cors;

    @Bean
    public CorsFilter corsFilter() {

        List<String> corsOrigins = Arrays.stream(cors.split(","))
                .map(String::trim)
                .toList();

        log.info("CORS liberado para: {}", corsOrigins);

        CorsConfiguration config = new CorsConfiguration();

        config.setAllowCredentials(true);

        log.info(corsOrigins.toString());

        config.setAllowedOrigins(
            corsOrigins
        );

        config.setAllowedHeaders(List.of("*"));
        config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        config.setExposedHeaders(List.of("Authorization"));

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);

    }
}
