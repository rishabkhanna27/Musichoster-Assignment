package com.upgrad.musichoster.api.exception;


import com.upgrad.musichoster.service.exception.AuthenticationFailedException;
import com.upgrad.musichoster.service.exception.UnauthorizedException;
import com.upgrad.musichoster.service.exception.UploadFailedException;

import com.upgrad.musichoster.service.exception.UserNotSignedInException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class RestExceptionHandler {



    @ExceptionHandler(AuthenticationFailedException.class)
    public ResponseEntity<ErrorResponse> authenticationFailedException(AuthenticationFailedException exc, WebRequest request) {
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exc.getCode()).message(exc.getErrorMessage()), HttpStatus.UNAUTHORIZED
        );
    }

    @ExceptionHandler(UploadFailedException.class)
    public ResponseEntity<ErrorResponse> uploadFailedException(UploadFailedException exc, WebRequest request) {
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exc.getCode()).message(exc.getErrorMessage()), HttpStatus.UNAUTHORIZED
        );
    }



    @ExceptionHandler(UserNotSignedInException.class)
    public ResponseEntity<ErrorResponse> usernotsignedinException(UserNotSignedInException exc, WebRequest request) {
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exc.getCode()).message(exc.getErrorMessage()), HttpStatus.UNAUTHORIZED
        );
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ErrorResponse> unauthorizedException(UnauthorizedException exc, WebRequest request) {
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exc.getCode()).message(exc.getErrorMessage()), HttpStatus.FORBIDDEN
        );
    }

}