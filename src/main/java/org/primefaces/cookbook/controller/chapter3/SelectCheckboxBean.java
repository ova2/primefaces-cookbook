package org.primefaces.cookbook.controller.chapter3;

import org.primefaces.cookbook.utils.MessageUtil;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * User: mertcaliskan
 * Date: 6/26/12
 */
@Named
@ViewScoped
public class SelectCheckboxBean implements Serializable {

    private boolean selectedValue;

    private List<String> selectedCountries;

    public boolean isSelectedValue() {
        return selectedValue;
    }

    public void setSelectedValue(boolean selectedValue) {
        this.selectedValue = selectedValue;
    }

    public List<String> getSelectedCountries() {
        return selectedCountries;
    }

    public void setSelectedCountries(List<String> selectedCountries) {
        this.selectedCountries = selectedCountries;
    }

    public void addMessage() {
        String summaryKey = selectedValue ? "checkbox.checked" : "checkbox.unchecked";

        MessageUtil.addInfoMessage(summaryKey);
    }
}
