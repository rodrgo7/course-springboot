package com.oliveiradev.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oliveiradev.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User us = new User(1L, "Rodrigo", "ro@gmail.com", "999999", "12345");
        return ResponseEntity.ok().body(us);
    }
}
