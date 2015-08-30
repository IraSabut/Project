package com.exposit.sjc.app.bookstore;

import com.exposit.sjc.app.repository.entity.AuthorEntity;
import com.exposit.sjc.app.repository.entity.BookEntity;
import com.exposit.sjc.app.repository.entity.UserEntity;
import com.exposit.sjc.domain.model.AuthorizationData;
import com.exposit.sjc.domain.service.BookService;
import com.exposit.sjc.domain.service.UserService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.annotation.Resource;

import java.util.List;
@Controller
@RequestMapping("/user")
public class UserController {
   // @Resource(name="userService")
    private UserService userService;
    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String getAdd(Model model) {


        // Create new Person and add to model
        // This is the formBackingOBject
        model.addAttribute("user", new UserEntity());

        // This will resolve to /WEB-INF/jsp/addpage.jsp
        return "registrationUser";
    }


    @RequestMapping(value = "/addUserPost",method = RequestMethod.POST)
    public String addNewUserPost(@ModelAttribute("userAttribute") UserEntity user) {

        user.setIdAutorizationData(new AuthorizationData());
        user.setAmountOfMoney(10);
        user.setAddress("grodno");
        user.setFirstName("erty");
        user.setEmail("asfdg");
        user.setLastName("asfdg");
        user.setPatronymic("asfdg");
        user.setPhoneNumber(1234567);
        user.setIdUser((long) 5);

        this.userService.save(user);
        return "registrationUser";
    }
}
