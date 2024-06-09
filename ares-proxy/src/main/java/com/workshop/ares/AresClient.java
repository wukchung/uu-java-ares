package com.workshop.ares;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AresClient {

    private static final String ARES_URL = "https://ares.gov.cz/ekonomicke-subjekty-v-be/rest/ekonomicke-subjekty/";

    public static String fetchData(String id) throws IOException, InterruptedException, AresClientException {
        String url = ARES_URL + id;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("accept", "application/json")
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        int statusCode = response.statusCode();

        if (statusCode >= 400 && statusCode < 600) {
            handleErrorResponse(response);
        }

        return response.body();
    }

    private static void handleErrorResponse(HttpResponse<String> response) throws IOException, AresClientException {
        int statusCode = response.statusCode();
        String responseBody = response.body();
        
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> errorResponse = objectMapper.readValue(responseBody, Map.class);

        String errorCode = errorResponse.get("kod");
        String errorDescription = errorResponse.get("popis");

        switch (statusCode) {
            case 400:
                throw new AresClientInputException(errorCode, errorDescription);
            case 401:
                throw new AresClientAuthenticationException(errorCode, errorDescription);
            case 403:
                throw new AresClientAccessDeniedException(errorCode, errorDescription);
            case 404:
                throw new AresClientNotFoundException(errorCode, errorDescription);
            case 500:
                throw new AresClientUnexpectedException(errorCode, errorDescription);
            default:
                throw new AresClientException(errorCode, errorDescription);
        }
    }
}