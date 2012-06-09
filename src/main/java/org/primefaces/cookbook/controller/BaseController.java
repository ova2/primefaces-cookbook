package org.primefaces.cookbook.controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.ResourceBundle;

/**
 * User: mertcaliskan
 * Date: 6/9/12
 */
public abstract class BaseController implements Serializable {

    protected void addInfoMessage(String str) {
        FacesContext context = FacesContext.getCurrentInstance();
        ResourceBundle bundle = context.getApplication().getResourceBundle(context, "msg");
        String message = bundle.getString(str);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, message, ""));
    }
}
