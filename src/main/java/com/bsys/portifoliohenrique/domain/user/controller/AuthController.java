package com.bsys.portifoliohenrique.domain.user.controller;

import com.bsys.portifoliohenrique.domain.user.dto.LoginRequest;
import com.bsys.portifoliohenrique.domain.user.service.KeycloakService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("portifolio")
@RequiredArgsConstructor
public class AuthController {

    private final KeycloakService keycloakService;

    @PostMapping("/login")
    public Object login(@RequestBody LoginRequest request) {
        return keycloakService.login(request.username(), request.password());
    }
}
