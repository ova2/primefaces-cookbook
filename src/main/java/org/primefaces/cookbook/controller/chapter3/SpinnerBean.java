package org.primefaces.cookbook.controller.chapter3;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 7/1/12
 */
@Named
@ViewScoped
public class SpinnerBean implements Serializable {

    private int intValue = 0;
    private int intValue2 = 0;
    private double doubleValue = 0.0;

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue2() {
        return intValue2;
    }

    public void setIntValue2(int intValue2) {
        this.intValue2 = intValue2;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }
}
