package com.example.pluck_server.domain.auth.application;

import com.example.pluck_server.domain.auth.dto.request.LoginRequest;
import com.example.pluck_server.domain.auth.dto.response.TokenResponse;
import com.example.pluck_server.domain.auth.exception.PasswordMismatchException;
import com.example.pluck_server.domain.user.dao.UserRepository;
import com.example.pluck_server.domain.user.domain.User;
import com.example.pluck_server.domain.user.exception.UserNotFoundException;
import com.example.pluck_server.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final JwtTokenProvider jwtTokenProvider;

    public TokenResponse login(LoginRequest request) {
        User user = userRepository.findByAccountId(request.getAccountId())
                .orElseThrow(()-> UserNotFoundException.EXCEPTION);

        if(!passwordEncoder.matches(request.getPassword(), user.getPassword())) throw PasswordMismatchException.EXCEPTION;

        return jwtTokenProvider.receiveToken(request.getAccountId());
    }
}
