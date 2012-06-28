package org.primefaces.cookbook.controller.chapter3;

import org.primefaces.cookbook.utils.MessageUtil;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 6/26/12
 */
@ManagedBean
@ViewScoped
public class SelectCheckboxController implements Serializable {

    private boolean selectedValue;

    public boolean isSelectedValue() {
        return selectedValue;
    }

    public void setSelectedValue(boolean selectedValue) {
        this.selectedValue = selectedValue;
    }

    public void addMessage() {
        String summary = selectedValue ? "Checked" : "Unchecked";

        MessageUtil.addInfoMessage(summary);
    }
}
