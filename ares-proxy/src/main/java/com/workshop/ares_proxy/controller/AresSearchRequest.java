package com.workshop.ares_proxy.controller;

public class AresSearchRequest {
	private String search;

    public AresSearchRequest() {
    }

    public AresSearchRequest(String search) {
        this.search = search;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String ico) {
        this.search = ico;
    }
}
