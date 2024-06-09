package com.workshop.ares;

public class AresClientNotFoundException extends AresClientException {
    public AresClientNotFoundException(String code, String description) {
        super(code, description);
    }
}