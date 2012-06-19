package org.primefaces.cookbook.controller.chapter1;

import java.io.Serializable;

/**
 * @author  mertcaliskan Date: 6/18/12 / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
public class BasicPPRController implements Serializable {

    private String value;
    
    public String updateValue() {
        value = String.valueOf(System.currentTimeMillis());
        return null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
