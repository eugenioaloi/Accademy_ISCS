package com.example.gestionevoli.service;

import java.util.List;

import com.example.gestionevoli.entity.Company;

public interface ICompanyService {
	
	List<Company> getAllComapanies();
	
	boolean existsById(String companyID);
	
	Company getCompanyById(String companyID);
	
	boolean addCompany(Company company);
	
	void updateCompany(Company company);
	
	void deleteCompany(String companyID);

}
