package com.bafoly.ex.error;

import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiError {

  int status;

  String message;

  long timestamp;

  String path;

  Map<String, String> validationErrors;

  public ApiError(int status, String message, String path) {
    super();
    this.timestamp = new Date().getTime();
    this.status = status;
    this.message = message;
    this.path = path;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public int getStatus() {
    return status;
  }
  
  public void setMessage(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getPath() {
    return path;
  }

  public void setValidationErrors(Map<String, String> validationErrors) {
    this.validationErrors = validationErrors;
  }
  
  public Map<String, String> getValidationErrors() {
    return validationErrors;
  }
  
}
