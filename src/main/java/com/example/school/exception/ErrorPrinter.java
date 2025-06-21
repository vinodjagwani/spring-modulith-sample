package com.example.school.exception;

import java.io.Serializable;
import org.springframework.http.HttpStatus;

public interface ErrorPrinter extends Serializable {

    HttpStatus getHttpStatus();

}
