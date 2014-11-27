package org.primefaces.cookbook.controller.chapter1;

import org.primefaces.cookbook.utils.MessageUtil;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 6/21/12
 */
@Named
@ViewScoped
public class LocalizationBean implements Serializable {

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