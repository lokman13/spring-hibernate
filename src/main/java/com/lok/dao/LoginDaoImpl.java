package com.lok.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao {


    protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession(){
        return sessionFactory.openSession();
    }

    public boolean checkLogin(String userName, String userPassword){
        System.out.println("In Check login");
        Session session = sessionFactory.openSession();
        boolean userFound = false;
        //Query using Hibernate Query Language
        String SQL_QUERY =" from Users as o where o.userName=? and o.userPassword=?";
        org.hibernate.Query query = session.createQuery(SQL_QUERY);
        query.setParameter(0,userName);
        query.setParameter(1,userPassword);
        List list = query.list();

        if ((list != null) && (list.size() > 0)) {
            userFound= true;
        }

        session.close();
        return userFound;
    }

}
