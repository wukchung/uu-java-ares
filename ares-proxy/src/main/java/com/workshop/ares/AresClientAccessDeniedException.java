package com.workshop.ares;

public class AresClientAccessDeniedException extends AresClientException {
    public AresClientAccessDeniedException(String code, String description) {
        super(code, description);
    }
}