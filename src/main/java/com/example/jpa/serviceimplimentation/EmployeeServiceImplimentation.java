package com.example.jpa.serviceimplimentation;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.validation.Valid;
import javax.ws.rs.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.jpa.error.ConflictException;
import com.example.jpa.error.NotFoundExeption;
import com.example.jpa.model.Company;
import com.example.jpa.model.Employee;
import com.example.jpa.reprository.CompanyReprository;
import com.example.jpa.reprository.EmployeeReprository;
import com.example.jpa.serviceinterface.EmployeeService;
@Service
public class EmployeeServiceImplimentation implements EmployeeService {

	@Autowired 
	private EmployeeReprository employeeReprository;
	
	@Autowired 
	private CompanyReprository companyReprository;
	
	
	//-------------------------------
	//Exception conflict --------------------
	//-----------------------------
	@Override
	public Employee saveEmployee(Employee employee, Optional<Company> company)
	{
		String name=employee.getLastName();
	if (employeeReprository.findBylastName(employee.getLastName())!=null)
	{
     throw new ConflictException(String.format("there are another record like %s !!sorry",name));
    }
		employee.setCompany(company.get());
		return employeeReprository.save(employee);
	}

	
	
	
	@Override
	public void updateEmployee(Employee employee,Optional<Employee> employees) {
		employee.setEemployee(employees.get());
		 employeeReprository.saveAndFlush(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeReprository.findAll();
	}



	@Override
	public void deleteEmployee(long id) {
	
		employeeReprository.deleteById(id);
	}
	
	@Override
	public Optional<Employee> findEmployee(long id) {

			return employeeReprository.findById(id);
		
	
	}


}
