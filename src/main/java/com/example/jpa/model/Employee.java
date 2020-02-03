package com.example.jpa.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "emloyee")
public class Employee {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@NotNull(message="tiyle is requered")
	@Size(min=3,message="Tile must be at least 3 characers long")
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email_address")
    private String email;
	  
    
	    
    
    
    @ManyToOne(fetch = FetchType.EAGER)
    //@JoinColumn(name = "company_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Company company;
    
    public Employee() {
		
	}
    
     public Employee(int id, String name,String firstname,String lastname,String email) {
    	 super();
    	 this.email=email;
    	 this.id=id;
    	 this.lastName=lastname;
    	 this.firstName=firstname;
		
	} 
		
	
    
    
	    public Employee(long id, String firstName, String lastName, String email, Company company) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.company = company;
	}

		public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void setEemployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}


		
}
