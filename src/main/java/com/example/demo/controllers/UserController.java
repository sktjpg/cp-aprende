package com.example.demo.controllers;

import com.example.demo.domain.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/example")
public class UserController {

    private final UserService exampleService;

    public UserController(UserService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/user")
    public ResponseEntity<UserEntity> getExampleNumber() {
        final UserEntity user = exampleService.getUser();
        return ResponseEntity.ok(user);
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        final List<UserEntity> user = exampleService.getAllUsers();
        return ResponseEntity.ok(user);
    }

    @GetMapping("/hola")
    public ResponseEntity<String> getHola() {
        return ResponseEntity.ok("hola");
    }
}
