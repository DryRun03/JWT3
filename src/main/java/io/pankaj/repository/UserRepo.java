package io.pankaj.repository;

import io.pankaj.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,String> {
    public Optional<User> findUserByEmail(String email);
}
