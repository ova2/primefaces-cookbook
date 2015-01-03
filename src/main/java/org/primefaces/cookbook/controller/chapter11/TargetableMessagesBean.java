package org.primefaces.cookbook.controller.chapter11;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * TargetableMessagesBean
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@ViewScoped
public class TargetableMessagesBean implements Serializable {

    public String addSaveMessage() {
        addMessage("save", FacesMessage.SEVERITY_INFO,
                "Sample info message",
                "First data was successfully saved");
        addMessage("save", FacesMessage.SEVERITY_INFO,
                "Sample info message",
                "Second data was successfully saved");

        return null;
    }

    public String addChangeMessage() {
        addMessage("change", FacesMessage.SEVERITY_INFO,
                "Sample info message",
                "Data was successfully changed");

        return null;
    }

    public String addDeleteMessage() {
        addMessage(null, FacesMessage.SEVERITY_INFO,
                "Sample info message",
                "Data was successfully deleted");

        return null;
    }

    public String addErrorMessage() {
        addMessage(null, FacesMessage.SEVERITY_ERROR,
                "Sample error message",
                "Operation failed");

        return null;
    }

    private void addMessage(String key, FacesMessage.Severity severity, String message, String detail) {
        FacesMessage msg = new FacesMessage(severity, message, detail);
        FacesContext.getCurrentInstance().addMessage(key, msg);
    }
}
