package com.example.covidstatsh2jpa.repositories;

import com.example.covidstatsh2jpa.models.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, String> {
}
