package org.primefaces.cookbook.controller.chapter3;

import org.primefaces.cookbook.converter.CarConverter;
import org.primefaces.cookbook.model.chapter3.Car;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mertcaliskan
 * on 04/01/15.
 */
@Named
@ViewScoped
public class SelectOneMenuBean implements Serializable {

    private List<Car> cars;
    private Car selectedCar;

    @PostConstruct
    public void setup() {
        cars = new ArrayList<Car>(CarConverter.cars.values());
    }

    public char getGroup(Car car) {
        return car.getName().charAt(0);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }
}