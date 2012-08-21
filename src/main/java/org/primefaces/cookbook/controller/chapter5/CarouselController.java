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
 * Date: 8/20/12
 */
@ManagedBean
@ViewScoped
public class CarouselController implements Serializable {

    public Collection<Car> getCars() {
        return new ArrayList<Car>(CarConverter.cars.values());
    }
}
