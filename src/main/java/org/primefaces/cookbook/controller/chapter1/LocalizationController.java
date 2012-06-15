package org.primefaces.cookbook.controller.chapter1;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.cookbook.utils.MessageUtil;

/**
 * LocalizationController
 *
 * @author  mertcaliskan Date: 6/9/12 / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class LocalizationController implements Serializable {

	private boolean selectedValue = true;

	public boolean isSelectedValue() {
		return selectedValue;
	}

	public void setSelectedValue(boolean selectedValue) {
		this.selectedValue = selectedValue;
	}

	public String addMessage() {
		MessageUtil.addInfoMessage("broadcast.message");

		return null;
	}
}
