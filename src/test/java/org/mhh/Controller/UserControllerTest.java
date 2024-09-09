package org.mhh.Controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class UserControllerTest {

    @Autowired
    private UserController userController;

    @Test
    void testGetBusinessMessageEnglish() {
        String expectedKey = "business-success-message";
        ResponseEntity<String> result = userController.getBusinessMessageEnglish(expectedKey);
        assertNotNull(result);
        assertEquals(200, result.getStatusCodeValue());
        assertEquals("Business operation completed successfully.", result.getBody());
    }

    @Test
    void testGetBusinessMessagePersian() {
        String expectedKey = "business-success-message";
        ResponseEntity<String> result = userController.getBusinessMessagePersian(expectedKey);
        assertNotNull(result);
        assertEquals(200, result.getStatusCodeValue());
        assertEquals("?????? ????? ?? ?????? ?? ????? ????.", result.getBody());
    }

    @Test
    void testGetValidationMessageEnglish() {
        String expectedKey = "error-invalid-email";
        ResponseEntity<String> result = userController.getValidationMessageEnglish(expectedKey);
        assertNotNull(result);
        assertEquals(200, result.getStatusCodeValue());
        assertEquals("Invalid email address", result.getBody());
    }

    @Test
    void testGetValidationMessagePersian() {
        String expectedKey = "error-invalid-email";
        ResponseEntity<String> result = userController.getValidationMessagePersian(expectedKey);
        assertNotNull(result);
        assertEquals(200, result.getStatusCodeValue());
        assertEquals("???? ????? ??????? ???", result.getBody());
    }
}