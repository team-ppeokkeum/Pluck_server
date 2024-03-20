package com.example.pluck_server.domain.user.dao;

import com.example.pluck_server.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    
}