package org.primefaces.cookbook.controller.chapter6;

import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * CheckboxMenuBean
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@ViewScoped
public class CheckboxMenuBean implements Serializable {

	private List<SelectItem> languages;
	private Map<String, String> color;
	private List<Locale> selectedLanguages;
	private List<String> selectedColors;

	public List<SelectItem> getLanguages() {
		if (languages == null) {
			languages = new ArrayList<SelectItem>();
			languages.add(new SelectItem(new Locale("de"), "German"));
			languages.add(new SelectItem(new Locale("en"), "English"));
			languages.add(new SelectItem(new Locale("it"), "Italian"));
			languages.add(new SelectItem(new Locale("fr"), "French"));
		}

		return languages;
	}

	public Map<String, String> getColors() {
		if (color == null) {
			color = new HashMap<String, String>();
			color.put("Red", "Red");
			color.put("Green", "Green");
			color.put("Blue", "Blue");
			color.put("Orange", "Orange");
		}

		return color;
	}

	public List<Locale> getSelectedLanguages() {
		return selectedLanguages;
	}

	public void setSelectedLanguages(List<Locale> selectedLanguages) {
		this.selectedLanguages = selectedLanguages;
	}

	public List<String> getSelectedColors() {
		return selectedColors;
	}

	public void setSelectedColors(List<String> selectedColors) {
		this.selectedColors = selectedColors;
	}
}
