package io.pankaj.service;

import io.pankaj.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceI implements UserService {

    List<User> list = new ArrayList<>();
    public List<User> getAllUsers(){
        return this.list;
    }
}
