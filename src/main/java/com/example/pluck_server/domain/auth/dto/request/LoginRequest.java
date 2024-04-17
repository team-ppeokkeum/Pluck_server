package com.example.pluck_server.domain.auth.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class LoginRequest {

    @NotBlank
    private String accountId;

    @NotBlank
    private String password;
}
