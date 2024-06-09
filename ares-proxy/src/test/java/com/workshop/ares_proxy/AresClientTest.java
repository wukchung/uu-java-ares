package com.workshop.ares_proxy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.workshop.ares.AresClient;
import com.workshop.ares.AresClientException;
import com.workshop.ares.AresClientNotFoundException;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AresClientTest {

 @Test
    public void testFetchDataValidId() throws IOException, InterruptedException, AresClientException {
        String validId = "21051861"; // Replace with a valid ID for testing
        String result = AresClient.fetchData(validId);
        assertNotNull(result, "The fetched data should not be null");
        System.out.println(result);
    }

    @Test
    public void testFetchDataInvalidId() {
        String invalidId = "00000000"; // Invalid ID for testing
        Exception exception = assertThrows(AresClientNotFoundException.class, () -> {
            AresClient.fetchData(invalidId);
        });

        assertEquals("NENALEZENO", ((AresClientException) exception).getCode());
        System.out.println("Response for invalid ID: " + exception.getMessage());
    }
}

