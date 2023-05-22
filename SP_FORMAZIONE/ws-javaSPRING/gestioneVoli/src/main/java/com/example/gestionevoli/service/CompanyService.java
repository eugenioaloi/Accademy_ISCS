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
		// TODO Auto-generated method stub
		List<Company> list = new ArrayList<>(); 
		companyRepository.findAll().forEach(c -> list.add(c));
		return list;
	}

	@Override
	public boolean existsById(String companyID) {
		// TODO Auto-generated method stub
		return companyRepository.existsById(companyID);
	}

	@Override
	public Company getCompanyById(String companyID) {
		// TODO Auto-generated method stub
		Company result = companyRepository.findById(companyID).get();
		return result;
	}

	@Override
	public boolean addCompany(Company company) {
		// TODO Auto-generated method stub
		if (companyRepository.existsById(company.getidcompagnia())) {
			return false;
		} else {
			companyRepository.save(company);
			return true;
		}
	}

	@Override
	public void updateCompany(Company company) {
		// TODO Auto-generated method stub
		companyRepository.save(company);
	}

	@Override
	public void deleteCompany(String companyID) {
		// TODO Auto-generated method stub
		companyRepository.delete(getCompanyById(companyID));
	}

}
