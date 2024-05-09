package com.example.springboot.dao;

import com.example.springboot.model.User;

import java.util.List;

public interface UserDAO {
    void save(User user);

    List<User> getAll();

    void delete(int id);

    void update(int id, User user);


    User findById(int id);

}