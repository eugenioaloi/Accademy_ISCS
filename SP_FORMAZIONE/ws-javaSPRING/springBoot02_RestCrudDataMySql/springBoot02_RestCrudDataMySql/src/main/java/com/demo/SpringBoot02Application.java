package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringBoot02Application implements CommandLineRunner, WebMvcConfigurer  {	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot02Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql;
		int result;
	    jdbcTemplate.execute("DROP table articles");
	    jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS `articles` ("
	    		+ "  `article_id` int(5) NOT NULL,"
	    		+ "  `title` varchar(200) NOT NULL,"
	    		+ "  `category` varchar(100) NOT NULL,"
	    		+ "  PRIMARY KEY (`article_id`)"
	    		+ ") ENGINE=InnoDB ");
	    result = jdbcTemplate.update("DELETE FROM articles WHERE 1=1");
		if (result > 0) {
			System.out.println(result + " Rows Deleted");
		}
		sql = "INSERT INTO articles (article_id, title, category) VALUES (?, ?, ?)";
		result = jdbcTemplate.update(sql, "1", "Java Concurrency", "Java");
		sql = "INSERT INTO articles (article_id, title, category) VALUES (?, ?, ?)";
		result = jdbcTemplate.update(sql, "2", "Spring Boot Getting Started", "Spring Boot");
		sql = "INSERT INTO articles (article_id, title, category) VALUES (?, ?, ?)";
		result = jdbcTemplate.update(sql, "3",  "Lambda Expressions Java 8 Example", "Java 8");
	}
	
	  @Override
	  public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//	    configurer.defaultContentType(MediaType.APPLICATION_XML);
	  }

}
