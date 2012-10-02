package org.primefaces.cookbook.converter;

import org.primefaces.cookbook.model.chapter2.AvailableThemes;
import org.primefaces.cookbook.model.chapter2.Theme;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * ThemeConverter
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@FacesConverter("org.primefaces.cookbook.converter.ThemeConverter")
public class ThemeConverter implements Converter {

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return AvailableThemes.instance().getTheme(value);
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return ((Theme) value).getName();
	}
}
