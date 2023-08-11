package io.pankaj.controller;

import io.pankaj.entities.User;
import io.pankaj.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RequestMapping("/home")
@RestController
public class UserController {

    @Autowired @Lazy
    private UserServiceI userService;


    @GetMapping("/user")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/currentUser")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
