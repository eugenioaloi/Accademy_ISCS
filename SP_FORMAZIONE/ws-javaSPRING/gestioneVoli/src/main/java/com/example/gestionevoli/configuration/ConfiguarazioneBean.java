package com.example.gestionevoli.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.gestionevoli.service.AereoService;
import com.example.gestionevoli.service.AereoportoService;
import com.example.gestionevoli.service.ClienteService;
import com.example.gestionevoli.service.CompanyService;
import com.example.gestionevoli.service.DipendenteService;
import com.example.gestionevoli.service.IAereoService;
import com.example.gestionevoli.service.IAereoportoService;
import com.example.gestionevoli.service.IClienteService;
import com.example.gestionevoli.service.ICompanyService;
import com.example.gestionevoli.service.IDipendenteService;
import com.example.gestionevoli.service.ITicketService;
import com.example.gestionevoli.service.IVoloService;
import com.example.gestionevoli.service.TicketService;
import com.example.gestionevoli.service.VoloService;

@Configuration
public class ConfiguarazioneBean {

	public ICompanyService getCompagniaService() {
		return new CompanyService();
	}
	
	@Bean
	public IVoloService getVoloService() {
		return new VoloService();
	}
	
	@Bean
	public IAereoportoService getAereoportoService() {
		return new AereoportoService();
	}
	
	@Bean
	public IAereoService getAereoservice() {
		return new AereoService();
	}
	
	@Bean
	public IClienteService getClienteService() {
		return new ClienteService();
	}
	@Bean
	public IDipendenteService getDipendenteService() {
		return new DipendenteService();
	}
	
	@Bean
	public ITicketService getTicketService() {
		return new TicketService();
	}

}
