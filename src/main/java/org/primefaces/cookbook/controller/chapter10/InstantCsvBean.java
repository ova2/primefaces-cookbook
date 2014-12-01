package org.primefaces.cookbook.controller.chapter10;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;

@Named
@ViewScoped
public class InstantCsvBean implements Serializable {

    private String value1;
    private Integer value2;
    private Date value3;

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public Integer getValue2() {
        return value2;
    }

    public void setValue2(Integer value2) {
        this.value2 = value2;
    }

    public Date getValue3() {
        return value3;
    }

    public void setValue3(Date value3) {
        this.value3 = value3;
    }
}
