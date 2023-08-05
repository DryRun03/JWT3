package io.pankaj.service;

import io.pankaj.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserServiceI {
    public List<User> getAllUsers();
}
