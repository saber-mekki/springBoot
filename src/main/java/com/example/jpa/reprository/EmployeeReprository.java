 package com.example.jpa.reprository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.jpa.model.Employee;
@Repository
public interface EmployeeReprository extends JpaRepository<Employee,Long> {
Employee findBylastName(String lastName);

}
