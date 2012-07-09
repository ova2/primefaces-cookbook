package org.primefaces.cookbook.controller.chapter3;

import org.primefaces.cookbook.utils.MessageUtil;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

/**
 * User: mertcaliskan
 * Date: 6/26/12
 */
@ManagedBean
@ViewScoped
public class SelectCheckboxController implements Serializable {

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
