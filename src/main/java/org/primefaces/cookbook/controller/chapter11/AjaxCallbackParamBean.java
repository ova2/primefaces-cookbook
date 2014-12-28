package org.primefaces.cookbook.controller.chapter11;

import org.primefaces.context.RequestContext;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * AjaxCallbackParamBean
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@ViewScoped
public class AjaxCallbackParamBean implements Serializable {

    private String name;

    public void save(ActionEvent ae) {
        RequestContext requestContext = RequestContext.getCurrentInstance();

        String message;
        FacesMessage.Severity severity;
        UIInput input = (UIInput) ae.getComponent().findComponent("name");

        if ("PrimeFaces Cookbook".equals(name)) {
            message = "All right!";
            severity = FacesMessage.SEVERITY_INFO;

            requestContext.addCallbackParam("validName", true);
            input.setValid(true);
        } else {
            message = "Name is wrong, try again";
            severity = FacesMessage.SEVERITY_ERROR;

            requestContext.addCallbackParam("validName", false);
            input.setValid(false);
        }

        FacesMessage msg = new FacesMessage(severity, message, null);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
