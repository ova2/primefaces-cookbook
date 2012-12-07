package org.primefaces.cookbook.controller.chapter5;

import org.primefaces.cookbook.converter.CarConverter;
import org.primefaces.cookbook.model.chapter3.Car;
import org.primefaces.model.DualListModel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * User: mertcaliskan
 * Date: 8/19/12
 */
@ManagedBean
@ViewScoped
public class PickListController implements Serializable {

    private DualListModel<String> countries;

    private DualListModel<Car> cars;

    private List<String> countriesSource = new ArrayList<String>();
    private List<String> countriesTarget = new ArrayList<String>();

    public PickListController() {
        countriesSource.add("England");
        countriesSource.add("Germany");
        countriesSource.add("Switzerland");
        countriesSource.add("Turkey");

        countries = new DualListModel<String>(countriesSource, countriesTarget);

        List<Car> carsSource = new ArrayList<Car>(CarConverter.cars.values());
        List<Car> carsTarget = new ArrayList<Car>();

        cars = new DualListModel<Car>(carsSource, carsTarget);
    }

    public DualListModel<String> getCountries() {
        return countries;
    }

    public void setCountries(DualListModel<String> countries) {
        this.countries = countries;
    }

    public DualListModel<Car> getCars() {
        return cars;
    }

    public void setCars(DualListModel<Car> cars) {
        this.cars = cars;
    }
}