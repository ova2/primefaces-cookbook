package org.primefaces.cookbook.controller.chapter11;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * DefaultCommandBean
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@ViewScoped
public class DefaultCommandBean implements Serializable {

	private String text;

	private String btn = "btn1";

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getBtn() {
		return btn;
	}

	public void setBtn(String btn) {
		this.btn = btn;
	}

	public void showMessage(String button) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Pressed button: " + button, null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
