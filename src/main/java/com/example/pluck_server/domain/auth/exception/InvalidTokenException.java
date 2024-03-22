package com.example.pluck_server.domain.auth.exception;

import com.example.pluck_server.global.error.exception.BusinessException;
import com.example.pluck_server.global.error.exception.ErrorCode;

public class InvalidTokenException extends BusinessException {

    public static final BusinessException EXCEPTION = new InvalidTokenException();

    public InvalidTokenException() {
        super(ErrorCode.INVALID_TOKEN);
    }
}