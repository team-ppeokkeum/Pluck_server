package com.example.pluck_server.global.security.auth;

import com.example.pluck_server.domain.user.domain.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public record CustomUserDetails(User user) implements UserDetails {

    @Override
    public String getUsername() {
        return user.getAccountId();
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return new ArrayList<>(Collections.singleton(new SimpleGrantedAuthority("ROLE_"+user.getNickname())));
    }

    @Override
    public String getPassword() {
        return user.getAccountId();
    }

    @Override
    public boolean isAccountNonExpired() { return true; }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}