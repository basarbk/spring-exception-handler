package com.bafoly.ex.user;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("/users/{id}")
  public User getUser(@PathVariable long id){
    return userService.getUserById(id);
  }

  @PostMapping("/users")
  public User postUser(@Valid @RequestBody User user){
    return userService.save(user);
  }

}
