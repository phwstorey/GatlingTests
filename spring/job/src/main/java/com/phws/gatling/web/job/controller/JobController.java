package com.phws.gatling.web.job.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("job")
public class JobController {
    @PostMapping(value = "create",consumes = "application/json")
    public ResponseEntity<String> roundUpAndAddToSavings() {
        System.out.println(Thread.currentThread().getId());
        return new ResponseEntity<String>("{\"jobName\": \"doSomething\"}", HttpStatus.CREATED);
    }
}