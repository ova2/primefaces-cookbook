package org.primefaces.cookbook.controller.chapter6;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import java.io.Serializable;

/**
 * BaseMenuBean
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
public abstract class BaseMenuBean implements Serializable {

	public void save(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Saved", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void update(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Updated", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void delete(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Deleted", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public String doSomething() {
		// do something
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Done", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);

		return null;
	}
}
