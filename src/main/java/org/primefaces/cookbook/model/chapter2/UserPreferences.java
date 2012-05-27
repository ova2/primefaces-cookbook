package org.primefaces.cookbook.model.chapter2;

import java.io.Serializable;

/**
 * UserPreferences
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
public class UserPreferences implements Serializable {

	private static final long serialVersionUID = 20120527L;

	private String theme = "home";

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
}
