package org.primefaces.cookbook.controller.chapter12;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 * InputNumberController
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class InputNumberController implements Serializable {

    private Double input1 = 0.0;
    private Double input2 = 0.0;
    private Double input3 = 0.0;
    private Double input4 = 0.0;

    public Double getInput1() {
        return input1;
    }

    public void setInput1(Double input1) {
        this.input1 = input1;
    }

    public Double getInput2() {
        return input2;
    }

    public void setInput2(Double input2) {
        this.input2 = input2;
    }

    public Double getInput3() {
        return input3;
    }

    public void setInput3(Double input3) {
        this.input3 = input3;
    }

    public Double getInput4() {
        return input4;
    }

    public void setInput4(Double input4) {
        this.input4 = input4;
    }
}
