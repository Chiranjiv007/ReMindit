package com.example.ReMindIt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@EntityScan(basePackages = {"com.example.ReMindIt.model"})
@SpringBootApplication
@ComponentScan("com.example")
public class ReMindItApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReMindItApplication.class, args);
	}

}
