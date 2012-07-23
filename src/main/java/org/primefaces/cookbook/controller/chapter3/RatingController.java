package org.primefaces.cookbook.controller.chapter3;

import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.RateEvent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 7/23/12
 */
@ManagedBean
@ViewScoped
public class RatingController implements Serializable {
    
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