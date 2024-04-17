package com.example.pluck_server.domain.user.exception;

import com.example.pluck_server.global.error.exception.PluckException;
import com.example.pluck_server.global.error.exception.ErrorCode;

public class UserNotFoundException extends PluckException {

    public static final PluckException EXCEPTION = new UserNotFoundException();

    public UserNotFoundException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}