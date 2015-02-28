package org.primefaces.cookbook.controller.chapter5;

import org.primefaces.cookbook.converter.CarConverter;
import org.primefaces.cookbook.model.chapter3.Car;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User: mertcaliskan
 * Date: 8/8/12
 */
@Named
@ViewScoped
public class OrderListBean implements Serializable {

    private List<String> countries;

    public OrderListBean() {
        countries = new ArrayList<String>();

        countries.add("England");
        countries.add("Germany");
        countries.add("Switzerland");
        countries.add("Turkey");
    }

    public List<String> getCountries() {
        return countries;
    }

    public Collection<Car> getCars() {
        return new ArrayList<Car>(CarConverter.cars.values());
    }
}
