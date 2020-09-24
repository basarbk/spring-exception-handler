package com.bafoly.ex.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("/users/{id}")
  public User getUser(@PathVariable long id){
    return this.userService.getUserById(id);
  }
  
}
