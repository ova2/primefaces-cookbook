package org.primefaces.cookbook.controller.chapter12;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


/**
 * TriStateCheckBoxController
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class TriStateCheckBoxController implements Serializable {

    private String value1;
    private String value2;
    private String value3;
    private String value4;

    public TriStateCheckBoxController() {
        value1 = "2";
        value4 = "1";
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public String getValue4() {
        return value4;
    }

    public void setValue4(String value4) {
        this.value4 = value4;
    }

    public void addMessage() {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "State has been changed",
                "State is = " + value2);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
