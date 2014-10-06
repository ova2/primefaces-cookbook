package org.primefaces.cookbook.converter;

import org.primefaces.cookbook.controller.chapter2.UserSettingsBean;
import org.primefaces.cookbook.model.chapter2.Theme;

import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * ThemeConverter
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@SessionScoped
public class ThemeConverter implements Serializable, Converter {
    
    @Inject
    private UserSettingsBean userSettingsBean;

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
        List<Theme> themes = userSettingsBean.getAvailableThemes();
        for (Theme theme : themes) {
            if (theme.getName().equals(value)) {
                return theme;
            }
        }
        
        return null;
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return ((Theme) value).getName();
	}
}
