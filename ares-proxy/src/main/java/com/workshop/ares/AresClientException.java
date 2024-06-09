package com.workshop.ares;

public class AresClientException extends Exception {
    private final String code;
    private final String description;

    public AresClientException(String code, String description) {
        super(description);
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
