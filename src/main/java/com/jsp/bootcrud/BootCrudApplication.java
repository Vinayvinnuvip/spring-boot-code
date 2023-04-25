package com.jsp.bootcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.jsp")
@EnableJpaRepositories(basePackages = "com.jsp.dao")
@EntityScan(basePackages = "com.jsp.dto")
public class BootCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootCrudApplication.class, args);
	}

}
