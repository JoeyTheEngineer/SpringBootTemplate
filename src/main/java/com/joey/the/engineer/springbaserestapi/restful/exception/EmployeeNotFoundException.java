package com.joey.the.engineer.springbaserestapi.restful.exception;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(String id) {
        super("Could not find employee " + id);
    }
}
