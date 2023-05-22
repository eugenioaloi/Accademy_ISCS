package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableConfigurationProperties(Database.class) 

@SpringBootApplication
public class SpringPrjPrimiPassiApplication implements CommandLineRunner {

	@Autowired
	private Database database;

	@Autowired
	private Student student;

	@Value("ABCS")
	private String stringValue;

	@Autowired
	private List<String> listOfValues;

	private List<String> listOfValuesBySetter = new ArrayList<>();

	@Value("#{${valuesMap}}")
	private Map<String, Integer> valuesMap;
	
	@Value("#{${valuesMap}.key1}")
	private String valueMapKey1;

	@Value("#{${unknownMap : {key1: '11', key2: '22'}}}")
	private Map<String, Integer> unknownMap;

	@Value("#{${valuesMap}['unknownKey'] ?: 5}")
	private Integer unknownMapKeyWithDefaultValue;

	@Value("#{${valuesMap}.?[value>'1']}")
	private Map<String, Integer> valuesMapFiltered;

	@Value("#{systemProperties}")
	private Map<String, String> systemPropertiesMap;
	
	@Value("#{systemProperties['java.specification.version']}")	
	private String systemPropertyJava;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringPrjPrimiPassiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println();
        System.out.println("== Dati da bean Student");
		student.displayInfo();
		System.out.println();
	    System.out.println("====");
		System.out.println("ListValues="+listOfValues);
		System.out.println();
	    System.out.println("====");
		System.out.println("ListValuesBySetter="+listOfValuesBySetter);
		System.out.println();
	    System.out.println("====");
		System.out.println("MapValues="+valuesMap);
		System.out.println();
	    System.out.println("====");
		System.out.println("MapKey1="+valueMapKey1);
		System.out.println();
	    System.out.println("====");
		System.out.println("MapUnknown="+unknownMap);
		System.out.println();
	    System.out.println("====");
		System.out.println("MapUnknownWithDefaultValue="+unknownMapKeyWithDefaultValue);
		System.out.println();
	    System.out.println("====");
		System.out.println("MapFilteredValue="+valuesMapFiltered);
		System.out.println();
	    System.out.println("====");
		System.out.println("MapSystemProperties="+systemPropertiesMap);
		System.out.println();
	    System.out.println("====");
		System.out.println("JavaVersion="+systemPropertyJava);
		System.out.println();
		System.out.println("==== Parameters with prefix simple");
		System.out.println("database.url="+database.getUrl());
		System.out.println("database.username="+database.getUsername());
		System.out.println("database.password="+database.getPassword());
		System.out.println();
		System.out.println("==== Parameters Autowired with prefix List");
		System.out.println("Database.mySqlInfo[0]="+database.getMySqlMail().get(0));
		System.out.println("Database.mySqlInfo[0]="+database.getMySqlMail().get(1));
		System.out.println();
		System.out.println("==== Parameters Autowired with prefix Map");
		for (Entry<String, String> entry : database.getAdditionalInfo().entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println("Key="+key + " Value="+val);
		}
	}

    @Autowired
    public void setValues(@Value("#{'${listOfValues}'.split(',')}") List<String> values) {
        this.listOfValuesBySetter.addAll(values);
    }

}

