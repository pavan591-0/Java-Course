package com.example.demo.annotations;


import com.example.demo.validators.CapitalizationValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.springframework.validation.annotation.Validated;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CapitalizationValidator.class)
public @interface CapitalizationCheck {

    String message() default "Starting letter should be capital according to school works";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};


}
