package com.exposit.sjc.app.bookstore;

import com.exposit.sjc.app.repository.entity.AuthorEntity;
import com.exposit.sjc.app.repository.entity.BookEntity;
import com.exposit.sjc.app.repository.entity.UserEntity;
import com.exposit.sjc.domain.model.AuthorizationData;
import com.exposit.sjc.domain.service.BookService;
import com.exposit.sjc.domain.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@Controller
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    @RequestMapping(value = "/addUserPost",method = RequestMethod.POST)
    public String addNewBookPost(@ModelAttribute("user") UserEntity user) {
           user.setIdAutorizationData(new AuthorizationData());
        this.userService.save(user);
        return "registrationUser";
    }
}
