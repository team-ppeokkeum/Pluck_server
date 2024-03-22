package com.example.pluck_server.domain.auth.exception;

import com.example.pluck_server.global.error.exception.BusinessException;
import com.example.pluck_server.global.error.exception.ErrorCode;

public class ExpiredTokenException extends BusinessException {

    public static final BusinessException EXCEPTION = new ExpiredTokenException();

    public ExpiredTokenException() {
        super(ErrorCode.EXPIRED_TOKEN);
    }
}