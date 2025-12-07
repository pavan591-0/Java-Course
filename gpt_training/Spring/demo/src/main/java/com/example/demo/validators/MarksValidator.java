package com.example.demo.validators;

import com.example.demo.annotations.ValidMarksRange;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MarksValidator implements ConstraintValidator<ValidMarksRange, Integer> {

    @Override
    public boolean isValid(Integer marks, ConstraintValidatorContext constraintValidatorContext) {
        if(marks == null) return false;
        return marks >= 0 && marks <=100 && marks % 5 == 0;
    }
}
