package org.primefaces.cookbook.controller.chapter3;

import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.SlideEndEvent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 7/1/12
 */
@ManagedBean
@ViewScoped
public class SliderController implements Serializable {

    private int intValue = 0;

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public void onSlideEnd(SlideEndEvent event) {
        int value = event.getValue();
        MessageUtil.addInfoMessage("selected.sliderValue", value);
    }
}
