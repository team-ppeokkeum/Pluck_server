package com.example.pluck_server.domain.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "account_id", nullable = false)
    private String accountId;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    @Column(name = "name", length = 4, nullable = false)
    private String name;
}