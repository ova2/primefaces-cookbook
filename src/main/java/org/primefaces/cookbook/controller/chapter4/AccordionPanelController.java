package org.primefaces.cookbook.controller.chapter4;

import org.primefaces.cookbook.converter.CarConverter;
import org.primefaces.cookbook.model.chapter3.Car;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * User: mertcaliskan
 * Date: 7/28/12
 */
@Named
@ViewScoped
public class AccordionPanelController implements Serializable {

    public List<Car> getCars() {
        return new ArrayList<Car>(CarConverter.cars.values());
    }
}