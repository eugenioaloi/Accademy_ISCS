package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurazione {
	
	@Bean
	@Value("${valoriList}")
	public List<String> getValoriList(List<String> valoriList){
		return valoriList;
	}
	

}
