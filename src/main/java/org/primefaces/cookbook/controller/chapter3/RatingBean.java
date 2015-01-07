package org.primefaces.cookbook.controller.chapter3;

import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.RateEvent;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 7/23/12
 */
@Named
@ViewScoped
public class RatingBean implements Serializable {

    private Integer rate;

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

        public void handleRate(RateEvent rateEvent) {
        Integer rate = (Integer) rateEvent.getRating();
        MessageUtil.addInfoMessage("rating.selected", rate);
    }

    public void cancelRate() {
        MessageUtil.addInfoMessage("rating.cancelled");
    }
}