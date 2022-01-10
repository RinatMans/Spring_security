package jm.security.example.dao;

import jm.security.example.model.User;

import java.util.List;

public interface UserDao {
    void saveNewUser(User user);

    List<User> getUsersList();

    User findById(Long id);

    void updateUser(User user);

    void deleteUser(Long id);

    User findByUserName(String username);

}
