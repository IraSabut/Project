package com.exposit.sjc.app.bookstore;

import com.exposit.sjc.app.repository.entity.UserEntity;
import com.exposit.sjc.app.repository.entity.validation.UserValidator;
import com.exposit.sjc.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/signup")
public class SignupController {
    @Autowired
    private UserValidator signupValidator;

    @RequestMapping(method = RequestMethod.GET)
    public String signup(ModelMap model) {
        UserEntity signupForm = new UserEntity();
        model.put("signupForm", signupForm);
        return "signup";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSignup(User signupForm, BindingResult result) {
        signupValidator.validate(signupForm, result);
        if (result.hasErrors()) {
            return "signup";
        }
        return "signup-success";
    }
}
