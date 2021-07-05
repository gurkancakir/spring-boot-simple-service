package com.gurkan.simpleservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping("/")
    public ResponseEntity<LocalDateTime> test() {
        return ResponseEntity.ok(LocalDateTime.now());
    }

    @GetMapping("/test")
    public ResponseEntity<String> test2() {
        return ResponseEntity.ok("Test");
    }
}
