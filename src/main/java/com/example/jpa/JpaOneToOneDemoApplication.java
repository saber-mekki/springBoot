package com.example.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaAuditing
@SpringBootApplication
@ComponentScan()
@EntityScan()
@EnableJpaRepositories()
public class JpaOneToOneDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JpaOneToOneDemoApplication.class, args);
	}

	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
		
		return  applicationBuilder.sources(SpringBootApplication.class);
	}
	
}
