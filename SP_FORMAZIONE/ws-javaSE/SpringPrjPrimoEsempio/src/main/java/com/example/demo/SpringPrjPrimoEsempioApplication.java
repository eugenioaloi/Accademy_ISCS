package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPrjPrimoEsempioApplication implements CommandLineRunner{
	
	@Autowired
	private List<String> valoriList;
	
	@Value("#{valoriMap}")
	private Map<String, String> valoriMap;
	
	@Value("#{${valoriMap}.chiave1}")
	private Map<String, String> valoriChiaveMap;

	public static void main(String[] args) {
		SpringApplication.run(SpringPrjPrimoEsempioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Valori della lista");
		System.out.println(valoriList);
		
		System.out.println("Valori della mappa");
		System.out.println(valoriMap);
		
		System.out.println("Valori chiave della map");
		System.out.println(valoriChiaveMap);
		
	}

}
