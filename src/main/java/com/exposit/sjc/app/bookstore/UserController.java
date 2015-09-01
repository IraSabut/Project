package com.exposit.sjc.app.bookstore;

import com.exposit.sjc.app.repository.entity.AuthorEntity;
import com.exposit.sjc.app.repository.entity.AutorizationDataEntity;
import com.exposit.sjc.app.repository.entity.BookEntity;
import com.exposit.sjc.app.repository.entity.UserEntity;
import com.exposit.sjc.domain.model.AuthorizationData;
import com.exposit.sjc.domain.service.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.apache.log4j.Logger;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    protected static Logger logger = Logger.getLogger("controller");

    private UserService userService;
    private AuthorizationDataService authorizationDataService;

    @Autowired
    public UserController(UserService userService, AuthorizationDataService authorizationDataService) {
        this.userService=userService;
        this.authorizationDataService=authorizationDataService;
    }


    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String getAdd(Model model) {
        logger.debug("Received request to show add page");
        List<AutorizationDataEntity> autorizationDataEntities=this.authorizationDataService.getAutorizationDaties();
        model.addAttribute("autorizationDataEntities",autorizationDataEntities);
        model.addAttribute("user", new UserEntity());
     return "registrationUser";
    }

    @RequestMapping(value ="/addUser",method = RequestMethod.POST)
    public String addNewUserPost(@ModelAttribute("user") UserEntity user, BindingResult results) {

        if (results.hasErrors()) {
            return "registrationUser";
        }
        List<AutorizationDataEntity> users = this.authorizationDataService.getAutorizationDaties();
        logger.debug("Received request to add new user");
          user.setIdAutorizationData(new AutorizationDataEntity());
      this.userService.save(user);
        return "registrationUser";
    }

    @RequestMapping(value ="/editUser", method = RequestMethod.GET)
    public String getEdit(Model model) {
        logger.debug("Received request to show edit page");
        UserEntity user =  this.userService.getUserByID(1L);

        model.addAttribute("editUser", user);

        return "editUser";
    }

    @RequestMapping(value = "/editUser",method = RequestMethod.POST)
    public String editUserPost(@ModelAttribute("user") UserEntity user,Model model) {
        // user.setIdAutorizationData(new AuthorizationData());
        logger.debug("Received request to show edit page");
        this.userService.updateUser(user);
        model.addAttribute("user", new UserEntity());
        return "editUser";
    }


}
