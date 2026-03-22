package com.bsys.portifoliohenrique.domain.user.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class KeycloakService {

    @Value("${keycloak.KEYCLOAK_URL}")
    private String KEYCLOAK_URL;

    @Value("${keycloak.REALM}")
    private String REALM;

    @Value("${keycloak.CLIENT_ID}")
    private String CLIENT_ID;

    @Value("${keycloak.CLIENT_SECRET}")
    private String CLIENT_SECRET; // se confidential

    public Map<String, Object> login(String username, String password) {

        String url = KEYCLOAK_URL + "/realms/" + REALM + "/protocol/openid-connect/token";

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        String body = "client_id=" + CLIENT_ID +
                "&client_secret=" + CLIENT_SECRET +
                "&grant_type=password" +
                "&username=" + username +
                "&password=" + password;

        HttpEntity<String> request = new HttpEntity<>(body, headers);

        ResponseEntity<Map> response = restTemplate.postForEntity(url, request, Map.class);

        return response.getBody();
    }
}
