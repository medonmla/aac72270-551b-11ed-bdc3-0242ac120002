package com.example.covidstatsh2jpa;

import com.example.covidstatsh2jpa.repositories.CountryRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CovidStatsH2JpaApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext=
				SpringApplication.run(CovidStatsH2JpaApplication.class, args);
		CountryRepository countryRepository =
				configurableApplicationContext.getBean(CountryRepository.class);
	}
	}


