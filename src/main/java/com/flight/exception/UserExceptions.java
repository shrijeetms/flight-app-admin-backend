package com.flight.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptions {
   @ExceptionHandler(value = UserNotFoundException.class)
   public ResponseEntity<Object> exception(UserNotFoundException exception) {
      return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
   }
   
}
