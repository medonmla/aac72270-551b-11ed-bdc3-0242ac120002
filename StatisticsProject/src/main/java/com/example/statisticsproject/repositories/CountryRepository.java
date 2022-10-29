package com.example.statisticsproject.repositories;

import com.example.statisticsproject.models.Country;

import java.util.List;

public interface CountryRepository {

    List<Country> getAll();

    Country getByCode(String countryCode);
}
