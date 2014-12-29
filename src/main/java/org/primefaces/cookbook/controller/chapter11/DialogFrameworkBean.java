package org.primefaces.cookbook.controller.chapter11;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Named
@ViewScoped
public class DialogFrameworkBean implements Serializable {

    private String bookName;

    public void showRatingDialog() {
        Map<String, Object> options = new HashMap<String, Object>();
        options.put("modal", true);
        options.put("draggable", false);
        options.put("resizable", false);
        options.put("contentWidth", 500);
        options.put("contentHeight", 100);
        options.put("includeViewParams", true);

        Map<String, List<String>> params = new HashMap<String, List<String>>();
        List<String> values = new ArrayList<String>();
        values.add(bookName);
        params.put("bookName", values);

        RequestContext.getCurrentInstance().openDialog("/views/chapter11/bookRating", options, params);
    }

    public void onDialogReturn(SelectEvent event) {
        Object rating = event.getObject();
        FacesMessage message = new FacesMessage(
                FacesMessage.SEVERITY_INFO,
                "You rated the book with " + rating,
                null);

        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
