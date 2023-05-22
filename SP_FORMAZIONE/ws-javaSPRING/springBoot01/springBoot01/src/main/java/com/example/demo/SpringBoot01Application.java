package com.example.demo;

/* ------------------------------
 * Dependency Injection in azione
 * ------------------------------
 * 
 * 1) @SpringBootApplication per dichiarare una SpringBoot application
 * 2) @Autowired per iniettare le dipendenza (SpringBoot01Application.java)
 *    by Type @Bean Database via getter new Database() (SpringConfiguration.java)
 *    by Type @Component Student (Student.java)  
 * 3) @Configuration per configurare i bean da iniettare (SpringConfiguration.java, Database.java)
 * 4) @Component per dichiarare un been iniettato con @Autowired (Student.java)
 * 5) @Bean per dichiarare che un metodo restituisce un been da iniettare con @Autowired (SpringConfiguration.java)
 * 6) @Value per iniettare proprieta da file properties 
 *     by Constructor              (Student.java, student-info.properties, ${student.name}, ..)
 *     by Setter String            (Student.java, application.properties, ${priority:normal})
 *     by Setter List              (SpringBoot01Application.java, application.properties, ${listOfValues})
 *     by Getter List & @Autowired (SpringConfig.java, application.properties, ${listOfValues} )
 *     by property all Map         (SpringBoot01Application.java, application.properties, #{${valuesMap}} )
 *     by property Map key         (SpringBoot01Application.java, application.properties, #{${valuesMap}.key1}} )
 *     by property Map key default (SpringBoot01Application.java, application.properties, #{${valuesMap}['unknownKey'] ?: 5} )
 *     by property Map conditional (SpringBoot01Application.java, application.properties, #{${valuesMap}.?[value>'1']} )
 *     by property Map System Prop.(SpringBoot01Application.java, application.properties, #{systemProperties} )
 *     by property Map System Prop.(SpringBoot01Application.java, application.properties, #{systemProperties['java.specification.version'] )
 * 7) @ConfigurationProperties(prefix = "database") per iniettare le proprietà qualificate
 *    @PropertySource(value = { "classpath:database.properties" }) per utilizzare uno specifico file di properties
 *    by name                      (Database.java, database.properties (database.url, database.name, database.password))
 *    by List                      (Database.java, database.properties (database.mySqlMail[0]=mysql1@mail.com, database.mySqlMail[0]=mysql1@mail.com))
 *    by Map                       (Database.java, database.properties (database.additionalInfo.italian=true, database.additionalInfo.address=Via Po 20))
 *    by nested object             (Database.java, database.properties (database.serverNested.serverName=SRV001, database.serverNested.serverType=embedded, ..)
 *    
  */
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
public class SpringBoot01Application implements CommandLineRunner {

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
		SpringApplication.run(SpringBoot01Application.class, args);
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
