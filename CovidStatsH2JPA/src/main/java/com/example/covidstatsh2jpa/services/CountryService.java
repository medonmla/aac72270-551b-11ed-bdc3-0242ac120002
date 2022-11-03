package com.example.covidstatsh2jpa.services;

import com.example.covidstatsh2jpa.models.Country;
import com.example.covidstatsh2jpa.models.exceptions.CountryNotFoundException;
import com.example.covidstatsh2jpa.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Country findByCode(String code){
        return countryRepository.findById(code).orElseThrow(()->new CountryNotFoundException(code));
    }

    public List<Country> getCountries() {

        return StreamSupport.stream(countryRepository.findAll().spliterator(),false)
                .collect(Collectors.toList());
    }
}
