package com.lok.service;

import com.lok.dao.UserDAO;
import com.lok.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public List<User> getUserList() {
        return userDAO.getUserList();
    }

    public void createUser(User user) {
        userDAO.addUser(user);
    }
}
