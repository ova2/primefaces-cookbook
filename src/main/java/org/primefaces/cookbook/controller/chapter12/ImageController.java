package org.primefaces.cookbook.controller.chapter12;

import org.primefaces.extensions.event.ResizeEvent;
import org.primefaces.extensions.event.RotateEvent;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


/**
 * ImageController
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class ImageController implements Serializable {

    public void rotateListener(RotateEvent e) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Image rotated", "Degree:" + e.getDegree());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void resizeListener(ResizeEvent e) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Image resized",
                "Width:" + e.getWidth() + ", Height: " + e.getHeight());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
