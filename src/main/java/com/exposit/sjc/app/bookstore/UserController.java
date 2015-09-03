package com.exposit.sjc.app.bookstore;

import com.exposit.sjc.app.repository.entity.AutorizationDataEntity;
import com.exposit.sjc.app.repository.entity.UserEntity;
import com.exposit.sjc.domain.model.UserPrincipal;
import com.exposit.sjc.domain.service.*;
import com.exposit.sjc.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.apache.log4j.Logger;

import javax.management.relation.Role;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    protected static Logger logger = Logger.getLogger("controller");

    private UserService userService;
    private AutorizationDataService autorizationDataService;


    @Autowired
    public UserController(UserService userService, AutorizationDataService autorizationDataService) {
        this.userService=userService;
        this.autorizationDataService = autorizationDataService;

    }


    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String getAdd(Model model) {
        logger.debug("Received request to show add page");
       // List<AutorizationDataEntity> autorizationDataEntities=this.autorizationDataService.getAutorizationDaties();
       // model.addAttribute("autorizationDataEntities",autorizationDataEntities);
      //  model.addAttribute("role", new Role());
                model.addAttribute("user", new UserEntity());

     return "registrationUser";
    }

    @RequestMapping(value = "/addUserAutorization", method = RequestMethod.GET)
    public String getAddAutorization(Model model) {
        logger.debug("Received request to show add page");
       // List<AutorizationDataEntity> autorizationDataEntities=this.autorizationDataService.getAutorizationDaties();
     //   model.addAttribute("autorizationDataEntities", new AutorizationDataEntity());
        logger.debug("Received request to show add page");
        return "registrationUser";
    }



    @RequestMapping(value ="/addUserAutorization",method = RequestMethod.POST)
    public String addNewAutorizationUserPost(@ModelAttribute("idAutorizationData") AutorizationDataEntity idAutorizationData, BindingResult results) {
        this.autorizationDataService.save(idAutorizationData);
        logger.debug("Received request to add new user");
        return "registrationUser";
    }


    @RequestMapping(value ="/addUser",method = RequestMethod.POST)
    public String addNewUserPost(@ModelAttribute("user") UserEntity user,  BindingResult results) {
       // this.autorizationDataService.save(idAutorizationData);
     //   user.setIdRole(com.exposit.sjc.domain.model.Role.USER);
    this.userService.save(user);

          logger.debug("Received request to add new user");
        return "registrationUser";
    }

    @RequestMapping(value ="/editUser", method = RequestMethod.GET)
    public String getEdit(Model model) {
        logger.debug("Received request to show edit page");
        UserPrincipal user =  this.userService.getUserByID(1L);

        model.addAttribute("editUser", user);

        return "editUser";
    }

    @RequestMapping(value = "/editUser",method = RequestMethod.POST)
    public String editUserPost(@ModelAttribute("user") UserEntity user,Model model) {
        // user.setIdAutorizationData(new AutorizationData());
        logger.debug("Received request to show edit page");
        this.userService.updateUser(user);
        model.addAttribute("user", new UserEntity());
        return "editUser";
    }


}
