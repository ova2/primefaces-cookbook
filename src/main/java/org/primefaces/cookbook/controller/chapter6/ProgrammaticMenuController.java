package org.primefaces.cookbook.controller.chapter6;

import org.primefaces.component.menuitem.MenuItem;
import org.primefaces.component.submenu.Submenu;

import org.primefaces.cookbook.utils.FacesUtil;

import org.primefaces.model.DefaultMenuModel;
import org.primefaces.model.MenuModel;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;


/**
 * ProgrammaticMenuController
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class ProgrammaticMenuController implements Serializable {

    private MenuModel model;

    @PostConstruct
    protected void initialize() {
        model = new DefaultMenuModel();

        // first submenu
        Submenu submenu = new Submenu();
        submenu.setLabel("JavaScript Libraries");

        // menu items
        MenuItem item = new MenuItem();
        item.setValue("jQuery");
        item.setUrl("http://jquery.com");
        submenu.getChildren().add(item);

        item = new MenuItem();
        item.setValue("Yahoo UI");
        item.setUrl("http://yuilibrary.com");
        submenu.getChildren().add(item);

        item = new MenuItem();
        item.setValue("Prototype");
        item.setUrl("http://prototypejs.org");
        submenu.getChildren().add(item);

        model.addSubmenu(submenu);

        // second submenu
        submenu = new Submenu();
        submenu.setLabel("Operations");

        // menu items
        item = new MenuItem();
        item.setValue("Save");
        item.addActionListener(FacesUtil.createMethodActionListener("#{positionedMenuController.save}", Void.class,
                new Class[] { ActionEvent.class }));
        item.setUpdate("growl");
        submenu.getChildren().add(item);

        item = new MenuItem();
        item.setValue("Update");
        item.addActionListener(FacesUtil.createMethodActionListener("#{positionedMenuController.update}", Void.class,
                new Class[] { ActionEvent.class }));
        item.setUpdate("growl");
        submenu.getChildren().add(item);

        item = new MenuItem();
        item.setValue("Delete");
        item.addActionListener(FacesUtil.createMethodActionListener("#{positionedMenuController.delete}", Void.class,
                new Class[] { ActionEvent.class }));
        item.setUpdate("growl");
        submenu.getChildren().add(item);

        model.addSubmenu(submenu);
    }

    public MenuModel getModel() {
        return model;
    }
}
