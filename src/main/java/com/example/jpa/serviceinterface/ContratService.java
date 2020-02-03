package com.example.jpa.serviceinterface;


import com.example.jpa.model.Contrat;
import com.example.jpa.model.Employee;

import java.util.*;

public interface ContratService {
	public void createContrat(Contrat contrat,Optional<Employee> emloyee);
	public void updateContrat(long id,Optional<Employee> emloyee);
	public void deleteContrat(long contratId);
	public List<Contrat> getContrats();
	public Optional<Contrat> getContrat(long id);
	
}
