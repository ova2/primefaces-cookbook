package org.primefaces.cookbook.model.chapter5;

import org.primefaces.cookbook.model.chapter3.Car;
import org.primefaces.model.SelectableDataModel;

import javax.faces.model.ListDataModel;
import java.util.List;

/**
 * Created by mertcaliskan
 * on 02/03/15.
 */
public class CarDataModel extends ListDataModel<Car> implements SelectableDataModel<Car> {

    public CarDataModel(List<Car> data) {
        super(data);
    }

    @Override
    public Car getRowData(String rowKey) {
        List<Car> cars = (List<Car>) getWrappedData();

        for(Car car : cars) {
            if(car.getName().equals(rowKey))
                return car;
        }
        return null;
    }

    @Override
    public Object getRowKey(Car car) {
        return car.getName();
    }
}