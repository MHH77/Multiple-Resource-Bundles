package org.mhh.Controller;

import org.mhh.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/business/en/{key}")
    public ResponseEntity<String> getBusinessMessageEnglish(@PathVariable String key) {
        return ResponseEntity.ok(userService.getBusinessMessageEnglish(key));
    }

    @GetMapping("/business/fa/{key}")
    public ResponseEntity<String> getBusinessMessagePersian(@PathVariable String key) {
        return ResponseEntity.ok(userService.getBusinessMessagePersian(key));
    }

    @GetMapping("/validation/en/{key}")
    public ResponseEntity<String> getValidationMessageEnglish(@PathVariable String key) {
        return ResponseEntity.ok(userService.getValidationMessageEnglish(key));
    }

    @GetMapping("/validation/fa/{key}")
    public ResponseEntity<String> getValidationMessagePersian(@PathVariable String key) {
        return ResponseEntity.ok(userService.getValidationMessagePersian(key));
    }

}
