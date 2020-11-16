package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
    private String courseCode;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        this.courseCode = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String courseCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = false;
        if (courseCode != null) {
            result = courseCode.startsWith(this.courseCode);
        } else {
            result = true;
        }

        return result;
    }
}
