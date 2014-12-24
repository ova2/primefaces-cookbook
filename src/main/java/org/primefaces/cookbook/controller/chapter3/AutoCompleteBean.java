package org.primefaces.cookbook.controller.chapter3;

import org.apache.commons.lang3.RandomStringUtils;
import org.primefaces.cookbook.converter.CarConverter;
import org.primefaces.cookbook.model.chapter3.Car;
import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.SelectEvent;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * User: mertcaliskan
 * Date: 6/11/12
 */
@Named
@ViewScoped
public class AutoCompleteBean implements Serializable {

    private String txt1;
    private String txt2;
    private String txt3;
    private String txt4;
    private String txt5;
    private String txt6;
    private String txt7;
    private String txt8;
    private Car selectedCar;
    private Car selectedCar2;
    private List<String> selectedTexts;

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }

    public String getTxt3() {
        return txt3;
    }

    public void setTxt3(String txt3) {
        this.txt3 = txt3;
    }

    public String getTxt4() {
        return txt4;
    }

    public void setTxt4(String txt4) {
        this.txt4 = txt4;
    }

    public String getTxt5() {
        return txt5;
    }

    public void setTxt5(String txt5) {
        this.txt5 = txt5;
    }

    public String getTxt6() {
        return txt6;
    }

    public void setTxt6(String txt6) {
        this.txt6 = txt6;
    }

    public String getTxt7() {
        return txt7;
    }

    public void setTxt7(String txt7) {
        this.txt7 = txt7;
    }

    public String getTxt8() {
        return txt8;
    }

    public void setTxt8(String txt8) {
        this.txt8 = txt8;
    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }

    public Car getSelectedCar2() {
        return selectedCar2;
    }

    public void setSelectedCar2(Car selectedCar2) {
        this.selectedCar2 = selectedCar2;
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

    public List<Car> completeCarContains(String input) {
        List<Car> suggestions = new ArrayList<Car>();
        Set<String> keys = CarConverter.cars.keySet();

        for (String key : keys) {
            if (key.contains(input)) {
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

    public List<String> completeNoFound(String input) {
        return null;
    }

    public char getGroup(Car car) {
        return car.getName().charAt(0);
    }
}