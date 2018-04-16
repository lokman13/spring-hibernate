package com.lok.dao;

import com.lok.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAO {
    private static List<User> list = null;
    static{
        list = new ArrayList<User>();
        list.add(new User("Mohamed", 30, "mouhamed@gmail.com", "Algerie"));
        list.add(new User("kk", 40, "kk@gmail.com", "US"));
        list.add(new User("AAb", 30, "aab@gmail.com", "Canada"));
    }
    public List<User> getUserList() {
        return list;
    }
    public void addUser(User user) {:
        list.add(user);
    }
}
