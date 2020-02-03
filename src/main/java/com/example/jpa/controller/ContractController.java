package com.example.jpa.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.error.NotFoundExeption;
import com.example.jpa.model.Contrat;
import com.example.jpa.model.Employee;
import com.example.jpa.serviceinterface.ContratService;
import com.example.jpa.serviceinterface.EmployeeService;

@RestController
@RequestMapping("contrat")
public class ContractController {
	@Autowired
	private ContratService contratService;
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/contrat/{employee_id}")	  
	public @ResponseBody void save(@RequestBody Contrat contrat,@PathVariable long employee_id) {
	
		try{
			Optional<Employee> employee=employeeService.findEmployee(employee_id);
			   contratService.createContrat(contrat,employee);
			
		}
		catch (NoSuchElementException ex) {
	
	throw new NotFoundExeption(String.format("No Record with this id [%s] ",employee_id));
	
	}

	
	
	}
	

	@PostMapping("/update/{id}/{employee_id}")	
	public @ResponseBody void update(@PathVariable(name="id") long id,@PathVariable(name="employee_id") long employee_id) {
		Optional<Employee> employee=employeeService.findEmployee(employee_id);
		contratService.updateContrat(id, employee);
		
	}
	
	
	@GetMapping("/all")	
	public List<Contrat> getContrat(){
		return contratService.getContrats();
	}
	@GetMapping("/get/{id}")
	public Optional<Contrat> getoneContrat(@PathVariable(name="id") long id){
		
		return contratService.getContrat(id);
	}

	@DeleteMapping("/delete/{id}")	
	public void deleteContrat(@PathVariable(name="id") long id)
	{
		contratService.deleteContrat(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
