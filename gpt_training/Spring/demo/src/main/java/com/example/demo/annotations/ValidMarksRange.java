package com.example.demo.annotations;

import com.example.demo.validators.MarksValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MarksValidator.class)
public @interface ValidMarksRange {

    String message() default "Marks must be between 0 and 100 and divisible by 5";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
