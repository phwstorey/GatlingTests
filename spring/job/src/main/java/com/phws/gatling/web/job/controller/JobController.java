package com.phws.gatling.web.job.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("job")
public class JobController {

    @PostMapping("create")
    public ResponseEntity<String> roundUpAndAddToSavings() {
        return new ResponseEntity<String>("Job Created", HttpStatus.OK);
    }
}