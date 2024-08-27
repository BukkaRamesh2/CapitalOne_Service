package com.capitalone.service;

import com.capitalone.model.Customer;
import com.capitalone.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    void createEmployeeManually(Employee employee);

    Employee getEmployee(String name);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(String name);
}
