package org.primefaces.cookbook.controller.chapter3;


import org.primefaces.cookbook.converter.CarConverter;
import org.primefaces.cookbook.model.chapter3.Car;
import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.SelectEvent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * User: mertcaliskan
 * Date: 6/11/12
 */
@ManagedBean
@ViewScoped
public class AutoCompleteController implements Serializable {
    
    private String txt1;
    private Car selectedCar;
    private List<String> selectedTexts;

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }

    public List<String> getSelectedTexts() {
        return selectedTexts;
    }

    public void setSelectedTexts(List<String> selectedTexts) {
        this.selectedTexts = selectedTexts;
    }

    public List<Car> completeCar(String input) {
        List<Car> suggestions = new ArrayList<Car>();
        Set<String> keys = CarConverter.cars.keySet();

        for (String key : keys) {
            if (key.startsWith(input)) {
                suggestions.add(CarConverter.cars.get(key));
            }
        }
        return suggestions;
    }

    public void handleSelect(SelectEvent event) {
        Object selectedObject = event.getObject();
        MessageUtil.addInfoMessage("selected.object", selectedObject);
    }

    public List<String> complete(String input) {
        List<String> result = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            result.add(input + i);
        }

        return result;
    }
}