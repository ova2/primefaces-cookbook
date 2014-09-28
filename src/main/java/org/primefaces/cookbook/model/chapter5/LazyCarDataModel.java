package org.primefaces.cookbook.model.chapter5;

import org.primefaces.cookbook.model.chapter3.Car;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import java.util.*;

/**
 * User: mertcaliskan
 * Date: 9/2/12
 */
public class LazyCarDataModel extends LazyDataModel<Car> {

    private List<Car> datasource;

    public LazyCarDataModel(List<Car> datasource) {
        this.datasource = datasource;
    }

    @Override
    public Car getRowData(String rowKey) {
        for(Car car : datasource) {
            if(car.getName().equals(rowKey))
                return car;
        }

        return null;
    }

    @Override
    public Object getRowKey(Car car) {
        return car.getName();
    }

    @Override
    public List<Car> load(int first, int pageSize, final String sortField, final SortOrder sortOrder, Map<String, Object> filters) {
        List<Car> data = new ArrayList<Car>();

        for(Car car : datasource) {
            boolean match = true;

            for(String filterProperty : filters.keySet()) {
                try {
                    String filterValue = (String)filters.get(filterProperty);
                    String fieldValue = String.valueOf(car.getClass().getField(filterProperty).get(car));

                    if(filterValue == null || fieldValue.startsWith(filterValue)) {
                        match = true;
                    }
                    else {
                        match = false;
                        break;
                    }
                } catch(Exception e) {
                    match = false;
                }
            }
            if(match) {
                data.add(car);
            }
        }

        //sort
        if(sortField != null) {
            Collections.sort(data, new Comparator<Car>() {
                @Override
                public int compare(Car car1, Car car2) {
                    Object value1 = null;
                    try {
                        value1 = Car.class.getField(sortField).get(car1);
                        Object value2 = Car.class.getField(sortField).get(car2);
                        int value = ((Comparable)value1).compareTo(value2);
                        return SortOrder.ASCENDING.equals(sortOrder) ? value : -1 * value;
                    }
                    catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            );
        }

        //rowCount
        int dataSize = data.size();
        this.setRowCount(dataSize);

        //paginate
        if(dataSize > pageSize) {
            try {
                return data.subList(first, first + pageSize);
            }
            catch(IndexOutOfBoundsException e) {
                return data.subList(first, first + (dataSize % pageSize));
            }
        }
        else {
            return data;
        }
    }
}
