package org.primefaces.cookbook.controller.chapter11;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * PollingBean
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@ViewScoped
public class PollingBean implements Serializable {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");

    public void showMessage() {
        FacesMessage msg = new FacesMessage(
                FacesMessage.SEVERITY_INFO,
                "Updated feed at " + simpleDateFormat.format(new Date()) + " o'clock",
                null);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
