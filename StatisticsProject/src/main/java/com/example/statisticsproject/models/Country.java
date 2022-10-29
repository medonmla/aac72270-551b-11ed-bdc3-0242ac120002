package com.example.statisticsproject.models;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "countries")
public class Country {


    @NotNull
    @Column(name = "id")
    private String id;

    @NotNull
    @Size(min = 2, max = 32, message = "Country name should be between 2 and 32 symbols.")
    @Column(name = "country_name")
    private String countryName;

    @Id
    @Size(min = 2, max = 2, message = "Country code should be 2 symbols.")
    @Pattern(regexp="[A-Z].*[A-Z]")
    @Column(name = "country_code")
    private String countryCode;

    @NotNull
    @Size(min = 2, max = 32, message = "Slug should be between 2 and 32 symbols.")
    @Column(name = "slug")
    private String slug;

    @Column(name = "new_confirmed")
    private int newCasesConfirmed;

    @Column(name = "total_confirmed")
    private int totalCasesConfirmed;

    @Column(name = "new_deaths")
    private int newDeaths;

    @Column(name = "total_deaths")
    private int totalDeaths;

    @Column(name = "new_recovered")
    private int newRecovered;

    @Column(name = "total_recovered")
    private int totalRecovered;

    @NotNull
    @Column(name = "date")
    private String date;

    public Country() {
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    private void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    private void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getSlug() {
        return slug;
    }

    private void setSlug(String slug) {
        this.slug = slug;
    }

    public int getNewCasesConfirmed() {
        return newCasesConfirmed;
    }

    private void setNewCasesConfirmed(int newCasesConfirmed) {
        this.newCasesConfirmed = newCasesConfirmed;
    }

    public int getTotalCasesConfirmed() {
        return totalCasesConfirmed;
    }

    private void setTotalCasesConfirmed(int totalCasesConfirmed) {
        this.totalCasesConfirmed = totalCasesConfirmed;
    }

    public int getNewDeaths() {
        return newDeaths;
    }

    private void setNewDeaths(int newDeaths) {
        this.newDeaths = newDeaths;
    }

    public int getTotalDeaths() {
        return totalDeaths;
    }

    private void setTotalDeaths(int totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public int getNewRecovered() {
        return newRecovered;
    }

    private void setNewRecovered(int newRecovered) {
        this.newRecovered = newRecovered;
    }

    public int getTotalRecovered() {
        return totalRecovered;
    }

    private void setTotalRecovered(int totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public String getDate() {
        return date;
    }

    private void setDate(String date) {
        this.date = date;
    }
}
