package com.example.todoappforsubmission.controller;

import com.example.todoappforsubmission.obj.Lunch;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private final Lunch lunch;

    public ApiController(Lunch lunch) {
        this.lunch = lunch;
    }

    @GetMapping("/")
    public ResponseEntity<String> index() {
        String response = "안녕하세요, 안녕하세요";
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @GetMapping("/lunch")
    public ResponseEntity<Lunch> getLunch() {
        return new ResponseEntity<>(lunch, HttpStatus.OK);
    }


}
