package com.muskaanproject.springboot_demo.exception;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String message)
    {
        super(message);
    }
}
