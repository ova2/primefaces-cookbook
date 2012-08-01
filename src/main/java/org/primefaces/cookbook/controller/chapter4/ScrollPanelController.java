package org.primefaces.cookbook.controller.chapter4;

import org.primefaces.cookbook.model.chapter3.Car;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * User: mertcaliskan
 * Date: 7/30/12
 */
@ManagedBean
@ViewScoped
public class ScrollPanelController implements Serializable {

    List<Car> cars = new ArrayList<Car>();
    {
        cars.add(new Car("CC"));
        cars.add(new Car("Golf"));
        cars.add(new Car("Jetta"));
        cars.add(new Car("Passat"));
        cars.add(new Car("Polo"));
        cars.add(new Car("Scirocco"));
        cars.add(new Car("Touareg"));
    }

    public List<Car> getCars() {
        return cars;
    }
}
