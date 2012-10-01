package org.primefaces.cookbook.component;

import javax.faces.component.UIComponent;
import javax.faces.component.behavior.Behavior;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.AjaxBehaviorListener;
import javax.faces.event.FacesListener;

/**
 * CloseEvent
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
public class CloseEvent extends AjaxBehaviorEvent {

	public CloseEvent(UIComponent component, Behavior behavior) {
		super(component, behavior);
	}

	@Override
	public boolean isAppropriateListener(FacesListener facesListener) {
		return (facesListener instanceof AjaxBehaviorListener);
	}

	@Override
	public void processListener(FacesListener facesListener) {
		if (facesListener instanceof AjaxBehaviorListener) {
			((AjaxBehaviorListener) facesListener).processAjaxBehavior(this);
		}
	}
}
