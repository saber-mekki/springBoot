package com.example.jpa.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

import javax.swing.text.html.HTML.Tag;
import javax.validation.constraints.NotNull;
import javax.persistence.*;


@Entity

public class Departement {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	  @NotNull
	    @Lob
	    private String name;
	  
	    @ManyToMany(cascade = CascadeType.ALL)
	    @JoinTable(name = "company_department",
	    joinColumns = { @JoinColumn(name = "departement_id",referencedColumnName = "id") },
	    inverseJoinColumns = { @JoinColumn(name = "company_id",referencedColumnName = "id") })
	    private Set<Company> company = new HashSet<>();
	
	 

}
