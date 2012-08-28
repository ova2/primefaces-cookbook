package org.primefaces.cookbook.controller.chapter5;

import org.primefaces.cookbook.converter.CarConverter;
import org.primefaces.cookbook.model.chapter3.Car;
import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.RowEditEvent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * User: mertcaliskan
 * Date: 8/8/12
 */
@ManagedBean
@ViewScoped
public class DataTableController implements Serializable {

    private Car selectedCar;
    private Car[] selectedCars;
    
    public Collection<Car> getCars() {
        return new ArrayList<Car>(CarConverter.cars.values());
    }

    public String[] getCarNames() {
        return CarConverter.cars.keySet().toArray(new String[0]);
    }

    public void onEdit(RowEditEvent event) {
        MessageUtil.addInfoMessage("car.edit", ((Car) event.getObject()).getName());
    }

    public void onCancel(RowEditEvent event) {
        MessageUtil.addInfoMessage("car.edit.cancelled", ((Car) event.getObject()).getName());
    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }

    public Car[] getSelectedCars() {
        return selectedCars;
    }

    public void setSelectedCars(Car[] selectedCars) {
        this.selectedCars = selectedCars;
    }
}
