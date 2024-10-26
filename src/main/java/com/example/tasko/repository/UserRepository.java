package com.example.tasko.repository;

import com.example.tasko.model.Enterprise;
import com.example.tasko.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    long countByEnterprise(Enterprise enterprise);
}