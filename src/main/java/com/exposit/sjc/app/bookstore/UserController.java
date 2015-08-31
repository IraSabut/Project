package com.exposit.sjc.app.bookstore;

import com.exposit.sjc.app.repository.entity.AuthorEntity;
import com.exposit.sjc.app.repository.entity.BookEntity;
import com.exposit.sjc.app.repository.entity.UserEntity;
import com.exposit.sjc.domain.model.AuthorizationData;
import com.exposit.sjc.domain.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;


import javax.annotation.Resource;

import java.util.List;
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserController(UserService userService) {
        this.userService=userService;


    }





    // @Resource(name="userService")
    private UserService userService;
    @RequestMapping( method = RequestMethod.GET)
    public String getAdd(Model model) {

        model.addAttribute("user", new UserEntity());
     return "addUser";
    }

    @RequestMapping(value ="/editUser", method = RequestMethod.GET)
    public String getEdit(Model model) {
        UserEntity user =  this.userService.getUserByID(1L);

        model.addAttribute("editUser", user);

        return "editUser";
    }

    @RequestMapping(value = "/editUser",method = RequestMethod.POST)
    public String editUserPost(@ModelAttribute("user") UserEntity user,Model model) {
        // user.setIdAutorizationData(new AuthorizationData());
        this.userService.updateUser(user);
        model.addAttribute("user", new UserEntity());
        return "editUser";
    }

    @RequestMapping(value ="/addUser",method = RequestMethod.POST)
     public String addNewUserPost(@ModelAttribute("user") UserEntity user,Model model) {
     // user.setIdAutorizationData(new AuthorizationData());
     this.userService.save(user);
        model.addAttribute("user", new UserEntity());
        return "addUser";
    }
}
