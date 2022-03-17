package com.spring.boot.springbootmvc.service;

import com.spring.boot.springbootmvc.entity.User;
import java.util.List;

public interface UserService {
    void addUser(User user);
    User getUserById(Long id);
    void deleteUser(User user);
    void updateUser(User user);
    List<User> getUsers();
}
