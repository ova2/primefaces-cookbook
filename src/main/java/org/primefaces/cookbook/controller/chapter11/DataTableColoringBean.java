package org.primefaces.cookbook.controller.chapter11;

import org.primefaces.cookbook.model.chapter11.CountryGdp;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class DataTableColoringBean implements Serializable {

    private List<CountryGdp> countryGdpList;

    @PostConstruct
    protected void init() {
        countryGdpList = new ArrayList<CountryGdp>();
        countryGdpList.add(new CountryGdp("United States", 16720000));
        countryGdpList.add(new CountryGdp("China", 9330000));
        countryGdpList.add(new CountryGdp("Japan", 5007000));
        countryGdpList.add(new CountryGdp("Germany", 3593000));
        countryGdpList.add(new CountryGdp("France", 2739000));
        countryGdpList.add(new CountryGdp("United Kingdom", 2490000));
        countryGdpList.add(new CountryGdp("Brazil", 2190000));
        countryGdpList.add(new CountryGdp("Russia", 2113000));
    }

    public List<CountryGdp> getCountryGdpList() {
        return countryGdpList;
    }
}
