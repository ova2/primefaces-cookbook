package org.primefaces.cookbook.model.chapter11;

import java.io.Serializable;

public class CountryGdp implements Serializable {

    // name of the country
    private String name;
    // gross domestic product (GDP), in millions of US dollars
    private long gdp;

    public CountryGdp() {
    }

    public CountryGdp(String name, long gdp) {
        this.name = name;
        this.gdp = gdp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getGdp() {
        return gdp;
    }

    public void setGdp(long gdp) {
        this.gdp = gdp;
    }
}


