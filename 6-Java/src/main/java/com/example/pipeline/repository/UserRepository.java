package com.example.pipeline.repository;

import com.example.pipeline.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
