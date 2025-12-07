package com.example.demo.validators;

import com.example.demo.annotations.ValidateStudent;
import com.example.demo.dto.StudentRequestDTO;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.hibernate.validator.constraints.CompositionType;
import org.hibernate.validator.constraints.ConstraintComposition;

import java.lang.annotation.Annotation;

public class StudentValidator implements ConstraintValidator<ValidateStudent, StudentRequestDTO> {

    @Override
    public boolean isValid(StudentRequestDTO studentRequestDTO, ConstraintValidatorContext constraintValidatorContext) {
        if(studentRequestDTO.getName() == null)
            return false;

        return !studentRequestDTO.getName().isBlank() || studentRequestDTO.getMarks() == null;
    }
}
