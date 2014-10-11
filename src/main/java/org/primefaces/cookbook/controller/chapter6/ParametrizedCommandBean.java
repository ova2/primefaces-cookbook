package org.primefaces.cookbook.controller.chapter6;

import org.primefaces.event.MenuActionEvent;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuModel;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * ProgrammaticMenuParamsBean
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@ViewScoped
public class ParametrizedCommandBean implements Serializable {

    private MenuModel model;

    @PostConstruct
    protected void initialize() {
        model = new DefaultMenuModel();
    
        DefaultMenuItem item = new DefaultMenuItem();
        item.setValue("Command with parameters");
        item.setCommand("#{parametrizedCommandBean.command}");
        item.setUpdate("growl");
        item.setIcon("ui-icon-play");
        item.setParam("book", "PrimeFaces Cookbook");
        item.setParam("edition", "Second Edition");
    
        model.addElement(item);
    }
    
    public void command(MenuActionEvent event) {
        DefaultMenuItem item = (DefaultMenuItem) event.getMenuItem();
        Map<String, List<String>> params = item.getParams();
    
        FacesMessage msg = new FacesMessage(
            FacesMessage.SEVERITY_INFO,
            params.get("book").get(0) + ", " + 
            params.get("edition").get(0), null);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public MenuModel getModel() {
        return model;
    }
}
