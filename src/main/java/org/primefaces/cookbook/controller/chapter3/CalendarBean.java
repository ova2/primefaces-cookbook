package org.primefaces.cookbook.controller.chapter3;

import org.apache.commons.lang3.time.DateUtils;
import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.SelectEvent;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;

/**
 * User: mertcaliskan
 * Date: 6/28/12
 */
@Named
@ViewScoped
public class CalendarBean implements Serializable {

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

    public void onDateSelect(SelectEvent event) {
        Date date = (Date)event.getObject();
        MessageUtil.addInfoMessage("selected.date", date);
    }
}
