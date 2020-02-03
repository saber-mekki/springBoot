package com.example.jpa.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Mission {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	  @NotNull
	    @Lob
	    private String name;
	  
	  
	  public Mission() {
		super();
		// TODO Auto-generated constructor stub
	}


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


	@ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "employee_id")
	    @OnDelete(action = OnDeleteAction.CASCADE)
	    @JsonIgnore
	    private Employee employee;
	

}
