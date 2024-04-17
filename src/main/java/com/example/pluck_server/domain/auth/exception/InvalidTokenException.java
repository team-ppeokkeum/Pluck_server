package com.example.pluck_server.domain.auth.exception;

import com.example.pluck_server.global.error.exception.PluckException;
import com.example.pluck_server.global.error.exception.ErrorCode;

public class InvalidTokenException extends PluckException {

    public static final PluckException EXCEPTION = new InvalidTokenException();

    public InvalidTokenException() {
        super(ErrorCode.INVALID_TOKEN);
    }
}