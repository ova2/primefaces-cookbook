package org.primefaces.cookbook.validator;

import org.apache.commons.lang3.StringUtils;
import org.primefaces.validate.bean.ClientValidationConstraint;

import javax.validation.metadata.ConstraintDescriptor;
import java.util.HashMap;
import java.util.Map;

public class CvcClientConstraint
        implements ClientValidationConstraint {

    private static final String CARDMENU_METADATA =
            "data-forcardmenu";

    @Override
    public Map<String, Object> getMetadata(
            ConstraintDescriptor constraintDescriptor) {
        Map<String, Object> metadata =
                new HashMap<String, Object>();
        Map attrs = constraintDescriptor.getAttributes();
        String forCardMenu = (String) attrs.get("forCardMenu");
        if (StringUtils.isNotBlank(forCardMenu)) {
            metadata.put(CARDMENU_METADATA, forCardMenu);
        }

        return metadata;
    }

    @Override
    public String getValidatorId() {
        return ValidCVC.class.getSimpleName();
    }
}
