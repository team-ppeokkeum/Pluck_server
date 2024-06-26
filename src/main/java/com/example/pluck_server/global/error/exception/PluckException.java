package com.example.pluck_server.global.error.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PluckException extends RuntimeException {
    private final ErrorCode errorCode;
}
