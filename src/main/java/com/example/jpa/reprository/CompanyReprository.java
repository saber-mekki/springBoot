package com.example.jpa.reprository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.model.Company;

@Repository

public interface CompanyReprository  extends JpaRepository<Company,Long>{

	
}
