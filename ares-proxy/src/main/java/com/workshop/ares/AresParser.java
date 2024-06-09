package com.workshop.ares;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class AresParser {

    public static AresData parse(String jsonData) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(jsonData);

        // Check for error code
        if (rootNode.has("kod") && "NENALEZENO".equals(rootNode.path("kod").asText())) {
            String errorMessage = rootNode.path("popis").asText();
            System.err.println("Error from API: " + errorMessage);
            return null; // Return null or throw an exception if desired
        }

        JsonNode dataNode = rootNode.path("someDataField"); // Adjust this according to actual JSON structure

        AresData aresData = new AresData();
        aresData.setField1(dataNode.path("field1").asText());
        aresData.setField2(dataNode.path("field2").asText());
        // Add more fields as needed

        return aresData;
    }
}
