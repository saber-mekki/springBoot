package com.example.jpa.serviceimplimentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import com.example.jpa.model.Company;
import com.example.jpa.reprository.CompanyReprository;
import com.example.jpa.serviceinterface.CompanyService;
@Service
public class CompanyServiceImplimentation implements CompanyService {

	List<Company> companies= new ArrayList<>();
	
	@Autowired
	private CompanyReprository companyreprisotory;
	
	@Override
	public void createCompany(Company company) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCompany(int companyId, Company company) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCompany(int companyId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Company> getCompanies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Company> findCompany(long id) {
		// TODO Auto-generated method stub
		return companyreprisotory.findById(id);
	}

}
