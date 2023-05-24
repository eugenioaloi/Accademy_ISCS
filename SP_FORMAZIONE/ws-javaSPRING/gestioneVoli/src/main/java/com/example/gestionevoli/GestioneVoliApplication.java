package com.example.gestionevoli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource(value= {"classpath:application.properties"})
public class GestioneVoliApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestioneVoliApplication.class, args);
	}

}
