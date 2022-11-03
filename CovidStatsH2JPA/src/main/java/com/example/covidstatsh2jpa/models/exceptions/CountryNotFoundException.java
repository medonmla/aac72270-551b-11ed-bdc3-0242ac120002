package com.example.covidstatsh2jpa.models.exceptions;

import java.text.MessageFormat;

public class CountryNotFoundException extends RuntimeException{

    public CountryNotFoundException(String id){
        super(MessageFormat.format("Could not find country with code: {null}", id));
    }
}
