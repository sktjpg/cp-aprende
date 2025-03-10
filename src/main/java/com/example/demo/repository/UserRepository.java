package com.example.demo.repository;

import com.example.demo.domain.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    private final UserJPARepository userJPARepository;

    public UserRepository(UserJPARepository userJPARepository) {
        this.userJPARepository = userJPARepository;
    }

    public UserEntity getUser() {
        return new UserEntity("name", "email");
    }

    public List<UserEntity> getAllUsers() {
        return userJPARepository.findAll();
    }

}
