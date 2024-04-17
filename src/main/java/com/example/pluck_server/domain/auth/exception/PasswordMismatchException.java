package com.example.pluck_server.domain.auth.exception;

import com.example.pluck_server.global.error.exception.BusinessException;
import com.example.pluck_server.global.error.exception.ErrorCode;

public class PasswordMismatchException extends BusinessException {

    public static final BusinessException EXCEPTION = new PasswordMismatchException();

    public PasswordMismatchException() {
        super(ErrorCode.PASSWORD_MISMATCH);
    }
}
