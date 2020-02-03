package com.example.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.model.Company;
import com.example.jpa.model.Employee;
import com.example.jpa.serviceinterface.CompanyService;
import com.example.jpa.serviceinterface.EmployeeService;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
    private EmployeeService employeeService;
	@Autowired
    private CompanyService companyService;
   
@PostMapping("/save/{company_id}")	  
public ResponseEntity<Employee> save(@Valid @RequestBody Employee employee,@PathVariable long company_id) {
	Optional<Company> company=companyService.findCompany(company_id);
	Employee result=employeeService.saveEmployee(employee,company);
      return new ResponseEntity<Employee>(result,HttpStatus.OK); 
}
  

@PostMapping("/update/{employee_id}")	
public @ResponseBody void update(@PathVariable long employee_id,@RequestBody Employee employee) {
	Optional<Employee> result=employeeService.findEmployee(employee_id);
	 employeeService.updateEmployee(employee, result);
	
}

@GetMapping("/all")	
public List<Employee> getAllEmployee(){
	return employeeService.getAllEmployees();
}



@DeleteMapping("/delete/{id}")	
public ResponseEntity<Void> deleteEmployee(@PathVariable(name="id") Long id)
{
	employeeService.deleteEmployee(id);
	return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
}
@GetMapping("/saber/{id}")	
public Optional<Employee> findEmployee(@PathVariable(name="id")  long id){
	return employeeService.findEmployee(id);
};

}
