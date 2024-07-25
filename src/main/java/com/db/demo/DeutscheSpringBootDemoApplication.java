package com.db.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeutscheSpringBootDemoApplication {
	
	private static final Logger LOG = LoggerFactory.getLogger(DeutscheSpringBootDemoApplication.class);

	public static void main(String[] args) {
		LOG.info("Starting Deutsche Bank spring boot Demo app..");
		SpringApplication.run(DeutscheSpringBootDemoApplication.class, args);
		LOG.info("Deutsche Bank spring boot Demo app started.");
	}
}

/**
 * JDBC
 * 
 * ORM - concept for better JDBC    
 * 
 * JPA - specification based on ORM 
 * 
 * Hibernate - implementation of JPA 
 * 
 * Spring Data JPA - implementation of JPA 
 * 
 * 
 **/