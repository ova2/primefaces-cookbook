package org.primefaces.cookbook.controller.chapter1;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * User: mertcaliskan
 * Date: 6/21/12
 */
@Named
@ViewScoped
public class PartialProcessingBean implements Serializable {
    
    private String country;
    private String city;
    private String email;

    private Map<String,String> countries = new HashMap<String, String>();
    private Map<String,String> cities = new HashMap<String, String>();

    private Map<String,String> citiesTurkey;
    private Map<String,String> citiesGermany;

    private Map<String,Map<String,String>> citiesData = new HashMap<String, Map<String,String>>();

    @PostConstruct
    public void setup() {
        countries.put("Germany", "Germany");
        countries.put("Turkey", "Turkey");

        citiesGermany = new HashMap<String, String>();
        citiesGermany.put("Berlin", "Berlin");
        citiesGermany.put("Hamburg", "Hamburg");
        citiesGermany.put("Munich", "Munich");

        citiesTurkey = new HashMap<String, String>();
        citiesTurkey.put("Istanbul", "Istanbul");
        citiesTurkey.put("Ankara", "Ankara");
        citiesTurkey.put("Izmir", "Izmir");

        citiesData.put("Turkey", citiesTurkey);
        citiesData.put("Germany", citiesGermany);
    }

    public void handleCountryChange() {
        if (country != null && !country.equals(""))
            cities = citiesData.get(country);
        else
            cities = new HashMap<String, String>();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getCountries() {
        return countries;
    }

    public void setCountries(Map<String, String> countries) {
        this.countries = countries;
    }

    public Map<String, String> getCities() {
        return cities;
    }

    public void setCities(Map<String, String> cities) {
        this.cities = cities;
    }
}
