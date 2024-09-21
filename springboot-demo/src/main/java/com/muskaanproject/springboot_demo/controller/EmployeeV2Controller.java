package com.muskaanproject.springboot_demo.controller;

import com.muskaanproject.springboot_demo.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/employee")
public class EmployeeV2Controller {
    @PostMapping("/save")
    public ResponseEntity <String> save()
    {

        return new ResponseEntity<>("data saved", HttpStatus.ACCEPTED);

    }
}
