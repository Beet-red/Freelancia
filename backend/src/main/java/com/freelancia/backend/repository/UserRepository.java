package com.freelancia.backend.repository;

import com.freelancia.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository // Marks this as a repository bean
public interface UserRepository extends JpaRepository<User, Long> {

    // Spring Data JPA automatically creates the query for these method names
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}