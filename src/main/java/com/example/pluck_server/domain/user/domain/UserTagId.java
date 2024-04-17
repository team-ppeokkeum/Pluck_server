package com.example.pluck_server.domain.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
@NoArgsConstructor
@EqualsAndHashCode
public class UserTagId implements Serializable {
    @Column(name = "user_id")
    private UUID userId;

    @Column(name = "tag_id")
    private Long tagId;
}
