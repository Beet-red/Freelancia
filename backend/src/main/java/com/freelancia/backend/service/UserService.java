package com.freelancia.backend.service;

import com.freelancia.backend.model.User;
import com.freelancia.backend.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder; // Note the change here
import org.springframework.stereotype.Service;

@Service // Marks this as a service component
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder; // Use the interface, not the implementation

    // Constructor to inject UserRepository and PasswordEncoder
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User registerNewUser(User user) {
        if (userRepository.existsByUsername(user.getUsername())) {
            throw new RuntimeException("Username is already taken!");
        }
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email is already in use!");
        }
        // Hash the password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user); // Save the user to the database
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found: " + username));
    }
}