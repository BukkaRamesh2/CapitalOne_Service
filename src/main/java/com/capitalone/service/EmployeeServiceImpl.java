package com.capitalone.service;

import com.capitalone.exception.BankingException;
import com.capitalone.exception.EmployeeException;
import com.capitalone.model.Employee;
import com.capitalone.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
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
    public  Employee getEmployee(String name) {
        Employee emp = empRepository.findByFirstName(name);
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


    public void createEmployeeManually(Employee emp)
    {
        LocalDateTime currentTime = LocalDateTime.now();

        List<String> list = new ArrayList<String>();
        list.add("john");
        list.add("doe");
        System.out.println("Arraylist Current Date and Time before: " + currentTime);
        list.add("smith");
        System.out.println("Arraylist Current Date and Time after: " + currentTime);
        for (String l : list) {
            System.out.println(l);
        }

        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        System.out.println("linkedlist Current Date and Time before: " + currentTime);
        al.add("Sandy");
        System.out.println("linkedlist Current Date and Time after: " + currentTime);
        al.add("Ajay");
        for (String l : al) {
            System.out.println(l);
        }

        Set<String> s1 = new HashSet<String>();
        s1.add("Apple");
        s1.add("Banana");
        s1.add("Orange");
        s1.add("Apple");
        for (String fruit : s1) {
            System.out.println(fruit);
        }

        Map<Long, Employee> employeeMap = new HashMap<>();
        employeeMap.put(emp.getEmployeeId(), emp);
        employeeMap.forEach((key, value) -> {
                    System.out.println("key: " + key);
                    System.out.println("firstname: " + value.getLastName());
                    System.out.println("lastname: " + value.getLastName());
                    System.out.println("department: " + value.getDepartment());
                }
        );

    }
}
