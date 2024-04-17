package com.example.pluck_server.domain.tag.exception;

import com.example.pluck_server.global.error.exception.ErrorCode;
import com.example.pluck_server.global.error.exception.PluckException;

public class DuplicatedTagException extends PluckException {

    public static final PluckException EXCEPTION = new DuplicatedTagException();

    public DuplicatedTagException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}
