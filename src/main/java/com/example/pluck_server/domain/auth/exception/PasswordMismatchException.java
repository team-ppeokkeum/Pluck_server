package com.example.pluck_server.domain.auth.exception;

import com.example.pluck_server.global.error.exception.PluckException;
import com.example.pluck_server.global.error.exception.ErrorCode;

public class PasswordMismatchException extends PluckException {

    public static final PluckException EXCEPTION = new PasswordMismatchException();

    public PasswordMismatchException() {
        super(ErrorCode.PASSWORD_MISMATCH);
    }
}
