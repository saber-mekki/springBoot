package com.example.jpa.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
@Entity
public class Contrat {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	  @NotNull
	    @Lob
	    private String name;
	
	  
	  
	  
	  public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Employee getEmployee() {
		return employee;
	}




	public void setEmployee(Employee employee) {
		this.employee = employee;
	}




	@OneToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "employee_id")
	    private Employee employee;

}
