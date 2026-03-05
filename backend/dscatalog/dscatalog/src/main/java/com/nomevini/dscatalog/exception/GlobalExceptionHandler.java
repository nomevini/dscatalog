package com.nomevini.dscatalog.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handleNotFound(ResourceNotFoundException ex) {

        Map<String, Object> body = new HashMap<>();
        body.put("status", 404);
        body.put("error", "Resource not found");
        body.put("message", ex.getMessage());

        return ResponseEntity.status(404).body(body);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<Map<String, Object>> handleUUIDError() {

        Map<String, Object> body = new HashMap<>();
        body.put("status", 400);
        body.put("error", "Invalid parameter");
        body.put("message", "ID must be a valid UUID");

        return null;
    }
}
