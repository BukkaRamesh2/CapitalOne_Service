package com.capitalone.repository;

import com.capitalone.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartment(String department);

<<<<<<< HEAD
    Employee findByFirstName(String firstName);
=======
    Employee findByFirstName(String firstName);
>>>>>>> cd8c9e5259be608ec7c7b73564acd4bc27f36ee1


}
