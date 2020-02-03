package com.example.jpa.serviceinterface;

import java.util.List;


import com.example.jpa.model.Departement;

public interface DepartementService {
	
	
	public void createDepartement(Departement departement);
	public void updateDepartement(int departementId,Departement departement);
	public void deleteDepartement(int contratId);
	public List<Departement> getDepartements();
	

}
