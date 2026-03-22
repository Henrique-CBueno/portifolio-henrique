package com.bsys.portifoliohenrique.infra.advice;

import com.bsys.portifoliohenrique.infra.exceptions.EmptyPortifolioException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@ControllerAdvice
public class ExceptionsAdvice {

    @ExceptionHandler(EmptyPortifolioException.class)
    public ResponseEntity<String> emptyPortifolioException(EmptyPortifolioException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
}
