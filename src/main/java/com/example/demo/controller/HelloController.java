package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.UserEntity;
import com.example.demo.repo.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin(origins = "*")
public class HelloController {

//    @GetMapping("/")
//    public String hello() {
//        return "index.html";
//    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @Autowired
    private UserRepository userRepository;

    // Quick DB connectivity check: will fail if DB is unreachable
    

    @PostMapping("/users")
    public UserEntity createUser(@RequestBody UserEntity user) {
          return userRepository.save(user);
    }

    @GetMapping("/users")
    public List<UserEntity> listUsers() {
        return userRepository.findAll();
    }
    
    @GetMapping("/users/{id}")
    public Optional<UserEntity> getUser(@PathVariable long id) {
    	return userRepository.findById(id);
    	
    }
    
    @GetMapping("/user/{name}")
    public UserEntity getDepatment(@PathVariable String name) {
    	return userRepository.findByName(name);
    }
    
}
