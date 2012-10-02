package org.primefaces.cookbook.controller.chapter10;

import org.primefaces.context.RequestContext;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import java.io.Serializable;

/**
 * RequestContextController
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class RequestContextController implements Serializable {

	private boolean firstOutput = true;

	private int counter = 0;

	public void incrementWithUpdate(ActionEvent ae) {
		counter++;

		RequestContext requestContext = RequestContext.getCurrentInstance();

		if (firstOutput) {
			requestContext.update("firstOutput");
		} else {
			requestContext.update("secondOutput");
		}
	}

	public void incrementWithScroll(ActionEvent ae) {
		counter++;

		RequestContext requestContext = RequestContext.getCurrentInstance();
		requestContext.scrollTo("counter");
	}

	public boolean isFirstOutput() {
		return firstOutput;
	}

	public void setFirstOutput(boolean firstOutput) {
		this.firstOutput = firstOutput;
	}

	public int getCounter() {
		return counter;
	}
}
