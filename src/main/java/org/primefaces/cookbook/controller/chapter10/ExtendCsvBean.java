package org.primefaces.cookbook.controller.chapter10;

import org.primefaces.context.RequestContext;
import org.primefaces.cookbook.validator.ValidCVC;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Named
@ViewScoped
public class ExtendCsvBean implements Serializable {

    private String firstName;
    private String lastName;

    @NotNull
    private String card;
    @NotNull
    @ValidCVC(forCardMenu = "@(.card)")
    private Integer cvc;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public Integer getCvc() {
        return cvc;
    }

    public void setCvc(Integer cvc) {
        this.cvc = cvc;
    }

    public void save() {
        RequestContext.getCurrentInstance().execute(
                "alert('Saved!')");
    }
}
