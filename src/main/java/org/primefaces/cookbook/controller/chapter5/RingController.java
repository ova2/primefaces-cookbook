package org.primefaces.cookbook.controller.chapter5;

import org.primefaces.cookbook.converter.CarConverter;
import org.primefaces.cookbook.model.chapter3.Car;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * User: mertcaliskan
 * Date: 8/21/12
 */
@ManagedBean
@ViewScoped
public class RingController implements Serializable {

    private Car selectedCar;

    public Collection<Car> getCars() {
        return new ArrayList<Car>(CarConverter.cars.values());
    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }
}