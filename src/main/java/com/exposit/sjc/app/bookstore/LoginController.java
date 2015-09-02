package com.exposit.sjc.app.bookstore;

import com.exposit.sjc.app.repository.entity.UserEntity;
import com.exposit.sjc.domain.model.User;
import com.exposit.sjc.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("")
public class LoginController {


    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login", method = { RequestMethod.POST })
    public ModelAndView login(
            @RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "password", required = true) String password,
            HttpServletRequest request, HttpSession session) {

        ModelAndView mav = new ModelAndView();

        UserEntity user = userService.loadUserByName(username);

        System.out.println("user: " + user.getClass().getCanonicalName());
      //  System.out.println("role: " + user.getIdAutorizationData().getRole().toString());

        session.setAttribute("user", user);
        mav.addObject("user", user);
        mav.setViewName("redirect:client/list");

        return mav;
    }

    @RequestMapping(value = "/logout")
    public ModelAndView logout(HttpSession session) {

        ModelAndView model = new ModelAndView();
        model.setViewName("login");

        session.setAttribute("user", null);
        session.invalidate();

        return model;
    }
}
