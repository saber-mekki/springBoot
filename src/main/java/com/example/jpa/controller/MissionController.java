package com.example.jpa.controller;

import java.util.List;
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


import com.example.jpa.model.Employee;
import com.example.jpa.model.Mission;
import com.example.jpa.serviceinterface.EmployeeService;
import com.example.jpa.serviceinterface.MissionService;
@RestController
@RequestMapping("mission")
public class MissionController {
	@Autowired
    private EmployeeService employeeService;
	@Autowired
    private MissionService missionService;
   
	
	@PostMapping("/mission/{employee_id}")	  
	public @ResponseBody void save(@RequestBody Mission mission,@PathVariable long employee_id) {
		Optional<Employee> employee=employeeService.findEmployee(employee_id);
		missionService.createMission(mission,employee);
	}
	
	@PostMapping("/update/{employee_id}")	
	public @ResponseBody void update(@RequestBody Mission mission,@PathVariable long employee_id) {
		Optional<Employee> employee=employeeService.findEmployee(employee_id);
		 missionService.updateMission(mission,employee);
		
	}
	
	@GetMapping("/all")	
	public List<Mission> getMission(){
		return missionService.getMission();
	}

	@DeleteMapping("/delete/{id}")	
	public void deleteMission(@PathVariable(name="id") Long id)
	{
		missionService.deleteMission(id);
	}
	
}
