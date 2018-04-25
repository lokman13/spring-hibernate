package com.lok.dao;

import com.lok.entity.RegisterBean;
import com.lok.util.DBConnection;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
@Repository("registerDao")
public class RegisterDao {

    public static String registerUser(RegisterBean registerBean) {
        String fullName = registerBean.getFullName();
        String email = registerBean.getEmail();
        String userName = registerBean.getUserName();
        String password = registerBean.getPassword();




        return"";
    }
}