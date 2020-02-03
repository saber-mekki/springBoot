package com.example.jpa.model;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "company")
public class Company {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	@NotNull
	@Lob
	private String name;
	

	  
	   @ManyToMany(fetch = FetchType.EAGER, mappedBy = "company")
	    private Set<Departement> department = new HashSet<>();
}
