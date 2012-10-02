package org.primefaces.cookbook.controller.chapter10;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;

/**
 * NavigationContext.
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@SessionScoped
public class NaviController implements Serializable {

	public String getMenuitemStyleClass(final String page) {
		final String viewId = getViewId();
		if (viewId != null && viewId.equals(page)) {
			return "ui-state-active";
		}

		return "";
	}

	private String getViewId() {
		FacesContext fc = FacesContext.getCurrentInstance();
		String viewId = fc.getViewRoot().getViewId();
		String selectedComponent;
		if (viewId != null) {
			selectedComponent = viewId.substring(viewId.lastIndexOf("/") + 1, viewId.lastIndexOf("."));
		} else {
			selectedComponent = null;
		}

		return selectedComponent;
	}
}
