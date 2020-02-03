package com.example.jpa.serviceinterface;

import com.example.jpa.model.Company;

import java.util.*;

public interface CompanyService {
	public void createCompany(Company company);
	public void updateCompany(int companyId,Company company);
	public void deleteCompany(int companyId);
	public List<Company> getCompanies();
	public Optional<Company> findCompany(long id);
 
}
