package com.exposit.sjc.app.bookstore;

import com.exposit.sjc.app.repository.entity.AuthorEntity;
import com.exposit.sjc.app.repository.entity.BookEntity;
import com.exposit.sjc.app.repository.entity.ContractEntity;
import com.exposit.sjc.app.repository.entity.UserEntity;
import com.exposit.sjc.app.repository.hibernate.AbstractHibernateDao;
import com.exposit.sjc.domain.model.User;
import com.exposit.sjc.domain.service.AuthorService;
import com.exposit.sjc.domain.service.BookService;
import com.exposit.sjc.domain.service.ContractService;
import com.exposit.sjc.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

   // private AbstractHibernateDao abstractHibernateDao;
    private BookService bookService;
    private UserService userService;
    private ContractService contractService;
    private AuthorService authorService;
@Autowired
    public HelloController(UserService userService,BookService bookService,ContractService contractService,AuthorService authorService) {
  this.userService=userService;
    this.bookService=bookService;
this.contractService=contractService;
    this.authorService=authorService;
    }






   @RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String getBooks(Model model) {
        List<BookEntity> books = this.bookService.getBooks();

        model.addAttribute("books", books);

        return "hello";
	}
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String getUsers(Model model) {
        List<UserEntity> users = this.userService.getUsers();

        model.addAttribute("users", users);

        return "user";
    }

    @RequestMapping(value = "/author",method = RequestMethod.GET)
    public String getAuthors(Model model) {
        List<AuthorEntity> authors = this.authorService.getAuthors();

        model.addAttribute("authors", authors);

        return "author";
    }



    @RequestMapping(value = "contract",method = RequestMethod.GET)
    public String getContracts(Model model) {
        List<ContractEntity> contracts = this.contractService.getContracts();

        model.addAttribute("contracts", contracts);

        return "contract";
    }



    @RequestMapping(value ="/showUser", method = RequestMethod.GET)
    public String getUser(Model model) {
        UserEntity user =  this.userService.getUserByID(1L);

        model.addAttribute("showUser", user);

        return "showUser";

    }

    @RequestMapping(value ="/editUser", method = RequestMethod.GET)
    public ModelAndView editUser( HttpServletRequest request, HttpServletResponse response) {

        System.out.println("chech ID :  " + request.getParameter("selectUser"));


        return  new ModelAndView("user");
    }



}