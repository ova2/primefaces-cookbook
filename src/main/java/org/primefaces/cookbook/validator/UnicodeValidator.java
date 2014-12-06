package org.primefaces.cookbook.validator;

import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.validate.ClientValidator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@FacesValidator("org.primefaces.cookbook.UnicodeValidator")
public class UnicodeValidator implements
                              Validator, ClientValidator, Serializable {

    private static final String MESSAGE_METADATA = "data-param";
    private static final String REGEX = "[\\p{L}\\-\\'\\´\\`\\s]+";

    private String msgparam;

    @Override
    public void validate(FacesContext context,
                         UIComponent component,
                         Object value) throws ValidatorException {
        if (value == null) {
            return;
        }

        boolean valid = value.toString().matches(REGEX);
        if (!valid) {
            String param = MessageUtil.getMessage(msgparam);
            String msg = MessageUtil.getMessage("invalid.unicode", param);
            throw new ValidatorException(
                new FacesMessage(FacesMessage.SEVERITY_ERROR, null, msg));
        }
    }

    @Override
    public Map<String, Object> getMetadata() {
        Map<String, Object> metadata = new HashMap<String, Object>();
        String param = MessageUtil.getMessage(msgparam);
        metadata.put(MESSAGE_METADATA, param);

        return metadata;
    }

    @Override
    public String getValidatorId() {
        return UnicodeValidator.class.getSimpleName();
    }

    public String getMsgparam() {
        return msgparam;
    }

    public void setMsgparam(String msgparam) {
        this.msgparam = msgparam;
    }
}
