package com.example.gestionevoli.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestionevoli.entity.Company;
import com.example.gestionevoli.repository.CompanyRepository;

@Service
public class CompanyService implements ICompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public List<Company> getAllComapanies() {
		List<Company> list = new ArrayList<>(); 
		companyRepository.findAll().forEach(c -> list.add(c));
		return list;
	}

	@Override
	public boolean existsById(String companyID) {
		return companyRepository.existsById(companyID);
	}

	@Override
	public Company getCompanyById(String companyID) {
		Company result = companyRepository.findById(companyID).get();
		return result;
	}

	@Override
	public boolean addCompany(Company company) {
		if (companyRepository.existsById(company.getidcompagnia())) {
			return false;
		} else {
			companyRepository.save(company);
			return true;
		}
	}

	@Override
	public void updateCompany(Company company) {
		companyRepository.save(company);
	}

	@Override
	public void deleteCompany(String companyID) {
		companyRepository.delete(getCompanyById(companyID));
	}

}
