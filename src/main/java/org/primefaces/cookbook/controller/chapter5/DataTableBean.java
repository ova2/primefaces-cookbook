package org.primefaces.cookbook.controller.chapter5;

import org.primefaces.cookbook.converter.CarConverter;
import org.primefaces.cookbook.model.chapter3.Car;
import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.RowEditEvent;

import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * User: mertcaliskan
 * Date: 8/8/12
 */
@Named
@ViewScoped
public class DataTableBean implements Serializable {

    private List<Car> cars;
    private Car selectedCar;
    private Car[] selectedCars;
    private List<Car> selectedCarsList;
    private SelectItem[] carNamesOptions;

    public DataTableBean() {
        cars = new ArrayList<Car>(CarConverter.cars.values());
    }
    
    public String[] getCarNames() {
        return CarConverter.cars.keySet().toArray(new String[0]);
    }

    public SelectItem[] getCarNamesAsOptions() {
        carNamesOptions = createFilterOptions(CarConverter.cars.keySet().toArray(new String[0]));
        return carNamesOptions;
    }

    private SelectItem[] createFilterOptions(String[] data) {
        SelectItem[] options = new SelectItem[data.length + 1];

        options[0] = new SelectItem("", "Select");
        for(int i = 0; i < data.length; i++) {
            options[i + 1] = new SelectItem(data[i], data[i]);
        }

        return options;
    }

    public String selectCar(Car car) {
        this.selectedCar = car;
        return null;
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

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getSelectedCarsList() {
        return selectedCarsList;
    }

    public void setSelectedCarsList(List<Car> selectedCarsList) {
        this.selectedCarsList = selectedCarsList;
    }
}
