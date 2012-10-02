package org.primefaces.cookbook.controller.chapter10;

import org.primefaces.context.RequestContext;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import java.io.Serializable;

/**
 * JavaScriptExecController
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class JavaScriptExecController implements Serializable {

	private boolean enabled = true;

	public void toogleMenuitems(ActionEvent ae) {
		RequestContext requestContext = RequestContext.getCurrentInstance();

		String script;
		if (enabled) {
			script =
			    "$('#menu a').each(function() {"
			    + "$(this).attr('data-oldhref', $(this).attr('href'))"
			    + ".removeAttr('href').addClass('ui-state-disabled');"
			    + "});";
		} else {
			script =
			    "$('#menu a').each(function() {"
			    + "$(this).attr('href', $(this).attr('data-oldhref'))"
			    + ".removeAttr('data-oldhref').removeClass('ui-state-disabled');"
			    + "});";
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
