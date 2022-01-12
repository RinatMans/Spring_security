package jm.security.example.service;

import jm.security.example.dao.UserDao;
import jm.security.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private final UserDao userDao;
    private final PasswordEncoder bcryptPasswordEncoder;

    @Autowired
    public UserServiceImp(UserDao userDao, PasswordEncoder bcryptPasswordEncoder) {
        this.userDao = userDao;
        this.bcryptPasswordEncoder = bcryptPasswordEncoder;
    }

    @Transactional
    @Override
    public void saveNewUser(User user) {
        user.setPassword(bcryptPasswordEncoder.encode(user.getPassword()));
        userDao.saveNewUser(user);
    }

    @Transactional
    @Override
    public List<User> getUsersList() {
        return this.userDao.getUsersList();
    }

    @Transactional
    @Override
    public User findById(Long id) {
        return this.userDao.findById(id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        this.userDao.deleteUser(id);
    }

    @Transactional
    @Override
    public User findByUserName(String name) {
        return userDao.findByUserName(name);
    }

}
