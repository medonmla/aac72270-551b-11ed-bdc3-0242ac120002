package com.example.statisticsproject.services;

import com.example.statisticsproject.models.Country;

import java.util.List;

public interface CountryService {

    List<Country> getAll();

    Country getByCode(String countryCode);
}
