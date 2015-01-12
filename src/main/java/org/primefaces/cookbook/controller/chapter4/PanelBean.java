package org.primefaces.cookbook.controller.chapter4;

import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.CloseEvent;
import org.primefaces.event.ToggleEvent;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 8/4/12
 */
@Named
@ViewScoped
public class PanelBean implements Serializable {

    public void handleClose(CloseEvent event) {
        MessageUtil.addInfoMessage("panel.closed", "Closed panel id:'" + event.getComponent().getId());
    }

    public void handleToggle(ToggleEvent event) {
        MessageUtil.addInfoMessage("panel.toggled", "Status:" + event.getVisibility().name());
    }
}
