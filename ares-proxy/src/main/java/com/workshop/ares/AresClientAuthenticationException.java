package com.workshop.ares;

public class AresClientAuthenticationException extends AresClientException {
    public AresClientAuthenticationException(String code, String description) {
        super(code, description);
    }
}