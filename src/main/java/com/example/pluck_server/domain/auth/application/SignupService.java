package com.example.pluck_server.domain.auth.application;

import com.example.pluck_server.domain.auth.dto.request.SignupRequest;
import com.example.pluck_server.domain.user.dao.UserRepository;
import com.example.pluck_server.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignupService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public void signup(SignupRequest request) {
        userRepository.save(
                User.builder()
                        .accountId(request.getAccountId())
                        .nickname(request.getNickname())
                        .password(passwordEncoder.encode(request.getPassword()))
                        .heartCount(0)
                        .build());
    }
}
