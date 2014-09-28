package org.primefaces.cookbook.controller.chapter3;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 6/25/12
 */
@Named
@ViewScoped
public class InputTextAreaController implements Serializable {
    
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
