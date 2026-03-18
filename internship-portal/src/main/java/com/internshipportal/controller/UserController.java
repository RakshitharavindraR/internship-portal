package com.internshipportal.controller;

import com.internshipportal.model.User;
import com.internshipportal.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
private final UserRepository userRepository;
public UserController(UserRepository userRepository) { this.userRepository = userRepository; }
@GetMapping public List<User> getUsers() { return userRepository.findAll(); }
@PostMapping("/register") public User registerUser(@RequestBody User user) { return userRepository.save(user); }
}