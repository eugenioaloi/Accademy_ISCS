package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// Funziona uguale CON
//@PropertySource(value={"file:student-info.properties"})

// NON funziona CON e application.properties in src/main/resource, DEVE essere in root   
//@PropertySource(value={"classpath:application.properties"}) 

@Configuration
@PropertySource(value = { "classpath:student-info.properties" })
public class SpringConfiguration {
	{
		// this initializer block will execute when an instance of this class is created by Spring	
		System.out.println("\nLoading AppClientProperties\n");
	}

	@Bean
	public Database getDatabase() {
		return new Database();
	}


	@Bean
	@Value("${listOfValues}")
	public List<String> getListOfValues(List<String> listOfValues) {
		return listOfValues;
	}

}