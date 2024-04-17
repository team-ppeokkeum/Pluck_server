package com.example.pluck_server.domain.auth.exception;

import com.example.pluck_server.global.error.exception.PluckException;
import com.example.pluck_server.global.error.exception.ErrorCode;

public class ExpiredTokenException extends PluckException {

    public static final PluckException EXCEPTION = new ExpiredTokenException();

    public ExpiredTokenException() {
        super(ErrorCode.EXPIRED_TOKEN);
    }
}