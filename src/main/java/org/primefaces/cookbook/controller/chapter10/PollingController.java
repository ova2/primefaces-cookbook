package org.primefaces.cookbook.controller.chapter10;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * PollingController
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class PollingController implements Serializable {

	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");

	public void showMessage() {
		FacesMessage msg =
		    new FacesMessage(FacesMessage.SEVERITY_INFO, "Updated feed at " + simpleDateFormat.format(new Date()) + " o'clock",
		                     null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
