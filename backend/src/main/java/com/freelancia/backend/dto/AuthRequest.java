package com.freelancia.backend.dto;

import lombok.Data;

@Data // Lombok annotation for getters/setters
public class AuthRequest {
    private String username;
    private String password;
}