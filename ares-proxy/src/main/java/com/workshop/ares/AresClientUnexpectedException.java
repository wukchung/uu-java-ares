package com.workshop.ares;

public class AresClientUnexpectedException extends AresClientException {
    public AresClientUnexpectedException(String code, String description) {
        super(code, description);
    }
}