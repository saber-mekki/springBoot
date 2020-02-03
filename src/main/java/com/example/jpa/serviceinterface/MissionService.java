package com.example.jpa.serviceinterface;

import java.util.List;
import java.util.Optional;

import com.example.jpa.model.Company;
import com.example.jpa.model.Employee;
import com.example.jpa.model.Mission;

public interface MissionService {
	
		            		   
	
	public void createMission(Mission employee,Optional<Employee> emloyee);
	public void updateMission(Mission mission,Optional<Employee> employee);
	public List<Mission> getMission();
	void deleteMission(Long id);
	
}
