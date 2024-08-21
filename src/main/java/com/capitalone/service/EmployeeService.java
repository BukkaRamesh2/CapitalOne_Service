package com.capitalone.service;

import com.capitalone.model.Customer;
import com.capitalone.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    Employee createEmployee(Employee employee, String name);

    Employee getEmployee(String name);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(String name);
}
