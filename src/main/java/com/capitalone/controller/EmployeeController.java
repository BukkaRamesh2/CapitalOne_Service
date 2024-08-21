package com.capitalone.controller;

import com.capitalone.model.Employee;
import com.capitalone.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeService empService;

    @PostMapping("/saveCust")
    public Employee createCustomer(@RequestBody Employee emp) {
        return empService.createEmployee(emp);
    }

    @GetMapping("/getCust/{name}")
    public ResponseEntity<Employee> getCustomer(@PathVariable String name) {
        return new ResponseEntity<>(empService.getEmployee(name), HttpStatus.OK);

    }

}
