package org.primefaces.cookbook.controller.chapter12;

import org.primefaces.cookbook.model.chapter12.Circle;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


/**
 * RemoteCommandController
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@RequestScoped
public class RemoteCommandController {

    private String subject;
    private Date date;
    private Circle circle;

    public void printMethodParams(String subject, Date date, Circle circle) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Parameters",
                "Subject: " + subject + ", Date: " + date + ", Circle - backgroundColor: " +
                circle.getBackgroundColor());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }
}
