package com.edu.demo.safari.exception;


import com.edu.demo.safari.dto.GenericResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Object> handleNoSuchElementException(HttpServletRequest request, NoSuchElementException NoSuchElementException)
    {
        GenericResponse<Object>response=GenericResponse.builder()
                .status(HttpStatus.NOT_FOUND)
                .message("no such element returned by "+request.getRequestURI())
                .data(null)
                .localDateTime(LocalDateTime.now())
                .build();
        return buildResponseEntity(response);
    }

    private ResponseEntity<Object>buildResponseEntity(GenericResponse<Object> errorResponse)
    {
        return new ResponseEntity<>(errorResponse, errorResponse.getStatus());
    }
}
