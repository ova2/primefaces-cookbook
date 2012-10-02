package org.primefaces.cookbook.controller.chapter10;

import org.primefaces.context.RequestContext;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import java.io.Serializable;

/**
 * AjaxCallbackParamController
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class AjaxCallbackParamController implements Serializable {

	private String name;

	public void save(ActionEvent ae) {
		RequestContext requestContext = RequestContext.getCurrentInstance();

		String message;
		FacesMessage.Severity severity;

		if ("PrimeFaces Cookbook".equals(name)) {
			message = "All right!";
			severity = FacesMessage.SEVERITY_INFO;

			requestContext.addCallbackParam("validName", true);
		} else {
			message = "Name is wrong, try again";
			severity = FacesMessage.SEVERITY_ERROR;

			requestContext.addCallbackParam("validName", false);
		}

		FacesMessage msg = new FacesMessage(severity, message, null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
