package com.bsys.portifoliohenrique.infra.exceptions;

public class EmptyPortifolioException extends RuntimeException {
    public EmptyPortifolioException(String message) {
        super(message);
    }
}
