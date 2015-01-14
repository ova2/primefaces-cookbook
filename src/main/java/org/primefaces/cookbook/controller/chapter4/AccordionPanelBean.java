package org.primefaces.cookbook.controller.chapter4;

import org.primefaces.cookbook.converter.CarConverter;
import org.primefaces.cookbook.model.chapter3.Car;
import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.TabChangeEvent;
import org.primefaces.event.TabCloseEvent;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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
public class AccordionPanelBean implements Serializable {

    public List<Car> getCars() {
        return new ArrayList<Car>(CarConverter.cars.values());
    }

    public void onTabChange(TabChangeEvent event) {
        MessageUtil.addInfoMessage("tab.changed", "Title: " + event.getTab().getTitle());
    }

    public void onTabClose(TabCloseEvent event) {
        MessageUtil.addInfoMessage("tab.closed", "Closed Tab: " + event.getTab().getTitle());
    }
}