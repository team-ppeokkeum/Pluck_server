package com.example.pluck_server.domain.user.dao;

import com.example.pluck_server.domain.user.domain.UserTag;
import com.example.pluck_server.domain.user.domain.UserTagId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTagRepository extends JpaRepository<UserTag, UserTagId> {
}
