package com.example.school.exception.dto;

import com.example.school.exception.ErrorPrinter;
import org.springframework.http.HttpStatus;

public enum ErrorCodeEnum implements ErrorPrinter {

    UNAUTHORIZED(HttpStatus.UNAUTHORIZED),
    INVALID_PARAM(HttpStatus.BAD_REQUEST),
    DUPLICATE_RECORD(HttpStatus.BAD_REQUEST),
    ENTITY_NOT_FOUND(HttpStatus.BAD_REQUEST);

    ErrorCodeEnum(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    private final HttpStatus httpStatus;

    @Override
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
