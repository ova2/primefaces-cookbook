package org.primefaces.cookbook.controller.chapter3;

import org.apache.commons.lang3.time.DateUtils;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.Date;

/**
 * User: mertcaliskan
 * Date: 6/28/12
 */
@ManagedBean
@ViewScoped
public class CalendarController implements Serializable {

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public Date getYesterday() {
        return DateUtils.addDays(new Date(), -1);
    }

    public Date getTomorrow() {
        return DateUtils.addDays(new Date(), 1);
    }
}
