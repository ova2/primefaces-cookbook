package org.primefaces.cookbook.converter;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import java.io.Serializable;
import java.util.Locale;

/**
 * LocaleConverter
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@FacesConverter(value = "org.primefaces.cookbook.converter.LocaleConverter")
public class LocaleConverter implements Converter, Serializable {

	public Object getAsObject(final FacesContext fc, final UIComponent component, final String value) {
		if (StringUtils.isBlank(value)) {
			return fc.getApplication().getDefaultLocale();
		}

		return getLocaleObject(value);
	}

	public String getAsString(final FacesContext fc, final UIComponent component, final Object value) {
		if (value == null) {
			final Locale defaultLocale = fc.getApplication().getDefaultLocale();
			if (defaultLocale == null) {
				return null;
			}

			return getLocaleString(defaultLocale);
		}

		if (value instanceof String) {
			return (String) value;
		} else if (value instanceof Locale) {
			return getLocaleString((Locale) value);
		} else {
			throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR,
			                                              "Wrong type: '" + value.getClass().getSimpleName()
			                                              + "' is not 'Locale'.", StringUtils.EMPTY));
		}
	}

	public static Locale getLocaleObject(final String locale) {
		final String[] parts = locale.split("_");
		if (parts.length == 0
		    || !parts[0].matches("[a-zA-Z]{2,2}")
		    || (parts.length > 1 && parts[1].length() != 0 && !parts[1].matches("[a-zA-Z]{2,2}"))) {
			throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR,
			                                              "'" + locale + "' does not represent a valid locale",
			                                              StringUtils.EMPTY));
		}

		switch (parts.length) {
		case 3:
			return new Locale(parts[0], parts[1], parts[2]);

		case 2:
			return new Locale(parts[0], parts[1]);

		case 1:
			return new Locale(parts[0]);

		default:
			return new Locale(parts[0], parts[1], StringUtils.join(ArrayUtils.subarray(parts, 2, parts.length), '_'));
		}
	}

	public static String getLocaleString(final Locale locale) {
		if (StringUtils.isBlank(locale.getCountry())) {
			return locale.getLanguage();
		}

		return locale.getLanguage() + "_" + locale.getCountry();
	}
}
