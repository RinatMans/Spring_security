package jm.security.example.service;

import jm.security.example.model.User;

import java.util.List;

public interface UserService {
    void saveNewUser(User user);

    List<User> getUsersList();

    User findById(Long id);

    void updateUser(User user);

    void deleteUser(Long id);

    User findByUserName(String name);

}
