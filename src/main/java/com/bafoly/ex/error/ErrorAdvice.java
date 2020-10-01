package com.bafoly.ex.error;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorAdvice {
  
  @ExceptionHandler(NotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public ApiError handleNotFoundException(NotFoundException ex, HttpServletRequest request){
    ApiError error = new ApiError(404, ex.getMessage(), request.getServletPath());
    return error;
  }
  
  @ExceptionHandler(MethodArgumentNotValidException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public ApiError handleMethodArgNotValid(MethodArgumentNotValidException exception, HttpServletRequest request){
    ApiError error = new ApiError(400, exception.getMessage(), request.getServletPath());
    return error;
  }

}
