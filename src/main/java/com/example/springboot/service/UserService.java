package com.example.springboot.service;

import com.example.springboot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserService {

    void save(User user);

    User findById(int id);


    List<User> getAll();

    void update(int id, User user);

    void delete(int id);
}