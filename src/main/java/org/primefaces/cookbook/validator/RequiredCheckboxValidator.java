package org.primefaces.cookbook.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.UISelectBoolean;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.ResourceBundle;

/**
 * RequiredCheckboxValidator
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@FacesValidator("org.primefaces.cookbook.validator.RequiredCheckboxValidator")
public class RequiredCheckboxValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (!(component instanceof UISelectBoolean)) {
			throw new IllegalArgumentException("RequiredCheckboxValidator must be registered on a UISelectBoolean");
		}

		if (!Boolean.TRUE.equals(value)) {
			String requiredMessage = ((UIInput) component).getRequiredMessage();

			if (requiredMessage == null && context.getApplication().getMessageBundle() != null) {
				requiredMessage =
				    ResourceBundle.getBundle(context.getApplication().getMessageBundle(), context.getViewRoot().getLocale())
				                  .getString(UIInput.REQUIRED_MESSAGE_ID);
			}

			if (requiredMessage == null) {
				requiredMessage = component.getAttributes().get("label") + ": Validation Error: Value is required.";
			}

			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, requiredMessage, null));
		}
	}
}
