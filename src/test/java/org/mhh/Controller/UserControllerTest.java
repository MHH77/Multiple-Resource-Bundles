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
    void testGetBusinessMessageEnglishTest() {
        String expectedKey = "business-success-message";
        ResponseEntity<String> result = userController.getBusinessMessageEnglish(expectedKey);
        assertNotNull(result);
        assertEquals(200, result.getStatusCodeValue());
        assertEquals("Business operation completed successfully.", result.getBody());
    }

    @Test
    void testGetBusinessMessagePersianTest() {
        String expectedKey = "business-success-message";
        ResponseEntity<String> result = userController.getBusinessMessagePersian(expectedKey);
        assertNotNull(result);
        assertEquals(200, result.getStatusCodeValue());
        assertEquals("عملیات تجاری با موفقیت به پایان رسید.", result.getBody());
    }

    @Test
    void testGetValidationMessageEnglishTest() {
        String expectedKey = "error-invalid-email";
        ResponseEntity<String> result = userController.getValidationMessageEnglish(expectedKey);
        assertNotNull(result);
        assertEquals(200, result.getStatusCodeValue());
        assertEquals("Invalid email address", result.getBody());
    }

    @Test
    void testGetValidationMessagePersianTest() {
        String expectedKey = "error-invalid-email";
        ResponseEntity<String> result = userController.getValidationMessagePersian(expectedKey);
        assertNotNull(result);
        assertEquals(200, result.getStatusCodeValue());
        assertEquals("ایمیل نا معتبر است", result.getBody());
    }
    @Test
    void getBusinessMessageEnglishWithParameterTest() {
        String expectedKey = "business-test-message";
        ResponseEntity<String> result = userController.getBusinessMessageEnglishWithParameter(expectedKey,"notification","Test");
        assertNotNull(result);
        assertEquals(200, result.getStatusCodeValue());
        assertEquals("notification operation by this parameter Test is completed successfully.", result.getBody());
    }
    @Test
    void getBusinessMessagePersianWithParameterTest() {
        String expectedKey = "business-test-message";
        ResponseEntity<String> result = userController.getBusinessMessagePersianWithParameter(expectedKey,"notification","Test");
        assertNotNull(result);
        assertEquals(200, result.getStatusCodeValue());
        assertEquals("عملیات notification توسط این پارامتر Test با موفقیت انجام شد.", result.getBody());
    }
}