package org.primefaces.cookbook.model.chapter2;

import java.io.Serializable;

/**
 * Model class for a theme.
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
public class Theme implements Serializable {

	private static final long serialVersionUID = 20141005L;

	private String displayName;
	private String name;

	public Theme(String displayName, String name) {
		this.displayName = displayName;
		this.name = name;
	}

	public final String getDisplayName() {
		return displayName;
	}

	public String getName() {
		return name;
	}
}
