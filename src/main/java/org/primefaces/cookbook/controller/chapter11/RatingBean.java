package org.primefaces.cookbook.controller.chapter11;

import org.primefaces.context.RequestContext;
import org.primefaces.event.RateEvent;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class RatingBean implements Serializable {

    private String bookName;

    public void onrate(RateEvent rateEvent) {
        RequestContext.getCurrentInstance().closeDialog(rateEvent.getRating());
    }

    public void oncancel() {
        RequestContext.getCurrentInstance().closeDialog(0);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
