package com.example.ecommerce.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.ecommerce.services.exception.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		String standardError = "Resource Not Found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError error = new StandardError(Instant.now(), status.value(), standardError, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(error);
	}
	
}
