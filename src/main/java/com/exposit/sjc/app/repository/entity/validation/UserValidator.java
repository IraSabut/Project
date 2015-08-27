package com.exposit.sjc.app.repository.entity.validation;

import com.exposit.sjc.app.repository.entity.UserEntity;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.exposit.sjc.domain.model.User;

@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
     return    UserEntity.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User signupForm = (User) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "idAutorizationData.login", "username.empty", "Username must not be empty.");
        String username = signupForm.getIdAutorizationData().getLogin();
        if ((username.length()) > 16) {
            errors.rejectValue("idAutorizationData.password", "username.tooLong", "Username must not more than 16 characters.");
        }


        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "idAutorizationData.password", "password.empty", "Password must not be empty.");



    }


}
