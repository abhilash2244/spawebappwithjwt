package com.eos.spa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages={"com.test","com.eos.spa.model.security","com.eos.security.controller","com.eos.security","com.eos.rest","com.eos.spa","com.eos.spa.config","com.eos.security.service","com.eos.security.repository"})
@EnableJpaRepositories(basePackages= {"com.eos.security.repository"})
public class SpawebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpawebApplication.class, args);
	}
}
