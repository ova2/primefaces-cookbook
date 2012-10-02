package org.primefaces.cookbook.controller.chapter6;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * SlideMenuController
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class MegaMenuController implements Serializable {

	public String getItems() {
		return "Bought items: ...";
	}
}
