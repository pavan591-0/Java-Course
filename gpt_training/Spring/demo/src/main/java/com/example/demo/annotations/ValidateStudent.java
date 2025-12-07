package com.example.demo.annotations;


import com.example.demo.validators.StudentValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@Constraint(validatedBy = StudentValidator.class)
public @interface ValidateStudent {
    String message() default "Invalid Student Data.";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
