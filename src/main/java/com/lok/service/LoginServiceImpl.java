package com.lok.service;

import com.lok.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
   private LoginDao logindao;

    public void setLoginDAO(LoginDao loginDAO) {
        this.logindao = logindao;
    }

    public boolean checkLogin(String userName, String userPassword){
        System.out.println("In Service class...Check Login");
        return logindao.checkLogin(userName, userPassword);
    }
}