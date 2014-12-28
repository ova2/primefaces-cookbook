package org.primefaces.cookbook.controller.chapter11;

import org.primefaces.context.RequestContext;

import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * JavaScriptExecBean
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@ViewScoped
public class JavaScriptExecBean implements Serializable {

	private boolean enabled = true;

	public void toogleMenuitems(ActionEvent ae) {
		RequestContext requestContext =
                RequestContext.getCurrentInstance();

		String script;
		if (enabled) {
			script =
			    "$('#menu a').each(function() {"
			    + "$(this).attr('data-href', $(this).attr('href'))"
			    + ".removeAttr('href')"
                + ".addClass('ui-state-disabled');});";
		} else {
			script =
			    "$('#menu a').each(function() {"
			    + "$(this).attr('href', $(this).attr('data-href'))"
			    + ".removeAttr('data-href')"
                + ".removeClass('ui-state-disabled');});";
		}

		requestContext.execute(script);
		enabled = !enabled;
	}

	public void toogleEnabled(ActionEvent ae) {
		enabled = !enabled;
	}

	public boolean isEnabled() {
		return enabled;
	}
}
