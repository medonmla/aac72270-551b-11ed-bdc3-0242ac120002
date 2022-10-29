package com.example.statisticsproject.services;

import com.example.statisticsproject.models.Country;
import com.example.statisticsproject.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryServiceImpl implements CountryService{

    private final CountryRepository countryRepository;

    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> getAll() {
        return countryRepository.getAll();
    }

    @Override
    public Country getByCode(String countryCode) {
        return countryRepository.getByCode(countryCode);
    }

}
