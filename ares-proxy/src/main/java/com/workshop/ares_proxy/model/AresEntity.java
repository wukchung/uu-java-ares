package com.workshop.ares_proxy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AresEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String ico;

    private String json_data;

    public AresEntity() {
    }

    public AresEntity(String ico, String json_data) {
        this.ico = ico;
        this.json_data = json_data;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }
    
    public String getId() {
        return ico;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getJsonData() {
        return json_data;
    }

    public void setJsonData(String json_data) {
        this.json_data = json_data;
    }
}