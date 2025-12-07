package com.example.demo.validators;

import com.example.demo.annotations.NoSpaceCheck;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<NoSpaceCheck, String> {
    @Override
    public boolean isValid(String name, ConstraintValidatorContext constraintValidatorContext) {
        return name != null && name.matches("^[A-Za-z0-9]+$");
    }
}
