package com.exposit.sjc.app.bookstore;

import com.exposit.sjc.app.repository.entity.*;
import com.exposit.sjc.domain.model.UserPrincipal;
import com.exposit.sjc.domain.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HelloController {

   // private AbstractHibernateDao abstractHibernateDao;
    private BookService bookService;
    private UserService userService;
    private ContractService contractService;
    private AuthorService authorService;
    private AutorizationDataService autorizationDataService;



@Autowired
    public HelloController(UserService userService,BookService bookService,ContractService contractService,AuthorService authorService,AutorizationDataService autorizationDataService) {
  this.userService=userService;
    this.bookService=bookService;
this.contractService=contractService;
    this.authorService=authorService;
    this.autorizationDataService = autorizationDataService;

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



    @RequestMapping(value = "/contract",method = RequestMethod.GET)
    public String getContracts(Model model) {
        List<ContractEntity> contracts = this.contractService.getContracts();

        model.addAttribute("contracts", contracts);

        return "contract";
    }



    @RequestMapping(value ="/showUser", method = RequestMethod.GET)
    public String getUser(Model model) {
        UserPrincipal user =  this.userService.getUserByID(1L);

        model.addAttribute("showUser", user);

        return "showUser";

    }

    @RequestMapping(value = "/getContract{id}",method = RequestMethod.GET)
    public String getContract(@PathVariable Long id, Model model) {
        ContractEntity contract = this.contractService.getContractByID(id);
        model.addAttribute("contractById", contract);
        return "contractById";
    }

  /*@RequestMapping(value ="/contractById", method = RequestMethod.GET)
    public String getContract(Model model) {
        ContractEntity contract =  this.contractService.getContractByID(1L);

        model.addAttribute("contractById", contract);

        return "contractById";

    }
*/
  @RequestMapping(value = "/addUser",method = RequestMethod.GET)
  public String addNewUser(Model model) {

      model.addAttribute("user", new UserEntity());
      return "registrationUser";
  }





}