package com.work.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({PARAMETER, METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = StringValidator.class)
public @interface CheckBrackets  {
    String message() default "String not pass";

    Class<?>[] groups() default { } ;

    Class<? extends Payload>[] payload() default {};
}
