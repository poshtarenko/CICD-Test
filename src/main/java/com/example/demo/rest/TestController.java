package com.example.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

//    very important comment2q121fe ........

    @GetMapping("/")
    public ResponseEntity<String> endpoint() {
        return ResponseEntity.ok("Mock data 2\n");
    }

}
