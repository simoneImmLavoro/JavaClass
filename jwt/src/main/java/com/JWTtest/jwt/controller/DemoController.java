package com.JWTtest.jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public ResponseEntity<String> demo(){
        return ResponseEntity.ok("Welcome to your App!");
    }


    @GetMapping("admin_only")
    public ResponseEntity<String> adminOnly(){
        return ResponseEntity.ok("If you are here you are an ADMIN!");
    }
}
