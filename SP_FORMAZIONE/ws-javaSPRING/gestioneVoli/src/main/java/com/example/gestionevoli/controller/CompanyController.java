package com.example.gestionevoli.controller;

import org.springframework.http.HttpHeaders;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.gestionevoli.entity.Company;
import com.example.gestionevoli.service.ICompanyService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("gestioneCompagnia")
public class CompanyController {
	
	@Autowired
	private ICompanyService companyService;
	
	@GetMapping(value = "compagnia/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<CompanyInfo> getCompanyId(@PathVariable("id") String id) {
		CompanyInfo ob = new CompanyInfo();
		if(!companyService.existsById(id)) {
			return new ResponseEntity<CompanyInfo>(ob, HttpStatus.NOT_FOUND); 
		}
		BeanUtils.copyProperties(companyService.getCompanyById(id), ob);
		return new ResponseEntity<CompanyInfo>(ob, HttpStatus.OK);
	}
	
	@GetMapping(value = "compagnia", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<CompanyInfo>> getAllCompanies() {
		List<CompanyInfo> resCompanyInfo = new ArrayList<>();
		List<Company> companyList = companyService.getAllComapanies();
		for (int i = 0; i < companyList.size(); i++) {
			CompanyInfo ob = new CompanyInfo();
			BeanUtils.copyProperties(companyList.get(i), ob);
			resCompanyInfo.add(ob);
		}
		
		return new ResponseEntity<List<CompanyInfo>>(resCompanyInfo, HttpStatus.OK);
	}
	
	@PostMapping(value = "compagnia", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Void> addCompany(@RequestBody CompanyInfo companyInfo, UriComponentsBuilder builder) {
		Company company = new Company();
		BeanUtils.copyProperties(companyInfo, company);
		boolean flag = companyService.addCompany(company);
		if (flag == false) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/company/{id}").buildAndExpand(company.getidcompagnia()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@PutMapping(value = "compagnia", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<CompanyInfo> updateCompany(@RequestBody CompanyInfo companyInfo) {
		Company company = new Company();
		BeanUtils.copyProperties(companyInfo, company);
		CompanyInfo compInfo = new CompanyInfo();
		BeanUtils.copyProperties(company, compInfo);
		if (!companyService.existsById(compInfo.getidcompagnia())) {
			return new ResponseEntity<CompanyInfo>(compInfo, HttpStatus.NOT_FOUND);
		}
		companyService.updateCompany(company);
		return new ResponseEntity<CompanyInfo>(compInfo, HttpStatus.OK);
	}
	
	
	@DeleteMapping(value= "compagnia/{id}", produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Void> deleteCompany(@PathVariable("id") String id, UriComponentsBuilder builder) {
		if (!companyService.existsById(id)) {
			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(builder.path("/Company/{id}").buildAndExpand(id).toUri());
			return new ResponseEntity<Void>(headers, HttpStatus.NOT_FOUND);
		}
		companyService.deleteCompany(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	
	
}
