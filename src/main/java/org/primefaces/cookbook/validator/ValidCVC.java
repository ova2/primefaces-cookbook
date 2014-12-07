package org.primefaces.cookbook.validator;

import org.primefaces.validate.bean.ClientConstraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

@Constraint(validatedBy = CvcConstraintValidator.class)
@ClientConstraint(resolvedBy = CvcClientConstraint.class)
@Target({FIELD, METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidCVC {

    String message() default "{invalid.cvc.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
    // identifier of the select menu with cards
    String forCardMenu() default "";
}
