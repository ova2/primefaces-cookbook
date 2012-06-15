package org.primefaces.cookbook.utils;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * MessageUtil
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
public class MessageUtil {

	public static void addInfoMessage(String str) {
		FacesContext context = FacesContext.getCurrentInstance();
		ResourceBundle bundle = context.getApplication().getResourceBundle(context, "msg");
		String message = bundle.getString(str);
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, message, ""));
	}
}
