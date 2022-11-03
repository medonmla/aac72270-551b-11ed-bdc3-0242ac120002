package com.example.covidstatsh2jpa.controllers;

import com.example.covidstatsh2jpa.models.Country;
import com.example.covidstatsh2jpa.services.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/api/country")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public List<Country> getAll() {
        return countryService.getCountries();
    }

    @GetMapping("/{countryCode}")
    public Country getByCode(@PathVariable String countryCode) {
        try {
            return countryService.findByCode(countryCode);
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }

    }
}
