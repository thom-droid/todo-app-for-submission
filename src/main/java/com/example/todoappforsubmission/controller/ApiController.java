package com.example.todoappforsubmission.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/")
    public ResponseEntity<String> index() {
        String response = "안녕하세요, 안녕하세요";
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
