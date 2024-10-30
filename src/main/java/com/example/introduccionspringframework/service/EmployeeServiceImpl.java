package com.example.introduccionspringframework.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public String hello() {
        return "Hello from EmployeeServiceImpl";
    }
}
