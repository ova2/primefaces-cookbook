package org.primefaces.cookbook.controller.chapter6;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * MenubarBean
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@ViewScoped
public class MenubarBean implements Serializable {

	public void createFolder(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Create Folder", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void createVideo(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Create Video File", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void createHTML(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Create HTML File", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void properties(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Properties", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void cut(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cut", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void copy(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Copy", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void paste(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Paste", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void zoomIn(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Zoom In", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void zoomOut(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Zoom Out", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void viewIcons(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "View Icons", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void viewCompact(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "View Compact", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void viewDetails(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "View Details", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public String info() {
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("helpVisible", true);

		return "/views/chapter6/menubar.xhtml";
	}
}
