package com.example.pluck_server.domain.user.application.facade;

import com.example.pluck_server.domain.user.dao.UserRepository;
import com.example.pluck_server.domain.user.domain.User;
import com.example.pluck_server.domain.user.exception.NotAuthenticatedException;
import com.example.pluck_server.domain.user.exception.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserFacade {

    private final UserRepository userRepository;

    public User currentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()) {
            throw new NotAuthenticatedException("인증되지 않는 유저입니다.");
        }

        return userRepository.findByAccountId(authentication.getName())
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);
    }
}