package com.freelancia.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor // Lombok annotation for a constructor with all fields
public class AuthResponse {
    private String token;
}