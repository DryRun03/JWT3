package io.pankaj.service;

import io.pankaj.entities.User;
import io.pankaj.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceI implements UserService {

//    List<User> list = new ArrayList<>();
    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public User createUser(User user){
        user.setAbout(UUID.randomUUID().toString());
        return userRepo.save(user);
    }
}
