package com.freelancia.backend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity // This marks the class as a database table
@Table(name = "users") // The actual table name in your database
@Data // Lombok: creates getters, setters, toString, etc.
@NoArgsConstructor // Lombok: creates an empty constructor
@AllArgsConstructor // Lombok: creates a constructor with all fields
public class User {
    @Id // Marks this as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increments the ID
    private Long id;

    @Column(unique = true, nullable = false) // Unique and cannot be empty
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;
}