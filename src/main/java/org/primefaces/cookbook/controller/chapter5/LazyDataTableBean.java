package org.primefaces.cookbook.controller.chapter5;

import org.primefaces.cookbook.converter.CarConverter;
import org.primefaces.cookbook.model.chapter3.Car;
import org.primefaces.cookbook.model.chapter5.LazyCarDataModel;
import org.primefaces.model.LazyDataModel;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User: mertcaliskan
 * Date: 9/2/12
 */
@Named
@ViewScoped
public class LazyDataTableBean implements Serializable {

    private List<Car> cars;

    private LazyDataModel<Car> lazyModel;

    public LazyDataTableBean() {
        Collection<Car> cars = CarConverter.cars.values();
        Collection<Car> bulkCars = new ArrayList<Car>();
        for (int i = 0; i< 1000; i++) {
            bulkCars.addAll(cars);
        }
        this.cars = new ArrayList<Car>(bulkCars);
        lazyModel = new LazyCarDataModel(this.cars);
    }

    public LazyDataModel<Car> getLazyModel() {
        return lazyModel;
    }
}
