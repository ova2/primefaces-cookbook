package org.primefaces.cookbook.controller.chapter1;

import org.primefaces.cookbook.controller.BaseController;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 6/9/12
 */
@ManagedBean
@ViewScoped
public class LocalizationController extends BaseController {

    private boolean selectedValue = true;

    public boolean isSelectedValue() {
        return selectedValue;
    }

    public void setSelectedValue(boolean selectedValue) {
        this.selectedValue = selectedValue;
    }
    
    public String addMessage() {
        addInfoMessage("broadcast.message");
        return null;
    }
}