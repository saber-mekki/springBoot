package com.example.jpa.serviceimplimentation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.model.Employee;
import com.example.jpa.model.Mission;
import com.example.jpa.reprository.EmployeeReprository;
import com.example.jpa.reprository.MissionReprository;
import com.example.jpa.serviceinterface.MissionService;
@Service
public class MissionServiceImplimentation implements MissionService {
	@Autowired 
	private MissionReprository missionReprository;
	
	@Override
	public void createMission(Mission mission, Optional<Employee> employee) {
		// TODO Auto-generated method stub
		mission.setEmployee(employee.get());
		 missionReprository.save(mission);
	}

	

	@Override
	public void updateMission(Mission mission, Optional<Employee> employee) {
		// TODO Auto-generated method stub
		mission.setEmployee(employee.get());
	}

	

	@Override
	public List<Mission> getMission() {
		// TODO Auto-generated method stub
		return missionReprository.findAll();
	}

	@Override
	public void deleteMission(Long id) {
		// TODO Auto-generated method stub
		missionReprository.deleteById(id);
	}

}
