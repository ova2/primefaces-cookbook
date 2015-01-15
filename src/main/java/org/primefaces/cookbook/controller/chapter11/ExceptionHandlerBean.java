package org.primefaces.cookbook.controller.chapter11;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.ViewExpiredException;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class ExceptionHandlerBean {

    public void throwNullPointerException() {
        throw new NullPointerException("NullPointerException");
    }

    public void throwIllegalStateException() {
        throw new IllegalStateException("IllegalStateException");
    }

    public void throwViewExpiredException() {
        throw new ViewExpiredException("ViewExpiredException",
                FacesContext.getCurrentInstance().getViewRoot().getViewId());
    }
}
