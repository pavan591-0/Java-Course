package com.example.demo.annotations;


import com.example.demo.validators.NameValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NameValidator.class)
public @interface NoSpaceCheck {
    String message() default "The name should not have any spaces.";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
