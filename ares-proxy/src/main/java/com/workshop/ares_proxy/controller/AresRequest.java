// AresRequest.java
package com.workshop.ares_proxy.controller;

public class AresRequest {

    private String ico;

    // Constructors, getters, and setters
    public AresRequest() {
    }

    public AresRequest(String ico) {
        this.ico = ico;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }
}
