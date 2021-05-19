package com.codeclan.example.one2many.hwk.controllers;

import com.codeclan.example.one2many.hwk.models.User;
import com.codeclan.example.one2many.hwk.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity getUser(@PathVariable Long id) {
        return new ResponseEntity<>(userRepository.findById(id), HttpStatus.OK);
    }

    //    CREATE - POST REQUEST
    @PostMapping(value = "/users")
    public ResponseEntity<User> postFolder(@RequestBody User users) {
        userRepository.save(users);
        return new ResponseEntity<>(users, HttpStatus.CREATED);
    }

}
