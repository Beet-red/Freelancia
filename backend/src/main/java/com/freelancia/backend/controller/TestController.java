package com.freelancia.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal; // This will hold the logged-in user's details

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/hello")
    public ResponseEntity<String> getProtectedGreeting(Principal principal) {
        // Because of our JWT filter, 'principal.getName()' will return the username of the logged-in user.
        // If no valid token is provided, this endpoint will be blocked before this code is even reached.
        String message = "Hello, " + principal.getName() + "! This is a protected message.";
        return ResponseEntity.ok(message);
    }
}