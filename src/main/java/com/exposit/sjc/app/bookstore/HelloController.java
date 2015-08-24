package com.exposit.sjc.app.bookstore;

import com.exposit.sjc.app.repository.entity.BookEntity;
import com.exposit.sjc.app.repository.entity.UserEntity;
import com.exposit.sjc.app.repository.hibernate.AbstractHibernateDao;
import com.exposit.sjc.domain.service.BookService;
import com.exposit.sjc.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HelloController {

   // private AbstractHibernateDao abstractHibernateDao;
    private BookService bookService;
    private UserService userService;
@Autowired
    public HelloController(UserService userService) {

    this.userService=userService;
    }






    /*@RequestMapping(value = "/",method = RequestMethod.GET)
	public String getBooks(Model model) {
        List<BookEntity> books = this.bookService.getBooks();

        model.addAttribute("books", books);

        return "hello";
	}*/
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String getUsers(Model model) {
        List<UserEntity> users = this.userService.getUsers();

        model.addAttribute("users", users);

        return "user";
    }
}