package com.bafoly.ex.user;

import com.bafoly.ex.error.ApiError;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("/users/{id}")
  public ResponseEntity<?> getUser(@PathVariable long id){
    try {
      return ResponseEntity.ok(userService.getUserById(id));
    } catch (Exception exception){
      ApiError error = new ApiError(404, "User not found", "/users/" + id);
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
  }
  
}
