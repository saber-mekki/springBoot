package com.example.jpa.serviceimplimentation;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.error.NotFoundExeption;
import com.example.jpa.model.Contrat;
import com.example.jpa.model.Employee;
import com.example.jpa.reprository.ContratReprository;
import com.example.jpa.reprository.MissionReprository;
import com.example.jpa.serviceinterface.ContratService;
@Service
public class ContratServiceImplimentation implements ContratService {

	@Autowired 
	private ContratReprository contratReprository;
 	
	
	
	@Override
	public void createContrat(Contrat contrat, Optional<Employee> emloyee) {
	
		
			contrat.setEmployee(emloyee.get());
			contratReprository.save(contrat);
		
	

		
		
		
		
	}

	@Override
	public void updateContrat(long id, Optional<Employee> emloyee) {
		Optional<Contrat> contrat = getContrat(id); 
		contrat.get().setEmployee(emloyee.get());
		contratReprository.saveAndFlush(contrat.get());
	}

	
	
	public Optional<Contrat> getContrat(long id) {
				return  contratReprository.findById(id);
	}

	@Override
	public void deleteContrat(long contratId) {
		contratReprository.deleteById(contratId);

	}

	@Override
	public List<Contrat> getContrats() {
		
		return contratReprository.findAll();
	}
	

	

}
