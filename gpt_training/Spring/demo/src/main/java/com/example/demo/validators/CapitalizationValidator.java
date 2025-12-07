package com.example.demo.validators;

import com.example.demo.annotations.CapitalizationCheck;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CapitalizationValidator implements ConstraintValidator<CapitalizationCheck, String> {
    @Override
    public boolean isValid(String name, ConstraintValidatorContext constraintValidatorContext) {
        if (name == null || name.isBlank()) return false;
        if (!Character.isUpperCase(name.charAt(0))) return false;
        return name.chars().allMatch(Character::isLetter);
    }
}
