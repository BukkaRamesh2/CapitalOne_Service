package com.capitalone.service;

import com.capitalone.exception.BankingException;
import com.capitalone.exception.EmployeeException;
import com.capitalone.model.Employee;
import com.capitalone.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository empRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        if (empRepository.existsById(employee.getEmployeeId())) {
            throw new EmployeeException("Employee with Id: " + employee.getEmployeeId() + " already exists in our records ");
        } else {
           return empRepository.save(employee);
        }
    }

    @Override
    public Employee createEmployee(Employee employee, String name) {
        return null;
    }

    @Override
    public  Employee getEmployee(String name) {
        Employee emp = empRepository.findByName(name);
        if (emp == null) {
           throw new EmployeeException(" No records found");
         }
            return emp;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public void deleteEmployee(String name) {

    }
}
