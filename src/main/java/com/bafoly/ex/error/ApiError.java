package com.bafoly.ex.error;

import java.util.Date;

public class ApiError {

  int status;

  String message;

  long timestamp;

  String path;

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
  
}
