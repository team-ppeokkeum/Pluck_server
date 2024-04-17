package com.example.pluck_server.domain.auth.application;

import com.example.pluck_server.domain.auth.dto.request.SignupRequest;
import com.example.pluck_server.domain.tag.dao.TagRepository;
import com.example.pluck_server.domain.user.dao.UserRepository;
import com.example.pluck_server.domain.user.dao.UserTagRepository;
import com.example.pluck_server.domain.user.domain.User;
import com.example.pluck_server.domain.user.domain.UserTag;
import com.example.pluck_server.domain.user.domain.UserTagId;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignupService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final TagRepository tagRepository;

    private final UserTagRepository userTagRepository;

    public void signup(SignupRequest request) {
        User user = userRepository.save(
                User.builder()
                        .accountId(request.getAccountId())
                        .nickname(request.getNickname())
                        .password(passwordEncoder.encode(request.getPassword()))
                        .heartCount(0)
                        .build());

        request.getTagName().stream()
                .map(tagRepository::findByTagName)
                .forEach(tag -> userTagRepository.save(new UserTag(new UserTagId(), user, tag)));
    }
}
