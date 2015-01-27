package org.primefaces.cookbook.controller.chapter7;

import org.primefaces.cookbook.converter.CarConverter;
import org.primefaces.cookbook.model.chapter3.Car;
import org.primefaces.cookbook.utils.MessageUtil;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mertcaliskan
 * on 25/01/15.
 */
@Named
@ViewScoped
public class ContentFlowBean implements Serializable {

    public List<Car> getCars() {
        return new ArrayList<Car>(CarConverter.cars.values());
    }

    public String showMessage() {
        MessageUtil.addInfoMessage("car.selected");
        return null;
    }
}
