package org.primefaces.cookbook.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CvcConstraintValidator
        implements ConstraintValidator<ValidCVC, Integer> {

    @Override
    public void initialize(ValidCVC validCVC) {
    }

    @Override
    public boolean isValid(Integer cvc,
                      ConstraintValidatorContext context) {
        if (cvc == null || cvc < 0) {
            return false;
        }

        int length = (int) (Math.log10(cvc) + 1);
        return (length >= 3 && length <= 4);
    }
}
