package org.primefaces.cookbook.controller.chapter6;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * MegaMenuBean
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@ViewScoped
public class MegaMenuBean implements Serializable {

	public String getItems() {
		return "Bought items: ...";
	}
}
