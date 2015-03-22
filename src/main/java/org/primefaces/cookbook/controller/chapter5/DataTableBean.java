package org.primefaces.cookbook.controller.chapter5;

import org.primefaces.component.datatable.DataTable;
import org.primefaces.cookbook.converter.CarConverter;
import org.primefaces.cookbook.converter.DetailedCarConverter;
import org.primefaces.cookbook.model.chapter3.Car;
import org.primefaces.cookbook.model.chapter5.Boxer;
import org.primefaces.cookbook.model.chapter5.CarDataModel;
import org.primefaces.cookbook.model.chapter5.DetailedCar;
import org.primefaces.cookbook.model.chapter5.Stat;
import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.*;

import javax.annotation.PostConstruct;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * User: mertcaliskan
 * Date: 8/8/12
 */
@Named
@ViewScoped
public class DataTableBean implements Serializable {

    private List<Car> cars;
    private List<DetailedCar> detailedCars;
    private Car selectedCar;
    private Car[] selectedCars;
    private SelectItem[] carNamesOptions;
    private List<Car> filteredValues;
    private CarDataModel carDataModel;
    private List<Boxer> boxers;

    @PostConstruct
    public void setup() {
        cars = new ArrayList<Car>(CarConverter.cars.values());
        detailedCars = new ArrayList<DetailedCar>(DetailedCarConverter.cars.values());

        carDataModel = new CarDataModel(cars);
        
        initBoxers();
    }

    private void initBoxers() {
        boxers = new ArrayList<Boxer>();
        Boxer muhammadAli = new Boxer("Muhammad Ali");
        muhammadAli.getStats().add(new Stat("2005-2006", 7, 5));
        muhammadAli.getStats().add(new Stat("2006-2007", 10, 5));
        muhammadAli.getStats().add(new Stat("2007-2008", 3, 8));
        muhammadAli.getStats().add(new Stat("2008-2009", 10, 4));
        muhammadAli.getStats().add(new Stat("2009-2010", 10, 5));
        muhammadAli.getStats().add(new Stat("2010-2011", 3, 10));
        boxers.add(muhammadAli);

        Boxer georgeForeman = new Boxer("George Foreman");
        georgeForeman.getStats().add(new Stat("2005-2006", 4, 10));
        georgeForeman.getStats().add(new Stat("2006-2007", 6, 8));
        georgeForeman.getStats().add(new Stat("2007-2008", 10, 5));
        georgeForeman.getStats().add(new Stat("2008-2009", 7, 6));
        georgeForeman.getStats().add(new Stat("2009-2010", 10, 8));
        georgeForeman.getStats().add(new Stat("2010-2011", 7, 4));
        boxers.add(georgeForeman);
    }

    public void onResize(ColumnResizeEvent event) {
        MessageUtil.addInfoMessage("column.resized", "W:" + event.getWidth() + " - H:" + event.getHeight());
    }

    public void onRowReorder(ReorderEvent event) {
        MessageUtil.addInfoMessage("row.reordered", "From:" + event.getFromIndex() + " - To:" + event.getToIndex());
    }

    public void onColReorder(AjaxBehaviorEvent event) {
        MessageUtil.addInfoMessage("col.reordered", "Component ID:" + event.getComponent().getId());
    }

    public void onColumnToggle(ToggleEvent e) {
        MessageUtil.addInfoMessage("col.toggled", "Visibility:" + e.getVisibility());
    }

    public String[] getCarNames() {
        return CarConverter.cars.keySet().toArray(new String[0]);
    }

    public SelectItem[] getCarNamesAsOptions() {
        carNamesOptions = createFilterOptions(CarConverter.cars.keySet().toArray(new String[0]));
        return carNamesOptions;
    }

    private SelectItem[] createFilterOptions(String[] data) {
        SelectItem[] options = new SelectItem[data.length];

        for(int i = 0; i < data.length; i++) {
            options[i] = new SelectItem(data[i], data[i]);
        }

        return options;
    }

    public String selectCar(Car car) {
        this.selectedCar = car;
        return null;
    }

    public void onRowSelect(SelectEvent event) {
        MessageUtil.addInfoMessage("car.selected", ((Car) event.getObject()).getName());
    }

    public void onRowUnselect(UnselectEvent event) {
        MessageUtil.addInfoMessage("car.unselected", ((Car) event.getObject()).getName());
    }

    public void onEdit(RowEditEvent event) {
        MessageUtil.addInfoMessage("car.edit", ((Car) event.getObject()).getName());
    }

    public void onCancel(RowEditEvent event) {
        MessageUtil.addInfoMessage("car.edit.cancelled", ((Car) event.getObject()).getName());
    }

    public void postSort(ComponentSystemEvent e) {
        System.out.println(((DataTable) e.getComponent()).getSortColumn().getHeaderText());
    }

    public void postFilter(ComponentSystemEvent e) {
        DataTable dt = (DataTable) e.getComponent();
        for (Iterator it = dt.getFilteredValue().iterator(); it.hasNext();) {
            Car car = (Car) it.next();
            System.out.println(car.getName());
        }
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

    public List<Car> getFilteredValues() {
        return filteredValues;
    }

    public void setFilteredValues(List<Car> filteredValues) {
        this.filteredValues = filteredValues;
    }

    public CarDataModel getCarDataModel() {
        return carDataModel;
    }

    public void setCarDataModel(CarDataModel carDataModel) {
        this.carDataModel = carDataModel;
    }

    public List<DetailedCar> getDetailedCars() {
        return detailedCars;
    }

    public void setDetailedCars(List<DetailedCar> detailedCars) {
        this.detailedCars = detailedCars;
    }

    public List<Boxer> getBoxers() {
        return boxers;
    }

    public void setBoxers(List<Boxer> boxers) {
        this.boxers = boxers;
    }
}
