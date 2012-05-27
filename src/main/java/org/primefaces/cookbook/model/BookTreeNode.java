package org.primefaces.cookbook.model;

import java.io.Serializable;

/**
 * BookTreeNode
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
public class BookTreeNode implements Serializable {

	private static final long serialVersionUID = 20120517L;

	private String name;

	private String view;

	public BookTreeNode(String name, String view) {
		this.name = name;
		this.view = view;
	}

	public String getName() {
		return name;
	}

	public String getView() {
		return view;
	}
}
