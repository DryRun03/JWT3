package io.pankaj.controller;

import io.pankaj.domain.User;
import io.pankaj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/home")
@RestController
public class UserController {

    @Autowired @Lazy
    private UserService userService;


    @GetMapping("/user")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
