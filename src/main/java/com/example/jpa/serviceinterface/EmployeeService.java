package com.example.jpa.serviceinterface;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.jpa.model.Company;
import com.example.jpa.model.Employee;



public interface EmployeeService {
	
	Employee saveEmployee(Employee employee,Optional<Company> company);
	
	void updateEmployee(Employee  employee,Optional<Employee> employees);
	
	
	
	
	List<Employee > getAllEmployees();
	
	void deleteEmployee(long id);
	public Optional<Employee> findEmployee(long id);

}
