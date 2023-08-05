package io.pankaj.service;

import io.pankaj.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService implements UserServiceI{

    List<User> list = new ArrayList<>();
    public List<User> getAllUsers(){
        if(list.isEmpty()){
            list.add(new User(UUID.randomUUID().toString(),"Pankaj" , "pankaj@gmail.com"));
            list.add(new User(UUID.randomUUID().toString(),"Garg" , "garg@gmail.com"));
        }
        return this.list;
    }
}
